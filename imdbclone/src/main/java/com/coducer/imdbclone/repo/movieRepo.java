package com.coducer.imdbclone.repo;

import com.coducer.imdbclone.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface movieRepo extends JpaRepository<Movie,Integer> {

    @Query(value = "SELECT * FROM movie WHERE name like ?1", nativeQuery = true)
   List<Movie> findbyMovieName(String name);
}
