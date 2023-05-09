package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, integer>{
    
}
