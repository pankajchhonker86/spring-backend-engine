# Advanced Spring Boot Core Engine

A production-grade Spring Boot backend service built to showcase enterprise development capabilities and core framework design patterns. This architecture implements custom runtime metrics tracking, structural bean lifecycle management, and conditional configuration models optimized for technical vetting loops.

##  Key Architectural Implementations

* **Aspect-Oriented Programming (AOP):** Implements a dedicated proxy tracking layer (`PerformanceAspect`) to dynamically intercept and log operational speeds without polluting core business logic.
* **Custom Annotations:** Features a runtime marker (`@LogExecutionTime`) targeting method execution blocks via runtime proxies.
* **Container Lifecycle Management:** Showcases explicit bean initialization hooks utilizing `@PostConstruct` and `@PreDestroy` for pre-warming registers and system cleanup.
* **Profile-Driven Configurations:** Demonstrates smart decoupling using `@ConditionalOnProperty` to selectively instantiate application components based on active YAML profiles.
* **Constructor Dependency Injection:** Guarantees immutable bean status at compile time, eliminating null-pointer vulnerabilities and enabling unit testing without container coupling.

##  Technical Stack
* **Language:** Java 17+
* **Framework:** Spring Boot 3.x (Spring Core, Spring AOP)
* **Build Tool:** Maven
* **Configuration:** YAML Matrix (`application.yml`)

##  Execution and Validation

1. **Compile and Install Dependencies:**
   ```bash
   mvn clean install