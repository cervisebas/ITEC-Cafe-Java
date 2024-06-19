
package com.project_itec.cafe.models;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    protected String Nombre;
    protected String Apellido;
    protected String Correo;
    protected int Telefono;
    
    
    public void create(String Nombre,String Apellido,String Correo,int Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }
    public List<String> obtenerVentasCliente(){
        List<String> lista = new ArrayList();
        return lista;
    }
    
    
}
