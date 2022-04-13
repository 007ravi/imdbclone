package com.coducer.imdbclone.service;

import com.coducer.imdbclone.model.Movie;

import java.util.List;
import java.util.Optional;


public interface movieService {

    public Movie addmovie(Movie movie);

   public List<Movie> getmovie(String name);

    Optional<Movie> getmoviebyId(int movieId);
}
