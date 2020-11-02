package com.chstore.ca.employee.product.service;

import com.chstore.ca.employee.product.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductQueryService {

    public List<ProductDTO> getProducts() {

        ProductDTO product = getProductDTO(UUID.randomUUID());
        return List.of(product);
    }

    public ProductDTO getProductsById(String productId) {

        return getProductDTO(UUID.fromString(productId));
    }

    private ProductDTO getProductDTO(UUID uuid) {

        ProductDTO product = new ProductDTO();
        product.setId(uuid);
        product.setDescription("PRD1");
        product.setTitleDescription("USB");
        return product;
    }
}