package argumentosmain;

/**
 * <h1>TestArgumentosMain</h1> 
 * 
 * <p>El m\u00e9todo main admite argumentos.</p>
 *
 * Sube el c\u00f3digo fuente "TestArgumentosMain.java" que:
 *<ul>
 * <li>Muestre el n\u00famero de argumentos enviados al main.</li> 
 * <li>Muestre los argumentos al rev\u00e9s y en may\u00fasculas.</li>
 *
 * <p>Por ejemplo, si los argumentos son "hola adios", debe mostrarse "N\u00famero de
 * argumentos 2. ADIOS HOLA"</p>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestArgumentosMain {
	public static void main(String[] args) {
		System.out.println("\nN\u00famero de argumentos: " + args.length + ".");
		delDerecho(args);
		delReves(args);
	}

	/**
	 * Permite mostrar los argumentos del m\u00e9todo main
	 * @param args argumentos pasados
	 */
	private static void delDerecho(String[] args) {
		for (String arg : args) {
			System.out.println(arg + " ");
		}
	}

	/**
	 * Permite mostrar los argumentos del m\u00e9todo main del rev\u00e9s y en may\u00fasculas.
	 * @param args argumentos pasados
	 */
	private static void delReves(String[] args) {
		String mensaje = "";
		for (int i = args.length - 1; i >= 0; i--) {
			mensaje += "\n" + args[i].toUpperCase() + " ";
		}
		System.out.println(mensaje);
	}
}