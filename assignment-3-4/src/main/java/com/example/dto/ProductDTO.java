package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductDTO {
    
    @NotBlank(message = "Product name is required")
    private String name;
    
    @Positive(message = "Product price must be positive")
    private double price;
}
