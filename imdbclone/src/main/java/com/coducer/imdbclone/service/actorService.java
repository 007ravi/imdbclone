package com.coducer.imdbclone.service;

import com.coducer.imdbclone.model.Actor;

import java.util.List;
import java.util.Optional;

public interface actorService {
    Actor addActor(Actor actor);

    List<Actor> getAllActor();

    Actor getActorById(int id);

    List<Actor> getActorByName(String name);

    Optional<Actor> getActorByNamemoviejson(int name);
}
