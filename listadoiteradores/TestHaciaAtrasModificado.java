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
public class TestHaciaAtrasModificado {
	private static ArrayList<Double> doubles = new ArrayList<Double>();
	private static ListIterator<Double> it = doubles.listIterator();

	public static void main(String[] args) {
		apilarNodos();
		System.out.println("\nMostrando la lista de manera invertida:\n");
		mostrarDelReves();
		System.out.println("");
		modificar();
		mostrarDelReves();
	}

	private static void apilarNodos() {
		it = doubles.listIterator();
		do {
			it.add(recogerDato());
		} while (Teclado.deseaContinuar());
	}


	private static Double recogerDato() {
		return Teclado.leerDecimal("\nIntroduzca un double: ");
	}

	private static void modificar() {
		iteradorAlPrincipio();
		while (it.hasNext()) {
			it.next();
			System.out.println("\nModificando el ListIterator en la posición " + it.nextIndex());
			if (Teclado.deseaContinuar("¿Desea modificar? S/N"))
				it.set(recogerDato());
		}
	}
	
	private static void iteradorAlPrincipio() {
		it = doubles.listIterator();
	}

	private static void iteradorAlFinal() {
		it = doubles.listIterator(doubles.size());
	}

	private static void mostrarDelReves() {
		iteradorAlFinal();
		while (it.hasPrevious()) {
			System.out.print("\t" + it.previous());

		}
	}
}