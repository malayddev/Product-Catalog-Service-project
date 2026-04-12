# Product Catalog Service - Complete Java Learning Journey

A comprehensive Java learning project demonstrating progression from basic domain modeling to Spring Boot web applications.

## Repository Structure

```
product-catalog-service/
├── assignment-1-2/              # Basic Java & Collections
│   ├── pom.xml
│   ├── src/main/java/com/example/
│   │   ├── Main.java
│   │   ├── model/Product.java
│   │   └── service/ProductService.java
│   └── README.md
├── product-catalog-service/     # Spring Boot REST API
│   ├── pom.xml
│   ├── src/main/java/com/example/
│   │   ├── ProductCatalogApplication.java
│   │   ├── controller/ProductController.java
│   │   ├── service/ProductService.java
│   │   └── model/Product.java
│   └── README.md
└── README.md                    # This file
```

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

## Quick Start Guide

### Assignment 1-2: Basic Java
```bash
cd assignment-1-2
mvn compile
mvn exec:java -Dexec.mainClass="com.example.Main"
```

### Assignment 3: Spring Boot
```bash
cd product-catalog-service
mvn spring-boot:run
```

Then test the endpoints:
- `http://localhost:8080/` - Home page
- `http://localhost:8080/products` - Get all products (JSON)
- `http://localhost:8080/products/1` - Get product by ID
- `http://localhost:8080/products/count` - Get product count

## Key Features Demonstrated

### Assignment 1-2 Features:
- ✅ Lombok-generated getters/setters/constructors
- ✅ Stream filtering: `getProductsAbovePrice()`
- ✅ Stream mapping: `getAllProductNames()`
- ✅ Stream chaining: filter + map operations
- ✅ Optional null safety: `findProductById()`
- ✅ Functional programming patterns

### Assignment 3 Features:
- ✅ Spring Boot auto-configuration
- ✅ Constructor-based dependency injection
- ✅ RESTful API endpoints
- ✅ JSON response serialization
- ✅ Service layer separation
- ✅ Component scanning and bean management

## Sample Output

### Assignment 1-2 Console Output:
```
=== Assignment 1: Basic Product ===
Product name: Laptop

=== Assignment 2: ProductService Demo ===
1. All Products:
  Laptop - $999.99
  Mouse - $25.5
  ...

2. Products above $100:
  Laptop - $999.99
  Monitor - $299.99
  ...
```

### Assignment 3 API Response:
```json
GET /products
[
  {
    "id": 1,
    "name": "Spring Boot Laptop",
    "price": 1299.99
  },
  {
    "id": 2,
    "name": "REST API Mouse", 
    "price": 35.5
  }
]
```

## Dependencies Used

### Core Dependencies:
- **Java 21**: Modern Java features and performance
- **Maven**: Build automation and dependency management
- **Lombok 1.18.44**: Boilerplate code reduction

### Spring Boot Dependencies:
- **Spring Boot 3.2.0**: Framework and auto-configuration
- **Spring Web**: REST API and web layer
- **Embedded Tomcat**: Application server

## Learning Outcomes

By completing these assignments, you will understand:

1. **Java Fundamentals**: Classes, objects, packages, and Maven
2. **Modern Java**: Lombok annotations, Stream API, Optional
3. **Functional Programming**: Lambda expressions, method references
4. **Spring Framework**: Dependency injection, component scanning
5. **REST APIs**: HTTP endpoints, JSON serialization, web services
6. **Software Architecture**: Layered architecture (Controller → Service → Model)

## Next Steps

This project provides a solid foundation for:
- Database integration with Spring Data JPA
- Security implementation with Spring Security
- Testing with JUnit and MockMvc
- Containerization with Docker
- Cloud deployment

---

**Happy Learning!** 🚀 Each assignment builds upon the previous one, creating a comprehensive understanding of modern Java development.