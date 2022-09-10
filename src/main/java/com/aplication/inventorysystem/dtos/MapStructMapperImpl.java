package com.aplication.inventorysystem.dtos;

import com.aplication.inventorysystem.model.Product;
import com.aplication.inventorysystem.model.Sale;
import com.aplication.inventorysystem.model.Users;
import org.springframework.stereotype.Component;

@Component
public class MapStructMapperImpl implements MapStructMapper {
    @Override
    public ProductDto productToProductDto(Product product) {
        if (product == null)
            return null;

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setCode(product.getCode());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setStock(product.getStock());

        return productDto;
    }

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        if (productDto == null)
            return null;

        Product product = new Product();
        product.setId(productDto.getId());
        product.setCode(productDto.getCode());
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setStock(productDto.getStock());

        return product;
    }

    @Override
    public SaleDto productToProductDto(Sale sale) {
        return null;
    }

    @Override
    public Sale productDtoToProduct(SaleDto saleDto) {
        return null;
    }

    @Override
    public UsersDto productToProductDto(Users users) {
        return null;
    }

    @Override
    public Users productDtoToProduct(UsersDto usersDto) {
        return null;
    }
}
