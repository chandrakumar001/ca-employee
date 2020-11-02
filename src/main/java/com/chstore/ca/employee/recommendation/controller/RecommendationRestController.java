package com.chstore.ca.employee.recommendation.controller;

import com.chstore.ca.employee.recommendation.dto.RecommendationDTO;
import com.chstore.ca.employee.recommendation.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationRestController {

    @Autowired
    RecommendationService recommendationService;

    public List<RecommendationDTO> getRecommends() {
        return recommendationService.getRecommends();
    }

}
