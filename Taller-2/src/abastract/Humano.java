package abastract;

import java.security.SecureRandom;
import interfaces.AccionesGeneral;
import interfaces.AccionesHumano;
import utilities.TipoIdentificacion;

public abstract class Humano implements AccionesGeneral, AccionesHumano {

	private int identificacion;
	private String nombre;
	private String tipoIdentificacion;

	public Humano() {
	}

	public abstract String alimentarse(String comida);

	public abstract void bailar();

	public abstract String comunicarse();

	@Override
	public void desplazarse() {
		System.out.println("Estoy caminando con dos piernas");
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

	public abstract void estudiar();

	public abstract void jugar();

	public abstract String tocarInstrumento(String instrumento);

	public abstract void trabajar();

	public int getIdentificacion() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setIdentificacion(int identificacion) {

		this.identificacion = identificacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {

		this.tipoIdentificacion = TipoIdentificacion.verificar(tipoIdentificacion);

	}

}
