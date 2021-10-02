package com.example.movie.services;

import org.springframework.web.bind.annotation.RestController;

public class movie_Info {
    private String name;
    private String description;
    private double rating;

    public movie_Info(String name, String description, double rating) {
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

    public double getRating() {
        return rating;
    }
}
