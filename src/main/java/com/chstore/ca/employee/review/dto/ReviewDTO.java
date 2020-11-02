package com.chstore.ca.employee.review.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
public class ReviewDTO {

    private UUID reviewId;
    private String reviewDescription;
    private int rating;

    private String userName;
    private String userPic;

    private UUID productId;
}
