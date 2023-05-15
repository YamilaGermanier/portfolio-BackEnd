
package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.SobreMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreMiRepository extends JpaRepository <SobreMi,Integer>{
    
}
