package com.coducer.imdbclone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Desc;

    private int Rating;

    @ManyToOne(fetch = FetchType.LAZY)
   // @JsonIgnore
    //@JoinColumn(name = "movie_id",referencedColumnName = "mid")
    @NotNull
    //@ManyToOne
    private Movie movie;

    public Review() {
    }

    public Review( String desc, int rating, Movie movie) {
        Desc = desc;
        Rating = rating;
        this.movie = movie;
    }

    public Review(int id, String desc, int rating, Movie movie) {
        this.id = id;
        Desc = desc;
        Rating = rating;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", Desc='" + Desc + '\'' +
                ", Rating=" + Rating +
                ", movie=" + movie +
                '}';
    }
}
