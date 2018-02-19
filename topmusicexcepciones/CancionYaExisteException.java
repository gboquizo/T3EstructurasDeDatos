package topmusicexcepciones;

public class CancionYaExisteException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public CancionYaExisteException(String mensaje) {
		super(mensaje);
	}

}
