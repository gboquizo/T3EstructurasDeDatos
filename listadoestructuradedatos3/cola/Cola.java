package listadoestructuradedatos3.cola;

import java.util.ArrayList;

/**
 * Crea una clase gen\u00e9rica Cola (debe de aceptar cualquier tipo de objeto concreto,
 * utiliza generics). Recuerda que has de evitar la interacci\u00f3n con el usuario dentro de 
 * Cola. Utilizando generics, implementa las operaciones b\u00e1sicas de una estructura de 
 * datos cola. Recuerda que una cola es una estructura FIFO donde el primer elemento en
 * entrar es el primero en salir. Un ejemplo b\u00e1sico de cola es la de la taquilla de un cine.
 * Las operaciones a implementar son:
 * <ul>
 * 		<li>a. Crear una cola.</li>
 * 		<li>b. Introducir elemento en la cola (a\u00f1adir/enqueue)</li> 
 * 		<li>c. Sacar elemento de la cola (extraer/dequeue)</li>
 * 		<li>d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front)</li>
 * </ul>
 * Implementa los m\u00e9todos necesarios, y recuerda hacer las pruebas precisas
 * Para  ello,  crea  una  clase  TestCola  donde  se  a\u00f1adan  muchos  elementos  de  una  clase 
 * creada  en  el  mismo  fichero  (Persona,  Paciente,  Cartas...)  y  se  invoquen  a  todos  los 
 * m\u00e9todos. Al final, vac\u00eda la cola con un bucle while que extraiga de la cola hasta que se 
 * vac\u00ede.
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 * @param <T> el tipo de valor pasado a la cola.
 */
public class Cola<T> {
	
	/**
	 * ArrayList de la cola.
	 */
	private ArrayList<T> cola;
	
	/**
	 * Constructor sin par\u00e1metro.
	 */
	public Cola() {
		this.cola = new ArrayList<T>();
	}
	
	/**
	 * Constructor parametrizado.
	 */
	public Cola(ArrayList<T> cola) {
		setCola(cola);
	}
	
	/**
	 * A\u00f1ade un elemento al final de la cola.
	 * 
	 * @param elemento elemento que se va a a\u00f1adir.
	 */
	void anadir(T elemento) {
		cola.add(elemento);
	}

	/**
	 * Extrae el primer elemento de la cola.
	 * 
	 * @return elemento que se extrae.
	 * 
	 */
	T extraer() {
		if(getCola().isEmpty())
			return null;
		return cola.remove(0);
	}

	/**
	 * Devuelve el primer elemento de la cola.
	 * 
	 * @return elemento elemento en primer lugar en la cola.
	 * 
	 */
	T cabeza() {
		return cola.get(0);
	}

	/**
	 * Permite obtener una cola de tipo T.
	 * @return la cola a obtener.
	 */
	ArrayList<T> getCola() {
		return cola;
	}

	/**
	 * Establece un ArrayList cola de tipo T.
	 * @param cola la cola a establecer.
	 */
	private void setCola(ArrayList<T> cola) {
		this.cola = cola;
	}
	
	/**
	 * Comprueba si la cola se encuentra vac\u00eda o no.
	 * @return true o false en funci\u00f3n de si se encuenta vac\u00eda o no.
	 */
	boolean isEmpty() {
		return cola.isEmpty();
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for (T elemento : cola) {
			resultado += "\t" + elemento;
		}
		return resultado;	
	} 
}