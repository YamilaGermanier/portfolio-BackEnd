package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Integer> {
    
}
