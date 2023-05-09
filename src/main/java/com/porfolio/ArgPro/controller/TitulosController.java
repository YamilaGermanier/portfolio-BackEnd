package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Titulos;
import com.porfolio.ArgPro.service.TitulosService;
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
@RequestMapping ("titulos")
@CrossOrigin(origins = "http://localhost:4200")
public class TitulosController {
    
    @Autowired
    TitulosService titulServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Titulos> verTitulos(){
        return titulServ.verTitulos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Titulos verTitulos(@PathVariable int id){
        return titulServ.buscarTitulos(id);
    }
    
    @PostMapping("/crear")
    public String agregarTitulo(@RequestBody Titulos titul){
        titulServ.crearTitulos(titul);
        return"El título fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarTitulo(@PathVariable int id){
        titulServ.borrarTitulos(id);
        return "El título fue borrado correctamente";
}
    @PutMapping("/editar")
    public String modificarTitulo(@RequestBody Titulos titul){
        titulServ.editarTitulos(titul);
        return "Los datos se guardaron correctamente.";
    }
}
