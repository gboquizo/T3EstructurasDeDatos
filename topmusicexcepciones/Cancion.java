package topmusicexcepciones;

import java.util.Calendar;
import java.util.regex.Pattern;
import topmusicexcepciones.excepciones.AutorNoValidoException;
import topmusicexcepciones.excepciones.CancionNoValidaException;
import topmusicexcepciones.excepciones.FechaNoValidaException;
import topmusicexcepciones.excepciones.TituloNoValido;

public class Cancion {

	/**
	 * Fecha del sistema
	 */
	private static final Calendar FECHA = Calendar.getInstance();
	
	/**
	 * Fecha del sistema.
	 */
	private static final int ANNO = FECHA.get(Calendar.YEAR);
	
	/**
	 * Patrón para validar el título de la canción y el autor.
	 */
	private static final Pattern PATTERN = Pattern.compile("([´,'\\-a-zA-ZáéíóúñÑ0-9]+\\s?){2,}");
	
	/**
	 * Campo que controla el año inicial.
	 */
	private static final int ANNO_INICIAL = 1950;

	/**
	 * Título de la canción.
	 */
	private String titulo;

	/**
	 * Nombre del artista.
	 */
	private String artista;

	/**
	 * Año de grabación.
	 */
	private int annoGrabacion;

	/**
	 * Constructor de la clase.
	 * 
	 * @param titulo,titulo de la canción.
	 * @param artista,artista de la canción.
	 * @param annoGrabacion,año de grabación de la canción.
	 * @throws CancionNoValidaException.
	 * @throws AutorNoValidoException.
	 * @throws FechaNoValidaException.
	 * @throws TituloNoValido.
	 */
	Cancion(String titulo, String artista, int annoGrabacion) throws CancionNoValidaException, TituloNoValido, AutorNoValidoException, FechaNoValidaException {
		if (!isTituloValido(titulo) && !isArtistaValido(artista)
				&& !isAnnoValido(annoGrabacion)) {
			throw new CancionNoValidaException("\\nError al insertar la canción.La canción no es válida.\n");
		}
		setTitulo(titulo);
		setArtista(artista);
		setannoGrabacion(annoGrabacion);
	}
	
	/**
	 * Comprueba si un título o un artista se introducen de manera válida.
	 * 
	 * @param mensaje mensaje a comprobar.
	 * @return el patrón que comprueba dicho mensaje, true o false según lo haga.
	 */
	private boolean isTituloValido(String mensaje) {
		return PATTERN.matcher(mensaje).matches();
	}
	
	/**
	 * Comprueba si un título o un artista se introducen de manera válida.
	 * 
	 * @param mensaje mensaje a comprobar.
	 * @return el patrón que comprueba dicho mensaje, true o false según lo haga.
	 */
	private boolean isArtistaValido(String mensaje) {
		return PATTERN.matcher(mensaje).matches();
	}

	/**
	 * Comprueba el año de grabación es o no válido.
	 * 
	 * @param annoGrabacion annoGrabacion a comprobar.
	 * @return el patrón que comprueba dicho annoGrabacion, true o false según lo haga.
	 */
	private boolean isAnnoValido(int annoGrabacion) {
		return annoGrabacion >= ANNO_INICIAL && annoGrabacion <= ANNO;
	}

	/**
	 * Lee el título de la canción.
	 * 
	 * @return titulo el título obtenido.
	 */
	private String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo,
	 *            titulo de la cancion
	 * @throws TituloNoValido
	 */
	private void setTitulo(String titulo) throws TituloNoValido {
		if (!isTituloValido(titulo))
			throw new TituloNoValido("\nError al insertar la canción. El título no es válido\n");
		else
			this.titulo = titulo;
	}


	/**
	 * Lee el nombre del artista.
	 * 
	 * @return artista artista a obtener.
	 */
	private String getArtista() {
		return artista;
	}


	/**
	 * Establece el nombre del artista. Si no es válido, lanzará una excepción.
	 * 
	 * @param artista, artista de la cancion.
	 * @throws AutorNoValidoException. 
	 * */
	private void setArtista(String artista)  throws AutorNoValidoException{
		if(!isArtistaValido(artista))
			throw new AutorNoValidoException("Error al insertar la canción: El autor indicado no es válido");	
		else
		this.artista = artista;
	}

	/**
	 * Lee el año de grabación
	 * 
	 * @return annoGrabacion el año de grabación a obtener.
	 */
	private int getannoGrabacion() {
		return annoGrabacion;
	}

	/**
	 * Establece el año de grabación. Si no es válido, lanzará una excepción.
	 * @param annoGrabacion, año de grabación de la canción
	 * @throws FechaNoValidaException 
	 * */
	private void setannoGrabacion(int annoGrabacion) throws FechaNoValidaException {
		if(!isAnnoValido(annoGrabacion))
			throw new FechaNoValidaException("\nError al insertar la canción. La fecha no es válida.");
		else
			this.annoGrabacion = annoGrabacion;
	}

	@Override
	public String toString() {
		return "" + getTitulo() + ", " + getArtista() + ", (" + getannoGrabacion() + ")";
	}
}