package com.example.superherov3.controllers;

import com.example.superherov3.models.Superhero;
import com.example.superherov3.services.SuperheroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "superhero")
public class MyController {

    private SuperheroService superheroService;

    public MyController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping(path = "/herolist")
    public ResponseEntity <List<Superhero>> getHeroList(){
        List<Superhero> superheroList = superheroService.getHeroList();
        return new ResponseEntity<>(superheroList, HttpStatus.OK);
    }

    @GetMapping(path = "herolist/{id}")
    public ResponseEntity<List<Superhero>> searchHeroList(@PathVariable String id) {

        List<Superhero> superheroList = superheroService.searchHero(id);

        return new ResponseEntity<>(superheroList, HttpStatus.OK);
    }

}
