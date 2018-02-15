package utiles;
/**
*Crea la clase Menu.<p> 
*M\u00e9telo en el paquete utiles.<p>
*Implementa al menos los siguientes metodos y atributos:
*<ul>
*	<li>titulo</li>
*	<li>opciones</li>
*	<li>numOpciones</li>
*	<li>gestionar()</li>
*	<li>recogerOpcion()</li>
*</ul>
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestMenu {
	public static void main(String[] args) {
		Menu menu = new Menu("Mi primer men\u00fa",
				new String[] { "Primera opci\u00f3n", "Segunda opci\u00f3n", "Tercera opci\u00f3n", "Cuarta opci\u00f3n" });
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != menu.SALIR);
	}

	/**
	*Gestiona las opciones del men\u00fa a partir de la opci\u00f3n introducida por el usuario.
	*
	*/
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("\nMuestro la opci\u00f3n "+ opcion);
			break;
		case 2:
			System.out.println("\nMuestro la opci\u00f3n "+ opcion);
			break;
		case 3:
			System.out.println("\nMuestro la opci\u00f3n "+ opcion);
			break;
		case 4:
			System.out.println("\nMuestro la opci\u00f3n "+ opcion);
			break;		
		}		
	}
}
