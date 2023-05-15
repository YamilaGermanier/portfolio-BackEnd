package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Habilidades;
import com.porfolio.ArgPro.service.HabilidadesService;
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
@RequestMapping("habilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadesController {
    
    @Autowired
    HabilidadesService habServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidades> verHabilidades(){
        return habServ.verHabilidades();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidades verHabilidad(@PathVariable int id){
        return habServ.buscarHabilidad(id);
    }
    
    @PostMapping("/crear")
    public String agregarHabilidad(@RequestBody Habilidades habilidad){
        habServ.crearHabilidad(habilidad);
        return"La habilidad fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidad(@PathVariable int id){
        habServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
}
    @PutMapping("/editar")
    public String modificarHabilidad(@RequestBody Habilidades habilidad){
        habServ.editarHabilidad(habilidad);
        return "Los datos se guardaron correctamente.";
    }
    
}
