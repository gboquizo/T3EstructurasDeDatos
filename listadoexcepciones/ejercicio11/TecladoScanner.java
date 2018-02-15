package listadoexcepciones.ejercicio11;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

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
 * Clase TecladoScanner, envoltorio de la clase NewScanner, siguiendo el patrón
 * de diseño Singleton
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TecladoScanner {

	private static NuevoScanner scanner = NuevoScanner.obtenerScanner();

	/**
	 * Lee un entero por teclado
	 * 
	 * @return Entero válido introducido por teclado.
	 */
	public static int leerEntero() {
		int num;
		boolean valida = false;
		do {
			try {
				num = scanner.nextInt();
				scanner.nextLine();
				valida = true;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.err.println("\nError, no ha introducido un entero, repita:\n");
				num = 0;
			}
		} while (!valida);
		return num;
	}
	
	/**
	 * Lee un entero por teclado
	 * @param mensaje mensaje a mostrar antes de introducir vía teclado
	 * @return entero válido
	 */
	public static int leerEntero(String mensaje) {
		System.out.println(mensaje);
		return leerEntero();
	}
	
	/**
	 * Lee un decimal por teclado
	 * @return decimal válido pasado por teclado
	 */
	public static double leerDecimal() {
		double num;
		boolean valida = false;
		do {
			try {
				num = scanner.nextDouble();
				scanner.nextLine();
				valida = true;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.err.println("\nError, no ha introducido un decimal, repita:\n");
				num = 0;
			}
		} while (!valida);
		return num;

	}
	
	/**
	 * Lee un decimal por teclado
	 * @param mensaje mensaje a mostrar de manera previa a la introducción
	 * @return decimal válido leído por teclado
	 */
	public static double leerDecimal(String mensaje) {
		System.out.println(mensaje);
		return leerDecimal();
	}
	
	/**
	 * Lee un carácter por teclado
	 * @return carácter válido leído por teclado
	 */
	public static char leerCaracter() {
		char caracter = 0;
		boolean valida = false;
		do {
			try {
				caracter = scanner.nextLine().charAt(0);
				valida = true;
			} catch (IndexOutOfBoundsException e) {
				scanner.nextLine();
				System.err.println("\nError, no ha introducido un carácter válido, repita:\n");
			}
		} while (!valida);
		return caracter;

	}
	
	/**
	 * Lee un carácter por teclado
	 * @param mensaje mensaje a mostrar antes de leer el carácter
	 * @return carácter válido introducido por teclado
	 */
	public static char leerCaracter(String mensaje) {
		System.out.println(mensaje);
		return leerCaracter();
	}
	
	/**
	 * Lee una cadena por teclado
	 * @return cadena válida introducido por teclado
	 */
	public static String leerCadena() {
		String cadena;
		boolean valida = false;
		do {
			try {
				cadena = scanner.nextLine();
				valida = true;
			} catch (NoSuchElementException e) {
				scanner.nextLine();
				System.err.println("\nError, no se ha introducido una cadena válida\n");
				cadena = "";
			}
		} while (!valida);

		return cadena;
	}
	
	/**
	 * Lee una cadena por teclado
	 * @param mensaje mensaje a mostrar antes de leer la cadena
	 * @return cadena válida introducido por teclado
	 */
	public static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		return leerCadena();
	}
}