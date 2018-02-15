package listadoestructuradedatos3.pila;

import java.util.ArrayList;

/**
 * Crea una clase gen\u00e9rica Pila (debe de aceptar cualquier tipo de objeto
 * concreto, utiliza generics). Recuerda que has de evitar la interacci\u00f3n
 * con el usuario dentro de Pila. Implementa las operaciones b\u00e1sicas de una
 * estructura de datos pila. Una pila es una estructura LIFO donde el
 * \u00faltimo elemento en entrar es el primero en salir. Un ejemplo b\u00e1sico
 * de pila es la forma de almacenamiento de procesos en la memoria. Las
 * operaciones a implementar son:
 * <ul>
 * 		<li>a. Crear una pila.</li>
 * 		<li>b.Introducir elemento en la pila (apilar o push)</li>
 * 		<li>c. Sacar elemento de la pila (extraer o pop)</li>
 * 		<li>d. Cima de la pila (devuelve el elemento de la cima de la pila o top)</li>
 * </ul>
 * 
 * Implementa los m\u00e9todos necesarios, y recuerda hacer las pruebas precisas
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class Pila<T> {

	/**
	 * ArrayList
	 */
	private ArrayList<T> elementos;

	/**
	 * Constructor sin parametrizar.
	 */
	Pila() {
		this.elementos = new ArrayList<T>();
	}

	/**
	 * Constructor parametrizado.
	 */
	Pila(ArrayList<T> pila) {
		setPila(pila);
	}

	private void setPila(ArrayList<T> elementos) {
		if(elementos == null)
			elementos = new ArrayList<T>();
		this.elementos = elementos;

	}

	/**
	 * A\u00f1ade un elemento al final
	 * 
	 * @param elemento
	 *            que se a\u00f1adir\u00e1.
	 */
	void push(T elemento) {
		elementos.add(elemento);
	}

	/**
	 * Elimina el \u00faltimo elemento
	 * 
	 * @param string
	 * @return elemento que se borrar\u00e1
	 * @throws PilaEstaVaciaException 
	 */
	T pop() throws PilaEstaVaciaException {
		//if (pila.size() == 0)
			//return null;
		try {
			return elementos.remove(elementos.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new PilaEstaVaciaException("Error al eliminar el elemento:La pila está vacía");
		}
	}

	/**
	 * Devuelve el \u00faltimo elemento
	 * 
	 * @return elemento
	 * @throws PilaEstaVaciaException 
	 */
	T top() throws PilaEstaVaciaException {
		try {
			return elementos.get(elementos.size() - 1);
		} catch (Exception e) {
			throw new PilaEstaVaciaException("Error al devolver la cima de la pila. La pila está vacía");
		}
	}
	
	/**
	 * Elimina todos los elementos de la pila.
	 * @return 
	 */
	void removeAll() {
		elementos = new ArrayList<T>();
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String resultado = "";
		for (T elemento : elementos) {
			resultado += "\t" + elemento;
		}
		return resultado;	
	}

	boolean isEmpty() {
		return elementos.isEmpty();
	}
}