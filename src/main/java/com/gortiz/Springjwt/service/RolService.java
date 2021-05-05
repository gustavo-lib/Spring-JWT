package com.gortiz.Springjwt.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gortiz.Springjwt.entity.Rol;
import com.gortiz.Springjwt.enume.RolNomb;
import com.gortiz.Springjwt.respository.RolRepository;

@Service
@Transactional
public class RolService {
	
	@Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNomb rolNombre){
        return  rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}


