package com.coducer.imdbclone.repo;

import com.coducer.imdbclone.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Integer> {
}
