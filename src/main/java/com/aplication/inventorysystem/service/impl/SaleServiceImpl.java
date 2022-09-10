package com.aplication.inventorysystem.service.impl;

import com.aplication.inventorysystem.dtos.SaleDto;
import com.aplication.inventorysystem.model.Sale;
import com.aplication.inventorysystem.repository.SaleRepository;
import com.aplication.inventorysystem.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> getAll() {
        return (List<Sale>) saleRepository.findAll();
    }

    @Override
    public void update(Sale product) {
        saleRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        saleRepository.deleteById(id);
    }

}
