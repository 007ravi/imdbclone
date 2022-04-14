package com.coducer.imdbclone.controllers;

import com.coducer.imdbclone.model.Actor;
import com.coducer.imdbclone.service.actorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actor")
public class actorController {

    @Autowired
    actorService actorservice;

    @PostMapping
    public Actor createActor(@RequestBody Actor actor)
    {
        Actor newact=this.actorservice.addActor(actor);
        return newact;
    }

    @GetMapping
    public List<Actor> getAllActor()
    {
        List<Actor> newact=this.actorservice.getAllActor();
        return newact;
    }
    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable int id)
    {
        Actor newact=this.actorservice.getActorById(id);
        return newact;
    }

    @GetMapping("/name/{name}")
    public List<Actor> getActorByName(@PathVariable String name)
    {
        List<Actor> newact=this.actorservice.getActorByName(name);
        return newact;
    }

    @GetMapping("/id/{id}}")
    public Optional<Actor> getActorByNameMovie(@PathVariable int id)
    {
        Optional<Actor> newact=this.actorservice.getActorByNamemoviejson(id);
        return newact;
    }
}
