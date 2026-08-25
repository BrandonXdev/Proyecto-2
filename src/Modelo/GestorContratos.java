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
public class GestorContratos {
    
    private ArrayList<Contrato> contratos;

    public GestorContratos() {
        this.contratos = new ArrayList<>();
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }
    
    public void agregarContrato(Contrato contrato){
        contratos.add(contrato);     
    } 
    
    public Contrato buscarContrato(int numeroContrato){
        for(Contrato contrato : contratos){
            if (contrato.getNumeroContrato() == numeroContrato) {
                return contrato;
            }
        }
        return null;
    }
    
    public int generarNumeroContrato(){
        return contratos.size() + 1;
    }
    
    public void finalizarContrato(int numeroContrato) throws CambioEstadoException {
        Contrato contrato = buscarContrato(numeroContrato);
        
        if (contrato != null) {
            contrato.finalizar();
        }
    }
    
    public void cancelarContrato(int numeroContrato) throws CambioEstadoException { 
        Contrato contrato = buscarContrato(numeroContrato);
        
        if (contrato != null) {
            contrato.cancelar();
        }        
    }
    
    public void activarContrato(int numeroContrato) throws CambioEstadoException {
        Contrato contrato = buscarContrato(numeroContrato);
        
        if (contrato != null) {
            contrato.activar();
        }
    }
    
    public boolean verificarDisponibilidad(Espacio espacio, LocalDate fechaInicio,
            LocalDate fechaFinal) {
        
        for(Contrato contrato : contratos){
            if (contrato.getEspacio().equals(espacio)) {
                if (fechaInicio.isBefore(contrato.getFechaFinal()) && 
                        fechaFinal.isAfter(contrato.getFechaInicio())) {
                    return false;               
                }
 
            }
        }
        return true;     
    }  
}
