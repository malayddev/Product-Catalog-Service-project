# Persistence Enhancement (Assignment 6)

A Spring Boot application with an enhanced persistence layer featuring entity relationships, paginated API responses, and database schema management via Flyway migrations.

## Project Structure

```
assignment-6-persistence/
├── pom.xml
├── src/
│   └── main/
│       ├── java/com/example/
│       │   ├── ProductCatalogApplication.java
│       │   ├── controller/
│       │   │   └── ProductController.java      # Paginated endpoints
│       │   ├── service/
│       │   │   └── ProductService.java         # Business logic with Pageable
│       │   ├── repository/
│       │   │   ├── ProductRepository.java
│       │   │   └── ReviewRepository.java       # New Review Repository
│       │   ├── model/
│       │   │   ├── Product.java                # @OneToMany Relationship
│       │   │   └── Review.java                 # @ManyToOne Relationship
│       │   └── dto/
│       │       ├── ProductDTO.java             # Nested DTOs
│       │       └── ReviewDTO.java              # New Review DTO
│       └── resources/
│           ├── db/migration/
│           │   ├── V1__init.sql               # Flyway: Products table
│           │   └── V2__reviews.sql            # Flyway: Reviews table
│           └── application.properties          # Flyway & JPA configuration
└── README.md
```

## Assignment 6 Requirements ✅

### Completed Tasks:
- ✅ **Review Entity**: Created `Review` entity with `id`, `comment`, and relationship.
- ✅ **Relationships**: Established One-to-Many (`Product` → `Review`) and Many-to-One (`Review` → `Product`) links.
- ✅ **Flyway Migrations**: Added versioned SQL scripts for schema management.
- ✅ **Pagination**: Updated products endpoint to accept `page` and `size` parameters.
- ✅ **Nested POST**: Enabled creating a product and its reviews in a single request.
- ✅ **Schema Validation**: Configured Hibernate to validate against Flyway-managed schema.

## How to Run

### Method 1: Using Maven (Recommended)
```bash
cd assignment-6-persistence
mvn spring-boot:run
```

### Method 2: Package and Run JAR
```bash
cd assignment-6-persistence
mvn package
java -jar target/product-catalog-spring-1.0.0.jar
```

## Testing the Application

Once running, test these endpoints on **port 8001**:

### 1. Add Product with Reviews
```bash
curl -X POST http://localhost:8001/products \
-H "Content-Type: application/json" \
-d '{
  "name": "Mechanical Keyboard",
  "price": 120.0,
  "reviews": [
    {"comment": "Tactile and great for coding!"},
    {"comment": "A bit loud, but feels premium."}
  ]
}'
```

### 2. Get Paginated Products
```bash
curl "http://localhost:8001/products?page=0&size=2"
```

### 3. H2 Console
Visit `http://localhost:8001/h2-console` to inspect the `products` and `reviews` tables.
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User**: `malay`

## Key Concepts Demonstrated

### 1. Database Migrations (Flyway)
Ensures the database schema is versioned and reproducible. SQL scripts in `src/main/resources/db/migration` are executed automatically on startup.

### 2. Entity Relationships
Uses `@OneToMany` and `@ManyToOne` for parent-child data modeling.
- `CascadeType.ALL`: Automatically saves/updates reviews when a product is saved.
- `orphanRemoval = true`: Removes reviews from the database when removed from the product's list.

### 3. API Pagination
Improves performance and UX by returning data in chunks using Spring Data `Page` and `Pageable` interfaces.

---
**Learning Journey**: This assignment builds on Assignment 5 by adding real-world software architecture patterns for database management and API scalability.