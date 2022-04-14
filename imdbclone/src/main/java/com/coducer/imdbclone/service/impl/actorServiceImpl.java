package com.coducer.imdbclone.service.impl;

import com.coducer.imdbclone.model.Actor;
import com.coducer.imdbclone.repo.ActorRepo;
import com.coducer.imdbclone.service.actorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class actorServiceImpl implements actorService {
    @Autowired
    ActorRepo actorRepo;

    @Override
    public Actor addActor(Actor actor) {
        return this.actorRepo.save(actor);
    }

    @Override
    public List<Actor> getAllActor() {
        return this.actorRepo.findAll();
    }

    @Override
    public Actor getActorById(int id) {
        return this.actorRepo.getById(id);
    }

    @Override
    public List<Actor> getActorByName(String name) {
        String nameLike="%"+name+"%";
        return this.actorRepo.getByName(nameLike);
    }

    @Override
    public Optional<Actor> getActorByNamemoviejson(int id) {
        //name="%"+name+"%";
        return this.actorRepo.findById(id);
    }
}
