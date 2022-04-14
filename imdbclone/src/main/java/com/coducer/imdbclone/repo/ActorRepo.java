package com.coducer.imdbclone.repo;

import com.coducer.imdbclone.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepo extends JpaRepository<Actor,Integer> {

    @Query(value="select a from Actor a where a.name like ?1")
    List<Actor> getByName(String Name);


}
