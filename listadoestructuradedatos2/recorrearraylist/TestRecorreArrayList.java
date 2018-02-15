
package listadoestructuradedatos2.recorrearraylist;

import java.util.*;

/**
 * A continuaci�n se muestra parte de una clase denominada RecorreArrayList:
 * <ul>
 * <li>a. Compila y entrega el c�digo donde se invoquen cada uno de los
 * m�todos</li> anteriores. Utiliza una lista de String.
 * <li>b. Implementa c�mo recorrer una lista al rev�s en la misma clase</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S�nchez
 * @version 1.0
 */
public class TestRecorreArrayList {

	public static void main(String[] args) {
		ArrayList<String> jedis = new ArrayList<String>();
		jedis.add("Ki-Adi-Mundi");
		jedis.add("Qui-Gon Jinn");
		jedis.add("Obi Wan Kenobi");
		jedis.add("Mace Windu");
		jedis.add("Yoda");
		jedis.add("Plo Koon");
		jedis.add("Kit Fisto");
		jedis.add("Anakin Skywalker");
		jedis.add("Qui-Gon Jinn");
		jedis.add("Quinlan Vos");
		

		RecorreArrayList jedi = new RecorreArrayList(jedis);
		System.out.println("\nMostrando la lista con show:\n");
		jedi.show();
		System.out.println("\nMostrando la lista con un iterador con bucle while:\n");
		jedi.showWithIterator();
		System.out.println("\nMostrando la lista con un iterador con bucle for:\n");
		jedi.showWithIterator2();
		System.out.println("\nMostrando la lista con un for cl\u00e1sico, por \u00edndice:\n");
		jedi.showWithGet();
		System.out.println("\nMostrando la lista con un for mejorado:\n");
		jedi.showWithForEach();
		System.out.println("\nMostrando la lista de manera invertida:\n");
		inversoArrayList(jedis);
	}
	
	/**
	 * Permite mostrar una lista de manera invertida al recorrerla al rev\u00e9s mediante ListIterator.
	 * @param jedis el ArrayList a recorrer.
	 */
	private static void inversoArrayList(ArrayList<String> jedis) {
		ListIterator<String> it = jedis.listIterator(jedis.size());
		while (it.hasPrevious())
			System.out.println("\t" + it.previous());
	}
}