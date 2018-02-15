package listadoestructuradedatos3.topmusic;

/**
 * Implementa un programa que gestione una lista de las canciones m\u00e1s
 * escuchadas. El usuario podr\u00e1:
 * <ul>
 * 		<li>a. A\u00f1adir una canci\u00f3n (en una posici\u00f3n) al TopMusic.</li>
 * 		<li>b. Sacar un elemento del TopMusic.</li>
 * 		<li>c. Subir un puesto en el TopMusic.</li>
 * 		<li>d. Bajar un puesto en el TopMusic.</li>
 * 		<li>e. Mostrar la lista TopMusic.</li>
 * 		<li>f. Mostrar la canci\u00f3n m\u00e1s escuchada.</li>
 * </ul>
 * Sobre la canci\u00f3n se almacenar\u00e1 el t\u00edtulo, artista o grupo y
 * a\u00f1o de grabaci\u00f3n
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class Cancion {
	
	/**
	 * T\u00edtulo de la canci\u00f3n
	 */
	private String titulo;

	/**
	 * Nombre del artista
	 */
	private String artista;

	/**
	 * A\u00f1o de grabaci\u00f3n
	 */
	private String annoGrabacion;

	/**
	 * Constructor que recibe el t\u00edtulo, el artista y el a\u00f1o
	 * 
	 * @param titulo
	 *            de la canci\u00f3n
	 * @param artista
	 * @param anno
	 *            de grabaci\u00f3n
	 */
	public Cancion(String titulo, String artista, String annoGrabacion) {
		setTitulo(titulo);
		setArtista(artista);
		setannoGrabacion(annoGrabacion);
	}

	/**
	 * Constructor solo con un titulo.
	 * 
	 * @param titulo
	 */
	public Cancion(String titulo) {
		setTitulo(titulo);
	}

	/**
	 * Lee el t\u00edtulo de la canci\u00f3n
	 * 
	 * @return titulo
	 */
	String getTitulo() {
		return titulo;
	}

	/**
	 * Escribe el t\u00edtulo de la canci\u00f3n
	 * 
	 * @param titulo
	 */
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Lee el nombre del artista
	 * 
	 * @return artista
	 */
	String getArtista() {
		return artista;
	}

	/**
	 * Escribe el nombre del artista
	 * 
	 * @param artista
	 */
	private void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * Lee el a\u00f1o de grabaci\u00f3n
	 * 
	 * @return annoGrabacion
	 */
	String getannoGrabacion() {
		return annoGrabacion;
	}

	/**
	 * Escribe al a\u00f1o de grabaci\u00f3n
	 * 
	 * @param annoGrabacion
	 */
	private void setannoGrabacion(String annoGrabacion) {
		this.annoGrabacion = annoGrabacion;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nArtista: " + artista + "\nA\u00f1o: " + annoGrabacion + "\n";
	}
}