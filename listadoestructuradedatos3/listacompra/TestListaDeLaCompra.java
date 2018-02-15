package listadoestructuradedatos3.listacompra;

import utiles.Menu;
import utiles.Teclado;

public class TestListaDeLaCompra {
	private static ListaDeLaCompra listaArticulos = new ListaDeLaCompra();
	private static int codigo;
	private static Articulo articulo;
	private static Menu menu;

	public static void main(String[] args) {
		menu = new Menu("MENU LISTA COMPRA",
				new String[] { "A\u00f1adir art\u00edculo nuevo", "Eliminar art\u00edculo", "Incrementar existencias de un art\u00edculo",
						"Decrementar existencias de un art\u00edculo", "Modificar la cantidad m\u00ednima de un art\u00edculo",
						"Mostrar todos los art\u00edculos", "Mostrar la lista de la compra" });

		int opcion;
		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != menu.SALIR);

	}

	/**
	 * Gestiona las opciones del menu
	 * 
	 * @param opcion
	 *            escogida
	 */
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			annadirArticulo();
			break;
		case 2:
			eliminarArticulo();
			break;
		case 3:
			incrementarExistenciasArticulo();
			break;
		case 4:
			decrementarExistenciasArticulo();
			break;
		case 5:
			modificarCantidadMinimaArticulo();
			break;
		case 6:
			mostrarListaArticulos();
			break;
		case 7:
				System.out.println("\n\tLista de la compra:\n" + listaArticulos.mostrarListaCompra());
			break;
		}
		mostrarListaArticulos();
	}

	/**
	 * Modifica la cantidad minima de un articulo de la lista
	 */
	private static void modificarCantidadMinimaArticulo() {
		codigo = Teclado.leerEntero("\n\tC\u00f3digo del art\u00edculo a modificar: ");
		articulo = new Articulo(codigo);
		switch (listaArticulos.modificarMinimo(articulo, Teclado.leerEntero("\n\tNuevo m\u00ednimo: "))) {
		case -1:
			System.out.println("\n\tLa cantidad ha de ser positiva.\n");
			break;
		case 0:
			System.out.println("\n\tCambio realizado con exito.\n");
			break;
		case -2:
			System.out.println("\n\tEl producto con el c\u00f3digo " + codigo + " no existe.\n");
			break;
		case 2:
			System.out.println("\n\tCantidad introducida mayor que existencias");
			break;
		}
	}

	/**
	 * Decrementa las existencias de un articulo de la lista
	 */
	private static void decrementarExistenciasArticulo() {
		codigo = Teclado.leerEntero("\n\tC\u00f3digo del art\u00edculo a consumir: ");
		articulo = new Articulo(codigo);
		switch (listaArticulos.decrementarExistencias(articulo, Teclado.leerEntero("\n\tCantidad a consumir:"))) {
		case -1:
			System.out.println("\n\tLa cantidad ha de ser positiva\n");
			break;
		case 0:
			System.out.println("\n\tConsumo realizado con exito\n");
			break;
		case -2:
			System.out.println("\n\tEl producto con el c\u00f3digo " + codigo + " no existe");
			break;
		case 2:
			System.out.println("\n\tCantidad introducida mayor que existencias");
			break;
		}
	}

	/**
	 * Incrementa las existencias de un art\u00edculo.
	 */
	private static void incrementarExistenciasArticulo() {
		codigo = Teclado.leerEntero("\n\tC\u00f3digo del art\u00edculo a comprar:");
		articulo = new Articulo(codigo);
		switch (listaArticulos.incrementarExistencias(articulo, Teclado.leerEntero("\n\tCantidad comprada:"))) {
		case -1:
			System.out.println("\n\tLa cantidad ha de ser positiva.\n");
			break;
		case 0:
			System.out.println("\n\tCompra realizada con \u00e9xito\n");
			break;
		case -2:
			System.out.println("\n\tEl producto con el c\u00f3digo " + codigo + " no existe\n");
			break;
		}
	}

	/**
	 * Elimina un art\u00edculo de la lista de art\u00edculos.
	 */
	private static void eliminarArticulo() {
		codigo = Teclado.leerEntero("\n\tC\u00f3digo del art\u00edculo a eliminar: ");

		articulo = new Articulo(codigo);
		if (!listaArticulos.eliminarArticulo(articulo))
			System.out.println("\n\tNo se pudo eliminar");
	}

	/**
	 * A\u00f1ade un art\u00edculo a la lista de art\u00edculos.
	 */
	private static void annadirArticulo() {
		if (listaArticulos.annadir(Teclado.leerCadena("Nombre del articulo:"),
				Teclado.leerEntero("\n\tM\u00ednimo de existencias:"), Teclado.leerEntero("\n\tExistencias actuales:"))) {
			System.out.println("\n\tArticulo a\u00f1adido con \u00e9xito\n");
		} else
			System.out.println("\n\tError al a\u00f1adir el producto.\n");
	}

	/**
	 * Muestra la lista de art\u00edculos.
	 */
	private static void mostrarListaArticulos() {
		if (!ListaDeLaCompra.listaArticulos.isEmpty())
			System.out.println("\n\tLista de art\u00edculos:\n" + ListaDeLaCompra.listaArticulos);
		else
			System.out.println("\n\tLa lista est\u00e1 vac\u00eda.");
	}

}
