package com.example.movie.services;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class movie_Info {
    private String name;
    private String description;
    private int rating;

    public movie_Info(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }
}
