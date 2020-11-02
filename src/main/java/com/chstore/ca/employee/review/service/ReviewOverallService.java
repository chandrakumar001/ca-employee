package com.chstore.ca.employee.review.service;

import com.chstore.ca.employee.review.dto.ReviewOverallDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewOverallService {


    public List<ReviewOverallDTO> getOverallReviews() {

        ReviewOverallDTO reviewOverallDTO = new ReviewOverallDTO();
        reviewOverallDTO.setFiveStar(1);
        reviewOverallDTO.setFourStar(3);
        reviewOverallDTO.setThreeStar(6);
        reviewOverallDTO.setTwoStar(6);
        reviewOverallDTO.setOneStar(4);
        return List.of(reviewOverallDTO);
    }
}
