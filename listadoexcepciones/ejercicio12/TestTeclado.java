package listadoexcepciones.ejercicio12;

import utiles.Menu;
import utiles.Teclado;

/**
 * Analiza la clase Teclado suministrada por la profesora para la entrada por
 * teclado del usuario.
 * <ul>
 * <li>a. Analiza la gestión de excepciones, indicando</li>
 * <ul>
 * <li>i. Nombre de la excepción</li>
 * <li>ii. Cuándo se lanza</li>
 * <li>iii. Si se captura o se lanza de nuevo</li>
 * <li>iv. Solución al error en cuestión</li>
 * </ul>
 * <li>b. Modifica el código de la clase Teclado para obligar al usuario a que
 * introduzca un valor válido.</li>
 * <li>c. Pruébalo con la clase TestTeclado mediante un menú.</li>
 * </ul>
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TestTeclado {
	public static void main(String[] args) {
		String[] opciones = { "Leer entero", "Leer decimal", "Leer carácter", "Leer cadena"};
		Menu menu = new Menu("Menú Teclado", opciones);

		int opcion;
		do {
			opcion = menu.gestionar();
			switch (opcion) {
			case 1:
				System.out.println(Teclado.leerEntero("Introduzca un entero: "));
				break;

			case 2:
				System.out.println(Teclado.leerDecimal("Introduzca un decimal: "));
				break;

			case 3:
				System.out.println(Teclado.leerCaracter("Introduzca un caracter: "));
				break;

			case 4:
				System.out.println(Teclado.leerCadena("Introduzca una cadena: "));
				break;

			default:
				System.out.println("\nSaliendo...");
			}
		} while (opcion !=menu.SALIR);
	}
}