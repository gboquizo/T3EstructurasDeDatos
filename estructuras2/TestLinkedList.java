
package estructuras2;

import java.util.*;

/**
 * <h1>C\u00f3digos de la presentaci\u00f3n "Estructuras (II)"</h1>
 * 
 * C\u00f3digos de la presentaci\u00f3n "Estructuras (II)"
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestLinkedList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		LinkedList ciudades = new LinkedList();
		
		ciudades.add("Madrid");
		ciudades.add("Barcelona");
		ciudades.add("Malaga");
		ciudades.add("Vigo");
		ciudades.add(1,"Sevilla");
		ciudades.add("Madrid"); // Repetido.
		
		Iterator it = ciudades.iterator();
		
		while (it.hasNext())
			System.out.println("Ciudad: " + it.next());
	}
}