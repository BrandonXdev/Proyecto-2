/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author hilar
 */
public enum TipoEspacio {
    PEQUENO(5, 25000),
    MEDIANO(10, 45000),
    GRANDE(20, 70000);
    
    private int tamano;
    private double precioXMes;

    private TipoEspacio(int tamano, double precioXMes) {
        this.tamano = tamano;
        this.precioXMes = precioXMes;
    }

    public int getTamano() {
        return tamano;
    }

    public double getPrecioXMes() {
        return precioXMes;
    }
}  

