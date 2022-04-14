package com.coducer.imdbclone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;

    private String name;

    private String desc;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_actors",
            joinColumns = @JoinColumn(name = "mid"),
            inverseJoinColumns = @JoinColumn(name = "aid"))
    private Set<Actor> actors=new HashSet<>();

    //@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "movie",targetEntity = Review.class)
   @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Review> reviews=new ArrayList<>();


    public Movie() {
    }

    public Movie( String name, String desc,  List<Review> reviews) {
        this.name = name;
        this.desc = desc;
        this.reviews = reviews;
    }


    public Movie(int mid, String name, String desc, Set<Actor> actors, List<Review> reviews) {
        this.mid = mid;
        this.name = name;
        this.desc = desc;
        this.actors = actors;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public  List<Review> getReviews() {
        return reviews;
    }

    public void setReviews( List<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + mid +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
