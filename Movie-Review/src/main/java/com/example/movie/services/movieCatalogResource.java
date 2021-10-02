package com.example.movie.services;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class movieCatalogResource {

    public List<movie_Info> getCatalog(String userId){
        return Collections.singletonList(
                new movie_Info("Full Metal Jacket","Civil war movie",8)
        );
    }

}
