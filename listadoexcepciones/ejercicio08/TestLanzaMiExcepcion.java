package listadoexcepciones.ejercicio08;

/**
 * Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza una
 * excepción NullPointerException en la línea nula.toString();
 * <ul>
 * 		<li>a. Envía un pantallazo de la ejecución y explica quién maneja la
 * 				excepción lanzada. Justifica por qué no se ejecuta ningún
 * 				System.out.println("...");</li>
 * 		<li>b. Hay que tratar la excepción. Dale distintas soluciones. Impleméntalas
 * 				y analiza los distintos escenarios:</li>
 * 		<li>c. TestCapturaExcepcion: La excepción se captura directamente en
 * 				metodo2.</li>
 * 		<li>d. TestLanzaMiExcepcion: Se crea una excepción MiExcepcion con el mensaje
 * 				"Mi primera excepcion. " + e.getMessage() en metodo2() y se captura en
 * 				metodo1()</li>
 * 		<li>e. TestLanzaMiExcepcion2: Se crea una excepción MiExcepcion con el
 * 				mensaje "Mi primera excepcion. " + e.getMessage() en metodo2() y se captura
 * 				en el main().</li>
 * 		<li>f. TestCapturaEnElMain: Se captura la excepción directamente en el
 *				 main</li>
 * </ul>
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TestLanzaMiExcepcion {
	public static void main(String[] args) {
		metodo1();
		System.out.println("main: Acabando...");
	}

	private static void metodo1() {
		try {
			metodo2();
		} catch (MiExcepcion e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Metodo1: Acabando...");
	}

	@SuppressWarnings("null")
	private static void metodo2() throws MiExcepcion {
		try {
			String nula = null;
			nula.toString();
			System.out.println("Metodo2: Acabando...");
		} catch (NullPointerException e) {
			throw new MiExcepcion("Mi primera excepción " + e.getMessage());
		}
	}
}