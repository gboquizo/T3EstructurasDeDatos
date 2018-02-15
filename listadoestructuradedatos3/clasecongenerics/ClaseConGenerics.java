package listadoestructuradedatos3.clasecongenerics;
import java.util.ArrayList;

/**
 * Reproduce  una  clase  con  Generics.  Ll\u00e1mala  ClaseConGenerics.
 * Entrega  su  esqueleto donde:
 * <ul>
 * 		<li>a. Definas  una variable  de objeto. Ha  de  ser  una  colecci\u00f3n.
 * 			   homog\u00e9nea  (del  tipo parametrizado de la clase).</li>
 * 		<li>b. Definas un constructor donde instancies el atributo anterior.</li>
 * 		<li>c. Definas un m\u00e9todo metodo1 cuyo par\u00e1metro sea del tipo parametrizado.</li>
 * 		<li>d. Definas un m\u00e9todo metodo2 cuyo valor devuelto se a del tipo parametrizado.</li>
 * </ul>
 * @author Guillermo Boquizo S\u00e1nchez.
 * @version 1.0
 * @param <T> Tipo gen\u00e9rico de la clase.
 */
public class ClaseConGenerics<T> {
	
	/**
	 * ArrayList de tipo T.
	 */
	private ArrayList<T> lista;
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param lista Arraylist que utiliza los m\u00e9todos de esta clase.
	 */
	public ClaseConGenerics(ArrayList<T> lista) {
		setArraylist(lista);
	}

	/**
	 * GET del ArrayList.
	 * 
	 * @return lista la lista que se quiere obtener.
	 */
	 ArrayList<T> getArraylist() {
		return lista;
	}

	/**
	 * SET del ArrayList.
	 * @param lista la lista a establecer.
	 *        
	 */
	private void setArraylist(ArrayList<T> lista) {
		this.lista = lista;
	}
	
	/**
	 * A\u00f1ade el elemento pasado al final.
	 * @param elemento elemento de tipo T.
	 */
	void metodo1(T elemento){
		lista.add(elemento);
	}
	
	/**
	 * Borra el elemento de la posici\u00f3n indicada.
	 * @param posicion posici\u00f3n que se borra.
	 * @return elemento que se borra.
	 */
	T metodo2(int posicion){
		return lista.remove(posicion);
	}
}