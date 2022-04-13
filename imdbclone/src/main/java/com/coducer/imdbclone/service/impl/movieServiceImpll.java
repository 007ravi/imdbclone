package com.coducer.imdbclone.service.impl;

import com.coducer.imdbclone.model.Movie;
import com.coducer.imdbclone.model.Review;
import com.coducer.imdbclone.repo.ReviewRepo;
import com.coducer.imdbclone.repo.movieRepo;
import com.coducer.imdbclone.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class movieServiceImpll implements movieService {


    @Autowired
    movieRepo movieRepo;

    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public Movie addmovie(Movie movie) {
        System.out.println("moovie service"+ movie.toString());
        Movie m=this.movieRepo.save(movie);

//        List<Review>reviewList=movie.getReviews();
//
//        for(Review r:reviewList)
//            r.setMovie(movie);
//
//        this.reviewRepo.saveAll(reviewList);

        return m;
    }

    @Override
    public List<Movie> getmovie(String name) {
        name="%"+name+"%";
        List<Movie> m=this.movieRepo.findbyMovieName(name);
        return m;
    }

    @Override
    public Optional<Movie> getmoviebyId(int movieId) {
        return this.movieRepo.findById(movieId);
    }
}
