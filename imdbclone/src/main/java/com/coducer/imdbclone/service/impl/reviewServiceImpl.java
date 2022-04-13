package com.coducer.imdbclone.service.impl;

import com.coducer.imdbclone.model.Review;
import com.coducer.imdbclone.repo.ReviewRepo;
import com.coducer.imdbclone.service.reviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class reviewServiceImpl implements reviewService {

    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public Review addReview(Review review) {
        return this.reviewRepo.save(review);
    }

    @Override
    public List<Review> getAllReview() {
        return this.reviewRepo.findAll();
    }

    @Override
    public Optional<Review> getReview(int reviewId) {
        return this.reviewRepo.findById(reviewId);
    }
}
