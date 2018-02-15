package listadoestructuradedatos3.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Busca en la API de Java la collection Stack. Indica  su  nombre  completo, 
 * explica  su utilidad y entrega un c\u00f3digo donde demuestres su uso.
 * 
 * Respuesta: 
 * <p>java.util.Stack<E></p>
 * <p>Se trata de una clase que hereda de Vector y sigue un orden de tipo lifo, por lo que resulta
 * de utilidad si deseamos hacer uso de una pila en la cual no queramos implementar nuevos m\u00e9todos</p>.
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class Stack {

	public static void main(String[] args) {
		// creamos el stack
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		//insertamos elementos en el stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Cima de la pila: " + stack.peek());
		
		while(!stack.isEmpty()){
			System.out.println(stack.peek());
			// elimina el \u00faltimo elemento
			System.out.println("Desapilo de la pila: " + stack.pop());
		}	
	}
}