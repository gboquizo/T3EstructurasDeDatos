package listadoestructuradedatos3.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Busca en la API de Java la collection Queue. Indica  su  nombre  completo, 
 * explica  su utilidad y entrega un c\u00f3digo donde demuestres su uso.
 * 
 * Respuesta:
 * <p>public interface Queue<E></p>
 * <p>Esta clase permite almacenar objetos de un tipo y luego recuperarlos 
 * en el orden en el cual se insertaron<p>
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class Queue {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println("Primer elemento: " + queue.peek());
		
		while(!queue.isEmpty()){
			System.out.println(queue.peek());
			System.out.println("Saco de la cola: " + queue.poll());
		}	
	}
}