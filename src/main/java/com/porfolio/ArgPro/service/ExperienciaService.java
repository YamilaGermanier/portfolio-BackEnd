package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Experiencia;
import com.porfolio.ArgPro.repository.ExperienciaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    public List<Experiencia> verExperiencias(){
        List<Experiencia> listaExperiencias = expeRepo.findAll();
        return listaExperiencias;
    }
    
    public Experiencia buscarExperiencia(int id) {
      Experiencia expe = expeRepo.findById(id).orElse(null);
        return expe;
    }
    
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
    
    public void borrarExperiencia(int id){
        expeRepo.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
}
