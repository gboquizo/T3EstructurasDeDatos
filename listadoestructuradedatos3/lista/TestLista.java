package listadoestructuradedatos3.lista;

import java.util.*;

import listadoestructuradedatos3.cola.Persona;
import utiles.Menu;
import utiles.Teclado;

/**
 * Entrega la clase Lista que:
 * <ul>
 * 		<li>a. A\u00f1ada al final de la lista</li>
 * 		<li>b. Inserte un elemento en una determinada posici\u00f3n</li>
 * 		<li>c. Modifique un elemento reemplaz\u00e1ndolo por otro</li>
 * 		<li>d. Conozca el tama\u00f1o de la lista</li>
 * 		<li>e. Elimine elementos de la lista</li>
 * 		<li>f. Busque elementos en la lista</li>
 * 		<li>g. Copie la lista</li>
 * </ul>
 * Util\u00edzala en un ejemplo TestLista (por ejemplo, la alineaci\u00f3n de un equipo de
 * f\u00fatbol, con titulares y reservas) y entr\u00e9galo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deber\u00e1s implementar un men\u00fa con las opciones
 * posibles para que el usuario lo utilice f\u00e1cilmente
 *
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestLista {
	static Lista<Persona> lista;
	static Menu menuLista;

	public static void main(String[] args) {
		System.out.println("\n\tBienvenido, introduce la opci\u00f3n que desees");
		Menu menu = new Menu("Elementos",
				new String[] { "Insertar elementos al final de la lista", "Insertar elemento por \u00edndice",
						"Remplazar elemento", "Tama\u00f1o de la lista", "Eliminar elemento", "Buscar elemento",
						"Copiar elemento", "Mostrar elemento" });
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("30991068V", "Guillermo", "Boquizo S\u00e1nchez", 31));
		personas.add(new Persona("65986321Z", "Fulanito", "Campos Aguilar", 47));
		personas.add(new Persona("98635354P", "Zutanito", "Escobar Garc\u00e1a", 31));
		personas.add(new Persona("58424569Q", "Menganito", "Zut\u00e1\u00f1ez S\u00e1nchez", 27));
		lista = new Lista<Persona>(personas);
		int opcion;
		do {
			menuLista= new Menu("Elemento A SUSTITUIR",
					 personas.toArray());
			opcion = menu.gestionar();
			gestionarMenu(opcion);
		} while (opcion != menu.SALIR);
	}

	/**
	 * Gestiona un men\u00fa para manejar la lista.
	 * 
	 * @param opcion, opci\u00f3n indicada por el usuario.
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
	 * Sale del men\u00fa
	 */
	private static void salir() {
		System.out.println("\tHasta Luego.");
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
		lista.copiar();
	}

	/**
	 * Busca un elemento de la lista
	 */
	private static void buscar() {
		if (lista.buscaElemento(pedirDatos()));
			System.out.println("\n\tExiste.");
			System.out.println("\n\tNo existe.");
	}

	/**
	 * Borra un elemento de la lista.
	 */
	private static void borrar() {
		lista.borrar(lista.getArraylist().get(menuLista.gestionar() - 1));
	}

	/**
	 * Muestra el tama\u00f1o de la lista de elementos.
	 */
	private static void size() {
		System.out.println("\nTama\u00f1o de la lista: " + lista.size());
	}

	/**
	 * Permite reemplazar un elemento de la lista.
	 */
	private static void reemplazar() {
		lista.reemplazar(lista.getArraylist().get(menuLista.gestionar() - 1), pedirDatos());
	}

	/**
	 * A\u00f1ade elemento al final de la lista.
	 */
	private static void add() {
		lista.add(pedirDatos());
		
	}

	/**
	 * A\u00f1ade elemento en una posici\u00f3n determinada de la lista.
	 */ 
	private static void addIdx() {
		if (!lista.add(pedirDatos(), pedirPosicion()))
			System.out.println("\tError.No se ha podido a\u00f1adir el elemento en la posici\u00f3n indicada.");
	}
	
	/**
	 * Permite pedir al usuario en qu\u00e9 posici\u00f3n por \u00edndice  se modificar\u00e1 la lista.
	 * 
	 * @return posici\u00f3n posici\u00f3n que se desea modificar de la lista
	 */
	private static int pedirPosicion() {
		int posicion;
		do {
			posicion = Teclado.leerEntero("\tIndica la posici\u00f3n del nuevo elemento entre 0 y " + lista.size() + ":");
			if(!esValida(posicion))
				System.out.println("\n\tError, no existe esa posici\u00f3n, introduzca una posici\u00f3n v\u00e1lida:" + "\n");
		} while (!esValida(posicion));
		return posicion;
	}
	
	/**
	 * Pide los datos para la creaci\u00f3n de una nueva persona.
	 * @return
	 */
	private static Persona pedirDatos() {
		return new Persona(Teclado.leerCadena("Introduzca el D.N.I. : "), Teclado.leerCadena("Introduzca el nombre: "),
				Teclado.leerCadena("Introduzca los apellidos: "), Teclado.leerEntero("Introduzca la edad: "));
	}
	
	/**
	*Devuelve true si la posici\u00f3n es v\u00e1lida y false en caso contrario.
	*@return true o false en funci\u00f3n de la posici\u00f3n.
	*/
	private static boolean esValida(int posicion) {
		if(posicion < 0 || posicion > lista.size())
			return false;
		return true;	
	}
}