# Transaction Handling & Rollback (Assignment 7)

A Spring Boot application demonstrating database transactions and atomic operations using `@Transactional`.

## Assignment 7 Goals ✅

The primary objective of this assignment is to understand how Spring manages database transactions and how it handles rollbacks when an exception occurs.

### Key Tasks:
- **Transactional Service**: Implemented `createProductWithReviews()` in `ProductService` with the `@Transactional` annotation.
- **Atomic Operations**: The method saves a `Product` and multiple `Reviews` as a single unit of work.
- **Rollback Logic**: If the `reviews` list is empty, a `RuntimeException` is thrown.
- **Verification**: Verified that if the exception is thrown, the `Product` is **not** saved to the database, even though it was saved successfully in the first line of the method.

## How to Run

```bash
cd assignment-7-transactions
mvn spring-boot:run
```

## Testing Rollback Behavior

### 1. Test Success (Atomic Save)
Send a request with at least one review. Both the product and the review will be saved.
```bash
curl -X POST http://localhost:8001/products/transactional \
-H "Content-Type: application/json" \
-d '{
  "name": "Transactional Laptop",
  "price": 1000.0,
  "reviews": [{"comment": "Great!"}]
}'
```

### 2. Test Rollback (Transactional Failure)
Send a request with an **empty** reviews list. This will trigger the `RuntimeException`.
```bash
curl -X POST http://localhost:8001/products/transactional \
-H "Content-Type: application/json" \
-d '{
  "name": "Rollback Product",
  "price": 500.0,
  "reviews": []
}'
```
**Expected Result**:
- The API returns `500 Internal Server Error`.
- **Database Verification**: Check the H2 Console. The "Rollback Product" should **not** exist in the `products` table. This proves the transaction was rolled back.

## Key Concepts

### @Transactional
When a method is marked with `@Transactional`, Spring creates a proxy that starts a database transaction. If the method completes successfully, the transaction is **committed**. If any `RuntimeException` (or `Error`) is thrown, the transaction is **rolled back**.

### Atomicity
Transactions ensure "all or nothing" behavior. In this assignment, it ensures we don't end up with a Product that has no Reviews if our business logic requires them.