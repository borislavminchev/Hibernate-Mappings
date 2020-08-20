package com.borislavmm.service;

import com.borislavmm.entity.Review;
import com.borislavmm.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository repository;

    @Override
    public Review getReviewById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Review> getAllReviews() {
        return repository.findAll();
    }

    @Override
    public Review saveReview(Review review) {
        return repository.save(review);
    }

    @Override
    public void deleteReview(Review review) {
        repository.delete(review);
    }

    @Override
    public void deleteReviewById(long id) {
        repository.deleteById(id);
    }
}
