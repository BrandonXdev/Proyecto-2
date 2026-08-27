/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author brand
 */
public class EspaciosList implements KeyDynamicList<Espacio, Integer> {
    
    private HashMap<Integer, Espacio> espacios;

    public EspaciosList() {
        this.espacios = new HashMap<>();
    }

    @Override
    public boolean add(Espacio item) {

        if (espacios.containsKey(item.getNumeroEspacio())) {
            return false;
        }

        return espacios.put(
                item.getNumeroEspacio(),
                item) == null;
    }

    @Override
    public Espacio get(Integer id) {
        return espacios.get(id);
    }

    @Override
    public boolean remove(Integer id) {
        return espacios.remove(id) != null;
    }

    @Override
    public Iterator getAll() {

        if (espacios.isEmpty()) {
            return null;
        }

        return espacios.values().iterator();
    }

    @Override
    public int size() {
        return espacios.size();
    }

    @Override
    public boolean isEmpty() {
        return espacios.isEmpty();
    }
}