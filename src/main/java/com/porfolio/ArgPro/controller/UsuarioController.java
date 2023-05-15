package com.porfolio.ArgPro.controller;

import com.porfolio.ArgPro.entity.Usuario;
import com.porfolio.ArgPro.service.UsuarioService;
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
@RequestMapping("usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    
    @Autowired
    private UsuarioService userServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Usuario> verUsuario(){
        return userServ.verUsuarios();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Usuario verUsuario(@PathVariable int id){
        return userServ.buscarUsuario(id);
    }
    
    @PostMapping("/crear")
    public String agregarUsuario(@RequestBody Usuario user){
        userServ.crearUsuario(user);
        return"El usuario fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarUsiario(@PathVariable int id){
       userServ.borrarUsuario(id);
        return "El usuario fue borrado correctamente";
}
    @PutMapping("/editar")
    public String modificarUsuario(@RequestBody Usuario user){
        userServ.editarUsuario(user);
        return "Los cambios se guardaron correctamente.";
    }
    
    
}
