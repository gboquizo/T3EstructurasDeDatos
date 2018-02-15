package bucleforeach;

import bucleforeach.Matriz;
import utiles.Menu;
import utiles.Teclado;

/**
 * 
 * El bucle for mejorado (for-each) es un mecanismo que facilita el recorrido de
 * una estructura de datos, por ejemplo, un array. De esta forma se evita el uso
 * del \u00edndice y los problemas que estos provocan.
 *
 * Analiza el siguiente c\u00f3digo donde se usan ambos bucles (el "for cl\u00e1sico" en
 * sum1 y el "for mejorado" en sum2) para la suma de los elementos de un array.
 * 
 *
 * <ul>
 * 		<li>Entrega el c\u00f3digo anterior integrado dentro de un programa.</li>
 * 		<li>Realiza y entrega otra pr\u00e1ctica donde se utilice el bucle for mejorado con matrices. 
 * 			Comenta y documenta el c\u00f3digo generado.</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestMatriz {

	private static Menu menu;
	private static Menu menuCrear;
	private static Matriz matriz1;
	private static Matriz matriz2;
	private static Matriz resultado;
	public static void main(String[] args) {
		do {
			menu = new Menu("Men\u00fa de matrices", new String[] { "Crear primera matriz", "Crear segunda matriz",
				"Mostrar matrices", "Sumar matrices", "Restar matrices", "Multiplicar", "Trasponer matrices" });

			menuCrear = new Menu("Men\u00fa de creaci\u00f3n de matrices",
				new String[] { "Creaci\u00f3n con valores a 0", "Creaci\u00f3n aleatoria" });
			int opcion;
			do {

				opcion = menu.gestionar();
				realizarOpcion(opcion);
			} while (opcion != menu.SALIR);
			System.out.println("\u00a1Hasta pronto!");
		} while (Teclado.deseaContinuar());
	}

	/**
	*Gestiona las opciones del men\u00fa.
	*@param opcion la opci\u00f3n escogida.
	*
	*/
	private static void realizarOpcion(int opcion) {
		switch (opcion) {
			case 1:
				matriz1 = crearMatriz();
			break;
			case 2:
				matriz2 = crearMatriz();
			break;
			case 3:
				mostrarMatrices();
				
			break;
			case 4:
				sumarMatrices();
			break;
			case 5:
				restarMatrices();
			break;
			case 6:
				multiplicarMatrices();
			break;
			case 7:
				trasponerMatrices();
			break;
		}
	}

	/**
	*Muestra las matrices creadas, si existen. En caso contrario, advierte de que no lo est\u00e1n
	*/
	private static void mostrarMatrices() {
		if (matriz1 == null) {
			System.out.println("\nLa matriz 1 no est\u00e1 creada");
		} else {
			System.out.println("\n\tMatriz 1:");
			System.out.println(matriz1.toString());
		}
		if (matriz2 == null) {
			System.out.println("\nLa matriz 2 no est\u00e1 creada");
		} else {
			System.out.println("\n\tMatriz 2:");
			System.out.println(matriz2.toString());
		}
	}

	/**
	*Suma dos matrices
	*/
	private static void sumarMatrices() {
		if (matriz1 == null || matriz2 == null) {
			System.out.println("\n\u00a1Hay que crear la matriz antes!");
			return;
		} else {
			System.out.println("\nSumando 1:\n");
			System.out.println(matriz1.toString() + "\n");
			System.out.println("\nSumando 2:\n");
			System.out.println(matriz2.toString() + "\n");
			resultado = matriz1.sumar(matriz2);
			System.out.println("\nResultado:\n");
			System.out.println(resultado.toString() + "\n");
		}
	}
	
	/**
	*Resta dos matrices
	*/
	private static void restarMatrices() {
		if (matriz1 == null || matriz2 == null) {
			System.out.println("\n\u00a1Hay que crear la matriz antes!");
			return;
		}
		System.out.println("\nMinuendo:\n" + matriz1.toString());
		System.out.println("\nSustraendo:\n" + matriz2.toString());
		resultado = matriz1.restar(matriz2);
		System.out.println("\nDiferencia:\n" + resultado.toString());
	}

	/**
	*Multiplica dos matrices
	*/
	private static void multiplicarMatrices() {
		if (matriz1 == null || matriz2 == null) {
			System.out.println("\n\u00a1Hay que crear la matriz antes!");
			return;
		}
		System.out.println("\nFactor 1:\n");
		System.out.println(matriz1.toString() + "\n");
		System.out.println("\nFactor 2:\n");
		System.out.println(matriz2.toString() + "\n");
		resultado = matriz1.multiplicar(matriz2);
		System.out.println("\nResultado:\n");
		System.out.println(resultado.toString() + "\n");
	}

	/**
	*Traspone una matriz
	*/
	private static void trasponerMatrices() {
		if (matriz1 == null) {
			System.out.println("\n\u00a1Hay que crear la matriz antes!");
			return;
		}
		resultado = matriz1.trasponer();
		System.out.println(resultado.toString());
	}

	/**
	*Crea la matriz con valores a cero o aleatorios.
	*@return Una matriz con valores aleatorios o a cero.
	*/
	private static Matriz crearMatriz() {
		switch (menuCrear.gestionar()) {
			case 1:
			return new Matriz(Teclado.leerEntero("\nN\u00famero de filas:"),
				Teclado.leerEntero("\nN\u00famero de columnas:"));
			case 2:
			int filas = Teclado.leerEntero("\nN\u00famero de filas:");
			int columnas = Teclado.leerEntero("\nN\u00famero de columnas:");
			int min = Teclado.leerEntero("\nM\u00ednimo:");
			int max = Teclado.leerEntero("M\u00e1ximo:");
			if (max <= min)
				System.out.println("\nError, el m\u00ednimo no puede ser menor que el m\u00e1ximo, volviendo al men\u00fa");
			else
				return new Matriz(filas, columnas, max, min);
		}
		return null;
	}
}