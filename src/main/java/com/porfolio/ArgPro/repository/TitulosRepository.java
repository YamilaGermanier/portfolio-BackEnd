package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulosRepository extends JpaRepository<Titulos,Integer>{
    
}
