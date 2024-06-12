package com.project_itec.cafe.models;

public class Producto {
    protected String nombre;
    protected String description;
    protected TipoProducto tipo;
    protected UnidadMedida unidadMedida;
    protected Float stock;
    protected Float precio;
    protected Boolean borrado;

    public void crearProducto(
        String _nombre,
        String _description,
        TipoProducto _tipo,
        UnidadMedida _unidadMedida,
        Float _stock,
        Float _precio
    ) {
        this.nombre = _nombre;
        this.description = _description;
        this.tipo = _tipo;
        this.unidadMedida = _unidadMedida;
        this.stock = _stock;
        this.precio = _precio;
    }

    public Boolean hayStock() {
        return this.stock != 0;
    }

    public void borrar() {
        this.borrado = true;
    }
}
