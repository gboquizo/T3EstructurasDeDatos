package topmusicexcepciones;

import java.util.ArrayList;
import java.util.Iterator;

import topmusicexcepciones.excepciones.AutorNoValidoException;
import topmusicexcepciones.excepciones.CancionNoValidaException;
import topmusicexcepciones.excepciones.FechaNoValidaException;
import topmusicexcepciones.excepciones.PosicionNoValidaException;
import topmusicexcepciones.excepciones.TituloNoValido;

public class TopMusic {

	/**
	 * ArrayList de canciones.
	 */
	private ArrayList<Cancion> topMusic;

	/**
	 * Constructor de la clase.
	 */
	public TopMusic() {
		topMusic = new ArrayList<Cancion>();
	}

	/**
	 * Añade una cancion al TopMusic
	 * 
	 * @param indice, donde alojar la cancion (al usuario se muestra la posicion empezando en 1)
	 */
	void annadir(int indice, String titulo, String artista, int annoGrabacion)
			throws CancionNoValidaException, TituloNoValido, AutorNoValidoException, FechaNoValidaException,
			PosicionNoValidaException {

		if (fueraDeRango(indice - 1)) {
			throw new PosicionNoValidaException("\n\tError al añadir la canción: la posición no es válida.\n");
		}

		topMusic.add(indice - 1, new Cancion(titulo, artista, annoGrabacion));
	}

	/**
	 * Saca una cancion del top music
	 * 
	 * @param cancion cancion a borrar del top
	 * @throws PosicionNoValidaException
	 */
	void sacar(int indice) throws PosicionNoValidaException {
		if (!topMusic.isEmpty())
			if (fueraDeRango(indice - 1))
				throw new PosicionNoValidaException("\n\tError al borrar la canción: La posición no es válida\n");
			else
				topMusic.remove(indice - 1);

	}

	/**
	 * Sube una posicion una cancion
	 * 
	 * @param cancion
	 *            a subir de posicion
	 * @return 
	 * @throws PosicionNoValidaException
	 */
	void subir(int indice) throws PosicionNoValidaException {
		if (!(topMusic.isEmpty() || fueraDeRango(indice) || (indice - 2 < 0))) {
			topMusic.add(indice - 2, topMusic.remove(indice - 1));
		} else
			throw new PosicionNoValidaException("\n\tError al subir la canción: La canción ya es la primera o no es una posición válida.\n");
	}

	/**
	 * Baja una posicion una cancion
	 * 
	 * @param cancion
	 * @throws PosicionNoValidaException
	 */
	void bajar(int indice) throws PosicionNoValidaException {
		if (!(topMusic.isEmpty() || fueraDeRango(indice) || (indice > topMusic.size() - 1))) {
			topMusic.add(indice, topMusic.remove(indice - 1));
		} else
			throw new PosicionNoValidaException("\n\tError al bajar la canción: la canción está la última o no es una posición válida.\n");

	}

	/**
	 * Controla que la canción introducida en el TopMusic no pase de rango
	 * 
	 * @param indice
	 * @return
	 */
	private boolean fueraDeRango(int indice) {
		if (!esValida(indice))
			return false;
		return true;
	}

	/**
	 * Recoge una posicion valida
	 * 
	 * @param indice
	 *            Indice de la posicion
	 * @return El indice si es valido
	 */
	int posicionValida(int indice) {
		if (esValida(indice))
			return topMusic.size();
		else
			return indice;
	}

	/**
	 * @param indice
	 * @return
	 */
	private boolean esValida(int indice) {
		return indice > topMusic.size() || indice < 0;
	}

	/**
	 * Muestra el top Music
	 */
	String mostrarTopMusic() {
		StringBuilder top = new StringBuilder("");
		if (topMusic.size() >= tamannoTop()) {
			top.append("\n\t***Top Ten***\n");
			int i = 1;
			for (Iterator<Cancion> it = topMusic.iterator(); it.hasNext();)
				top.append("\n\t" + (i++) + " " + it.next() + "\n");

		}
		return top.toString().toUpperCase();
	}

	/**
	 * Muestra la cancion del top
	 */
	Cancion masEscuchada() {
		if (!topMusic.isEmpty()) {
			return topMusic.get(0);
		}
		return null;
	}

	/**
	 * @return tamanno de la lista
	 */
	private int tamannoTop() {
		if (topMusic.size() < 10)
			return topMusic.size();
		return 10;
	}

	/**
	 * Indica si la lista esta vacia o no
	 * 
	 * @return
	 */
	boolean isEmpty() {
		return topMusic.isEmpty();
	}

	/**
	 * Método que controla el tamaño de la lista
	 * 
	 * @return tamaño del topMusic
	 */
	int size() {
		return topMusic.size() + 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((topMusic == null) ? 0 : topMusic.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TopMusic))
			return false;
		TopMusic other = (TopMusic) obj;
		if (topMusic == null) {
			if (other.topMusic != null)
				return false;
		} else if (!topMusic.equals(other.topMusic))
			return false;
		return true;
	}

}