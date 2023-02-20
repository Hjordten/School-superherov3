package com.example.superherov3.controllers;

import com.example.superherov3.models.Superhero;
import com.example.superherov3.services.SuperheroService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "superhero")
public class MyController {
    private SuperheroService superheroService;

    public MyController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping(path = "/herolist")
    public ResponseEntity<String> getHeroList() {
        superheroService.getHeroList();
        //return new ResponseEntity<>(superheroList, HttpStatus.OK);

        HttpHeaders responsHeaders = new HttpHeaders();
        responsHeaders.set("Content type", "text/html");

        return new ResponseEntity<>(
                "<html><body><h1>" +
                 superheroService.getHeroList() +
                "</h1></body></html>"
                ,responsHeaders, HttpStatus.OK);
    }

    @GetMapping(path = "herolist/{id}")
    public ResponseEntity<Superhero> searchHeroList(@PathVariable java.lang.String id) {
        Superhero superhero = superheroService.searchHero(id);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }

    @PostMapping(path = "addSuperhero")
    public ResponseEntity<Superhero> createHero(@RequestBody Superhero superhero) {
        Superhero returnMessage = superheroService.addSuperhero(superhero);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }

    @PutMapping(path = "editSuperhero")
    public ResponseEntity<Superhero> editSuperhero(@RequestBody Superhero editSuperhero) {
        Superhero returnMessage = superheroService.editSuperhero(editSuperhero);
        return new ResponseEntity<>(returnMessage, HttpStatus.OK);
    }


    @DeleteMapping(path = "deletesuperhero/{superheroName}")
    public ResponseEntity<Superhero> deleteSuperhero(@PathVariable java.lang.String superheroName){
        superheroService.deleteSuperhero(superheroName);
        return new ResponseEntity("Superhero deleted", HttpStatus.OK);
    }


}
