/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author joanreciojimenez
 */
public class ServiciosList implements KeyDynamicList<Servicio, String>{
    private HashMap<String, Servicio> servicio;
    public ServiciosList(){
        this.servicio = new HashMap();
    }

    @Override
    public boolean add(Servicio item) {
        if(servicio.containsKey(item.getCodigo())) return false;
        return servicio.put(item.getCodigo(),item) == null;
    }

    @Override
    public Servicio get(String id) {
        return servicio.get(id);
    }

    @Override
    public boolean remove(String id) {
        return servicio.remove(id) != null;
    }

    @Override
    public Iterator getAll() {
        if(servicio.isEmpty()) return null;
        return servicio.values().iterator();
    }

    @Override
    public int size() {
        return servicio.size();
    }

    @Override
    public boolean isEmpty() {
        return servicio.isEmpty();
    }
}
