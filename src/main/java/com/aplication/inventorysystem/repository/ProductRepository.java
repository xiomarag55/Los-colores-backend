package com.aplication.inventorysystem.repository;

import com.aplication.inventorysystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer > {
}
