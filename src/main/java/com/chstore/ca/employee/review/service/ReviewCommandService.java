package com.chstore.ca.employee.review.service;

import com.chstore.ca.employee.product.dto.ProductDTO;
import com.chstore.ca.employee.review.client.ProductClient;
import com.chstore.ca.employee.review.dto.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
public class ReviewCommandService {

    @Autowired
    ProductClient productClient;

    public ReviewDTO createReview(String productId,
                                  ReviewDTO reviewDTO) {
        //check product is exists
        // invalid product
        if (productId.equals("throw")) {
            InvalidProduct1(productId);
        }
        InvalidProduct(productId);

        System.out.println("New Review create");
        return reviewDTO;
    }

    public void InvalidProduct1(String productId) {

        final ResponseEntity<ProductDTO> responseEntity = productClient.getProductDTO1(
                productId
        );
        if (!responseEntity.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("status code consume");
        }

        final ProductDTO entityBody = responseEntity.getBody();

        if (nonNull(entityBody) && isNull(entityBody.getId())) {
            throw new RuntimeException("product is not found");
        }
    }

    public void InvalidProduct(String productId) {

        final ResponseEntity<ProductDTO> responseEntity = productClient.getProductDTO(
                productId
        );
        if (!responseEntity.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("status code consume");
        }

        final ProductDTO entityBody = responseEntity.getBody();

        if (nonNull(entityBody) && isNull(entityBody.getId())) {
            throw new RuntimeException("product is not found");
        }
    }

    public String deleteReview(String productId,
                               String reviewId) {
        return null;
    }

    public ReviewDTO updateReview(String productId,
                                  String reviewId,
                                  ReviewDTO reviewDTO) {

        return null;
    }
}
