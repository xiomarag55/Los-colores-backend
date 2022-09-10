package com.aplication.inventorysystem.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
public class SaleDto {
    @NotNull
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
