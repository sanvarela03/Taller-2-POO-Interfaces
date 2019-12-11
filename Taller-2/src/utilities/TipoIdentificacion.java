package utilities;

public class TipoIdentificacion {
	private static final String TIPOSVALIDOS[] = { "CC", "TI", "PP", "CE", "PPE" };

	public static String verificar(String tipo) {

		boolean encontrado = false;

		for (int i = 0; i < TIPOSVALIDOS.length; i++) {
			if (tipo.equals(TIPOSVALIDOS[i])) {
				encontrado = true;
			}
		}

		if (encontrado) {
			return tipo;
		} else {
			System.out.println("Tipo de identificacion no valido");
			System.out.println("Validos: {CC, TI, PP, CE, PPE}");
			return null;
		}

	}

}
