
package listadoestructuradedatos3.pila;
import listadoestructuradedatos3.cola.Persona;

/**
 * Crea una clase gen\u00e9rica Pila (debe de aceptar cualquier tipo de objeto
 * concreto, utiliza generics). Recuerda que has de evitar la interacci\u00f3n con el
 * usuario dentro de Pila. Implementa las operaciones b\u00e1sicas de una estructura
 * de datos pila. Una pila es una estructura LIFO donde el \u00faltimo elemento en
 * entrar es el primero en salir. Un ejemplo b\u00e1sico de pila es la forma de
 * almacenamiento de procesos en la memoria. Las operaciones a implementar son:
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
public class TestPila {
	public static void main(String[] args) {
		Pila<Persona> pila = new Pila<Persona>();
		System.out.println("\nPila creada.");
		pila.push(new Persona("30991068V", "Guillermo", "Boquizo S\u00e1nchez", 31));
		pila.push(new Persona("65986321Z", "Fulanito", "Campos Aguilar", 47));
		pila.push(new Persona("98635354P", "Zutanito", "Escobar Garc\u00e1a", 31));
		pila.push(new Persona("58424569Q", "Menganito", "Zut\u00e1\u00f1ez S\u00e1nchez", 27));
		
		System.out.println("\nMostrando pila: ");
		System.out.println(pila.toString());

		System.out.println("El \u00faltimo elemento de la pila es: ");
		try {
			System.out.println(pila.top());
		} catch (PilaEstaVaciaException e1) {
			System.err.println(e1.getMessage());
		}
		try {
			System.out.println("Eliminando...\n" + pila.pop());
		} catch (PilaEstaVaciaException e1) {
			System.err.println(e1.getMessage());
		}
		System.out.println("Mostrando pila tras borrado de un elemento: ");
		System.out.println(pila.toString());
		
		
		while (!pila.isEmpty()) {
			try {
				System.out.println("Eliminando elementos...\n " + pila.top());
			} catch (PilaEstaVaciaException e) {
				System.err.println(e.getMessage());
			}
			try {
				pila.pop();
			} catch (PilaEstaVaciaException e) {
				System.err.println(e.getMessage());
			}
		}
		
		System.out.println("\nMostrando pila tras borrado de todos los elementos: ");
		
		if(pila.isEmpty())
			System.out.println("\nPila vac\u00eda");
			System.out.println(pila.toString());
	}
}