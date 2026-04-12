package com.example.service;

import com.example.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {
    // Maintain a list of products
    private List<Product> products = new ArrayList<>();
    
    // Constructor to initialize with sample products
    public ProductService() {
        initializeSampleProducts();
    }
    
    // Add sample products (3-5 items)
    private void initializeSampleProducts() {
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Mouse", 25.50));
        products.add(new Product(3L, "Keyboard", 75.00));
        products.add(new Product(4L, "Monitor", 299.99));
        products.add(new Product(5L, "Headphones", 150.00));
    }
    
    // Method to get all products
    public List<Product> getAllProducts() {
        return new ArrayList<>(products); // Return copy to prevent external modification
    }
    
    // Filter products above a certain price using Streams
    public List<Product> getProductsAbovePrice(double price) {
        return products.stream()
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());
    }
    
    // Return only product names using map()
    public List<String> getAllProductNames() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }
    
    // Get product names above a certain price
    public List<String> getProductNamesAbovePrice(double price) {
        return products.stream()
                .filter(product -> product.getPrice() > price)
                .map(Product::getName)
                .collect(Collectors.toList());
    }
    
    // Handle null safely using Optional - find product by ID
    public Optional<Product> findProductById(Long id) {
        if (id == null) {
            return Optional.empty();
        }
        
        return products.stream()
                .filter(product -> id.equals(product.getId()))
                .findFirst();
    }
    
    // Handle null safely - get product name by ID
    public Optional<String> getProductNameById(Long id) {
        return findProductById(id)
                .map(Product::getName);
    }
    
    // Add a new product
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }
    
    // Get count of products above price
    public long countProductsAbovePrice(double price) {
        return products.stream()
                .filter(product -> product.getPrice() > price)
                .count();
    }
}