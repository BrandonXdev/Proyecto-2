/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joanreciojimenez
 */
public class Servicio {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Servicio(String nombre, String descripcion, double precio) {
        this.codigo = "Servicio "+ String.valueOf(System.currentTimeMillis()).substring(8);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    
}
