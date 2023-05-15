package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Proyectos;
import com.porfolio.ArgPro.repository.ProyectosRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    
    @Autowired
    public ProyectosRepository proyectRepo;
    
    public List<Proyectos> verProyectos(){
        List<Proyectos> listaProyectos = proyectRepo.findAll();
        return listaProyectos;
    }
    
    public Proyectos buscarProyecto(int id) {
      Proyectos proyecto = proyectRepo.findById(id).orElse(null);
        return proyecto;
    }
    
    public void crearProyecto(Proyectos proyecto) {
        proyectRepo.save(proyecto);
    }
    
    public void borrarProyecto(int id){
        proyectRepo.deleteById(id);
    }
    
    public void editarProyecto(Proyectos proyecto) {
        proyectRepo.save(proyecto);
    }
    
}
