package org.cuatrovientos.ed;

public class Usuario {
	ListaCompra lista;
	
	public Usuario(int num) {
		lista = new ListaCompra(num);
		Producto p = new Producto("leche");
		lista.añadir(p);
		System.out.println(lista.MostrarProductos());
		
	}
}
