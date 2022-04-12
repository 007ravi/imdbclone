package com.coducer.imdbclone.service.impl;

import com.coducer.imdbclone.model.movie;
import com.coducer.imdbclone.repo.movieRepo;
import com.coducer.imdbclone.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieServiceImpll implements movieService {


    @Autowired
    movieRepo movieRepo;

    @Override
    public movie addmovie(movie movie) {
        movie m=this.movieRepo.save(movie);

        return m;
    }

    @Override
    public List<movie> getmovie(String name) {
        name="%"+name+"%";
        List<movie> m=this.movieRepo.findbyMovieName(name);
        return m;
    }
}
