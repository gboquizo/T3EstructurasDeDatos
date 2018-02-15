
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
public class TestTreeMap {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		TreeMap codigos = new TreeMap();
		
		codigos.put("04","Baja prioridad");
		codigos.put("01","Urgente");
		codigos.put("03","Normal");
		codigos.put("02","Importante");

		
		
		System.out.println("Aleatorio 03:" + codigos.get("03"));
		System.out.println("Aleatorio 01:" + codigos.get("01"));
		
		Set s = codigos.keySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			
			String aux = (String) it.next();
			System.out.println(aux + ": " + codigos.get(aux));
		}
	}
}