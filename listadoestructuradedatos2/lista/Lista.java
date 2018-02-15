package listadoestructuradedatos2.lista;

import java.util.*;

/**
 * Entrega la clase Lista que:
 * <ul>
 * 		<li>a. Añada al final de la lista</li>
 * 		<li>b. Inserte un elemento en una determinada posición</li>
 * 		<li>c. Modifique un elemento reemplazándolo por otro</li>
 * 		<li>d. Conozca el tamaño de la lista</li>
 * 		<li>e. Elimine elementos de la lista</li>
 * 		<li>f. Busque elementos en la lista</li>
 * 		<li>g. Copie la lista</li>
 * </ul>
 * Utilízala en un ejemplo TestLista (por ejemplo, la alineación de un equipo de
 * fútbol, con titulares y reservas) y entrégalo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deberás implementar un menú con las opciones
 * posibles para que el usuario lo utilice fácilmente
 *
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class Lista<E> {

	private ArrayList<E> lista = new ArrayList<E>();

	/**
	 * Constructor de la clase lista.
	 * 
	 * @param arrayList
	 *            Arraylist que utiliza los métodos de esta clase.
	 */
	Lista(ArrayList<E> arrayList) {
		if (arrayList == null)
			arrayList = new ArrayList<E>();
		setArraylist(arrayList);
	}

	/**
	 * SET del ArrayList
	 * 
	 * @param lista la lista a establecer.
	 * 
	 */
	private void setArraylist(ArrayList<E> arraylist) {
		this.lista = arraylist;
	}

	/**
	 * Añade un nuevo elemento al final de la lista.
	 * 
	 * @param elemento elemento a añadir al final de la lista.
	 * @return true si puede añadir el elemento
	 * @throws ElementoYaExisteException 
	 */
	void add(E elemento) throws ElementoYaExisteException {
		try {
			lista.add(elemento);
		} catch (Exception e) {
			throw new ElementoYaExisteException("El elemento ya existe en la lista.");
		}
	}

	/**
	 * Añade un nuevo elemento por índice. Devuelve false si el índice es menor a 0
	 * o sobrepasa el tamaño del arrayList.
	 * 
	 * @param indice el índice por donde introducir.
	 * @param elemento el elemento a introducir.
	 * @throws IndiceFueraDeRangoException.
	 */
	void add(int indice, E elemento) throws IndiceFueraDeRangoException {
		try {
			lista.add(indice - 1, elemento);
		} catch (IndexOutOfBoundsException e) {
			throw new IndiceFueraDeRangoException("\nError al introducir el elemento. Índice fuera de rango\n");
		}
	}

	/**
	 * Permite reemplazar un elemento por otro indicado en el índice Si el índice es
	 * -1, devuelve null, en todo otro caso devuelve el arrayList modificado.
	 * 
	 * @param indice el indice donde se realizará la modificación.
	 * @param elemento el elemento a modificar.
	 * @throws IndiceFueraDeRangoException.
	 */
	void reemplazar(int indice, E elemento) throws IndiceFueraDeRangoException {
		try {
			lista.set(indice - 1, elemento);
		} catch (Exception e) {
			throw new IndiceFueraDeRangoException("\nError al reemplazar el elemento. Índice fuera de rango");
		}
	}

	/**
	 * Permite obtener la longitud de la lista.
	 * 
	 * @return la longitud de la lista.
	 */
	int size() {
		return lista.size();
	}

	/**
	 * Permite eliminar un elemento de la lista.
	 * 
	 * @param int indice el indice del elemento eliminado de la lista.
	 * @throws PosicionNoValidaException.
	 */
	void borrar(int indice) throws PosicionNoValidaException {
		lista.remove(indice - 1);
	}

	/**
	 * Buscar y comprueba si existe el elemento.
	 * 
	 * @param elemento elemento que deseamos buscar para comprobar si existe en la lista.
	 *Si el elemento está en la lista, devuelve true. 
	 *En otro caso devuelve false.
	 * @return si existe o no el elemento.
	 */
	boolean buscaElemento(E elemento) {
		return lista.contains(elemento);

	}
	/**
	 * Comprueba si la lista está o no vacía
	 * @return true o false en función del estado de la lista.
	 */
	boolean isEmpty() {
		return lista.isEmpty();
	}

	/**
	 * Recoge una posición válida.
	 * 
	 * @param indice índice de la posición.
	 * @return indice el índice si es válido.
	 * @throws PosicionNoValidaException.
	 */
	int posicionValida(int indice) throws PosicionNoValidaException {
		if (indice - 1 > lista.size() || indice - 1 < 0)
			throw new PosicionNoValidaException("\nPosicion invalida");
		return indice;
	}

	/**
	 * Permite obtener una copia de la lista.
	 * 
	 * @return Una copia de la lista.
	 */
	Object copiaLista() {
		return lista.clone();
	}

	/**
	 * Permite mostrar la lista.
	 * 
	 * @return la lista devuelta mediante toString().
	 */
	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		cadena.append("\t***Lista Gen\u00e9rica***\n");
		cadena.append("\n");
		for (E elemento : lista) {
			cadena.append(elemento + "\n");
		}
		return cadena.toString();
	}
}