package modelo;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Trabajador> listaTrabajadores;

	public Empresa() {
		this.listaTrabajadores = new ArrayList<>();
	}

	// Métodos para agregar y obtener trabajadores

	public void agregarTrabajador(Trabajador trabajador) {
		listaTrabajadores.add(trabajador);
	}

	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}
}