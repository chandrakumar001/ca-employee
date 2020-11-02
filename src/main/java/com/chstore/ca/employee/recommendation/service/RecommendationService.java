package com.chstore.ca.employee.recommendation.service;

import com.chstore.ca.employee.recommendation.dto.RecommendationDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RecommendationService {

    public List<RecommendationDTO> getRecommends() {
        RecommendationDTO recommendationDTO = new RecommendationDTO();
        recommendationDTO.setProductDescription("new product");
        recommendationDTO.setProductId(UUID.randomUUID());
        recommendationDTO.setProductName("PRD1");
        recommendationDTO.setTotalRating(3);
        recommendationDTO.setReviewerCount(11);
        return List.of(recommendationDTO);
    }

}
