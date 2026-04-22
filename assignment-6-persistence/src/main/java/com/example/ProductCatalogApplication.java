package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogApplication.class, args);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Product Catalog Spring Boot Application Started!");
        System.out.println("Application running at: http://localhost:8001");
        System.out.println("=".repeat(50) + "\n");
    }
}