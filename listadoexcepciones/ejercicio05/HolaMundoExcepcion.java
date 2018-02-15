package listadoexcepciones.ejercicio05;
/**
* El siguiente código lanza una excepción. Responde a las siguientes preguntas:
* <ul>
* 		<li>a. ¿Es una excepción checked o unchecked?</li>
* 		<li>b. Clase a la que pertenece</li>
* 		<li>c. Modifica el código para capturarla (try/catch) . Muestra el resultado 
* 				de los siguientes métodos:
* 			<ul>
* 				<li>i. getMessage(),</li>
* 				<li>ii. getCause(),</li>
* 				<li>iii. getLocalizedMessage(),</li>
* 				<li>iv. toString().</li>
* 			</ul>
* 		</li>
* 		<li>d. ¿A qué clase pertenecen los métodos anteriores?</li>
* 		<li>e. Asegúrate de que se muestre el mensaje "Después del lanzamiento de la
* 				excepción"</li>
* </ul>
* @author Guillermo Boquizo Sánchez
* @version 1.0
*
*/
public class HolaMundoExcepcion {
	public static void main(String[] args) {
		try {

			String[] mensaje = new String[2];
			mensaje[0] = "Hola ";
			mensaje[1] = "mundo!";

			// este bucle accederá a un índice fuera de rango
			// y lanzará una excepción

			for (int i = 0; i < 3; i++)

				System.out.println(mensaje[i]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

			System.err.println(e.getMessage());

			System.err.println(e.getCause());

			System.err.println(e.getLocalizedMessage());

			System.err.println(e.toString());
		} finally {
			System.out.println("Después del lanzamiento de la excepción");
		}
	}
}