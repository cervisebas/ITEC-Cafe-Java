package com.project_itec.cafe.models;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@ AllArgsConstructor    @NoArgsConstructor
public class Venta {
    protected String Cliente;
    //protected List<Productos> Productos;
    protected List<String> Productos;
    protected float Subtotal;
    protected float Descuento;
    protected float Total;
    protected TipoDeVenta tipoVenta;
    protected Date fechaHora;
    protected boolean estado;

}
