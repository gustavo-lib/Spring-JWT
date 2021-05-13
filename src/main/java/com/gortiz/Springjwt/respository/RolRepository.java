package com.gortiz.Springjwt.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gortiz.Springjwt.entity.Rol;
import com.gortiz.Springjwt.enume.RolNomb;
import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {

	Optional<Rol> findByRolNombre(RolNomb rolNombre);
}
