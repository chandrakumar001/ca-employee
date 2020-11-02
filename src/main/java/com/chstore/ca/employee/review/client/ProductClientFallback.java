package com.chstore.ca.employee.review.client;

import com.chstore.ca.employee.product.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
class ProductClientFallback implements ProductClient {


    @Override
    public ResponseEntity<ProductDTO> getProductDTO(String productId) {

        final ProductDTO productDTO = getProductDTO();
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductDTO> getProductDTO1(String productId) {

        final ProductDTO productDTO = getProductDTO();
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }

    private ProductDTO getProductDTO() {

        final ProductDTO productDTO = new ProductDTO();
        productDTO.setName("fallback Name");
        productDTO.setDescription("fallback Description");
        return productDTO;
    }
}