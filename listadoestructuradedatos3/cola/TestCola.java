package listadoestructuradedatos3.cola;

/**
 * Crea una clase gen\u00e9rica Cola (debe de aceptar cualquier tipo de objeto
 * concreto, utiliza generics). Recuerda que has de evitar la interacci\u00f3n
 * con el usuario dentro de Cola. Utilizando generics, implementa las
 * operaciones b\u00e1sicas de una estructura de datos cola. Recuerda que una
 * cola es una estructura FIFO donde el primer elemento en entrar es el primero
 * en salir. Un ejemplo b\u00e1sico de cola es la de la taquilla de un cine. Las
 * operaciones a implementar son:
 * <ul>
 * 		<li>a. Crear una cola.</li>
 * 		<li>b. Introducir elemento en la cola (a\u00f1adir/enqueue)</li>
 * 		<li>c. Sacar elemento de la cola (extraer/dequeue)</li>
 * 		<li>d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front)</li>
 * </ul>
 * Implementa los m\u00e9todos necesarios, y recuerda hacer las pruebas precisas
 * Para ello, crea una clase TestCola donde se a\u00f1adan muchos elementos de
 * una clase creada en el mismo fichero (Persona, Paciente, Cartas...) y se
 * invoquen a todos los m\u00e9todos. Al final, vac\u00eda la cola con un bucle
 * while que extraiga de la cola hasta que se vac\u00ede.
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestCola {
	public static void main(String[] args) {
		
		/**
		 * Se genera una nueva cola de tipo Cola.
		 */
		Cola<Persona> cola = new Cola<Persona>();
		System.out.println("\nCola creada.");
		
		/**
		 * Se a\u00f1aden elementos a la cola.
		 */
		cola.anadir(new Persona("30991068V", "Guillermo", "Boquizo S\u00e1nchez", 31));
		cola.anadir(new Persona("65986321Z", "Fulanito", "Campos Aguilar", 47));
		cola.anadir(new Persona("98635354P", "Zutanito", "Escobar Garc\u00e1a", 31));
		cola.anadir(new Persona("58424569Q", "Menganito", "Zut\u00e1\u00f1ez S\u00e1nchez", 27));
		
		/*
		 * Se muestra el primer elemento de la cola.
		 */
		System.out.println("\nEl primer elemento de la cola es: " + "\n" + cola.cabeza());
		
		/**
		 * Se muestra la cola.
		 */
		System.out.println(cola.toString());
		
		/**
		 * Se extrae un elemento de cola.
		 */
		cola.extraer();
		
		
		System.out.println(cola.toString());
		
		/**
		 * Limpia la cola.
		 */
		limpiar(cola);
	}
	
	

	/**
	 * Se borran todos los elementos de la cola.
	 * @param cola cola cuyos elementos se borran.
	 */
	private static void limpiar(Cola<Persona> cola) {
		while (!cola.getCola().isEmpty()) {
			System.out.println("\n\tEliminando: " + cola.cabeza());
			cola.extraer();
		}
		System.out.println("\nMostrando cola tras borrado de todos los elementos: ");
		
		if(cola.getCola().isEmpty())
			System.out.println("\nCola vac\u00eda");
		System.out.println(cola.toString());
	}
}