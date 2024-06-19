package com.project_itec.cafe.models;

import java.util.Date;
import java.util.List;

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

    public void cargar(
        String Cliente,
        List<String> Productos,
        float Subtotal,
        float Descuento,
        float Total,
        String TipoDeVenta,
        Date fechaHora,
        Boolean estado
    ) {}

    public float calcularDescuento() {
        float resultado = this.Total - Subtotal;
        return resultado;
    }
}
