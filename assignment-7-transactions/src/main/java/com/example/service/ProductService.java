package com.example.service;

import com.example.model.Product;
import com.example.model.Review;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product createProductWithReviews(Product product, List<Review> reviews) {
        // 1. Save the product first
        Product savedProduct = productRepository.save(product);

        // 2. Add failure condition for rollback testing
        if (reviews == null || reviews.isEmpty()) {
            throw new RuntimeException("Rollback Test: Reviews list is empty. Product should NOT be saved.");
        }

        // 3. Save reviews (linked to the product)
        reviews.forEach(review -> {
            review.setProduct(savedProduct);
            savedProduct.getReviews().add(review);
        });

        return productRepository.save(savedProduct);
    }
}