package concrete.animal;

import abastract.Animal;

public class Perro extends Animal {
	public Perro() {
	}

	public Perro(String nombre) {
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
		return getNombre() + "es un PERRO de tipo " + tipo;
	}

}
