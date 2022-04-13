package com.coducer.imdbclone.service;

import com.coducer.imdbclone.model.Review;

import java.util.List;
import java.util.Optional;

public interface reviewService {

    Optional<Review> getReview(int reviewId);

    Review addReview(Review review);

    List<Review> getAllReview();
}
