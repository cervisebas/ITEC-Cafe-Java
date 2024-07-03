package com.project_itec.cafe.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@ AllArgsConstructor    
@NoArgsConstructor

public class Producto {
    protected String nombre;
    protected String description;
    protected TipoProducto tipo;
    protected UnidadMedida unidadMedida;
    protected Float stock;
    protected Float precio;
    protected Boolean borrado;

   
}
