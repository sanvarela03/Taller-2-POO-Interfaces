package abastract;

import java.security.SecureRandom;

import interfaces.AccionesGeneral;

public abstract class Animal implements AccionesGeneral {

	private String nombre;

	public Animal() {
	}

	public abstract String alimentarse(String comida);

	@Override
	public String comunicarse() {
		return nombre;
	}

	@Override
	public void desplazarse() {
		System.out.println("Auxilio me desmayo, *");
	}

	@Override
	public boolean dormir() {

		SecureRandom random = new SecureRandom();

		int dormir = random.nextInt(2);

		if (dormir == 0) {
			return false;
		} else {
			return true;
		}
	}

	public abstract void jugar();

	public String tipoAnimal(String tipo) {
		return this.nombre + " es de tipo " + tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
