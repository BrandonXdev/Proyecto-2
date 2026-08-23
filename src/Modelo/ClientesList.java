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
public class ClientesList implements KeyDynamicList<Cliente, String> {
    private HashMap<String,Cliente>clientes;

    public ClientesList() {
        this.clientes = new HashMap();
    }
    
   

    @Override
    public boolean add(Cliente item) {
        if(clientes.containsKey(item.getIdentificacion())) return false;
        return clientes.put(item.getIdentificacion(), item) == null;
    }

    @Override
    public Cliente get(String id) {
        return clientes.get(id);
    }

    @Override
    public boolean remove(String id) {
        return clientes.remove(id) != null;
    }

    @Override
    public Iterator getAll() {
        if(clientes.isEmpty()) return null;
        return clientes.values().iterator();
    }

    @Override
    public int size() {
        return clientes.size();
    }

    @Override
    public boolean isEmpty() {
        return clientes.isEmpty();
    }
    
}
