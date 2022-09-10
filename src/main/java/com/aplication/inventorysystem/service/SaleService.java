package com.aplication.inventorysystem.service;

import com.aplication.inventorysystem.model.Sale;

import java.util.List;

public interface SaleService {

    Sale save(Sale sale);

    List<Sale> getAll();

    void update(Sale product);

    void delete(Long id);
}
