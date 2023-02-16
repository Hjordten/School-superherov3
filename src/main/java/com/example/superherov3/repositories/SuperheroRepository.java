package com.example.superherov3.repositories;

import com.example.superherov3.models.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository {
    Superhero superhero = new Superhero("test", 1.5, "test", "true", false);
    Superhero superhero1 = new Superhero("test", 1.5, "test", "true", false);
    Superhero superhero2 = new Superhero("test", 1.5, "test", "true", true);
    Superhero superhero3 = new Superhero("test", 1.5, "test", "test",true);
    private ArrayList<Superhero> heroList = new ArrayList<>(List.of(superhero, superhero1, superhero2, superhero3));



    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }


    public List<Superhero> searchHeroList(String superheroName) {
        List<Superhero> searchList = new ArrayList<>();
        for (Superhero nameSearch : heroList) {
            if (nameSearch.getSuperheroName().toLowerCase().contains(superheroName.toLowerCase())) {
                searchList.add(nameSearch);
            }
        }
        return searchList;
    }

}
