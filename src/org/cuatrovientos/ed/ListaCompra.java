package org.cuatrovientos.ed;

public class ListaCompra {
	Producto[] listaProductos;

	public ListaCompra(int num) {
		this.listaProductos = new Producto[num];
	}
	public boolean a�adir(Producto p) {
		if(this.listaProductos[this.listaProductos.length - 1] == null) {
			// La lista no est� llena
			// Agregar el elemento en la �ltima posici�n vac�a
			for (int i = 0; i < listaProductos.length; i++) {
				if(this.listaProductos[i] == null) {
					// Agregar aqu�
					this.listaProductos[i] = p;
					return true;
				}
			}
		}else {
			// La lista est� llena, no se puede agregar
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
