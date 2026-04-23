# Unit Testing with JUnit 5 & Mockito (Assignment 8)

A Spring Boot application demonstrating unit testing of the service layer using Mockito mocks.

## Assignment 8 Goals ✅

The goal is to test the business logic in `ProductService` independently of the database or web layer.

### Key Tasks:
- **Mocking**: Used `@Mock` to create a virtual `ProductRepository`.
- **Dependency Injection**: Used `@InjectMocks` to automatically inject the repository mock into the `ProductService`.
- **Stubs**: Configured mock behavior using `when(...).thenReturn(...)`.
- **Assertions**: Validated method results using `assertEquals()`, `assertNotNull()`, and `assertThrows()`.
- **Verifications**: Ensured that the service actually calls the repository methods using `verify()`.

## How to Run Tests

### Using Maven
```bash
cd assignment-8-junit
mvn test
```

## Test Coverage
The [ProductServiceTest.java](file:///Users/malaynandasana/Work/product-catalog-service/assignment-8-junit/src/test/java/com/example/service/ProductServiceTest.java) covers:
1.  **`getAllProducts()`**: Verifies that pagination parameters are correctly passed to the repository and data is returned.
2.  **`getProductById()` (Success)**: Verifies that a valid ID returns the correct product.
3.  **`getProductById()` (Not Found)**: Verifies that an invalid ID results in a `ResponseStatusException` with `404 Not Found`.

## Key Concepts

### Mockito
Mockito allows us to create fake versions of dependencies. This ensures that a failure in the database doesn't cause our service tests to fail (Isolation).

### JUnit 5 Assertions
- `assertEquals(expected, actual)`: Checks if values match.
- `assertThrows(Exception.class, lambda)`: Verifies that the correct error is triggered.
- `verify(mock, times(1))`: Confirms the number of times a method was called.