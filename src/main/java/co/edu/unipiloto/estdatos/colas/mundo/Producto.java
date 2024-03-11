/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

/**
 *
 * @author ACER
 */
public class Producto {
    
    private final String nombre;
    private final long tiempoPreparacion;
    private final int costo;

    public Producto(String nombre, long tiempoPreparacion, int costo) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.costo = costo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the tiempoPreparacion
     */
    public long getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return  nombre + ", tiempo de reparacion: " + tiempoPreparacion + " minutos, costo: " + costo + "$";
    }
    
    
}
