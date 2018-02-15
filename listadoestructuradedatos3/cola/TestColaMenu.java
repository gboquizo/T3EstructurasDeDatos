package listadoestructuradedatos3.cola;

import utiles.Menu;
import utiles.Teclado;

/**
 * Crea una clase gen\u00e9rica Cola (debe de aceptar cualquier tipo de objeto
 * concreto, utiliza generics). Recuerda que has de evitar la interacci\u00f3n
 * con el usuario dentro de Cola. Utilizando generics, implementa las
 * operaciones b\u00e1sicas de una estructura de datos cola. Recuerda que una
 * cola es una estructura FIFO donde el primer elemento en entrar es el primero
 * en salir. Un ejemplo b\u00e1sico de cola es la de la taquilla de un cine. Las
 * operaciones a implementar son:
 * <ul>
 * 		<li>a. Crear una cola.</li>
 * 		<li>b. Introducir elemento en la cola (a\u00f1adir/enqueue)</li>
 * 		<li>c. Sacar elemento de la cola (extraer/dequeue)</li>
 * 		<li>d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front)</li>
 * </ul>
 * Implementa los m\u00e9todos necesarios, y recuerda hacer las pruebas precisas
 * Para ello, crea una clase TestCola donde se a\u00f1adan muchos elementos de
 * una clase creada en el mismo fichero (Persona, Paciente, Cartas...) y se
 * invoquen a todos los m\u00e9todos. Al final, vac\u00eda la cola con un bucle
 * while que extraiga de la cola hasta que se vac\u00ede.
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 * @param <T> el tipo de valor pasado a la cola.
 */
public class TestColaMenu {
	
	/**
	 * Una cola de personas.
	 */
	private static Cola<Persona> cola;
	
	/**
	 * Men\u00fa
	 */
	private static Menu menu;

	public static void main(String[] args) {
		menu = new Menu("Cola", new String[] { "Añadir a la cola", "Sacar elemento", "Cabeza de la cola",
				"Mostrar cola", "Limpiar cola" });
		cola = new Cola<Persona>();
		int opcion;
		do {
			do {
				opcion = menu.gestionar();
					realizarOpcion(opcion);
			} while (opcion != menu.SALIR);
		} while (Teclado.deseaContinuar());
	}

	/**
	 * Realiza las opciones del men\u00fa.
	 * @param opcion opci\u00f3n a realizar.
	 */
	private static void realizarOpcion(int opcion) {
		if (opcion != 1 && opcion != menu.SALIR && cola.isEmpty()) {
			System.err.println("\nLa cola est\u00e1 vac\u00eda, introduce primero");
			return;
		}
		switch (opcion) {
		case 1:
			annadir();
			break;
		case 2:
			extraer();
			break;
		case 3:
			System.out.println(cola.cabeza());
			break;
		case 4:
			mostrarCola();
			break;
		case 5:
			limpiar();
			break;
		default:
			System.out.println("\tHasta pronto");
		}

	}
	
	/**
	 * Muestra la cola, si no est\u00e1 vac\u00eda.
	 */
	private static void mostrarCola() {
		if (cola != null)
			System.out.println(cola.toString());

	}
	
	/**
	 * A\u00f1ade elementos a la cola, pedidos por teclado.
	 */
	private static void annadir() {
		cola.anadir(pedirDatos());

	}
	
	/**
	 * Extrae un elemento fuera de la cola.
	 */
	private static void extraer() {
		System.out.println("Elemento eliminado: " + cola.extraer());
	}
	
	/**
	 * Limpia la cola de elementos.
	 */
	private static void limpiar() {
		while (!cola.getCola().isEmpty()) {
			System.out.println("Elemento eliminado: " + cola.cabeza());
			cola.extraer();
		}
	}
	
	/**
	 * Pide los datos para la creaci\u00f3n de una nueva persona.
	 * @return
	 */
	private static Persona pedirDatos() {
		return new Persona(Teclado.leerCadena("Introduzca el D.N.I. : "), Teclado.leerCadena("Introduzca el nombre: "),
				Teclado.leerCadena("Introduzca los apellidos: "), Teclado.leerEntero("Introduzca la edad: "));
	}
}