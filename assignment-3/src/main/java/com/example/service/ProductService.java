package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    
    private final List<Product> products;
    
    public ProductService() {
        this.products = new ArrayList<>();
        products.add(new Product(1L, "Apple Laptop", 1299.99));
        products.add(new Product(2L, "Samsung Mouse", 35.50));
        products.add(new Product(3L, "Dell Injection Keyboard", 85.00));
        products.add(new Product(4L, "Dell Monitor", 399.99));
        products.add(new Product(5L, "Samsung Headphones", 175.00));
    }
    
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}