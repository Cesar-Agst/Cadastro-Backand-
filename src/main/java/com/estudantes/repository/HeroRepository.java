package com.estudantes.repository;

import com.estudantes.Entities.Hero;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository <Hero, Long>{
    
}
