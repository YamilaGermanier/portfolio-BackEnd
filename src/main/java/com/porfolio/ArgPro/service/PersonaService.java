package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Persona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.ArgPro.repository.PersonaRepository;
import java.util.List;

@Service
@Transactional
public class PersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    
    public List<Persona> verPersonas(){
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }
    
    public Persona buscarPersona(int id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    public void crearPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    public void borrarPersona(int id){
        persoRepo.deleteById(id);
    }
    
    public void editarPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
      /*public void editarSobreMi(Persona perso) {
        Persona old = persoRepo.findById((int)1).orElse(null);
        assert old != null;
        old.setSobreMi(perso.getSobreMi());
        persoRepo.save(old);
    }*/

    public void editarPerfil(Persona perso) {
        Persona old = persoRepo.findById((int)1).orElse(null);
        assert old != null;
        old.setImagenPerfil(perso.getImagenPerfil());
        persoRepo.save(old);

    }

    /*public void editarBanner(Persona perso) {
        Persona old = persoRepo.findById((int)1).orElse(null);
        assert old != null;
        old.setBanner(perso.getBanner());
        persoRepo.save(old);

    }*/
}
