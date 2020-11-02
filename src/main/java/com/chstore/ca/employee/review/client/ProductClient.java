package com.chstore.ca.employee.review.client;

import com.chstore.ca.employee.product.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        qualifier = "chFeign",
        name = "productClient",
        url = "http://localhost:8080/",
        fallback = ProductClientFallback.class
)
public interface ProductClient {

    @GetMapping("v1/products/{product-id}")
    ResponseEntity<ProductDTO> getProductDTO(
            @RequestParam(name = "product-id") String productId
    );

    @GetMapping("v1/products1/{product-id}")
    ResponseEntity<ProductDTO> getProductDTO1(
            @RequestParam(name = "product-id") String productId
    );

}