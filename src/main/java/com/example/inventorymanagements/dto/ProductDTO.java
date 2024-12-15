package com.example.inventorymanagements.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) for Product entity.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    /**
     * The unique identifier for the product.
     */
    private Long id;

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The price of the product.
     */
    private Double price;

    /**
     * The ID of the category this product belongs to.
     */
    private Long categoryId;

    // Lombok automatically generates:
    // - Getters and Setters for all fields
    // - No-argument constructor (@NoArgsConstructor)
    // - All-arguments constructor (@AllArgsConstructor)
    // - toString(), equals(), and hashCode() methods (@Data)
}
