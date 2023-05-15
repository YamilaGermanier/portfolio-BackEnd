package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.SobreMi;
import com.porfolio.ArgPro.service.SobreMiService;
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
@RequestMapping("sobreMi")
@CrossOrigin(origins = "http://localhost:4200")
public class SobreMiController {
    
    @Autowired
    SobreMiService aboutServ;
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public SobreMi verSobreMi(@PathVariable int id){
        return aboutServ.buscarSobreMi(id);
    }

    @PostMapping("/crear")
    public String agregarSobreMi(@RequestBody SobreMi about){
        aboutServ.crearSobreMi(about);
        return"El texto fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarSobreMi(@PathVariable int id){
        aboutServ.borrarSobreMi(id);
        return "LLos datos fueron borrados correctamente.";
}
    @PutMapping("/editar")
    public String modificarPersona(@RequestBody SobreMi about){
        aboutServ.editarSobreMi(about);
        return "Los cambios se guardaron correctamente.";
    }
}
