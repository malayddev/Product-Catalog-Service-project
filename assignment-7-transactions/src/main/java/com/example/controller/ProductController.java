package com.example.controller;

import com.example.dto.ProductDTO;
import com.example.model.Product;
import com.example.model.Review;
import com.example.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class ProductController {
    
    private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products/transactional")
    public ResponseEntity<Product> addProductTransactional(@RequestBody ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        
        java.util.List<Review> reviews = new java.util.ArrayList<>();
        if (productDTO.getReviews() != null) {
            reviews = productDTO.getReviews().stream().map(reviewDTO -> {
                Review review = new Review();
                review.setComment(reviewDTO.getComment());
                return review;
            }).collect(Collectors.toList());
        }
        
        Product createdProduct = productService.createProductWithReviews(product, reviews);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }
}