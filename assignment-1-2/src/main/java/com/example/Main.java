package com.example;

import com.example.model.Product;
import com.example.service.ProductService;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Assignment 1: Basic Product creation
        System.out.println("=== Assignment 1: Basic Product ===");
        Product product = new Product(1L, "Laptop", 999.99);
        System.out.println("Product name: " + product.getName());
        
        System.out.println("\n=== Assignment 2: ProductService Demo ===");
        
        // Create ProductService with sample data
        ProductService productService = new ProductService();
        
        // Display all products
        System.out.println("\n1. All Products:");
        List<Product> allProducts = productService.getAllProducts();
        allProducts.forEach(p -> 
            System.out.println("  " + p.getName() + " - $" + p.getPrice())
        );
        
        // Filter products above price using Streams
        System.out.println("\n2. Products above $100:");
        List<Product> expensiveProducts = productService.getProductsAbovePrice(100.0);
        expensiveProducts.forEach(p -> 
            System.out.println("  " + p.getName() + " - $" + p.getPrice())
        );
        
        // Get only product names using map()
        System.out.println("\n3. All Product Names:");
        List<String> productNames = productService.getAllProductNames();
        productNames.forEach(name -> System.out.println("  " + name));
        
        // Get product names above price (combining filter + map)
        System.out.println("\n4. Product Names above $50:");
        List<String> expensiveProductNames = productService.getProductNamesAbovePrice(50.0);
        expensiveProductNames.forEach(name -> System.out.println("  " + name));
        
        // Handle null safely using Optional
        System.out.println("\n5. Optional Examples:");
        
        // Find existing product
        Optional<Product> foundProduct = productService.findProductById(2L);
        if (foundProduct.isPresent()) {
            System.out.println("  Found product: " + foundProduct.get().getName());
        }
        
        // Try to find non-existing product
        Optional<Product> notFound = productService.findProductById(999L);
        System.out.println("  Product 999 exists: " + notFound.isPresent());
        
        // Get product name safely
        Optional<String> productName = productService.getProductNameById(3L);
        productName.ifPresent(name -> System.out.println("  Product 3 name: " + name));
        
        // Handle null ID safely
        Optional<String> nullResult = productService.getProductNameById(null);
        System.out.println("  Null ID handled safely: " + nullResult.isPresent());
        
        // Count products above price
        System.out.println("\n6. Count products above $100: " + 
            productService.countProductsAbovePrice(100.0));
    }
}