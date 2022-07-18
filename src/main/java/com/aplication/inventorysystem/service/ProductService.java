package com.aplication.inventorysystem.service;


import com.aplication.inventorysystem.model.Product;
import com.aplication.inventorysystem.model.User;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> getAllProducts();


}
