package com.gortiz.Springjwt.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.gortiz.Springjwt.enume.RolNomb;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
	@Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @NotNull
    //Se indica que va a ser un Enum de tipo String
    @Enumerated(EnumType.STRING)
    private RolNomb rolNombre;

    public Rol() {
    }

    public Rol(@NotNull RolNomb rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNomb getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNomb rolNombre) {
        this.rolNombre = rolNombre;
    }

}
