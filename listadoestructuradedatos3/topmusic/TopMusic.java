package listadoestructuradedatos3.topmusic;

import java.util.ArrayList;

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
public class TopMusic {

	/**
	 * Constante que define el tope de tama\u00f1o del Top Music.
	 */
	private static final int TOPSIZE = 10;

	/**
	 * ArrayList que contiene las canciones.
	 */
	private ArrayList<Cancion> topMusic;

	public TopMusic() {
		topMusic = new ArrayList<Cancion>();
	}

	/**
	 * A\u00f1ade una canci\u00f3n al TopMusic
	 * 
	 * @param cancion
	 *            a a\u00f1adir
	 * @param titulo
	 *            a a\u00f1adir
	 * @param artista
	 *            a a\u00f1adir
	 * @param annoGrabacion
	 *            a a\u00f1adir
	 */
	String annadir(int indice, String titulo, String artista, String annoGrabacion) {
		if (isEmpty()) {
			topMusic.add(new Cancion(titulo, artista, annoGrabacion));
			return "\n\tPrimera canci\u00f3n, introducida al principio.\n\t\u00a1Cancion a\u00f1adida!";
		}
		if (esPosicionValida(indice)) {
			topMusic.add(indice, new Cancion(titulo, artista, annoGrabacion));
			return "\n\tIntroducida en la posici\u00f3n indicada.\n\t\u00a1Cancion a\u00f1adida!";
		}
		return "Imposible introducir cancion";
	}

	/**
	 * Saca una canci\u00f3n del Top Music
	 * 
	 * @param cancion
	 *            a sacar.
	 */
	String sacar(int indice) {
		if (!topMusic.isEmpty())
			if (esPosicionValida(indice)) {
				topMusic.remove(topMusic.get(indice - 1));
				return "Canci\u00f3n borrada";
			}
		return "Imposible realizar el borrado";
	}

	
	String subir(int posicion) {
		if (posicion == 0)
			return "\nYa esta en el Top 1, no puede subir m\u00e1s";
		if (!(topMusic.isEmpty() || fueraDeRango(posicion) || (posicion - 1 < 0)))
			topMusic.add(posicion, topMusic.remove(posicion));
		return "" + topMusic.get(posicion) + " ha subido";
	}

	String bajar(int posicion) {
		if (!(topMusic.isEmpty() || fueraDeRango(posicion) || (posicion > topMusic.size() - 1)))
			topMusic.add(posicion, topMusic.remove(posicion));
		return topMusic.get(posicion).getTitulo() + " ha bajado";
	}

	/**
	 * Muestra la cancion del top
	 */
	StringBuilder masEscuchada() {
		StringBuilder one = new StringBuilder("");
		if (topMusic.size() > 0) {
			for (int i = 0; i < tamannoTop(); i++) {
				one.append("Top 1: \n" + topMusic.get(0).toString() + "\n");
			}
		}
		return one;
	}

	/**
	 * Muestra el top Music
	 */
	StringBuilder mostrarTopMusic() {
		StringBuilder top = new StringBuilder("");
		if (topMusic.size() > 0) {
			top.append("Top Ten:\n");
			for (int i = 0; i < tamannoTop(); i++) {
				top.append(topMusic.get(i).toString() + "\n");
			}
		}
		return top;
	}

	/**
	 * @return tamanno de la lista
	 */
	int tamannoTop() {
		int tamannoTop = TOPSIZE;
		if (topMusic.size() < TOPSIZE)
			tamannoTop = topMusic.size();
		return tamannoTop;
	}

	private boolean esPosicionValida(int indice) {
		if (indice <= 0 || indice > topMusic.size())
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
		if (indice > topMusic.size() || indice <= 0)
			return topMusic.size();
		else
			return indice - 1 ;
	}
	
	/**
	 * Controla que la canción introducida en el TopMusic no pase de rango
	 * 
	 * @param indice
	 * @return
	 */
	private boolean fueraDeRango(int indice) {
		if (indice < 0 || indice > topMusic.size())
			return true;
		return false;
}

	/**
	 * indica si la lista esta vacia o no
	 * 
	 * @return
	 */
	boolean isEmpty() {
		return topMusic.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String cadena = "";
		if (topMusic.size() < 10) {
			for (int i = 0; i < topMusic.size(); i++) {
				cadena += "(" + (i + 1) + ")" + topMusic.get(i) + "\n";
			}
		}
		return "Top Music:\n" + cadena;
	}
}