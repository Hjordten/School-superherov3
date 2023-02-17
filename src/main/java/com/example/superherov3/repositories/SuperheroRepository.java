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
    Superhero superhero3 = new Superhero("test", 1.5, "test", "test", true);
    private ArrayList<Superhero> heroList = new ArrayList<>(List.of(superhero, superhero1, superhero2, superhero3));


    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }


    public Superhero searchHeroList(java.lang.String superheroName) {
        Superhero superhero = null;
        for (Superhero nameSearch : heroList) {
            if (nameSearch.getSuperheroName().toLowerCase().contains(superheroName.toLowerCase())) {
                superhero = nameSearch;
            }
        }
        return superhero;
    }

    public Superhero addSuperhero(Superhero superhero) {
        heroList.add(superhero);
        return superhero;
    }

    public java.lang.String deleteSuperhero(java.lang.String superheroName) {
        int i = 0;
        while (i < heroList.size()) {
            if (heroList.get(i).getSuperheroName().equals(superheroName)){
                heroList.remove(i);
                return superheroName;
            }
            i++;
        }
        return superheroName;
    }

    public Superhero editSuperhero(Superhero editSuperhero) {
        Superhero superhero = searchHeroList(editSuperhero.getSuperheroName());
        int i=heroList.indexOf(superhero);
        heroList.set(i,editSuperhero);
        return editSuperhero;
    }

}