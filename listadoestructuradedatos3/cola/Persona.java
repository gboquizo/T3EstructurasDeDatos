package listadoestructuradedatos3.cola;

/**
 * Clase que permite crear una persona.
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class Persona {
	
	/**
	 * DNI de la persona.
	 */
	private String dni;
	
	/**
	 * Nombre de la persona.
	 */
	private String nombre;
	
	/**
	 * Apellidos de la persona.
	 */
	private String apellidos;
	
	/**
	 * Edad de la persona.
	 */
	private int edad;
	
	/**
	 * Constructor de la clase persona.
	 * @param dni el DNI pasado.
	 * @param nombre el nombre pasado.
	 * @param apellidos los apellidos pasados.
	 * @param edad la edad pasada.
	 */
	public Persona(String dni,String nombre,String apellidos,int edad){
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
	}
	
	/**
	 * Constructor de la clase persona.
	 * @param dni el DNI pasado.
	 * @param nombre el nombre pasado.
	 * @param apellidos los apellidos pasados.
	 * @param edad la edad pasada.
	 */
	public Persona(String nombre){
		setNombre(nombre);
	}
	
	/**
	 * Permite obtener el DNI.
	 * @return dni el DNI obtenido.
	 */
	String getDni() {
		return dni;
	}
	
	/**
	 * Permite establecer el DNI.
	 * @param dni el DNI a establecer.
	 */
	private void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Permite obtener el nombre.
	 * @return nombre el nombre a obtener.
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * Permite establecer el nombre.
	 * @param nombre el nombre a establecer.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Permite obtener los apellidos.
	 * @return apellidos a obtener.
	 */
	String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Permite establecer los apellidos.
	 * @param apellidos apellidos a establecer.
	 */
	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Permite obtener la edad.
	 * @return edad la edad a obtener.
	 */
	int getEdad() {
		return edad;
	}
	
	/**
	 * Permite establecer la edad.
	 * @param edad edad a establecer.
	 */
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * Permite mostrar una persona con su nombre, apellidos, edad y DNI.
	 */
	@Override
	public String toString() {
		return "\n" + "\tDNI: " + dni  + "\n" + "\tNombre: " + nombre + "\n" + "\tApellidos: " + apellidos  + "\n"+ "\t"
				+ "Edad: " + edad + "\n";
	}
} 