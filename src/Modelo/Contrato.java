/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class Contrato {
    
    private Cliente cliente;
    private Espacio espacio;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private EstadoContrato estado;
    private int numeroContrato;
    
    private ArrayList<Servicio> servicios;

    public Contrato(Cliente cliente, Espacio espacio, LocalDate fechaInicio, LocalDate fechaFinal,
            int numeroContrato
            ){
        this.cliente = cliente;
        this.espacio = espacio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = EstadoContrato.PENDIENTE;
        this.numeroContrato = numeroContrato;
        this.servicios = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public EstadoContrato getEstado() {
        return estado;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }
    
    public void eliminarServicio(Servicio servicio){
        servicios.remove(servicio);
        }
    
    public long calcularDias() {
        return fechaFinal.toEpochDay() - fechaInicio.toEpochDay();
    }
    
    
    public int calcularPeriodos() {
    long dias = calcularDias();
    
    if (dias % 30 == 0) {
        return (int) (dias / 30);
        
        }else{
        return (int) (dias / 30) + 1;
        }
    }
    
    public void activar() {
        if (estado == EstadoContrato.PENDIENTE) {
            estado = EstadoContrato.ACTIVO;
            }
        }
    
    public void finalizar() {
        if (estado == EstadoContrato.ACTIVO) {
            estado = EstadoContrato.FINALIZADO;
            }
        }
    
    public void cancelar() {
        if (estado == EstadoContrato.PENDIENTE) {
            estado = EstadoContrato.CANCELADO;
            }   
        }
}
