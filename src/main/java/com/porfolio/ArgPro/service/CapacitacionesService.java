package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Capacitaciones;
import com.porfolio.ArgPro.repository.CapacitacionesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CapacitacionesService {
    
    @Autowired
    public CapacitacionesRepository capaRepo;
    
    public List<Capacitaciones> verCapacitaciones(){
        List<Capacitaciones> listaCapacitaciones = capaRepo.findAll();
        return listaCapacitaciones;
    }
    
    public Capacitaciones buscarCapacitacion(int id) {
      Capacitaciones capa = capaRepo.findById(id).orElse(null);
        return capa;
    }
    
    public void crearCapacitacion(Capacitaciones capa) {
        capaRepo.save(capa);
    }
    
    public void borrarCapacitacion(int id){
        capaRepo.deleteById(id);
    }
    
    public void editarCapacitacion(Capacitaciones capa) {
        capaRepo.save(capa);
    }
}
