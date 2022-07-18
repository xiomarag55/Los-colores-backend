package com.aplication.inventorysystem.repository;

import com.aplication.inventorysystem.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Integer > {
}
