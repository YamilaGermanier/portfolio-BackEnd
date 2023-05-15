package com.porfolio.ArgPro.repository;

import com.porfolio.ArgPro.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository<Banner,Integer>{
    
}
