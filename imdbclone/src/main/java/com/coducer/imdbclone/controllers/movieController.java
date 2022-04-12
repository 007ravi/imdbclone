package com.coducer.imdbclone.controllers;

import com.coducer.imdbclone.model.movie;
import com.coducer.imdbclone.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class movieController {

    @Autowired
    movieService movieService;

    @PostMapping("/")
    public ResponseEntity<movie> add(@RequestBody movie movie){
        return ResponseEntity.ok(this.movieService.addmovie(movie));
    }
    @GetMapping("/getmovie/{name}")
    public ResponseEntity<List<movie>> add(@PathVariable String name){
        return ResponseEntity.ok(this.movieService.getmovie(name));
    }
}
