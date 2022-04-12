package com.coducer.imdbclone.service;

import com.coducer.imdbclone.model.movie;
import org.springframework.stereotype.Service;

import java.util.List;


public interface movieService {

    public movie addmovie(movie movie);

   public List<movie> getmovie(String name);
}
