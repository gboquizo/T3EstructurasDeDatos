package bucleforeach;
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
public class SumaVector {
	
	/**
	 * M\u00e9todo que calcula la suma de los elementos del array. Utiliza para ello
	 * <b>for clasico</b> con \u00edndices.
	 * 
	 * @param a, array de enteros.
	 * @return la suma de los elementos del array.
	 */
	int sum1(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			//for cl\u00e1sico
			result += a[i];
		}
		return result;
	}
		
	/**
	 * M\u00e9todo que calcula la suma de los elementos del array Utiliza para ello
	 * el <b>for mejorado</b>
	 * 
	 * @param a, array de enteros.
	 * @return la suma de los elementos del array.
	 */
	int sum2(int[] a) {
		int result = 0;
		for (int i: a) {
			//para cada entero i del array a
			result += i;
		}
		return result;
	}
}