package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Capacitaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapacitacionesRepository extends JpaRepository <Capacitaciones,Integer>{
    
}
