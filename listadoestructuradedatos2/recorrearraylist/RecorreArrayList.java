package listadoestructuradedatos2.recorrearraylist;

import java.util.*;

/**
 * A continuaci\u00f3n se muestra parte de una clase denominada RecorreArrayList:
 * <ul>
 * 		<li>a. Compila y entrega el c\u00f3digo donde se invoquen cada uno de los
 * m\u00e9todos anteriores. Utiliza una lista de String.</li> 
 * 		<li>b. Implementa c\u00f3mo recorrer una lista al rev\u00e9s en la misma clase</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class RecorreArrayList {
	private ArrayList<String> arraylist;

	RecorreArrayList(ArrayList<String> arraylist) {
		if (arraylist == null)
			arraylist = new ArrayList<String>();
		setArrayList(arraylist);
	}

	private void setArrayList(ArrayList<String> arraylist) {
		this.arraylist = (arraylist);
	}

	void show() {
		System.out.println(arraylist);
	}

	/**
	 * Muestra el ArrayList mediante un iterador con el bucle while.
	 */
	void showWithIterator() {
		Iterator<String> it = arraylist.iterator();

		while (it.hasNext())
			System.out.println("\t" + it.next());

	}

	/**
	 * Muestra el ArrayList mediante un iterador con el bucle for.
	 */
	void showWithIterator2() {
		for (Iterator<String> it = arraylist.iterator(); it.hasNext();)
			System.out.println("\t" + it.next());
	}

	/**
	 * Muestra el ArrayList mediante un for cl\u00e1sico, accediendo mediante la
	 * posici\u00f3n (\u00edndices)
	 */
	void showWithGet() {
		for (int i = 0; i < arraylist.size(); i++)
			System.out.println("\t" + arraylist.get(i));
	}

	/**
	 * Muestra el ArrayList mediante un for mejorado
	 */
	void showWithForEach() {
		for (String elemento : arraylist) {
			System.out.println("\t" + elemento);
		}
	}
}