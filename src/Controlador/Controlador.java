/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author joanreciojimenez
 */
import Modelo.CambioEstadoException;
import Modelo.Cliente;
import Modelo.ClientesList;
import Modelo.Contrato;
import Modelo.Empleado;
import Modelo.EmpleadosList;
import Modelo.GestorContratos;
import Modelo.Servicio;
import Modelo.ServiciosList;
import Modelo.Espacio;
import Modelo.EspaciosList;

public class Controlador {
    
    private ClientesList clientes;
    private EmpleadosList empleados;
    private ServiciosList servicios; 
    private GestorContratos contratos;
    private EspaciosList espacios;

    public Controlador() {
        this.clientes = new ClientesList();
        this.empleados = new EmpleadosList();
        this.servicios = new ServiciosList();
        this.contratos = new GestorContratos();
        this.espacios = new EspaciosList();
    }
    
    //Clientes:
    public boolean agregarCliente(Cliente cliente) {
        return clientes.add(cliente);
    }
    public Cliente buscarCliente(String identificacion) {
        return clientes.get(identificacion);
    }
    public boolean eliminarCliente(String identificacion) {
        return clientes.remove(identificacion);
    }
    public ClientesList getClientes() {
        return clientes;
    }
    
    //Empleados: 
    public boolean agregarEmpleado(Empleado empleado) {
        return empleados.add(empleado);
    }
    public Empleado buscarEmpleado(String identificacion) {
        return empleados.get(identificacion);
    }
    public boolean eliminarEmpleado(String identificacion) {
        return empleados.remove(identificacion);
    }
    public EmpleadosList getEmpleados() {
        return empleados;
    }
    
    //Servicios: 
    public boolean agregarServicio(Servicio servicio) {
    return servicios.add(servicio);
    }
    public Servicio buscarServicio(String codigo) {
        return servicios.get(codigo);
    }
    public boolean eliminarServicio(String codigo) {
        return servicios.remove(codigo);
    }
    public ServiciosList getServicios() {
        return servicios;
    }
    
    //Contratos: 
    public void agregarContrato(Contrato contrato) {
        contratos.agregarContrato(contrato);
    }
    public Contrato buscarContrato(int numeroContrato) {
        return contratos.buscarContrato(numeroContrato);
    }
    public int generarNumeroContrato() {
        return contratos.generarNumeroContrato();
    }
    public void activarContrato(int numeroContrato) throws CambioEstadoException {
        contratos.activarContrato(numeroContrato);
    }
    public void finalizarContrato(int numeroContrato) throws CambioEstadoException {
        contratos.finalizarContrato(numeroContrato);
    }
    public void cancelarContrato(int numeroContrato) throws CambioEstadoException {
        contratos.cancelarContrato(numeroContrato);
    }
    public GestorContratos getContratos() {
        return contratos;
    }
    
    //Espacios: 
    public boolean agregarEspacio(Espacio espacio) {
        return espacios.add(espacio);
    }
    public Espacio buscarEspacio(int numeroEspacio) {
        return espacios.get(numeroEspacio);
    }
    public boolean eliminarEspacio(int numeroEspacio) {
        return espacios.remove(numeroEspacio);
    }
    public EspaciosList getEspacios() {
        return espacios;
    }
    

}
