package sieteymedia;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class Jugadores {

	/**
	 * Envoltorio de un arraylist de jugadores
	 */
	private ArrayList<Jugador> jugadores;

	/**
	 * Constructor de Jugadores
	 */
	public Jugadores() {
		jugadores = new ArrayList<Jugador>();
	}

	/**
	 * Inserta un jugador en la lista de jugadores
	 * 
	 * @param nombre nombre del jugador a insertar
	 * @return nombre nombre del jugador insertado
	 *
	 */
	String insertar(String nombre) {
		Jugador jugador = new Jugador(nombre);
		if (jugadores.contains(jugador))
			return ("Error al insertar el jugador.El jugador ya existe");
		jugadores.add(jugador);
		return nombre;
	}

	/**
	 * Elimina un jugador de la lista de jugadores
	 * 
	 * @param nombre nombre del jugador a eliminar
	 * 
	 */
	void borrar(String nombre) {
		Jugador jugador = new Jugador(nombre);
		jugadores.remove(jugador);
	}

	/**
	 * Muestra los jugadores
	 * @return el StrinBuilder muestraJugadores pasado a toString().
	 */
	String mostrar() {
		StringBuilder muestraJugadores = new StringBuilder("\n\t**JUGADORES**\n");
		for (int i = 0; i < size(); i++)
			muestraJugadores.append("\n\t" + (i + 1) + ". " + jugadores.get(i).getAlias().toUpperCase().trim()
					+ "\n\tPartidas jugadas: " + jugadores.get(i).getPartidasJugadas() + "\n\tPartidas ganadas: "
					+ jugadores.get(i).getPartidasGanadas() + "\n\tPartidas perdidas:"
					+ jugadores.get(i).getPartidasPerdidas() + "\n");
		return muestraJugadores.toString();

	}

	/**
	 * Obtiene el tama\u00f1o de la lista de jugadores
	 * 
	 * @return tama\u00f1o de la lista de jugadores
	 */
	public int size() {
		return jugadores.size();
	}

	/**
	 * Comprueba si la lista de jugadores est\u00e1 vac\u00eda
	 * 
	 * @return la verificaci\u00f3n o no de si la lista est\u00e1 vac\u00eda
	 */
	boolean isEmpty() {
		return jugadores.isEmpty();
	}

	/**
	 * Comprueba si el jugador est\u00e1 contenido en la lista
	 * 
	 * @param nombre, nombre del jugador en la lista
	 * @return la verificaci\u00f3n o no de si la el jugador est\u00e1 en la lista
	 *
	 */
	boolean contains(String nombre) {
		return jugadores.contains(new Jugador(nombre));
	}

	/**
	 * Jugador de la posici\u00f3n indicada
	 * 
	 * @param indice, del jugador
	 * @return
	 */
	public Jugador get(int indice) {
		return jugadores.get(indice);

	}

	/**
	 * Obtiene el \u00edndice del jugador que est\u00e1 en la lista
	 * 
	 * @param nombre
	 *            del jugador
	 * @return el \u00edndice del jugador en la lista
	 * @throws NombreNoValidoException
	 */
	int indexOf(String nombre) {
		return jugadores.indexOf(new Jugador(nombre));
	}

	/**
	 * Lista el objeto jugador en la lista de jugadores
	 * 
	 * @param jugador a a\u00f1adir
	 */
	void listarJugadores(Jugador jugador) {
		jugadores.add(jugador);

	}

	/**
	 * Ordena la lista de jugadores en funci\u00f3n de la cantidad de partidas
	 * ganadas
	 */
	void ordenarRanking() {
		Collections.sort(jugadores);
	}
	
	/**
	 * Limpia la lista de jugadores.
	 */
	public void clear() {
		jugadores.clear();
	}
}