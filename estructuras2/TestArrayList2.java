
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
public class TestArrayList2 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList ciudades = new ArrayList();
		
		ciudades.add("Madrid");
		ciudades.add("Barcelona");
		ciudades.add("Malaga");
		ciudades.add("Vigo");
		ciudades.add(1,"Sevilla");
		ciudades.add("Madrid"); // Repetido.
		
		@SuppressWarnings("unused")
		Iterator it = ciudades.iterator();
		
		for(int i = ciudades.size()-1; i >= 0; i--)
		System.out.println("Ciudad: " + i + " es: " + ciudades.get(i));
	}
}