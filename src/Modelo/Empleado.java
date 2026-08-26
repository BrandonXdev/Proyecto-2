/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author hilar
 */
public class Empleado extends Persona {

    private String telefono;
    private PuestoEmpleado puesto;
    private double salario;

    public Empleado(String identificacion, String nombre,
            String telefono, PuestoEmpleado puesto) {

        super(identificacion, nombre);

        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = puesto.getSalario();
    }

    public String getTelefono() {
        return telefono;
    }

    public PuestoEmpleado getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPuesto(PuestoEmpleado puesto) {
        this.puesto = puesto;
        this.salario = puesto.getSalario();
    }
}
    
