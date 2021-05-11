package com.gortiz.Springjwt.configUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gortiz.Springjwt.entity.Rol;
import com.gortiz.Springjwt.enume.RolNomb;
import com.gortiz.Springjwt.service.RolService;

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Rol rolAdmin = new Rol(RolNomb.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNomb.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
		
	}

}
