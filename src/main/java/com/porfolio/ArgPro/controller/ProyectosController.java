package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Proyectos;
import com.porfolio.ArgPro.service.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
    
    @Autowired
    ProyectosService proyectServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proyectServ.verProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyectos verProyecto(@PathVariable int id){
        return proyectServ.buscarProyecto(id);
    }
    
    @PostMapping("/crear")
    public String agregarPersona(@RequestBody Proyectos proyecto){
        proyectServ.crearProyecto(proyecto);
        return"El Proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        proyectServ.borrarProyecto(id);
        return "El Proyecto fue borrado correctamente";
}
    @PutMapping("/editar")
    public String modificarProyecto(@RequestBody Proyectos proyecto){
        proyectServ.editarProyecto(proyecto);
        return "Los datos se guardaron correctamente.";
    }
}
