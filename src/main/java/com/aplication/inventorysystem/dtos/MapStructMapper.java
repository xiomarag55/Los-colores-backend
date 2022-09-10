package com.aplication.inventorysystem.dtos;

import com.aplication.inventorysystem.model.Product;
import com.aplication.inventorysystem.model.Sale;
import com.aplication.inventorysystem.model.Users;

public interface MapStructMapper {

    ProductDto productToProductDto(Product product);

    Product productDtoToProduct(ProductDto productDto);

    SaleDto productToProductDto(Sale sale);

    Sale productDtoToProduct(SaleDto saleDto);

    UsersDto productToProductDto(Users users);

    Users productDtoToProduct(UsersDto usersDto);
}
