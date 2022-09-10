package com.aplication.inventorysystem.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UsersDto {

    private int id;
    @NotBlank
    private String identification;
    @NotBlank
    private String name;
    @NotBlank
    private String lastname;
    @NotBlank
    private String email;
    @NotBlank
    private String pass;
    @NotBlank
    private String role;
}
