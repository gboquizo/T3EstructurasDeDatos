package listadoestructuradedatos3.listacompra;

import java.util.Iterator;

/**
 * Entrega la clase Lista que:
 * <ul>
 * 		<li>a. A\u00f1ada al final de la lista</li>
 * 		<li>b. Inserte un elemento en una determinada posici\u00f3n</li>
 * 		<li>c. Modifique un elemento reemplaz\u00e1ndolo por otro</li>
 * 		<li>d. Conozca el tama\u00f1o de la lista</li>
 * 		<li>e. Elimine elementos de la lista</li>
 * 		<li>f. Busque elementos en la lista</li>
 * 		<li>g. Copie la lista</li>
 * </ul>
 * Util\u00edzala en un ejemplo TestLista (por ejemplo, la alineaci\u00f3n de un equipo de
 * f\u00fatbol, con titulares y reservas) y entr\u00e9galo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deber\u00e1s implementar un men\u00fa con las opciones
 * posibles para que el usuario lo utilice f\u00e1cilmente
 *
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class ListaDeLaCompra {
	
	/**
	 * ArrayList de articulos
	 */
	static Lista<Articulo> listaArticulos = new Lista<Articulo>();
	
	
	/**
	 * String para la lista de la compra
	 */
	static String listaCompra = "";

	public static int CANTIDAD_ES_NEGATIVA = -1;
	public static int CANTIDAD_MAYOR_EXISTENCIAS = 2;
	public static int NO_EXISTE = -2;
	
	/**
	 * A\u00f1ade un articulo a la lista
	 * @param nombre 
	 * @param cantidadMin 
	 * @param existencias 
	 * @param articulo
	 * @return
	 */
	boolean annadir(String nombre, int cantidadMin, int existencias) {
		return listaArticulos.add(new Articulo(nombre, cantidadMin, existencias));
	}

	/**
	 * Elimina un articulo de la lista
	 * 
	 * @param articulo
	 * @return true o false
	 */
	boolean eliminarArticulo(Articulo articulo) {
		if (!listaArticulos.isEmpty() && listaArticulos.contains(articulo))
			return listaArticulos.borrar(articulo);
		return false;
	}
	
	/**
	 * Incrementa las existencias del art\u00edculo cuyo c\u00f3digo es introducido por teclado
	 * @param articulo
	 * @param cantidad
	 * @return un entero con el codigo de error 
	 */
	int incrementarExistencias(Articulo articulo, int cantidad) {
		if (!listaArticulos.isEmpty() && listaArticulos.contains(articulo)) {
			if (cantidad <= 0)
				return CANTIDAD_ES_NEGATIVA; // La cantidad es negativa
			else {
				listaArticulos.get(listaArticulos.indexOf(articulo)).comprar(cantidad);
				return 0; // Compra la cantidad
			}
		} else
			return NO_EXISTE; // No existe
	}

	/**
	 * Decrementa las existencias del art\u00edculo cuyo c\u00f3digo es introducido por teclado
	 * @param articulo
	 * @param cantidad
	 * @return un entero con el codigo de error
	 */
	int decrementarExistencias(Articulo articulo, int cantidad) {
		if (!listaArticulos.isEmpty() && listaArticulos.contains(articulo)) {
			if (cantidad <= 0)
				return CANTIDAD_ES_NEGATIVA; // La cantidad es negativa
			else if (cantidad > articulo.getExistencias())
				return CANTIDAD_MAYOR_EXISTENCIAS;
			else {
				listaArticulos.get(listaArticulos.indexOf(articulo)).consumir(cantidad);
				return 0; // Consumo de la cantidad
			}
		} else
			return NO_EXISTE; // No existe
	}

	/**
	 * Modifica la cantidad m\u00ednima del art\u00edculo cuyo c\u00f3digo es introducido por teclado
	 * @param articulo
	 * @param cantidad
	 * @return un entero con el codigo de error
	 */
	int modificarMinimo(Articulo articulo, int cantidad) {
		if (!listaArticulos.isEmpty() && listaArticulos.contains(articulo)) {
			if (cantidad <= 0)
				return CANTIDAD_ES_NEGATIVA; // La cantidad es negativa
			else {
				listaArticulos.get(listaArticulos.indexOf(articulo)).setCantidadMin(cantidad);
				return 0; // Consumo de la cantidad
			}
		} else
			return NO_EXISTE; // No existe
	}

	/**
	 * Comprueba las existencias de los art\u00edculos en relaci\u00f3n con la cantidad
	 * m\u00ednima y se a\u00f1aden los art\u00edculos a la lista de la compra
	 */
	String mostrarListaCompra() {
		Articulo articulo;
		listaCompra = "";
		Iterator<Articulo> iterator = listaArticulos.iterator();
		while (iterator.hasNext()) {
			articulo = iterator.next();
			if (articulo.getExistencias() <= articulo.getCantidadMin())
				listaCompra += articulo + ". Cantidad necesaria: " + (articulo.getCantidadMin() - articulo.getExistencias()) + "\n";
		}
		return listaCompra;
	}
}
