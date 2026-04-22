# Spring Boot REST API (Assignments 3 & 4)

A Spring Boot REST API application demonstrating dependency injection, validations, exceptional handling, and web endpoints.

## Project Structure

```
assignment-3-4/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/example/
│               ├── ProductCatalogApplication.java  # Main Spring Boot class
│               ├── controller/
│               │   └── ProductController.java      # @RestController
│               ├── service/
│               │   └── ProductService.java         # @Service
│               └── model/
│                   └── Product.java                # Data model with Lombok
└── README.md
```

## Assignment 3 Requirements ✅

### Completed Tasks:
- ✅ Created Spring Boot project with Spring Initializr structure
- ✅ Added dependencies: Spring Web, Lombok
- ✅ Created package structure: controller, service, model
- ✅ Created `ProductService` class annotated with `@Service`
- ✅ Added `getAllProducts()` method in ProductService
- ✅ Created `ProductController` annotated with `@RestController`
- ✅ Injected ProductService using constructor injection
- ✅ Added `@GetMapping("/products")` endpoint
- ✅ Returns sample list of products
- ✅ Added `@PostMapping("/products")` with `@Valid` DTO validation
- ✅ Added Global Exception Handler for `404 Not Found` and `400 Bad Request`

### Key Spring Boot Features Demonstrated:
- **Dependency Injection**: Constructor injection in ProductController
- **Annotations**: `@SpringBootApplication`, `@RestController`, `@Service`, `@GetMapping`
- **Auto-configuration**: Spring Boot automatically configures web server
- **Component Scanning**: Spring automatically finds and manages beans
- **Global Error Handling**: Returning structured `ErrorResponse` payload globally.

## How to Run

### Method 1: Using Maven (Recommended)
```bash
cd assignment-3-4
mvn spring-boot:run
```

### Method 2: Compile and Run
```bash
cd assignment-3-4
mvn compile
mvn spring-boot:run
```

### Method 3: Package and Run JAR
```bash
cd assignment-3-4
mvn package
java -jar target/product-catalog-spring-1.0.0.jar
```

## Testing the Application

Once running, test these endpoints:

### 1. Home Page
```bash
curl http://localhost:8080/
```
**Expected**: Welcome message

### 2. Get All Products (Required Endpoint)
```bash
curl http://localhost:8080/products
```
**Expected**: JSON array of 5 products

### 3. Get Product by ID
```bash
curl http://localhost:8080/products/1
```
**Expected**: Single product JSON

### 4. Get Product Count
```bash
curl http://localhost:8080/products/count
```
**Expected**: Number 5

## Sample Response

`GET /products` returns:
```json
[
  {
    "id": 1,
    "name": "Spring Boot Laptop",
    "price": 1299.99
  },
  {
    "id": 2,
    "name": "REST API Mouse",
    "price": 35.50
  },
  ...
]
```

## Dependencies

- **Spring Boot Starter Web**: Web framework and embedded Tomcat
- **Lombok 1.18.44**: Reduces boilerplate code
- **Java 21**: Target runtime version

## Key Concepts Demonstrated

### 1. Dependency Injection
```java
@RestController
public class ProductController {
    private final ProductService productService;
    
    // Constructor injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
```

### 2. Spring Annotations
- `@SpringBootApplication`: Main application class
- `@RestController`: REST API controller
- `@Service`: Business logic service
- `@GetMapping`: HTTP GET endpoint mapping

### 3. Auto-Configuration
Spring Boot automatically:
- Configures embedded Tomcat server
- Sets up JSON serialization
- Manages bean lifecycle
- Handles HTTP request mapping