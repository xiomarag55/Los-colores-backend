package com.aplication.inventorysystem.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private Long userId;
    @NotBlank
    private Long productId;
    @NotBlank
    private String productCode;
    @NotBlank
    private float price;
    @NotBlank
    private int units;
    @NotBlank
    private float discount;
    @NotBlank
    private float total;
    @NotNull
    private Date date;
}
