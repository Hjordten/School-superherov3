package com.example.superherov3.services;

import com.example.superherov3.models.Superhero;
import com.example.superherov3.repositories.SuperheroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    private SuperheroRepository superheroRepository;

    public SuperheroService(SuperheroRepository superheroRepository){
        this.superheroRepository = superheroRepository;
    }


    public List<Superhero> getHeroList() {
        return superheroRepository.getHeroList();
    }


    public List<Superhero> searchHero(String superheroName) {
        return superheroRepository.searchHeroList(superheroName);
    }
}
