package com.project_itec.cafe.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@getter
@setter
@NoArgsConstructor
@AllArgsConstructor

public class Administrador {
    protected String nombre;
    protected String apellido;
    protected int permisos;
    protected int legajos;

}
