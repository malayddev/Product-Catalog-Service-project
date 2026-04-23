package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReviewDTO {
    @NotBlank(message = "Comment is required")
    private String comment;
}
