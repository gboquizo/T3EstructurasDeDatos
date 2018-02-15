package topmusicexcepciones;

import topmusicexcepciones.excepciones.AutorNoValidoException;
import topmusicexcepciones.excepciones.CancionNoValidaException;
import topmusicexcepciones.excepciones.FechaNoValidaException;
import topmusicexcepciones.excepciones.PosicionNoValidaException;
import topmusicexcepciones.excepciones.TituloNoValido;
import topmusicexcepciones.excepciones.TopMusicVacioException;
import utiles.Menu;
import utiles.Teclado;

public class TestTopMusic {

	/**
	 * Campo de la clase, recoge las canciones.
	 */
	private static TopMusic topMusic = new TopMusic();

	public static void main(String[] args) {
		Menu menu = new Menu("Top Music", new String[] { "Añadir canción", "Eliminar canción", "Subir un puesto",
				"Bajar un puesto", "Mostrar Top Music", "Mostrar la canción más escuchada" });
		int opcion;

		do {
			opcion = menu.gestionar();
			try {
				gestionarOpcion(opcion);
			} catch (TopMusicVacioException e) {
				System.err.println(e.getMessage());
			}
		} while (opcion != menu.SALIR);
	}

	private static void gestionarOpcion(int opcion) throws TopMusicVacioException {
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
			mostrarTopMusic();
			break;
		case 6:
			mostrarTop1();
			break;
		case 7:
			salir();
			break;
		}

	}

	/**
	 * Añade una cancion al top
	 * 
	 * @return
	 */
	private static void annadir() {
		try {
			topMusic.annadir(
					Teclado.leerEntero("Introduce una posicion en el top (entre 1 y " + topMusic.size() + "):"),
					Teclado.leerCadena("Titulo: "), Teclado.leerCadena("Artista: "),
					Teclado.leerEntero("Año grabacion (entre 1950 y el año actual): "));
			System.out.println("\n\t¡Cancion añadida!\n");
		} catch (CancionNoValidaException | TituloNoValido | AutorNoValidoException | FechaNoValidaException
				| PosicionNoValidaException e) {
			System.err.println(e.getMessage() + "\n\tNo se pudo añadir.\n");
		}

	}

	/**
	 * Elimina una cancion del top
	 * 
	 * @throws TopMusicVacioException
	 */
	private static void eliminar() throws TopMusicVacioException {
		mostrarSiVacio();
		try {
			topMusic.sacar(topMusic.posicionValida(Teclado.leerEntero("\n\tPosicion:\n")));
			System.out.println("\n\t¡Cancion eliminada!\n");
		} catch (PosicionNoValidaException e) {
			System.err.println(e.getMessage() + "\n\tNo se pudo eliminar.\n");
		}
	}

	/**
	 * Sube una cancion del top
	 * 
	 * @throws TopMusicVacioException
	 */
	private static void subir() throws TopMusicVacioException {
		mostrarSiVacio();
		try {
			topMusic.subir(topMusic.posicionValida(Teclado.leerEntero("\n\tPosicion:\n")));
			System.out.println("\n\t¡Cancion subida!\n");
		} catch (PosicionNoValidaException e) {
			System.err.println(e.getMessage() + "\n\tNo se pudo subir.\n");
		}
	}

	/**
	 * Baja una cancion del top1
	 * 
	 * @throws TopMusicVacioException
	 */
	private static void bajar() throws TopMusicVacioException {
		mostrarSiVacio();
		try {
			topMusic.bajar(topMusic.posicionValida(Teclado.leerEntero("\n\tPosicion:\n")));
			System.out.println("\n\t¡Cancion bajada!\n");

		} catch (PosicionNoValidaException e) {
			System.err.println(e.getMessage() + "\n\tNo se pudo bajar.\n");
		}
	}

	/**
	 * Muestra el top completo
	 * 
	 * @throws TopMusicVacioException
	 */
	private static void mostrarTopMusic() throws TopMusicVacioException {
		mostrarSiVacio();
		System.out.println(topMusic.mostrarTopMusic());

	}

	/**
	 * Muestra el nº 1 del top
	 * 
	 * @throws TopMusicVacioException
	 */
	private static void mostrarTop1() throws TopMusicVacioException {
		mostrarSiVacio();
		int i = 1;
		System.out.println("\n\t***Top 1***");
		System.out.println("\n\t" + (i++) + " " + topMusic.masEscuchada().toString().toUpperCase());

	}

	/**
	 * Lanza una excepción si el TopMusic está vacío.
	 * 
	 * @throws TopMusicVacioException
	 */
	private static void mostrarSiVacio() throws TopMusicVacioException {
		if (topMusic.isEmpty())
			throw new TopMusicVacioException("\n\tTop Vacío. No se puede realizar la acción.\n");
	}

	/**
	 * Sale del programa
	 */
	private static void salir() {
		System.out.println("\n\t¡Adios!\n");
		System.exit(0);
	}
}