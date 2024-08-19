package com.project_itec.cafe.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@ AllArgsConstructor    
@NoArgsConstructor

public class Administrador {
    protected String nombre;
    protected String apellido;
    protected int permisos;
    protected int legajos;

  
}
