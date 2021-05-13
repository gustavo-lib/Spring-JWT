package com.gortiz.Springjwt.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.stream.Collectors;


public class UsuarioMain implements UserDetails{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String nombre;
	    private String usuario;
	    private String email;
	    private String password;
	    private Collection<? extends GrantedAuthority> authorities;

	    public UsuarioMain(String nombre, String usuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
	        this.nombre = nombre;
	        this.usuario = usuario;
	        this.email = email;
	        this.password = password;
	        this.authorities = authorities;
	    }

	   
	    public static UsuarioMain build(Usuario usuario){
	        List<GrantedAuthority> authorities =
	                usuario.getRoles()
	                        .stream()
	                        .map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name()))
	                .collect(Collectors.toList());
	        return new UsuarioMain(usuario.getNombre(), usuario.getUsuario(), usuario.getEmail(),
	                usuario.getPassword(), authorities);
	    }

	       
	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return authorities;
	    }

	    @Override
	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public String getUsername() {
	        return usuario;
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getEmail() {
	        return email;
	    }
}
