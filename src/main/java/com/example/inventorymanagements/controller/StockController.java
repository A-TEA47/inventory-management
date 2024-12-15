package com.example.inventorymanagements.controller;


import com.example.inventorymanagements.dto.StockDTO;
import com.example.inventorymanagements.service.StockService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public List<StockDTO> getAllStocks() {
        return stockService.getAllStocks();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StockDTO createStock(@RequestBody StockDTO stockDTO) {
        return stockService.createStock(stockDTO);
    }
}
