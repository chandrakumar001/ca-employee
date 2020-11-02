package com.chstore.ca.employee.review.service;

import com.chstore.ca.employee.review.dto.ReviewDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewQueryService {

    public List<ReviewDTO> getAllReviews() {

        ReviewDTO reviewDTO = getReviewDTO(UUID.randomUUID());
        return List.of(reviewDTO);
    }

    public ReviewDTO getReviewsById(String reviewId) {

        return getReviewDTO(UUID.fromString(reviewId));
    }


    private ReviewDTO getReviewDTO(UUID uuid) {

        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setProductId(UUID.randomUUID());
        reviewDTO.setRating(5);
        reviewDTO.setReviewDescription("OK");
        reviewDTO.setReviewId(UUID.randomUUID());
        return reviewDTO;
    }
}
