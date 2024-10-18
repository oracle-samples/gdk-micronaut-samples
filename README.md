# Code Samples for the Graal Development Kit for Micronaut (GDK)

This repository contains code samples for the Graal Development Kit for Micronaut (GDK). These samples are used in the Oracle Live Labs workshops showcasing the GDK integration with Oracle Cloud Infrastructure (OCI).

## List of Code Samples

Below is the list of code samples available in this repository:

1. [GDK OCI Object Storage](./gdk-oci-object-store-mvn/)
2. [GDK OCI Email](./gdk-oci-email-mvn/)
3. [GDK OCI Autonomous Database with Secrets in the Vault](./gdk-oci-adb-mvn/)
4. [GDK OCI Logging](./gdk-oci-logging-mvn/)
5. [GDK OCI Tracing](./gdk-oci-tracing-mvn/)
6. [GDK OCI Metrics](./gdk-oci-metrics-mvn/)
7. [GDK OCI MySQL HeatWave with Secrets in the Vault](./gdk-oci-mysql-mvn/)

## What is Graal Development Kit for Micronaut?

The [Graal Development Kit for Micronaut (GDK)](https://graal.cloud/gdk) is an Oracle build of the open source Micronaut® framework. The GDK provides a curated set of Micronaut framework modules that simplify cloud application development, are designed for ahead-of-time compilation with GraalVM Native Image, and are fully supported by Oracle. The GDK also provides project creation utilities, VS Code and IntelliJ extensions to simplify application development and deployment.

## What is Micronaut?

The [Micronaut® framework](https://micronaut.io/) is a modern, JVM-based framework to build modular, easily testable microservice and serverless applications. By avoiding runtime reflection in favor of annotation processing, Micronaut improves the Java-based development experience by detecting errors at compile time instead of runtime, and improves Java-based application startup time and memory footprint. Micronaut includes a persistence framework called Micronaut Data that precomputes your SQL queries at compilation time making it a great fit for working with databases like MySQL, Oracle Autonomous Database, etc.

> Micronaut® is a registered trademark of Object Computing, Inc. Use is for referential purposes and does not imply any endorsement or affiliation with any third-party product.

## What is GraalVM Native Image?

[GraalVM Native Image](https://www.graalvm.org/) technology compiles Java applications ahead-of-time into self-contained native executables that are small in size, start almost instantaneously, provide peak performance with no warmup, and require less memory and CPU. Only the code that is required at run time by the application gets added into the executable file. Native Image is perfect for containerized workloads and microservices — which is why it has been embraced by Micronaut, Spring Boot, Helidon, and Quarkus.

GDK modules are designed for ahead-of-time compilation with GraalVM Native Image to produce native executables that are ideal for microservices: they have a small memory footprint, start instantly, and provide peak performance with no warmup.

> Graal Development Kit for Micronaut, and Oracle GraalVM are available at no additional cost on Oracle Cloud Infrastructure.

## Help

For more information about the Graal Development Kit for Micronaut (GDK), see https://graal.cloud/gdk.

## Security

Please consult the [security guide](./SECURITY.md) for our responsible security vulnerability disclosure process

## License

Copyright (c) 2024 Oracle and/or its affiliates.

Released under the [Apache License version 2.0](LICENSE.txt).
