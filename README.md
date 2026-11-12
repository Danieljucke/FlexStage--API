# FlexStage API

> Historical / Academic Project — not recently verified

An early Spring Boot service scaffold created for the FlexStage project. The
repository currently contains the application bootstrap, persistence
dependencies, database configuration, and a context-loading test; it does not
contain a complete public API implementation.

## Technology

- Java 18
- Spring Boot 2.7.4
- Spring Web, Spring Data JPA, and JDBC
- MySQL connector
- Maven Wrapper

## Run locally

Configure a local database in `src/main/resources/application.properties`, then
use `./mvnw spring-boot:run` (or `mvnw.cmd spring-boot:run` on Windows).
Run the available test with `./mvnw test`.

The build and database connection have not been recently verified. Do not commit
real database credentials.

## License

No root license file is present. No license is selected by this documentation.
