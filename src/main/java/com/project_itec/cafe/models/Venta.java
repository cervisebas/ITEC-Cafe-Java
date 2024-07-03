package com.project_itec.cafe.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@getter
@setter
@NoArgsConstructor
@AllArgsConstructor

public class Venta {
    protected String Cliente;
    /*protected List<Producto> Productos;
    protected List<String> Productos;*/
    protected float Subtotal;
    protected float Descuento;
    protected float Total;
    protected TipoDeVenta tipoVenta;
    protected Date fechaHora;
    protected boolean estado;
}
