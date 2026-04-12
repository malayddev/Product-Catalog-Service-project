package com.example.service;

import com.example.exception.ProductNotFoundException;
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

    public Product getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    public Product addProduct(Product product) {
        long newId = products.stream().mapToLong(Product::getId).max().orElse(0) + 1;
        product.setId(newId);
        products.add(product);
        return product;
    }
}