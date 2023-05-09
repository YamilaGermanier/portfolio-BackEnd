package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Titulos;
import com.porfolio.ArgPro.repository.TitulosRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TitulosService {
    
    @Autowired
    public TitulosRepository titulosRepo;
    
    public List<Titulos> verTitulos(){
        List<Titulos> listaTitulos = titulosRepo.findAll();
        return listaTitulos;
    }
    
    public Titulos buscarTitulos(int id) {
      Titulos titul = titulosRepo.findById(id).orElse(null);
        return titul;
    }
    
    public void crearTitulos(Titulos titul) {
        titulosRepo.save(titul);
    }
    
    public void borrarTitulos(int id){
        titulosRepo.deleteById(id);
    }
    
    public void editarTitulos(Titulos titul) {
        titulosRepo.save(titul);
    }
    
}
