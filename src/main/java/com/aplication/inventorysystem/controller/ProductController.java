package com.aplication.inventorysystem.controller;

import com.aplication.inventorysystem.model.Product;
import com.aplication.inventorysystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New product is added";

    }
    @GetMapping("/getAll")
    public List<Product> getAllUsers(){
        return productService.getAllProducts();
    }
}
