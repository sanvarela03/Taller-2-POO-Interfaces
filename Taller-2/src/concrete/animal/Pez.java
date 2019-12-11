package concrete.animal;

import abastract.Animal;

public class Pez extends Animal {

	public Pez() {
	}

	public Pez(String nombre) {
		setNombre(nombre);
	}

	@Override
	public String alimentarse(String comida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desplazarse() {

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String tipoAnimal(String tipo) {
		return getNombre() + "es un PEZ de tipo " + tipo;
	}

}
