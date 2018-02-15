package listadoexcepciones.ejercicio11;

import java.util.Scanner;

/**
 * 
 * Crea la clase TecladoScanner para la lectura de datos desde el teclado. Para
 * ello, crea la clase TestScannerConMenu que compruebe todas las lecturas. La
 * clase TecladoScanner dispondrá de:
 * <ul>
 * 		<li>a. Una propiedad scanner para la lectura desde teclado (flujo System.in)</li>
 * 		<li>b. Método leerEntero() que devuelva un entero válido introducido por el usuario.</li>
 * 		<li>c. Método leerDecimal() que devuelva un decimal válido introducido por el usuario .</li>
 * 		<li>d. Método leerCaracter() que devuelva un carácter válido introducido por el usuario.</li>
 * 		<li>e. Método leerCadena() que devuelva una cadena introducida por el usuario.</li>
 * 		<li>f. Todos los métodos estarán sobrecargados con un argumento de tipo String 
 * 				para mostrar lo como mensaje previo a la lectura .</li>
 * 		<li>g. ¿Puede utilizarse el patrón de diseño Singleton? Si es así,úsalo.</li>
 * </ul>
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class NuevoScanner {

	/**
	 * Campos, privatizado el campo scanner, que refiere a un objeto de
	 * java.util.Scanner. Estático el campo newScanner, referido al objeto
	 * generado en la clase bajo patrón Singleton
	 */
	private Scanner scanner;
	private static NuevoScanner nuevoScanner;

	/**
	 * Método de clase que devuelve un objeto NewScanner válido para ser
	 * empleado en la clase superior
	 * 
	 * @return newScanner el nuevo objeto NewScanner a emplear en la instancia superior
	 */
	public static NuevoScanner obtenerScanner() {
		if (nuevoScanner == null)
			nuevoScanner = new NuevoScanner();
		return nuevoScanner;
	}

	/**
	 * Constructor de la clase NewScanner, a partir de la creación de un objeto
	 * de java.util.scanner
	 */
	private NuevoScanner() {
		scanner = new Scanner(System.in);
	}

	/**
	 * Método que devuelve el siguiente entero leído mediante scanner
	 * 
	 * @return el siguiente entero leído
	 */
	int nextInt() {
		return scanner.nextInt();
	}

	/**
	 * Método que devuelve la siguiente cadena leída mediante scanner
	 * 
	 * @return la siguiente cadena leída
	 */
	String nextLine() {
		return scanner.nextLine();

	}

	/**
	 * Método que devuelve el siguiente doble leído mediante scanner
	 * 
	 * @return el siguiente doble leído
	 */
	double nextDouble() {
		return scanner.nextDouble();
	}
}