package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Persona;
import com.porfolio.ArgPro.service.PersonaService;
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
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    PersonaService persoServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping("/crear")
    public String agregarPersona(@RequestBody Persona perso){
        persoServ.crearPersona(perso);
        return"La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
}
    @PutMapping("/editar")
    public String modificarPersona(@RequestBody Persona perso){
        persoServ.editarPersona(perso);
        return "Los cambios se guardaron correctamente.";
    }
}
