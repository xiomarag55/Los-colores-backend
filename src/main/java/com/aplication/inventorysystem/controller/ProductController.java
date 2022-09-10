package com.aplication.inventorysystem.controller;

import com.aplication.inventorysystem.dtos.MapStructMapper;
import com.aplication.inventorysystem.dtos.ProductDto;
import com.aplication.inventorysystem.model.Product;
import com.aplication.inventorysystem.service.ProductService;
import com.aplication.inventorysystem.utils.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody ProductDto productDto) {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", productService.save(productDto)));
    }

    @GetMapping("/getCode")
    public ResponseEntity<Object> getByCode(@RequestParam String code) {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", productService.getByCode(code)));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", productService.getAll()));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody ProductDto productDto) {
        productService.update(productDto);
        return HandleResponse.buildProductResponse(MapUtils.buildEmptyMap());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestParam Long id) {
        productService.delete(id);
        return HandleResponse.buildProductResponse(MapUtils.buildEmptyMap());
    }
}
