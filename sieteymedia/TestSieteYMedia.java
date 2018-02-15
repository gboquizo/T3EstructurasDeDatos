package sieteymedia;
import utiles.Teclado;
import utiles.Menu;

/**
 * <h1>Siete y media con ArrayList y Generics
 * <h1>
 * 
 * <p>
 * Entrega el ejercicio de las Siete y media usando ArrayList. Aseg\u00farate de
 * que implementas estos c\u00f3digos:
 * </p>
 * <ol>
 * 		<li>class Baraja.
 * 			<ol> 
 * 				<li>private ArrayList<Carta></li> 
 * 				<li>cartas; cartas.shuffle();//barajar()</li>
 * 				<li>cartas.get(0);//Carta sacar()</li>
 * 			</ol>
 * 		</li>	 
 * 		<li>class Jugador
 * 			<ol> 
 *				<li>numPartidasGanadas++;//en jugador.ganar()</li> 
 * 				<li>numPartidasJugadas++;//en jugador.jugar();</li>
 * 			</ol>
 * 		</li> 
 * 		<li>class Partida
 * 			<ol>
 * 				<li>Partida(ArrayList<Jugador> jugadores)</li> 
 * 				<li>partida.ganador().ganar();//cuando se acabe la \u00faltima ronda</li>
 * 			</ol> 
 * 		<li>class Ranking 
 * 			<ol>
 *				<li>private ArrayList<Jugador>jugadores;</li>
 *				<li>Collections.sort(jugadores)//para mostrar ranking
 *					<ol>
 *						<li>class Jugador implements Comparable{</li>
 *						<li>public int compareTo (Jugador jugador) {//se ordena
 * 							por n\u00famero de partidas ganadas return (getNumPartidasGanadas() -
 * 							jugador.getNumPartidasGanadas()); }</li>
 * 					</ol>
 * 				</li>
 * 			</ol>
 * 		</ol>			
 * </ol>
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestSieteYMedia {
	private static Jugadores listaJugadores = new Jugadores();
	private static Jugadores participantes = new Jugadores();
	private static Menu MenuGeneral;
	private static Menu menuJugadores;

	public static void main(String[] args) {
		MenuGeneral = new Menu("Siete y Media",
				new String[] { "Jugar", "Gestionar jugadores", "Mostrar jugadores", "Mostrar r\u00e1nking" });
		int opcion;
		do {
			opcion = MenuGeneral.gestionar();
			gestionarOpcion(opcion);
		} while (opcion != MenuGeneral.SALIR);
	}

	private static void gestionarOpcion(int opcion) {
		if (opcion != 2 && opcion != MenuGeneral.SALIR && listaJugadores.isEmpty()) {
			System.err.println("\n\u00a1No hay jugadores!\n");
			return;
		}
		switch (opcion) {
		case 1:
			jugar();
			break;
		case 2:
			gestionarJugadores();

			break;
		case 3:
			mostrarJugadores();
			break;
		case 4:
			mostrarRanking();
			break;
		default:
			break;
		}
	}

	private static void gestionarJugadores() {
		menuJugadores = new Menu("Men\u00fa de gesti\u00f3n de jugadores",
				new String[] { "Crear jugadores", "Borrar jugadores"});
		int opcion;

		do {
			opcion = menuJugadores.gestionar();
			gestionarOpcionJugadores(opcion);
		} while (opcion != menuJugadores.SALIR);
	}

	private static void gestionarOpcionJugadores(int opcion) {
		if (opcion != 1 && opcion != menuJugadores.SALIR && listaJugadores.isEmpty()) {
			System.err.println("\n\u00a1No hay jugadores que borrar!\n");
			return;
		}
		switch (opcion) {
		case 1:
			crearJugadores();
			break;
		case 2:
			borrarJugadores();
			break;
		default:
			break;
		}

	}
	
	private static void jugar() {
		Partida partida = null;
		if (listaJugadores.size() < 2) {
			System.err.println("No hay suficientes jugadores. Mínimo 2");
			return;
		}
		escogerJugadores();
		System.out.println("\nLos jugadores en esta partida son: ");
		mostrarJugadores();
		partida = new Partida(participantes);
		partida.jugar();
		participantes.clear();
	}

	private static void escogerJugadores() {
		do {

			System.out.println(listaJugadores.mostrar() + "\n" + "**-ESCOJA M\u00e1S DE UN JUGADOR-***");
			prepararJugador(Teclado.leerCadena("Nombre:"));

		} while (Teclado.deseaContinuar() || listaJugadores.size() < 2);
	}

	private static void prepararJugador(String nombre) {
		if (listaJugadores.contains(nombre) && !participantes.contains(nombre))
			participantes.listarJugadores(listaJugadores.get(listaJugadores.indexOf(nombre)));
		else if (!listaJugadores.contains(nombre))
			System.err.println("Jugador no existe en la lista.");
		else
			System.err.println("Jugador ya existe.");

	}

	private static void mostrarJugadores() {
		System.out.println(listaJugadores.mostrar());
	}

	private static void crearJugadores() {
		listaJugadores.insertar(Teclado.leerCadena("\nIntroduzca un nombre para el nuevo jugador: "));
		System.out.println("Jugador insertado correctamente");
	}

	private static void borrarJugadores() {
		System.out.println(listaJugadores.mostrar());
		listaJugadores.borrar(Teclado.leerCadena("\nIndique el nombre del jugador que desee borrar: "));
		System.out.println("Jugador borrado correctamente");
	}

	private static void mostrarRanking() {
		for (int i = 0; i < listaJugadores.size(); i++) {
			System.out.println("\n\t" + (i + 1) + ". " + listaJugadores.get(i).getAlias());
			i++;

		}
		listaJugadores.ordenarRanking();
	}
}