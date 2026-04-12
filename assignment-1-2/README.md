# Product Catalog Service

A basic Java domain model for product catalog management using Maven and Lombok.

## Project Structure

```
product-catalog-service/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   ├── Main.java
│                   ├── model/
│                   │   └── Product.java
│                   └── service/          # For Assignment 2
│                       └── ProductService.java
└── README.md
```

## Assignment 1 - Basic Domain Model ✅ COMPLETED

### Completed Tasks:
- ✅ Created Maven project with groupId: `com.example` and artifactId: `product-service`
- ✅ Created `model` package
- ✅ Created `Product` class with:
  - `Long id`
  - `String name` 
  - `double price`
- ✅ Added Lombok annotations:
  - `@Getter`
  - `@Setter`
  - `@AllArgsConstructor`
  - `@NoArgsConstructor`
- ✅ Created `Main` class that instantiates a Product and prints the product name
- ✅ **Successfully compiled and ran with output: "Product name: Laptop"**

## Assignment 2 - Collection Handling ✅ COMPLETED

### Completed Tasks:
- ✅ Created `ProductService` class in `service` package
- ✅ Maintained a list of products: `List<Product> products = new ArrayList<>()`
- ✅ Added 5 sample products with different prices
- ✅ Implemented `getProductsAbovePrice(double price)` method using Streams to filter
- ✅ Added methods that return only product names using `map()`
- ✅ Handled null safely using `Optional` for safe operations
- ✅ **Successfully demonstrated Streams and functional programming**

### Key Features Implemented:
- **Filtering**: `getProductsAbovePrice()` - filters products by price
- **Mapping**: `getAllProductNames()` - transforms products to names
- **Combining**: `getProductNamesAbovePrice()` - filter + map together
- **Optional**: `findProductById()` - safe null handling
- **Counting**: `countProductsAbovePrice()` - stream aggregation

## How to Run

1. Ensure you have Java 11+ and Maven installed
2. Navigate to the project directory
3. Compile: `mvn compile`
4. Run: `mvn exec:java -Dexec.mainClass="com.example.Main"`

## Dependencies

- **Lombok 1.18.44**: For reducing boilerplate code with annotations (Java 26 compatible)
- **Java 21**: Target compilation version (compatible with Java 26 runtime)