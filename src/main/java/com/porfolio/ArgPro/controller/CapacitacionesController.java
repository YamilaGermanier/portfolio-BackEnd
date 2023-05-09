package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Capacitaciones;
import com.porfolio.ArgPro.service.CapacitacionesService;
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
@RequestMapping("capacitaciones")
@CrossOrigin (origins = "http://localhost:4200")
public class CapacitacionesController {
    
    @Autowired
    CapacitacionesService capaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Capacitaciones> verCapacitaciones(){
        return capaServ.verCapacitaciones();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Capacitaciones verCapacitacion(@PathVariable int id){
        return capaServ.buscarCapacitacion(id);
    }
    
    @PostMapping("/crear")
    public String agregarCapacitacion(@RequestBody Capacitaciones capa){
        capaServ.crearCapacitacion(capa);
        return"La capacitación fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarCapacitacion(@PathVariable int id){
        capaServ.borrarCapacitacion(id);
        return "La capacitación fue borrada correctamente";
}
    @PutMapping("/editar")
    public String modificarCapacitacion(@RequestBody Capacitaciones capa){
        capaServ.editarCapacitacion(capa);
        return "Los datos se guardaron correctamente.";
    }
}
