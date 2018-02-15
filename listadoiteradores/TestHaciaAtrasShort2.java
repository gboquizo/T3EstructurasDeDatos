package listadoiteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import utiles.Teclado;

/**
 * 
 * <h1>Listado Iteradores</h1> 
 * <p>Procurando utilizar el autoboxing,
 * entrega las siguientes clases que utilizan iteradores en las Collections:</p>
 * <ol>
 * 		<li>Crea una clase TestHaciaAtr\u00e1s que cree un ArrayList de cadenas que cumpla los
 * 			siguientes requisitos:
 * 			<ol> 
 * 				<li>El usuario indica el n\u00famero de nodos a medida que los va introduciendo</li> 
 * 				<li>Recorre la colecci\u00f3n hacia atr\u00e1s.</li>
 * 			</ol>
 * 		</li> 
 * 		<li>Crea una clase TestHaciaAtr\u00e1sShort que cree un ArrayList de shorts que cumpla los 
 * 			siguientes requisitos:
 * 			<ol> 
 * 				<li>El usuario indica el n\u00famero de nodos a medida que los va introduciendo</li> 
 * 				<li>Recorre la colecci\u00f3n hacia atr\u00e1s.</li>
 * 			</ol>
 * 		</li> 
 *		<li>Crea una clase TestHaciaAtr\u00e1sShort2 que cree un ArrayList de shorts que cumpla
 * 			los siguientes requisitos: 
 * 			<ol>
 * 				<li>El usuario indica el n\u00famero de nodos a medida que los va introduciendo</li> 
 * 				<li>Adem\u00e1s del short, el usuario indica la posici\u00f3n a ocupar por el nodo.</li> 
 * 				<li>Recorre la colecci\u00f3n hacia atr\u00e1s cada vez que el usuario introduce un nodo
 * 					nuevo.</li>
 * 			</ol>
 * 		</li>
 *		<li>Crea una clase TestHaciaAtr\u00e1sModificado que cree un ArrayList de Double que
 *			cumpla los siguientes requisitos: 
 *			<ol>
 *				<li>Los elementos de la estructura se introducir\u00e1n siempre en la primera posici\u00f3n.</li>
 *				<li>Muestra la colecci\u00f3n de atr\u00e1s hacia adelante</li>
 *				<li>Modifica un elemento determinado (indicado por el usuario)</li> 
 *				<li>Vuelve a mostrar la estructura desde atr\u00e1s hacia adelante(con el mismo 
 *					iterador)</li>
 *			</ol>
 *		</li>
 *</ol>
 * 
 * Utiliza los m\u00e9todos:
 * <ul>
 * 		<li>recogerIndice()</li>
 * 		<li>recogerDato()</li>
 * 		<li>comprobarIndice()</li>
 * 		<li>continuar()</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestHaciaAtrasShort2 {
	private static ArrayList<Short> shorts2 = new ArrayList<Short>();
	private static ListIterator<Short> it = shorts2.listIterator();

	public static void main(String[] args) {
		introducirNodos();
		System.out.println("\nMostrando la lista de manera invertida:\n");
		mostrarDelReves();
		annadirEnPosicion();
		mostrarDelReves();
	}

	private static void introducirNodos() {
		iteradorAlPincipio();
		do {
			it.add(recogerDato());
		} while (Teclado.deseaContinuar());
	}

	private static Short recogerDato() {
		return (short) Teclado.leerEntero("\nIntroduzca un short: ");
	}

	private static void annadirEnPosicion() {
		iteradorAlPincipio();
		int indice = recogerIndice();
		for (int i = 0; i <= indice; i++) {
			if (it.hasNext())
				it.next();
		}
		it.add(recogerDato());
	}

	private static void iteradorAlPincipio() {
		it = shorts2.listIterator();
	}

	private static int recogerIndice() {
		int indice;
		int max = shorts2.size();
		do {
			indice = Teclado.leerEntero("\nIntroduce un índice válido entre 0 y " + max);
		} while (!isIndiceValido(indice, max));
		return indice;
	}
	
	/**
	 * Comprueba que el índice sea válido.
	 * @param indice índice válido a introducir.
	 * @return true o false según el índice.
	 */
	private static boolean isIndiceValido(int indice, int max) {
		return ((indice >= 0) && (indice <= max));
	}

	private static void iteradorAlFinal() {
		it = shorts2.listIterator(shorts2.size());
	}

	private static void mostrarDelReves() {
		iteradorAlFinal();
		while (it.hasPrevious()) {
			System.out.print("\t" + it.previous());
		}
	}
}