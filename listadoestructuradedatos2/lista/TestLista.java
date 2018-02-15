package listadoestructuradedatos2.lista;

import java.util.*;
import utiles.Menu;
import utiles.Teclado;

/**
 * Entrega la clase Lista que:
 * <ul>
 * 		<li>a. Añada al final de la lista</li>
 * 		<li>b. Inserte un elemento en una determinada posición</li>
 * 		<li>c. Modifique un elemento reemplazándolo por otro</li>
 * 		<li>d. Conozca el tamaño de la lista</li>
 * 		<li>e. Elimine elementos de la lista</li>
 * 		<li>f. Busque elementos en la lista</li>
 * 		<li>g. Copie la lista</li>
 * </ul>
 * Utilízala en un ejemplo TestLista (por ejemplo, la alineación de un equipo de
 * fútbol, con titulares y reservas) y entrégalo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deberás implementar un menú con las opciones
 * posibles para que el usuario lo utilice fácilmente
 *
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TestLista {
	private static Lista<String> lista;

	public static void main(String[] args) {
		System.out.println("\n\tBienvenido, introduce la opción que desees:\n");
		Menu menu = new Menu("Elementos",
				new String[] { "Insertar elementos al final de la lista", "Insertar elemento por índice",
						"Reemplazar elemento", "Tamaño de la lista", "Eliminar elemento", "Buscar elemento",
						"Copiar elemento", "Mostrar elemento" });
		ArrayList<String> cadena = new ArrayList<String>();
		cadena.add("\tElemento 1");
		cadena.add("\tElemento 2");
		cadena.add("\tElemento 3");
		cadena.add("\tElemento 4");
		cadena.add("\tElemento 5");
		cadena.add("\tElemento 6");
		cadena.add("\tElemento 7");
		lista = new Lista<String>(cadena);
		int opcion;
		do {
			mostrar();
			opcion = menu.gestionar();
			gestionarMenu(opcion);
		} while (opcion != menu.SALIR);
	}

	/**
	 * Gestiona un menú para manejar la lista.
	 * 
	 * @param opcion, opción indicada por el usuario.
	 */
	private static void gestionarMenu(int opcion) {
		switch (opcion) {
		case 1:
			add();
			break;
		case 2:
			addIdx();
			break;
		case 3:
			reemplazar();
			break;
		case 4:
			size();
			break;
		case 5:
			borrar();
			break;
		case 6:
			buscar();
			break;
		case 7:
			copiar();
			break;
		case 8:
			mostrar();
			break;
		case 9:
			salir();
			break;
		}
	}

	/**
	 * Añade elemento al final de la lista.
	 */
	private static void add() {
		try {
			lista.add("\t" + Teclado.leerCadena("\tNuevo elemento:"));
			mostrar();
		} catch (ElementoYaExisteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Añade elemento en una posición determinada de la lista.
	 */
	private static void addIdx() {
		try {
			mostrar();
			lista.add(pedirPosicion(), "\t" + Teclado.leerCadena("\tNuevo elemento:"));
			System.out.println("\nElemento añadido\n");
			mostrar();
		} catch (IndiceFueraDeRangoException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Sale del menú
	 */
	private static void salir() {
		System.out.println("\tHasta Luego.");
	}

	/**
	 * Borra un elemento de la lista.
	 */
	private static void borrar() {
		try {
			if (mostrarSiVacia())
				lista.borrar(lista.posicionValida(Teclado
						.leerEntero("Indique la posición del elemento a borrar entre 1 y " + lista.size() + " :")));
			System.out.println("\nElemento borrado, mostrando la lista:\n");
			mostrar();
		} catch (PosicionNoValidaException | ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Permite reemplazar un elemento de la lista.
	 */
	private static void reemplazar() {
		try {
			mostrar();
			lista.reemplazar(
					Teclado.leerEntero("Introduzca el índice del elemento a modificar entre 1 y " + lista.size()),
					"\t" + Teclado.leerCadena("\tNuevo elemento:"));
			System.out.println("\nLista modificada, mostrando nueva lista:\n");
			mostrar();
		} catch (IndiceFueraDeRangoException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Muestra el tamaño de la lista de elementos.
	 */
	private static void size() {
		System.out.println("\nTamaño de la lista: " + lista.size() + "\n");
	}

	/**
	 * Muestra la lista
	 */
	private static void mostrar() {
		System.out.println(lista.toString());
	}

	/**
	 * Copia la lista
	 */
	private static void copiar() {
		lista.copiaLista();
	}

	/**
	 * Busca un elemento de la lista
	 */
	private static void buscar() {
		if (lista.buscaElemento(Teclado.leerCadena("\n\tElemento a buscar:")))
			System.out.println("\n\tExiste.");
		else
			System.out.println("\n\tNo existe.");
	}

	/**
	 * Permite pedir al usuario en qué posición por índice se modificará la lista.
	 * 
	 * @return la posición pedida por teclado
	 */
	private static int pedirPosicion() {
		return Teclado.leerEntero("\n\tIndica la posición del nuevo elemento entre 1 y " + (lista.size() + 1) + ":\n");
	}

	/**
	 * Comprueba que la lista no esté vacía
	 * 
	 * @return true o false en funcion de si está vacía o no
	 * @throws ListaVaciaException
	 */
	private static boolean mostrarSiVacia() throws ListaVaciaException {
		if (lista.isEmpty()) {
			throw new ListaVaciaException("\n!La lista está vacía!\n");
		}
		return true;
	}
}