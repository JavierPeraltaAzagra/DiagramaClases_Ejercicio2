package org.cuatrovientos.ed;

public class ListaCompra {
	Producto[] listaProductos;

	public ListaCompra(int num) {
		this.listaProductos = new Producto[num];
	}
	public boolean añadir(Producto p) {
		if(this.listaProductos[this.listaProductos.length - 1] == null) {
			// La lista no está llena
			// Agregar el elemento en la última posición vacía
			for (int i = 0; i < listaProductos.length; i++) {
				if(this.listaProductos[i] == null) {
					// Agregar aquí
					this.listaProductos[i] = p;
					return true;
				}
			}
		}else {
			// La lista está llena, no se puede agregar
			return false;
		}
		// Si todo ha ido bien
		return true;
		// Si no return false
	}
	public String MostrarProductos(){
		// TODO Recorrer lista y mostrar elementos
		String result = "";
		for (int i = 0; i < listaProductos.length; i++) {
			if (listaProductos[i] != null) {
				result += listaProductos[i].toString() + "\n";
			}
			
		}
		return result;
	}
}
