package com.estudantes.controller;

import java.util.List;
import java.util.Optional;

import com.estudantes.entities.Estudantes;
import com.estudantes.repository.EstudantesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



@RestController
@RequestMapping("/estudantes")
public class HeroController {
    
    @Autowired 
    private HeroRepository repo;

    @GetMapping
    public List<Hero> getHeroes()
    {

        List<Hero> lista = repo.findAll();

        

        return lista;
    }
    
 @GetMapping("{id}")
    public Hero getHero(@PathVariable Long id){

        Optional<Hero> op = repo.findById(id);
         Hero hero = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return hero;
    }
}
