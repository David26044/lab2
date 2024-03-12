package co.edu.unipiloto.estdatos.colas.mundo;

import co.edu.unipiloto.estdatos.colas.estructuras.Cola;
import co.edu.unipiloto.estdatos.colas.estructuras.ListaDobleEncadenada;
import co.edu.unipiloto.estdatos.colas.estructuras.NodoLista;
import java.util.Iterator;

public class AdministracionMcDonalds {

    private Cola<String> colaClientes;
    private Cola<Pedido> colaPedidos;
    private ListaDobleEncadenada<Producto> catalogoProductos;
    private Cola<Pedido> colaDomicilios;

    public AdministracionMcDonalds() {
        colaClientes = new Cola<String>();
        colaPedidos = new Cola<Pedido>();
        catalogoProductos = new ListaDobleEncadenada<Producto>();
        catalogoProductos.addFirst(new Producto("Combo Nuggets", 10, 200));
        catalogoProductos.addLast(new Producto("Combo Bigmac", 10, 300));
        catalogoProductos.addLast(new Producto("Combo Cuarto de Libra", 10, 250));
        catalogoProductos.addLast(new Producto("McFlurry", 10, 100));
        colaDomicilios = new Cola<Pedido>();
    }

    public ListaDobleEncadenada getCatalogoProductos() {
        return catalogoProductos;
    }
    
    public int cDomicilios(){
        return colaDomicilios.tamanio();
    }

    public void agregarCliente(String nombre) {
        colaClientes.encolar(nombre);
    }

    public Producto eliminarProducto() {
        return catalogoProductos.removeLast();
    }
    
    public void agregarDomicilio(Pedido p){
        colaDomicilios.encolar(p);
    }
    
    public void agregarProducto(Producto p){
        catalogoProductos.addLast(p);
    }

    public String atenderCliente(Pedido pedido) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        colaPedidos.encolar(pedido);
        return colaClientes.desencolar();
    }

    public String entregarDomicilio() {
        Pedido p = colaDomicilios.desencolar();
        try {
            Thread.sleep(p.getProducto().getTiempoPreparacion());
        } catch (InterruptedException e) {

        }
        return p.getProducto().getNombre();
    }
    
    public String entregarPedido() {
        Pedido p = colaPedidos.desencolar();
        try {
            Thread.sleep(p.getProducto().getTiempoPreparacion());
        } catch (InterruptedException e) {

        }
        return p.getProducto().getNombre();
    }

    public int clientesEnFila() {
        return colaClientes.tamanio();
    }

    public int pedidosEnEspera() {
        return colaPedidos.tamanio();
    }

    public Iterator<String> clientes() {
        return colaClientes.iterator();
    }

    public Iterator<Pedido> pedidos() {
        return colaPedidos.iterator();
    }

}
