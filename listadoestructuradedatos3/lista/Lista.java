
package listadoestructuradedatos3.lista;

import java.util.*;

/**
 * Entrega la clase Lista que:
 * <ul>
 * 		<li>a. A\u00f1ada al final de la lista</li>
 * 		<li>b. Inserte un elemento en una determinada posici\u00f3n</li>
 * 		<li>c. Modifique un elemento reemplaz\u00e1ndolo por otro</li>
 * 		<li>d. Conozca el tama\u00f1o de la lista</li>
 * 		<li>e. Elimine elementos de la lista</li>
 * 		<li>f. Busque elementos en la lista</li>
 * 		<li>g. Copie la lista</li>
 * </ul>
 * Util\u00edzala en un ejemplo TestLista (por ejemplo, la alineaci\u00f3n de un equipo de
 * f\u00fatbol, con titulares y reservas) y entr\u00e9galo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deber\u00e1s implementar un men\u00fa con las opciones
 * posibles para que el usuario lo utilice f\u00e1cilmente
 *
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 * @param <E>
 */
public class Lista<E> {
	
	/**
	 * Campo de lista
	 */
	private ArrayList<E> lista;

	/**
	 * Constructor de la clase lista.
	 * 
	 * @param arrayList Arraylist que utiliza los m\u00e9todos de esta clase.
	 */
	Lista() {
		if (lista == null)
			lista = new ArrayList<E>();
		setArraylist(lista);
	}

	public Lista(ArrayList<E> lista) {
		setLista(lista);
	}

	private void setLista(ArrayList<E> lista) {
		this.lista = lista;
		
	}

	/**
	 * GET del ArrayList
	 * 
	 * @return lista la lista que se quiere obtener.
	 */
	 ArrayList<E> getArraylist() {
		return lista;
	}

	/**
	 * SET del ArrayList
	 * @param lista la lista a establecer.
	 *        
	 */
	private void setArraylist(ArrayList<E> arraylist) {
		this.lista = arraylist;
	}

	/**
	 * A\u00f1ade un nuevo elemento al final de la lista.
	 * 
	 * @param elemento elemento a a\u00f1adir al final de la lista.
	 * @return 
	 */
	boolean add(E elemento) {
		if(elemento == null)
			return false;
		if(getArraylist().contains(elemento))
			return false;
		getArraylist().add(elemento);
		return true;
	}

	/**
	 * Establece mediante \u00edndices el fuera de rango de la lista.
	 * @param indice el \u00edndice a controlar. 
	 * @return el \u00edndice pasado de rango.
	 */
	private boolean fueraDeRango(int indice) {
		return indice < 0 || indice > getArraylist().size();
	}
	
	/**
	 * A\u00f1ade un nuevo elemento por \u00edndice. Devuelve false si el \u00edndice es menor a 0
	 * o sobrepasa el tama\u00f1o del arrayList. 
	 * @param elemento el elemento a introducir
	 * @param indice el \u00edndice por donde introducir
	 */
	boolean add(E elemento, int indice) {
		if(elemento == null)
			return false;
		if (fueraDeRango(indice))
			return false;
		getArraylist().add(indice, elemento);
		return true;
	}

	/**
	 * Permite reemplazar un elemento por otro indicado en el \u00edndice indicado
	 * Si el \u00edndice es -1, devuelve null, en todo otro caso devuelve el arrayList modificado.
	 * @param elementoNuevo el elemento nuevo a introducir.
	 * @param elemento el elemento a modificar
	 */
	E reemplazar(E elementoNuevo, E elemento) {
		int indice = getArraylist().indexOf(elementoNuevo);
		if (indice == -1)
			return null;
		return getArraylist().set(indice, elemento);
	}

	/**
	 * Permite obtener la longitud de la lista.
	 * 
	 * @return la longitud de la lista.
	 */
	int size() {
		return getArraylist().size();
	}

	/**
	 * Permite eliminar un elemento de la lista en una determinada posici\u00f3n.
	 * @param indice el elemento eliminado de la lista.
	 * @return el elemento borrado por indice.
	 */
	E borrar(int indice) {
		if (fueraDeRango(indice))
			return null;
		return getArraylist().remove(indice);
	}
	
	/**
	 * Borra un elemento de la lista.
	 * @param elemento elemento a borrar.
	 * @return el elemento borrado de la lista.
	 */
	boolean borrar(E elemento) {
		return getArraylist().remove(elemento);
	}
	
	/**
	 * Buscar y comprueba si existe el elemento.
	 * 
	 * @param elemento elemento que deseamos buscar para comprobar si existe en la lista.
	 * si el elemento est\u00e1 en la lista, devuelve true. En otro caso devuelve false
	 * @return si existe o no el elemento.
	 */
	boolean buscaElemento(E elemento) {
		if (getArraylist().contains(elemento))
			return true;
		return false;
	}
	
	/**
	 * Obtiene un elemento dada una posicion valida
	 * @param indice
	 * @return
	 */
	public E get(int indice) {
		if (fueraDeRango(indice))
			return null;
		return getArraylist().get(indice);
	}

	/**
	 * Comprueba si contiene el elemento
	 * @param elemento
	 * @return true o false
	 */
	public boolean contains(E elemento) {
		return getArraylist().contains(elemento);
	}

	/**
	 * Controla si la lista esta vacia
	 * @return true o false
	 */
	public boolean isEmpty() {
		return getArraylist().isEmpty();
	}

	/**
	 * Itera sobre la lista
	 * @return Un interador
	 */
	public Iterator<E> iterator() {
		return getArraylist().iterator();
	}

	/**
	 * Obtiene el indice de un elemento
	 * @param elemento
	 * @return
	 */
	public int indexOf(E elemento) {
		return getArraylist().indexOf(elemento);
	}

	/**
	 * Permite obtener una copia de la lista.
	 * 
	 * @return Una copia de la lista.
	 */
	Object copiar() {
		return getArraylist().clone();
	}

	/**
	 * Permite mostrar la lista.
	 * 
	 * @return la lista devuelta mediante toString().
	 */
	@Override
	public String toString() {
		String cadena = "";
		for (Iterator<E> iterator = lista.iterator(); iterator.hasNext();) {
			E elemento = (E) iterator.next();
			cadena += elemento + "\n";
		}
		return cadena;
	}
}