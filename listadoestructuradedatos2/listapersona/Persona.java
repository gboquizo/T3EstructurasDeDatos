package listadoestructuradedatos2.listapersona;

/**
 * * Entrega la clase TestListaPersonas que haga lo siguiente:
 * <ul>
 * 		<li>a. Cree una lista (ArrayList) de personas. ArrayList<Persona>
 * 		listaPersonas = new ArrayList<Persona>(); //Generics</li>
 * 		<li>b. A\u00f1ada tres personas a la lista (3 elementos).</li>
 * 		<li>c. Muestre la lista. (implementa toString() en Persona)</li>
 * 		<li>d. Elimine el \u00faltimo elemento.</li>
 * 		<li>e. Muestre la lista.</li>
 * 		<li>f. Elimine el primer elemento.</li>
 * 		<li>g. Muestre la lista</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	
		
	/**
	 * Constructor de la clase Persona.
	 * @param nombre nombre de la persona.
	 * @param apellido1 primer apellido de la persona.
	 * @param apellido2 segundo apellido de la persona.
	 */
	public Persona(String nombre, String apellido1, String apellido2) {
		setNombre(nombre);
		setApellido1(apellido1);
	    setApellido2(apellido2);
	}

	/**
	 * Obtiene el nombre de la persona.
	 * @return nombre el nombre obtenido.
	 */
	 String getNombre() {
		return nombre;
	}
	 
	/**
	 * Obtiene el primer apellido de la persona.
	 * @return apellido1 el primer apellido obtenido.
	 */
	 String getApellido1() {
		return apellido1;
	}
	 
	 /**
	  * Obtiene el segundo apellido de la persona.
	  * @return apellido2 el segundo apellido obtenido.
	  */
	 String getApellido2() {
		return apellido2;
	}
	
	/**
	 * Establece el nombre de la persona. 
	 * @param nombre el nombre establecido.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Establece el primer apellido de la persona.
	 * @param apellido1 el primer apellido establecido.
	 */
	private void setApellido1(String apellidos1) {
		this.apellido1 = apellidos1;
	}
	
	/**
	 * Establece el segundo apellido de la persona.
	 * @param apellido2 el segundo apellido establecido.
	 */
	private void setApellido2(String apellidos2) {
		this.apellido2 = apellidos2;
	}
	
	/**
	 * Permite mostrar una persona con su nombre, primer y segundo apellido.
	 */
	@Override
	public String toString() {
		return "Nombre : "  + nombre + "," + " Apellido1 : " + apellido1 + "," + " Apellido2 : " + apellido2 + ".\n";
	}	
}