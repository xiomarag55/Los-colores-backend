package com.aplication.inventorysystem.service;

import com.aplication.inventorysystem.model.Sale;


import java.util.List;

public interface SaleService {

    public Sale saveSale(Sale sale);
    public List<Sale> getAllSales();
}
