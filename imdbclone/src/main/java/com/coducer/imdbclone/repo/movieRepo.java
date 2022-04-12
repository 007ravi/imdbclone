package com.coducer.imdbclone.repo;

import com.coducer.imdbclone.model.movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface movieRepo extends JpaRepository<movie,Integer> {

    @Query(value = "SELECT * FROM movie WHERE m_name like ?1", nativeQuery = true)
   List<movie> findbyMovieName(String name);
}
