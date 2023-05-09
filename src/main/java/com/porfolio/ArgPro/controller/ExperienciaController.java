package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Experiencia;
import com.porfolio.ArgPro.service.ExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expeServ.verExperiencias();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return expeServ.buscarExperiencia(id);
    }
    
    @PostMapping("/crear")
    public String agregarExperiencia(@RequestBody Experiencia expe){
        expeServ.crearExperiencia(expe);
        return"La Experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        expeServ.borrarExperiencia(id);
        return "La Experiencia fue borrada correctamente";
}
    @PutMapping("/editar")
    public String modificarExperiencia(@RequestBody Experiencia expe){
        expeServ.editarExperiencia(expe);
        return"Los datos se guardaron correctamente.";
    }
}
