package com.aplication.inventorysystem.controller;

import com.aplication.inventorysystem.model.Sale;
import com.aplication.inventorysystem.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping("/add")
    public String add(@RequestBody Sale sale){
        saleService.saveSale(sale);
        return "New sale is added";

    }
    @GetMapping("/getAll")
    public List<Sale> getAllSales(){
        return saleService.getAllSales();
    }

}
