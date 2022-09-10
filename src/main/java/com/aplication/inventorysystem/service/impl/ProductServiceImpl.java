package com.aplication.inventorysystem.service.impl;


import com.aplication.inventorysystem.dtos.MapStructMapper;
import com.aplication.inventorysystem.dtos.ProductDto;
import com.aplication.inventorysystem.model.Product;
import com.aplication.inventorysystem.repository.ProductRepository;
import com.aplication.inventorysystem.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final MapStructMapper mapStructMapper;

    public ProductServiceImpl(ProductRepository productRepository, MapStructMapper mapStructMapper) {
        this.productRepository = productRepository;
        this.mapStructMapper = mapStructMapper;
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = productRepository.save(mapStructMapper.productDtoToProduct(productDto));
        return mapStructMapper.productToProductDto(product);
    }

    @Override
    public ProductDto getByCode(String code) {
        return mapStructMapper.productToProductDto(productRepository.findByCode(code));
    }

    @Override
    public List<ProductDto> getAll() {
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : productRepository.findAll()) {
            productDtos.add(mapStructMapper.productToProductDto(product));
        }
        return productDtos;
    }

    @Override
    public void update(ProductDto productDto) {
        productRepository.save(mapStructMapper.productDtoToProduct(productDto));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
