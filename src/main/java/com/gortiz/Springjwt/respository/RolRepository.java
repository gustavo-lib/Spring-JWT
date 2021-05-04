package com.gortiz.Springjwt.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gortiz.Springjwt.entity.Rol;
import com.gortiz.Springjwt.enume.RolNomb;
import com.sun.el.stream.Optional;

@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {

	java.util.Optional<Rol> findByRolNombre(RolNomb rolNombre);
}
