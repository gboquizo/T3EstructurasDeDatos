package bucleforeach;

import utiles.Matematicas;

/**
 * 
 * El bucle for mejorado (for-each) es un mecanismo que facilita el recorrido de
 * una estructura de datos, por ejemplo, un array. De esta forma se evita el uso
 * del índice y los problemas que estos provocan.
 *
 * Analiza el siguiente código donde se usan ambos bucles (el "for clásico" en
 * sum1 y el "for mejorado" en sum2) para la suma de los elementos de un array.
 * forEach
 *
 * Entrega el código anterior integrado dentro de un programa. Realiza y entrega
 * otra práctica donde se utilice el bucle for mejorado con matrices. Comenta y
 * documenta el código generado.
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class Matriz {

	/**
	*Matriz que se va a generar
	*/
	private int[][] matriz;
	
	/**
	*Constructor que crea la matriz con todos sus valores a 0.
	*@param filas N\u00famero de filas.
	*@param columnas N\u00famero de columnas.
	*/
	public Matriz(int filas, int columnas) {
		matriz = new int[comprobarDimension(filas)][comprobarDimension(columnas)];
	}
	
	/**
	*Constructor que crea una matriz de valores aleatorios.
	*@param filas N\u00famero de filas.
	*@param columnas N\u00famero de columnas.
	*@param min M\u00ednimo aleatorio.
	*@param max M\u00e1ximo aleatorio.
	*/
	public Matriz(int filas, int columnas, int max, int min) {
		matriz = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Matematicas.getAleatorio(min, max);
			}	
		}	
	}
	
	/**
	*Obtiene las columnas de la matriz.
	*@return N\u00famero de columnas de la matriz.
	*/
	private int columnas() {
		return matriz[0].length;
	}

	/**
	*Obtiene las filas de la matriz.
	*@return N\u00famero de filas de la matriz.
	*/
	private int filas() {
		 return  matriz.length; 
	}

	/**
	*Suma dos matrices.
	*@param sumando la segunda matriz que se suma.
	*@return La matriz resultante de la suma
	*/
	Matriz sumar(Matriz sumando) {
		if (!dimensionesIguales(sumando)) {
			System.out.println("\nNo puedo sumar las matrices porque sus dimensiones no son iguales");
			return null;
		}
		int filas = filas();
		int columnas = columnas();
		Matriz suma = new Matriz(filas, columnas);
		for (int i = 0; i < filas; i++)
			for (int j = 0; j < columnas; j++)
				suma.matriz[i][j] = matriz[i][j] + sumando.matriz[i][j];
		return suma;
	}
	
	/**
	*Resta dos matrices.
	*@param sustraendo Matriz sustraendo.
	*@return La matriz resultante.
	*/
	Matriz restar(Matriz sustraendo) {
		if (!dimensionesIguales(sustraendo)) {
			System.out.println("\nNo puedo restar las matrices porque sus dimensiones no son iguales");
			return null;
		}
		int filas = filas();
		int columnas = columnas();
		Matriz resta = new Matriz(filas, columnas);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resta.matriz[i][j] = matriz[i][j] - sustraendo.matriz[i][j];
			}
		}
		return resta;
	}

	/**
	*Multiplica dos matrices.
	*@param multiplicando2 la segunda matriz que act\u00faa como multiplicando.
	*@return La matriz resultante de la multiplicaci\u00f3n.
	*/
	Matriz multiplicar(Matriz multiplicando2) {
		Matriz resultado = new Matriz(matriz.length, multiplicando2.matriz[0].length);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < multiplicando2.matriz[0].length; j++) {
				for (int k = 0; k < matriz[0].length; k++) {
					resultado.matriz[i][j] += matriz[i][k] * multiplicando2.matriz[k][j];
				}
			}
		}
		return resultado;
	}
	
	/**
	*Traspone la matriz.
	*@return Devuelve la matriz traspuesta.
	*/
	Matriz trasponer() {
		int filas = filas();
		int columnas = columnas();
		Matriz resultado = new Matriz(filas, columnas);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resultado.matriz[i][j] = matriz[j][i];
			}
		}
		return resultado;
	}
	
	/**
	*Comprueba las dimensiones de dos matrices.
	*@param matriz1 matriz a comparar
	*@return True si son iguales y false si no lo son.
	*/
	private boolean dimensionesIguales(Matriz matriz1) {
		if (matriz[0].length == matriz1.matriz.length && matriz[0].length == matriz1.matriz[0].length)
		return true;
		return false;
	}
	
	/**
	*Comprueba que la dimensi\u00f3n a introducir no sea negativa ni mayor que 0. Si lo es, la devuelve. 
	*@param dimension La dimensi\u00f3n pasada como par\u00e1metro.
	*@return dimension La dimensi\u00f3n correcta.
	*/
	private int comprobarDimension(int dimension) {
		if(!esValida(dimension)) {
			System.out.println("\nError en las dimensiones.Deben ser positivas");
			return 1;
		}
		return dimension;
	}
	
	/**
	*Comprueba que la dimensi\u00f3n a introducir no sea negativa ni mayor que 0. Si lo es, la devuelve. 
	*@param dimension La dimensi\u00f3n pasada como par\u00e1metro.
	*@return dimension La dimensi\u00f3n correcta.
	*/
	private boolean esValida(int dimension) {
		if(dimension <= 0)
		return false;
		return true;	
	}
	
	/**
	*Muestra una matriz recorriendo filas y elementos dentro de las mismas.
	*@return matrizMostrada la matriz que se va a mostrar.
	*/		
	@Override
	public String toString() {
		String matrizMostrada = "";
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				matrizMostrada += "\t" + "[ " + elemento + " ]";
			}
			matrizMostrada += "\n";
		}
		return matrizMostrada;
	}
}