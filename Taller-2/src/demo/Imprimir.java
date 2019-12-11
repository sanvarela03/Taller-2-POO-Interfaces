package demo;

import concrete.animal.Perro;
import concrete.human.Hombre;
import concrete.human.Mujer;
import interfaces.AccionesGeneral;
import interfaces.AccionesHumano;

public class Imprimir {

	public static AccionesGeneral IAnimal = CrearPerro(new Perro());
	public static AccionesHumano IHombre = new Hombre();
	public static AccionesHumano IMujer = new Mujer();

	public Imprimir() {

	}

	public static AccionesGeneral CrearPerro(AccionesGeneral algo) {
		return algo;

	}

	public static AccionesGeneral CrearPez(AccionesGeneral algo) {
		return algo;

	}

	public static void main(String[] args) {
		IHombre.bailar();
	}

}
