package listadoexcepciones.ejercicio09;

/**
 * Ejecuta el siguiente código y responde:
 * <ol>
 * 		<li>A continuación aparecen dos pilas de ejecución de métodos, es decir, dos <br/ >
 * 			instantáneas de la ejecución. Indica en qué instante se encuentra cada pila:
 * 			<ol>
 * 				<li>El metodo3 se está ejecutando,</li>
 * 				<li>El método 3 ha finalizado y devuelve el control al metodo2</li>
 * 			</ol>
 * 		</li>
 * 		<li>Realiza una captura del error . Indica qué tipo de excepción es:
 *			verificada o no <br/ > verificada .</li>
 * 		<li>Indica dónde se lanza la excepción</li>
 * 		<li>Indica dónde se captura la excepción</li>
 * 		<li><p>Modifica el código para que la excepción sea capturada en metodo3 <br/ >
 * 			mostrando el mensaje "División por cero".Utiliza el menú "Código fuente..." <br/ >
 * 			de Eclipse.Entrégalo en TestPropagaExcepcion 2.</p></li>
 * 		<li><p>Modifica el código para que la excepción sea capturada de la misma forma
 * 			en <br/ > metodo2. Entrégalo en TestPropagaExcepcion 3.</p></li>
 * 		<li><p>Modifica el código para que la excepción sea capturada de la misma forma
 * 			en <br/ > el main. Entrégalo en TestPropagaExcepcion 4</p></li>
 * </ol>
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TestPropagaExcepcion3 {
	public static void main(String[] args) {
		metodo1();
	}

	private static void metodo1() {
		metodo2();
	}

	private static void metodo2() {
		try {
			metodo3();
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());

		} finally {
			System.out.println("División por cero");
		}
	}

	private static void metodo3() {
		@SuppressWarnings("unused")
		int a = 7 / 0;
	}
}