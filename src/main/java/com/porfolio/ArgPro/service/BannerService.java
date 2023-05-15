package com.porfolio.ArgPro.service;

import com.porfolio.ArgPro.entity.Banner;
import com.porfolio.ArgPro.repository.BannerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BannerService {
    
    @Autowired
    public BannerRepository banRepo;
    
    public Banner buscarBanner(int id) {
      Banner ban = banRepo.findById(id).orElse(null);
        return ban;
    }
      
    public void cargarBanner(Banner ban) {
        banRepo.save(ban);
    }
    
    public void borrarBanner(int id){
        banRepo.deleteById(id);
    }
    
    public void editarBanner(Banner ban) {
        banRepo.save(ban);
    }
}
