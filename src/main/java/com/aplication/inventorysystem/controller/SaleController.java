package com.aplication.inventorysystem.controller;

import com.aplication.inventorysystem.model.Sale;
import com.aplication.inventorysystem.service.SaleService;
import com.aplication.inventorysystem.utils.MapUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class SaleController {


    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Sale sale) {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", saleService.save(sale)));

    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllSales() {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", saleService.getAll()));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Sale sale) {
        saleService.update(sale);
        return HandleResponse.buildProductResponse(MapUtils.buildEmptyMap());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestParam Long id) {
        saleService.delete(id);
        return HandleResponse.buildProductResponse(MapUtils.buildEmptyMap());
    }

}
