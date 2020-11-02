package com.chstore.ca.employee.review.controller;

import com.chstore.ca.employee.review.dto.ReviewDTO;
import com.chstore.ca.employee.review.service.ReviewQueryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Review")
public class ReviewQueryRestController {

    @Autowired
    ReviewQueryService reviewQueryService;

    @GetMapping("v1/products/{product-id}/reviews")
    public List<ReviewDTO> getAllReviews() {
        return reviewQueryService.getAllReviews();
    }

    @GetMapping("v1/products/{product-id}/reviews/{reviews-id}")
    public ReviewDTO getReviewsById(
            @RequestParam(name = "reviews-id") String reviewsId
    ) {
        return reviewQueryService.getReviewsById(reviewsId);
    }
}
