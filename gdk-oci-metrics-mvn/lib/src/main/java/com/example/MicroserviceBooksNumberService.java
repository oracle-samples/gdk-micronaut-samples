/*
 * Copyright 2024 Oracle and/or its affiliates
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.StreamSupport;

@Singleton
public class MicroserviceBooksNumberService {

    private final Logger log = LoggerFactory.getLogger(getClass().getName());

    private final BookRepository bookRepository;
    private final Counter checks;
    private final Timer time;
    private final AtomicInteger microserviceBooksNumber = new AtomicInteger(0);

    private static final String SEARCH_KEY = "microservice";

    MicroserviceBooksNumberService(BookRepository bookRepository,
                                   MeterRegistry meterRegistry) {
        this.bookRepository = bookRepository;
        checks = meterRegistry.counter("microserviceBooksNumber.checks"); // <1>
        time = meterRegistry.timer("microserviceBooksNumber.time"); // <2>
        meterRegistry.gauge("microserviceBooksNumber.latest", microserviceBooksNumber); // <3>
    }

    @Scheduled(fixedRate = "${customMetrics.updateFrequency:1h}",
               initialDelay = "${customMetrics.initialDelay:0s}") // <4>
    public void updateNumber() {
        time.record(() -> {
            try {
                Iterable<Book> allBooks = bookRepository.findAll();
                long booksNumber = StreamSupport.stream(allBooks.spliterator(), false)
                        .filter(b -> b.getName().toLowerCase().contains(SEARCH_KEY))
                        .count();

                checks.increment();
                microserviceBooksNumber.set((int) booksNumber);
            } catch (Exception e) {
                log.error("Problem setting the number of microservice books", e);
            }
        });
    }
}