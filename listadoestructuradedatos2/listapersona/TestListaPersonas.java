
package listadoestructuradedatos2.listapersona;

import java.util.ArrayList;

/**
 * * Entrega la clase TestListaPersonas que haga lo siguiente:
 * <ul>
 * 		<li>a. Cree una lista (ArrayList) de personas. ArrayList<Persona>
 * 		listaPersonas = new ArrayList<Persona>(); //Generics</li>
 * 		<li>b. A\u00f1ada tres personas a la lista (3 elementos).</li>
 * 		<li>c. Muestre la lista. (implementa toString() en Persona)</li>
 * 		<li>d. Elimine el \u00faltimo elemento.</li>
 * 		<li>e. Muestre la lista.</li>
 * 		<li>f. Elimine el primer elemento.</li>
 * 		<li>g. Muestre la lista</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class TestListaPersonas {
	public static void main(String[] args) {

		// a.) Cree una lista (ArrayList) de personas. ArrayList<Persona>
		       //listaPersonas = new ArrayList<Persona>(); //Generics
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); // Generics

		// b.) A\u00f1ada tres personas a la lista (3 elementos)
		
		listaPersonas.add(new Persona("Guillermo", "Boquizo", "S\u00e1nchez"));
		listaPersonas.add(new Persona("Germ\u00e1n", "Boquizo", "S\u00e1nchez"));
		listaPersonas.add(new Persona("Juan", "Boquizo", "Arenas"));
		
		// c.) Muestre la lista. (implementa toString() en Persona)
		
		System.out.println();
		System.out.println("Vamos a mostrar la lista de personas:\n ");
		System.out.println(listaPersonas);
		
		// d.) Elimine el \u00faltimo elemento
		listaPersonas.remove(listaPersonas.size() - 1);
		
		System.out.println();
		System.out.println("Eliminemos el \u00faltimo elemento y mostremos la lista de personas:\n ");
		
		// e.) Muestre la lista.
		System.out.println(listaPersonas);
		
		// f.) Elimine el primer elemento
		
		listaPersonas.remove(0);
		
		System.out.println();
		System.out.println("Ahora eliminemos el primer elemento y mostremos de nuevo la lista de personas:\n ");
		
		// g.) Muestre la lista.
		System.out.println(listaPersonas);
	}

}