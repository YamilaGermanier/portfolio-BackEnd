package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos,Integer>{
    
}
