package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.SobreMi;
import com.porfolio.ArgPro.repository.SobreMiRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SobreMiService {
    
    @Autowired
    public SobreMiRepository aboutRepo;
    
    public SobreMi buscarSobreMi(int id) {
     SobreMi about = aboutRepo.findById(id).orElse(null);
        return about;
    }
    
    public void crearSobreMi(SobreMi about) {
        aboutRepo.save(about);
    }
    
    public void borrarSobreMi(int id){
        aboutRepo.deleteById(id);
    }
    
    public void editarSobreMi(SobreMi about) {
        aboutRepo.save(about);
    }
}
