/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author hilar
 */
public enum PuestoEmpleado {
    ADMINISTRADOR(950000),
    RECEPCIONISTA(700000),
    ENCARGADO_BODEGA(650000),
    MANTENIMIENTO(600000),
    OPERARIO_CARGA(575000);

    private double salario;

    private PuestoEmpleado(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
