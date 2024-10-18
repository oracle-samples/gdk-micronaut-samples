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
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
class MicroserviceBooksNumberTest {

    @Inject
    MeterRegistry meterRegistry;

    @Inject
    MicroserviceBooksNumberService service;

    @Test
    void testMicroserviceBooksNumberUpdates() {
        Counter counter = meterRegistry.counter("microserviceBooksNumber.checks");
        Timer timer = meterRegistry.timer("microserviceBooksNumber.time");
        Gauge gauge = meterRegistry.get("microserviceBooksNumber.latest").gauge();

        assertEquals(0.0, counter.count());
        assertEquals(0.0, timer.totalTime(MILLISECONDS));
        assertEquals(0.0, gauge.value());

        int checks = 3;
        for (int i = 0; i < checks; i++) {
            service.updateNumber();
        }

        assertEquals((double) checks, counter.count());
        assertTrue(timer.totalTime(MILLISECONDS) > 0);
        assertEquals(2.0, gauge.value());
    }
}