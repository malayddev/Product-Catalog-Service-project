# Product Catalog Service - Complete Java Learning Journey

## Learning Progression

### 📚 Assignment 1: Basic Java Domain Model
**Goal**: Create a basic Java domain model with Lombok annotations

**Key Concepts Learned**:
- Maven project structure and configuration
- Lombok annotations (`@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`)
- Java domain modeling
- Package organization

**Technologies**: Java 21, Maven, Lombok 1.18.44

### 📚 Assignment 2: Collections & Streams
**Goal**: Implement collection handling and filtering logic

**Key Concepts Learned**:
- Java Collections (`ArrayList`, `List`)
- Stream API for functional programming
- Lambda expressions and method references
- Optional for null safety
- Filtering, mapping, and collecting operations

**Technologies**: Java Streams API, Optional, Functional Programming

### 📚 Assignment 3: Spring Boot REST API
**Goal**: Set up a Spring Boot application with dependency injection

**Key Concepts Learned**:
- Spring Boot framework and auto-configuration
- Dependency Injection with constructor injection
- REST API development with `@RestController`
- Service layer with `@Service` annotation
- HTTP endpoint mapping with `@GetMapping`
- JSON serialization/deserialization
- Data Transfer Objects (DTOs) and Jakarta Validation (`@Valid`)
- Global Exception Handling with `@RestControllerAdvice`

**Technologies**: Spring Boot 3.2.0, Spring Web, Embedded Tomcat

### 📚 Assignment 5: Persistence with Spring Data JPA
**Goal**: Integrate database persistence using Spring Data JPA and H2

**Key Concepts Learned**:
- JPA Entity mapping (`@Entity`, `@Id`, `@GeneratedValue`)
- Repository pattern with `JpaRepository`
- Embedded database configuration (H2)
- Database schema auto-generation and H2 Console
- Moving from in-memory lists to persistent storage

**Technologies**: Spring Data JPA, H2 Database, Hibernate

### 📚 Assignment 6: Advanced Persistence & Migrations
**Goal**: Enhance the persistence layer with relationships, database versioning, and pagination.

**Key Concepts**:
- **Entity Relationships**: Implemented `@OneToMany` and `@ManyToOne` between Products and Reviews.
- **Flyway Migrations**: Managed database schema versions using SQL scripts (`V1__init.sql`, `V2__reviews.sql`).
- **Pagination**: Implemented server-side pagination using `Pageable` and `Page<T>`.
- **Nested Validation**: Enabled deep validation of related objects using `@Valid`.

### 📚 Assignment 7: Transaction Management & Rollback
**Goal**: Implement transaction handling and verify atomic database operations.

**Key Concepts Learned**:
- **@Transactional**: Managing database transaction boundaries.
- **Atomic Operations**: Ensuring multiple database saves succeed or fail as a single unit.
- **Rollback Behavior**: Verifying that partial data is not saved when a RuntimeException occurs.
- **Data Integrity**: Maintaining a clean database state during application failures.

**Technologies**: Spring Transactions, Hibernate, H2 Database.

## Quick Start Guide

### Assignment 1-2: Basic Java
```bash
cd assignment-1-2
mvn compile
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Assignment 3-4: Spring Boot
```bash
cd assignment-3-4
mvn spring-boot:run
```

### Assignment 5: Basic JPA
```bash
cd assignment-5-jpa
mvn spring-boot:run
```

### Assignment 6: Advanced JPA
```bash
cd assignment-6-persistence
mvn spring-boot:run
```

### Assignment 7: Transactions
```bash
cd assignment-7-transactions
mvn spring-boot:run
```