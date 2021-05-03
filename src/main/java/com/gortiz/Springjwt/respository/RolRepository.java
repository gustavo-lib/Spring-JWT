package com.gortiz.Springjwt.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gortiz.Springjwt.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {

}
