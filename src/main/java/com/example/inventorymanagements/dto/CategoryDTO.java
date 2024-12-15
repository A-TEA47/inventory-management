package com.example.inventorymanagements.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object for Category entity.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

    private Long id;
    private String name;
    private String description;

    // No boilerplate code needed for getters, setters, or constructors due to Lombok annotations.
}
