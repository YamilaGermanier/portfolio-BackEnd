package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer> {
}
