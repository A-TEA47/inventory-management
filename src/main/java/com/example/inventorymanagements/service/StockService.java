package com.example.inventorymanagements.service;

import com.example.inventorymanagements.dto.StockDTO;
import com.example.inventorymanagements.entity.Stock;
import com.example.inventorymanagements.entity.Product;
import com.example.inventorymanagements.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<StockDTO> getAllStocks() {
        return stockRepository.findAll().stream()
                .map(stock -> new StockDTO(stock.getId(), stock.getProduct().getId(), stock.getQuantity()))
                .collect(Collectors.toList());
    }

    public StockDTO createStock(StockDTO stockDTO) {
        Stock stock = new Stock();
        stock.setQuantity(stockDTO.getQuantity());
        Product product = new Product();
        product.setId(stockDTO.getProductId());
        stock.setProduct(product);
        Stock savedStock = stockRepository.save(stock);
        return new StockDTO(savedStock.getId(), savedStock.getProduct().getId(), savedStock.getQuantity());
    }
}
