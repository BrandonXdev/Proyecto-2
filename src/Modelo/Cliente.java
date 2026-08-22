/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;


/**
 *
 * @author joanreciojimenez
 */
public class Cliente extends Persona {
    private LocalDate fechaNacimiento;
    private int numeroTelefono;
    private String correo;


    public LocalDate getFechaNacimientoDate() {
        return fechaNacimiento;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public Cliente(String identificacion, String nombre, LocalDate fechaNacimiento, int numeroTelefono,String correo) {
        super(identificacion, nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
    }
    public int calcularEdad(){
        return java.time.Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }
    
}    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
