package listadoestructuradedatos1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * Continuando con la clase anterior “TestIterator”, analiza el siguiente c\u00f3digo
 * y contesta: 
 * <ul>
 * 		<li>a. Analiza el interfaz ListIterator e indica la descripci\u00f3n y
 * 			signatura de los siguientes m\u00e9todos: hasNext(), hasPrevious(), next() y
 * 			previous()</li>
 * 		<li>b. Analiza el interfaz ListIterator e indica la descripci\u00f3n y
 * 			signatura del m\u00e9todo set(). Identifica los requisitos para su uso.</li>
 * </ul>
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestListIterator {
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

		// Modificaci\u00f3n de los objetos
		ListIterator listIterator = arrayList.listIterator();    //4. Obtenci\u00f3n
																// del iterador
																// al principio
																// del arrayList
																// (listIterator(0))
		while (listIterator.hasNext()) {// 5.Bucle
										// con hasNext()
			
			Object element = listIterator.next();  // 6. Dentro del bucle,
												  // obtenci\u00f3n del elemento
												 // siguiente
			
			listIterator.set(element + "*"); // 7. Sustituye el \u00f3ltimo elemento
											// devuelto por next() o previous()
		}
											// 8. el listIterator est\u00e1 al final de la colecci\u00f3n.

											// Recorrido hacia adelante
		System.out.println("Lista modificada: \t\t");
		
		Iterator iterator = arrayList.iterator();   // 1. Obtenci\u00f3n del iterador
													// ( al principio de la
													// colecci\u00f3n) mediante el
													// m\u00e9todo iterator() de la
													// colecci\u00f3n
		while (iterator.hasNext()) {     			// 2.Bucle con hasNext()
			Object element = iterator.next();       // 3. Dentro del bucle, obtenci\u00f3n
												    // del elemento mediante next()
			System.out.print(element + "\t");
		}
		
		System.out.println();

	}
}