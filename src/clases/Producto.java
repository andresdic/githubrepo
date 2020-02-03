/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author docente
 */
public class Producto {
    //Variables de Instancia
    private String nombre;
    private int cantidad;
    private double costo;
    private String unidad;
    private String detalle;

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Producto(String nombre, int cantidad, double costo, String unidad, String detalle) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.unidad=unidad;
        this.detalle=detalle;
    }
    
}
