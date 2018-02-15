package listadoestructuradedatos3.pila;

/**
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestPila2 {
	public static void main(String[] args) {
		Pila<Short> pila = new Pila<Short>();
		apilar(pila);
		desapilar(pila);
		try {
			System.out.println(pila.top());
		} catch (PilaEstaVaciaException e) {
			System.err.println("En el main:\n" + e.getMessage());
		}

	}

	private static void desapilar(Pila<Short> pila) {
		try {
			System.out.println(pila.pop());
			System.out.println(pila.pop());
			System.out.println(pila.pop());
			System.out.println(pila.pop());
		} catch (PilaEstaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void apilar(Pila<Short> pila) {
		pila.push((short) 1);
		pila.push((short) 2);
		pila.push((short) 3);
	}
}