package com.example.inventorymanagements.service;


import com.example.inventorymanagements.dto.ProductDTO;
import com.example.inventorymanagements.entity.Product;
import com.example.inventorymanagements.entity.Category;
import com.example.inventorymanagements.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> new ProductDTO(product.getId(), product.getName(), product.getPrice(), product.getCategory().getId()))
                .collect(Collectors.toList());
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        // Assuming categoryId is set correctly
        Category category = new Category();
        category.setId(productDTO.getCategoryId());
        product.setCategory(category);
        Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct.getId(), savedProduct.getName(), savedProduct.getPrice(), savedProduct.getCategory().getId());
    }
}

