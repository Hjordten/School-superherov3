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


    public Superhero searchHero(java.lang.String superheroName) {
        return superheroRepository.searchHeroList(superheroName);
    }

    public Superhero addSuperhero(Superhero superhero) {
        return superheroRepository.addSuperhero(superhero);
    }



    public java.lang.String deleteSuperhero(java.lang.String superhero) {
        return superheroRepository.deleteSuperhero(superhero);
    }

    public Superhero editSuperhero(Superhero editSuperhero) {
        return superheroRepository.editSuperhero(editSuperhero);
    }
}
