package listadoexcepciones.ejercicio11;

import utiles.Menu;

/**
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
public class TestScannerConMenu {
	public static void main(String[] args) {
		String[] opciones = { "Leer enteros", "Leer decimales", "Leer caracteres", "Leer cadena" };
		Menu menu = new Menu("Menú Scanner", opciones);

		int opcion;
		System.out.println("\tBienvenido");
		do {
			opcion = menu.gestionar();
			switch (opcion) {
			case 1:
				System.out.println(TecladoScanner.leerEntero("Introduzca un entero: "));
				break;

			case 2:
				System.out.println(TecladoScanner.leerDecimal("Introduzca un decimal: "));
				break;

			case 3:
				System.out.println(TecladoScanner.leerCaracter("Introduzca un carácter: "));
				break;

			case 4:
				System.out.println(TecladoScanner.leerCadena("Introduzca una cadena: "));
				break;

			default:
				salir();
			}
		} while (opcion != menu.SALIR);
	}

	/**
	 * Sale del menú
	 */
	private static void salir() {
		System.out.println("\n\tHasta pronto...");
	}
}