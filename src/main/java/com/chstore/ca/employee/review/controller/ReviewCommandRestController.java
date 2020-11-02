package com.chstore.ca.employee.review.controller;

import com.chstore.ca.employee.review.dto.ReviewDTO;
import com.chstore.ca.employee.review.service.ReviewCommandService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Review")
public class ReviewCommandRestController {

    @Autowired
    ReviewCommandService reviewCommandService;


    //TODO which product
    // which order you got review
    @PostMapping("v1/products/{product-id}/reviews")
    public ReviewDTO createReview(
            @RequestParam(name = "product-id") String productId,
            @RequestBody ReviewDTO reviewDTO
    ) {

        return reviewCommandService.createReview(
                productId,
                reviewDTO
        );
    }

    @PutMapping("v1/products/{product-id}/reviews/{review-id}")
    public ReviewDTO updateReview(
            @RequestParam(name = "product-id") String productId,
            @RequestParam(name = "review-id") String reviewId,
            @RequestBody ReviewDTO reviewDTO
    ) {
        return reviewCommandService.updateReview(
                productId,
                reviewId,
                reviewDTO
        );
    }

    @DeleteMapping("v1/products/{product-id}/reviews/{review-id}")
    public String deleteReview(
            @RequestParam(name = "product-id") String productId,
            @RequestParam(name = "review-id") String reviewId
    ) {
        return reviewCommandService.deleteReview(productId, reviewId);
    }
}
