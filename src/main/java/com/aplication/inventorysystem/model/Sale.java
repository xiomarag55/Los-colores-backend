package com.aplication.inventorysystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private float priceProduct;
    private int unitsProduct;
    private float discountProduct;
    private float priceTotal;

    public Sale() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getUnitsProduct() {
        return unitsProduct;
    }

    public void setUnitsProduct(int unitsProduct) {
        this.unitsProduct = unitsProduct;
    }

    public float getDiscountProduct() {
        return discountProduct;
    }

    public void setDiscountProduct(float discountProduct) {
        this.discountProduct = discountProduct;
    }

    public float getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(float priceTotal) {
        this.priceTotal = priceTotal;
    }
}
