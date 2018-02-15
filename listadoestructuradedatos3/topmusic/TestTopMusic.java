package listadoestructuradedatos3.topmusic;

import utiles.Menu;
import utiles.Teclado;

/**
 * Implementa un programa que gestione una lista de las canciones m\u00e1s
 * escuchadas. El usuario podr\u00e1:
 * <ul>
 * <li>a. A\u00f1adir una canci\u00f3n (en una posici\u00f3n) al TopMusic.</li>
 * <li>b. Sacar un elemento del TopMusic.</li>
 * <li>c. Subir un puesto en el TopMusic.</li>
 * <li>d. Bajar un puesto en el TopMusic.</li>
 * <li>e. Mostrar la lista TopMusic.</li>
 * <li>f. Mostrar la canci\u00f3n m\u00e1s escuchada.</li>
 * </ul>
 * Sobre la canci\u00f3n se almacenar\u00e1 el t\u00edtulo, artista o grupo y
 * a\u00f1o de grabaci\u00f3n
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestTopMusic {
	private static TopMusic topMusic;
	private static Menu menu;

	public static void main(String[] args) {
		menu = new Menu("Top Music", new String[] { "Añadir canción", "Eliminar canción", "Subir un puesto",
				"Bajar un puesto", "Mostrar Top Music", "Mostrar la canción más escuchada" });
		topMusic = new TopMusic();
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionarOpcion(opcion);
		} while (opcion != menu.SALIR);
	}

	private static void gestionarOpcion(int opcion) {
		if (opcion != 1 && opcion != menu.SALIR && topMusic.isEmpty()) {
			System.err.println("\n\u00a1Top vacio!\n");
			return;
		}
		switch (opcion) {
		case 1:
			annadir();
			break;
		case 2:
			eliminar();
			break;
		case 3:
			subir();
			break;
		case 4:
			bajar();
			break;
		case 5:
			mostrarTop();
			break;
		case 6:
			mostrarTop1();
			break;
		default:
			System.out.println("\tHasta pronto");
		}
	}

	/**
	 * Muestra la primera canci\u00f3n del top.
	 */
	private static void mostrarTop1() {
		System.out.println(topMusic.masEscuchada());
	}

	/**
	 * A\u00f1ade una canci\u00f3n al top.
	 */
	private static void annadir() {
		System.out.println(topMusic.annadir(topMusic.posicionValida(Teclado.leerEntero("Posición en el TopMusic:")),
				Teclado.leerCadena("Titulo:"), Teclado.leerCadena("Artista:"), Teclado.leerCadena("Año:")));
		System.out.println("");
	}

	/**
	 * Elimina una canci\u00f3n del top.
	 */
	private static void eliminar() {
		System.out.println(topMusic.sacar(Teclado.leerEntero("Indica posici\u00f3n de la canción a eliminar")));

	}

	/**
	 * Sube una canci\u00f3n del top.
	 */
	private static void subir() {

		if (!topMusic.isEmpty())
			System.out.println(topMusic.subir(topMusic.posicionValida(Teclado.leerEntero("\n\tIndica la posici\u00f3n de la "
					+ "canci\u00f3n que va a ascender"))));
	}

	/**
	 * Baja una canci\u00f3n del top.
	 */
	private static void bajar() {
		if (!topMusic.isEmpty())
			System.out.println(topMusic.bajar(topMusic.posicionValida(Teclado.leerEntero("\n\tIndica la posici\u00f3n de la "
					+ "canci\u00f3n que va a descender"))));
	}

	/**
	 * Muestra el top completo.
	 */
	private static void mostrarTop() {
		System.out.println(topMusic.mostrarTopMusic());
	}
}