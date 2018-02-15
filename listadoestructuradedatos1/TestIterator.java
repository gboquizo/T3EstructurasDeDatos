/**
 * 
 */
package listadoestructuradedatos1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * <p>Un iterador es un objeto que se implementa en la interfaz Iterator o
 * ListIterator.</p>
 * <p>Se utiliza para el recorrido, obtenci\u00f3n o modificaci\u00f3n de los
 * elementos de una colecci\u00f3n.</p>
 * Bas\u00e1ndote en el siguiente c\u00f3digo y analizando el
 * interfaz Iterator indica la descripci\u00f3n y signatura de los siguientes
 * m\u00e9todos: 
 * <ul>
 * 		<li>hasNext() y</li> 
 * 		<li>next()</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestIterator {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Creaci\u00f3n de un ArrayList
		ArrayList arrayList = new ArrayList();
		
		// Se a\u00f1aden elementos
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("I");
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("L");

		// Recorrido hacia adelante
		System.out.println("Contenido original: \t\t");
		Iterator iterator = arrayList.iterator();   // 1. Obtenci\u00f3n del iterador
													// (al principio de la
													// colecci\u00f3n) mediante el
													// m\u00e9todo iterator() de la
													// colecci\u00f3n
		
		while (iterator.hasNext()) {				 // 2.Bucle con hasNext()
			Object element = iterator.next();		// 3. Dentro del bucle, obtenci\u00f3n
													// del elemento mediante next()
			System.out.print(element + "\t");
		}
		System.out.println();
	}
}