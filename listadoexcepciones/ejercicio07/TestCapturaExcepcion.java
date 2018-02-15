package listadoexcepciones.ejercicio07;

/**
 * El siguiente código lanza una excepción. 
 * Captúrala (try/catch) y haz un
 * System.out.println() de los siguientes métodos de la excepción capturada:
 * getMessage(), getCause(), getLocalizedMessage(), toString().Realiza las
 * siguientes actividades.
 * <ul>
 * 		<li>a. ¿Cuál es la excepción lanzada y a qué paquete pertenece?</li>
 * 		<li>b. Envía el código nuevo.</li>
 * </ul>
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 *
 */
public class TestCapturaExcepcion {
	public static void main(String[] args) {

		try {
			int dividendo = 7;
			int divisor = 0;
			@SuppressWarnings("unused")
			int cociente = dividendo / divisor;
			System.out.println("Aaaaaaaadios");
		} catch (Exception e) {
			System.out.println("Aquí te vas a encontrar una excepción, no se puede dividir entre 0");
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
			System.err.println(e.getLocalizedMessage());
			System.err.println(e.toString());
		} finally {
			System.out.println("Aaaaaaaadios");
		}
	}
}