/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;

public class EmpleadosList implements KeyDynamicList<Empleado, String > {
    
    private HashMap<String, Empleado> empleados;

    public EmpleadosList() {
        this.empleados = new HashMap<>();
    }

    @Override
    public boolean add(Empleado item) {

        if (empleados.containsKey(item.getIdentificacion())) {
            return false;
        }

        return empleados.put(item.getIdentificacion(), item) == null;
    }

    @Override
    public Empleado get(String id) {
        return empleados.get(id);
    }

    @Override
    public boolean remove(String id) {
        return empleados.remove(id) != null;
    }

    @Override
    public Iterator getAll() {

        if (empleados.isEmpty()) {
            return null;
        }

        return empleados.values().iterator();
    }

    @Override
    public int size() {
        return empleados.size();
    }

    @Override
    public boolean isEmpty() {
        return empleados.isEmpty();
    }

}

