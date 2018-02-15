package listadoestructuradedatos3.listacompra;
/**
 * ListaDeLaCompra. 
 * 
 * Implementa un programa que gestione una lista de la compra de forma autom\u00e1tica. 
 * 
 * Se dispondr\u00e1 de una lista de art\u00edculos y de sus existencias. 
 * 
 * En el momento en el que la cantidad de art\u00edculos llegue a un l\u00edmite m\u00ednimo, dicho art\u00edculo  aparecer\u00e1 en la lista de la compra. 
 * 
 * Cada vez que el usuario utilice uno de los art\u00edculos se decrementar\u00e1n las existencias de dicho art\u00edculo. 
 * 
 * De igual forma, cada vez que el usuario compre el art\u00edculo, se incrementar\u00e1n las existencias de dicho art\u00edculo.
 * 
 * A modo de ejemplo, supongamos que del art\u00edculo "latas de cerveza" se establece a un m\u00ednimo de 10 cervezas. 
 * 
 * Actualmente hay 14 y se consumen de golpe 5 cervezas.
 * <ul>
 * 		<li>a. Art\u00edculo: [nombre = latas de cerveza, cantidad m\u00ednima= 10, existencias = 14]</li>
 * 		<li>b. articulo.consumir(5)</li>
 * 		<li>c. Art\u00edculo: [nombre = latas de cerveza, cantidad m\u00ednima= 10, existencias = 9]</li>
 *		<li>d. Como (articulo.getExistencias() <= articulo.getCantidadMin()) hay que comprar latas de cerveza </li>
 * </ul>
 * 
 * Quiz\u00e1s sea interesante a\u00f1adir un campo c\u00f3digo del art\u00edculo para facilitar la gesti\u00f3n de la lista. 
 * Este c\u00f3digo ha de ser \u00fanico (static...)
 * Para ello, genera un interfaz con el usuario que permita entre otras acciones:
 * <ul>
 * 		<li>e. A\u00f1adir un producto nuevo a la lista.</li>
 * 		<li>f. Eliminar un elemento de la lista.</li>
 * 		<li>g. Incrementar las existencias de un art\u00edculo.</li>
 * 		<li>h. Decrementar las existencias de un art\u00edculo.</li>
 * 		<li>i. Modificar la cantidad m\u00ednima del art\u00edculo.</li>
 * 		<li>j. Mostrar la lista de todos los art\u00edculos.</li>
 * 		<li>k. Mostrar la lista de la compra.</li>
 * </ul>
 * 
 * Comienza analizando el dise\u00f1o. Piensa en el total de clases que vas a utilizar y
 * aprovecha aquellas clases que puedas.
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class Articulo {

	/**
	 * Codigo unico univoco
	 */
	private static int generarCodigo = 1;
	
	/**
	 * Codigo del articulo
	 */
	private int codigo;
	
	/**
	 * Nombre del art\u00edculo
	 */
	private String nombre;

	/**
	 * Cantidad m\u00ednima del art\u00edculo
	 */
	private int cantidadMin;

	/**
	 * Existencias del art\u00edculo
	 */
	private int existencias;

	/**
	 * Constructor del articulo
	 * 
	 * @param nombre
	 * @param cantidadMin
	 * @param existencias
	 */
	public Articulo(String nombre, int cantidadMin, int existencias) {
		setNombre(nombre);
		setCantidadMin(cantidadMin);
		setExistencias(existencias);
		setCodigo();
	}
	
	/**
	 * Constructor solo con codigo
	 * @param codigo
	 */
	public Articulo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * Obtiene el codigo
	 * @return
	 */
	private int getCodigo() {
		return codigo;
	}
	
	/**
	 * Modifica el codigo identificador
	 * @param nombre
	 */
	private void setCodigo() {
		this.codigo = generarCodigo++;
	}

	/**
	 * Obtiene el nombre del articulo
	 * @return
	 */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre del articulo
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene la cantidad minima
	 * @return
	 */
	 int getCantidadMin() {
		return cantidadMin;
	}
	
	/**
	 * Modifica la cantidad minima
	 * @param cantidadMin
	 */
	boolean setCantidadMin(int cantidadMin) {
		if (cantidadMin < 0)
			return false;
		this.cantidadMin = cantidadMin;
		return true;
	}
	
	/**
	 * Obtiene el numero de existencias
	 * @return
	 */
	 int getExistencias() {
		return existencias;
	}

	/**
	 * Modifica el valor de existencias
	 * @param existencias
	 */
	private boolean setExistencias(int existencias) {
		if (existencias <= 0)
			return false;
		this.existencias = existencias;
		return true;
	}

	/**
	 * Aumenta el numero de existencias
	 * @param cantidad a comprar
	 */
	boolean comprar(int cantidad) {
		 if (cantidad <= 0)
			return false;
		setExistencias(getExistencias() + cantidad);
		return true;
	}
	
	 /**
	  * Aumenta el numero de existencias
	  * @param cantidad a comprar
	  */
	 boolean consumir(int cantidad) {
		 if (cantidad <= 0)
			return false;
		setExistencias(getExistencias() - cantidad);
		return true;
	 }
	 
	 /*
	  * (non-Javadoc)
	  * @see java.lang.Object#toString()
	  */
	 @Override
	 public String toString() {
		return "\tC\u00f3digo: " + getCodigo() + "\tnombre: " + getNombre() + "\tcantidad m\u00ednima: "
					+ getCantidadMin() + "\texistencias: " + getExistencias();
	 }

	 /*
	  * (non-Javadoc)
	  * @see java.lang.Object#hashCode()
	  */
	 @Override
	 public int hashCode() {
		 final int prime = 31;
		 int result = 1;
		 result = prime * result + codigo;
		 return result;
	 }

	 /*
	  * (non-Javadoc)
	  * @see java.lang.Object#equals(java.lang.Object)
	  */
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;
		 if (getClass() != obj.getClass())
			 return false;
		 Articulo other = (Articulo) obj;
		 if (codigo != other.codigo)
			 return false;
		 return true;
	 }
}