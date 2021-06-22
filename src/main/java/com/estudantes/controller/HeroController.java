package com.estudantes.controller;


import java.util.List;

import com.estudantes.Entities.Hero;
import com.estudantes.repository.HeroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
}
