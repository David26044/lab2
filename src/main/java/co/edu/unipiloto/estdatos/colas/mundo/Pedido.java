/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

import java.time.LocalTime;

/**
 *
 * @author ACER
 */
public class Pedido {

    private LocalTime horaPedido;
    private final Producto producto;
    private final String direccion;

    public Pedido(LocalTime horaPedido, Producto producto, String direccion) {
        this.horaPedido = horaPedido;
        this.producto = producto;
        this.direccion = direccion;
    }

    public LocalTime getHoraPedido() {
        return horaPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Pedido{" + "horaPedido=" + horaPedido + ", producto=" + producto.getNombre() + ", direccion=" + direccion + '}';
    }

}
