package com.gortiz.Springjwt.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gortiz.Springjwt.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario (String nombreUsuario);
    boolean existsByEmail (String email);
}
