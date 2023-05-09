package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades,Integer>{
    
}
