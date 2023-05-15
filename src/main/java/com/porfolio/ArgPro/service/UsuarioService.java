package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Usuario;
import com.porfolio.ArgPro.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository userRepo;
    
    public void crearUsuario(Usuario user) {
        userRepo.save(user);
    }
    
    public List<Usuario> verUsuarios() {
        return userRepo.findAll();
    }
    
    public void borrarUsuario (Integer id) {
        userRepo.deleteById(id);
    }
    
    public Usuario buscarUsuario (Integer id) {
        return userRepo.findById(id).orElse(null);
    }
    
    public void editarUsuario(Usuario user) {
        userRepo.save(user);
    }
    
    public Usuario editarUser (Usuario user, Integer id) {
        Optional<Usuario> localUser = userRepo.findById(id);
        Usuario usuario = null;
        if (localUser.isPresent()) {
            usuario = localUser.get();
            usuario.setPassword(user.getPassword());
            usuario = userRepo.save(usuario);
        }
        return usuario;
    }
    
        
        public boolean iniciarSesion(Usuario user) {
        List<Usuario> lista = userRepo.findAll();
        boolean auth = false;

        for(Usuario elemento:lista){
            if (elemento.getEmail().equals(user.getEmail()) && elemento.getPassword().equals(user.getPassword())) {
                auth = true;
                break;
            }
        }
        return auth;
    }

}
