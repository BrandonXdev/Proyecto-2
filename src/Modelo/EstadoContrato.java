/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author hilar
 */
public enum EstadoContrato {

    PENDIENTE("Pendiente"),
    ACTIVO("Activo"),
    FINALIZADO("Finalizado"),
    CANCELADO("Cancelado");

    private String descripcion;

    EstadoContrato(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}  

