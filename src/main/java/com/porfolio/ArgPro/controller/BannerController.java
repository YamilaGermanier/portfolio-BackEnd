package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Banner;
import com.porfolio.ArgPro.service.BannerService;
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
@RequestMapping("banner")
@CrossOrigin(origins = "http://localhost:4200")
public class BannerController {
    
    @Autowired
    BannerService banServ;
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Banner verBanner(@PathVariable int id){
        return banServ.buscarBanner(id);
    }
       
    @PostMapping("/cargar")
    public String subirBanner(@RequestBody Banner ban){
        banServ.cargarBanner(ban);
        return"La imagen fue cargada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarBanner(@PathVariable int id){
        banServ.borrarBanner(id);
        return "La habilidad fue borrada correctamente";
}
    @PutMapping("/editar")
    public String modificarBanner(@RequestBody Banner ban){
        banServ.editarBanner(ban);
        return "Los datos se guardaron correctamente.";
    }
}
