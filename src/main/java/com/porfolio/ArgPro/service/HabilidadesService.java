package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Habilidades;
import com.porfolio.ArgPro.repository.HabilidadesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesService {
    @Autowired
    public HabilidadesRepository habRepo;
    
    public List<Habilidades> verHabilidades(){
        List<Habilidades> listaHabilidades = habRepo.findAll();
        return listaHabilidades;
    }
    
    public Habilidades buscarHabilidad(int id) {
      Habilidades habilidad = habRepo.findById(id).orElse(null);
        return habilidad;
    }
    
    public void crearHabilidad(Habilidades habilidad) {
        habRepo.save(habilidad);
    }
    
    public void borrarHabilidad(int id){
        habRepo.deleteById(id);
    }
    
    public void editarHabilidad(Habilidades habilidad) {
        habRepo.save(habilidad);
    }
}
