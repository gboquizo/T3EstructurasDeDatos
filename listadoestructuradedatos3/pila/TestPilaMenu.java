package listadoestructuradedatos3.pila;

import listadoestructuradedatos3.cola.Persona;
import utiles.Menu;
import utiles.Teclado;

/**
 * Crea una clase gen\u00e9rica Pila (debe de aceptar cualquier tipo de objeto
 * concreto, utiliza generics). Recuerda que has de evitar la interacci\u00f3n con el
 * usuario dentro de Pila. Implementa las operaciones b\u00e1sicas de una estructura
 * de datos pila. Una pila es una estructura LIFO donde el \u00faltimo elemento en
 * entrar es el primero en salir. Un ejemplo b\u00e1sico de pila es la forma de
 * almacenamiento de procesos en la memoria. Las operaciones a implementar son:
 * <ul>
 * 		<li>a. Crear una pila.</li> 
 * 		<li>b.Introducir elemento en la pila (apilar o push)</li> 
 * 		<li>c. Sacar elemento de la pila (extraer o pop)</li> 
 * 		<li>d. Cima de la pila (devuelve el elemento de la cima de la pila o top)</li>
 * </ul>
 * 
 * Implementa los m\u00e9todos necesarios, y recuerda hacer las pruebas precisas
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestPilaMenu {
	static Pila<Persona> pila;
	static Menu menu;

	public static void main(String[] args) {
		menu = new Menu("Pila", new String[] { "Añadir a la pila", "Sacar elemento", "Top de la pila",
				"Mostrar pila", "Limpiar pila" });
		pila = new Pila<Persona>();
		int opcion;
		do {
			do {
				opcion = menu.gestionar();
					realizarOpcion(opcion);
			} while (opcion != menu.SALIR);
		} while (Teclado.deseaContinuar());
	}

	private static void realizarOpcion(int opcion) {
		if (opcion != 1 && opcion != menu.SALIR && pila.isEmpty()) {
			System.err.println("\nLa pila est\u00e1 vac\u00eda, introduce primero");
			return;
		}
		switch (opcion) {
		case 1:
			annadir();
			break;
		case 2:
			try {
				extraer();
			} catch (PilaEstaVaciaException e1) {
				System.err.println(e1.getMessage());
			}
			break;
		case 3:
			try {
				System.out.println(pila.top());
			} catch (PilaEstaVaciaException e) {
				System.err.println(e.getMessage());
			}
			break;
		case 4:
			mostrarCola();
			break;
		case 5:
			try {
				limpiar();
			} catch (PilaEstaVaciaException e) {
				System.err.println(e.getMessage());
			}
			break;
		default:
			System.out.println("\tHasta pronto");
		}
	}

	private static void mostrarCola() {
		if (pila != null)
			System.out.println(pila.toString());

	}

	private static void annadir() {
		pila.push(pedirDatos());

	}

	private static void extraer() throws PilaEstaVaciaException {
		System.out.println("\nElemento eliminado: \n" + pila.pop());
		System.out.println();
	}

	private static void limpiar() throws PilaEstaVaciaException {
		while (!pila.isEmpty()) {
			try {
				System.out.println("\nDesapilo de la pila: " + pila.top());
			} catch (PilaEstaVaciaException e) {
				System.err.println(e.getMessage());
			}
			pila.pop();
		}
	}

	private static Persona pedirDatos() {
		return new Persona(Teclado.leerCadena("Introduzca el D.N.I. : \n"), Teclado.leerCadena("Introduzca el nombre: \n"),
				Teclado.leerCadena("Introduzca los apellidos: \n"), Teclado.leerEntero("Introduzca la edad: \n"));
	}
}