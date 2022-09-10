package com.aplication.inventorysystem.service;


import com.aplication.inventorysystem.dtos.ProductDto;
import com.aplication.inventorysystem.model.Product;

import java.util.List;

public interface ProductService {

    ProductDto save(ProductDto product);

    ProductDto getByCode(String code);

    List<ProductDto> getAll();

    void update(ProductDto product);

    void delete(Long id);
}
