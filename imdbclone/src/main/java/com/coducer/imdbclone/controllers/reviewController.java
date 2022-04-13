package com.coducer.imdbclone.controllers;


import com.coducer.imdbclone.model.Review;
import com.coducer.imdbclone.service.reviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class reviewController {

    @Autowired
    reviewService reviewService;

    @GetMapping("/{reviewId}")
    public ResponseEntity<?> getreview(@PathVariable int reviewId ){
        return ResponseEntity.ok(this.reviewService.getReview(reviewId));
    }

    @GetMapping("/")
    public ResponseEntity<?> getreview( ){
        return ResponseEntity.ok(this.reviewService.getAllReview());
    }

    @PostMapping("/")
    public ResponseEntity<Review> add(@RequestBody Review review){
        return ResponseEntity.ok(this.reviewService.addReview(review));
    }
}
