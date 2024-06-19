package com.project_itec.cafe.models;

public class Administrador {
    protected String nombre;
    protected String apellido;
    protected int permisos;
    protected int legajos;

    void create(String nombre, String apellido, int permisos, int legajo ){};
    Boolean verificarPermisos(int nivel){return false;}
}
