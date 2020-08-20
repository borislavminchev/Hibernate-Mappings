package com.borislavmm.service;

import com.borislavmm.entity.Course;
import com.borislavmm.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    Review getReviewById(long id);

    List<Review> getAllReviews();

    Review saveReview(Review review);

    void deleteReview(Review review);

    void deleteReviewById(long id);
}
