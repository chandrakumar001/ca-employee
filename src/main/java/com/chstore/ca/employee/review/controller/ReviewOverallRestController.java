package com.chstore.ca.employee.review.controller;

import com.chstore.ca.employee.review.dto.ReviewOverallDTO;
import com.chstore.ca.employee.review.service.ReviewOverallService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Review")
public class ReviewOverallRestController {

    @Autowired
    ReviewOverallService reviewOverallService;

    @GetMapping("v1/products/{product-id}/review-all")
    public List<ReviewOverallDTO> getOverallReviews(
            @RequestParam(name = "reviews-id") String reviewsId
    ) {

        return reviewOverallService.getOverallReviews();
    }
}
