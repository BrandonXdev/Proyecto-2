/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author brand
 */
public class Espacio {
    private int numeroEspacio;
    private TipoEspacio tipo;
    private int tamano;
    private double precioXMes;
    private boolean disponible;

    public Espacio(int numeroEspacio, TipoEspacio tipo) {
        this.numeroEspacio = numeroEspacio;
        this.tipo = tipo;
        this.tamano = tipo.getTamano();
        this.precioXMes = tipo.getPrecioXMes();
        this.disponible = true;
    }

    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public TipoEspacio getTipo() {
        return tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public double getPrecioXMes() {
        return precioXMes;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTipo(TipoEspacio tipo) {
        this.tipo = tipo;
        this.tamano = tipo.getTamano();
        this.precioXMes = tipo.getPrecioXMes();
    }

    public void setPrecioXMes(double precioXMes) {
        this.precioXMes = precioXMes;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
    
    
    
}
