package concrete.human;

import abastract.Humano;

public class Hombre extends Humano {

	public Hombre() {
	}

	public Hombre(String nombre, String tipoIdentificacion, int identificacion) {
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
	}

	@Override
	public String alimentarse(String comida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bailar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desplazarse() {

		System.out.println("");
	}

	@Override
	public boolean dormir() {

		return false;
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String tocarInstrumento(String instrumento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub

	}

}
