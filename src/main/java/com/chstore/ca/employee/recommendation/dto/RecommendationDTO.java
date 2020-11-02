package com.chstore.ca.employee.recommendation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class RecommendationDTO {

    private UUID productId;
    private String productName;
    private String productDescription;

    private int totalRating;
    private int reviewerCount;
}
