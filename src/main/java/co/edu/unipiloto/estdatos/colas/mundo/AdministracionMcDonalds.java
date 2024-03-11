package co.edu.unipiloto.estdatos.colas.mundo;

import co.edu.unipiloto.estdatos.colas.estructuras.Cola;
import co.edu.unipiloto.estdatos.colas.estructuras.ListaDobleEncadenada;
import co.edu.unipiloto.estdatos.colas.estructuras.NodoLista;
import java.util.Iterator;



public class AdministracionMcDonalds{
	
	private Cola<String> colaClientes;
	private Cola<Pedido> colaPedidos;
        private ListaDobleEncadenada<Producto> catalogoProductos;
	
	public AdministracionMcDonalds(){
		colaClientes=new Cola<String>();
		colaPedidos=new Cola<Pedido>();
                catalogoProductos = new ListaDobleEncadenada<Producto>();
                catalogoProductos.addFirst(new Producto("Combo Nuggets", 10, 200));
                catalogoProductos.addLast(new Producto("Combo Bigmac", 10, 300));
                catalogoProductos.addLast(new Producto("Combo Cuarto de Libra", 10, 250));
                catalogoProductos.addLast(new Producto("McFlurry", 10, 100));
	}
	
        public ListaDobleEncadenada getCatalogoProductos(){
            return catalogoProductos;
        }
        
	public void agregarCliente(String nombre){
		colaClientes.encolar(nombre);
	}
	
	public String atenderCliente(Pedido pedido){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}
		colaPedidos.encolar(pedido);
		return colaClientes.desencolar();
	}
	
	public String entregarPedido(){
		Pedido p = colaPedidos.desencolar();
		try {
			Thread.sleep(p.getProducto().getTiempoPreparacion());
		} catch (InterruptedException e) {

		}
		return p.getProducto().getNombre();
	}
	
	public int clientesEnFila(){
		return colaClientes.tamanio();
	}
	
	public int pedidosEnEspera(){
		return colaPedidos.tamanio();
	}
	
	public Iterator<String> clientes(){
		return colaClientes.iterator();
	}
	
	public Iterator<Pedido> pedidos(){
		return colaPedidos.iterator();
	}

}
