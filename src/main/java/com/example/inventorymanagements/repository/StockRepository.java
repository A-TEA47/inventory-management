package com.example.inventorymanagements.repository;


import com.example.inventorymanagements.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {}

