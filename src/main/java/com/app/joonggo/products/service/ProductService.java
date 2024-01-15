package com.app.joonggo.products.service;

import com.app.joonggo.products.entity.Product;
import com.app.joonggo.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getProductList() {
        return productRepository.findAll();
    }
}
