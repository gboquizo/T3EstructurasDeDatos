package sieteymedia;

/**
 * Enumeraci\u00f3n de figura.
 * 
 * @author Guillermo Boquizo S\u00e1nchez.
 * @version 1.0.
 */
enum Figura {
	AS(1.0),
	DOS(2.0),
	TRES(3.0),
	CUATRO(4.0),
	CINCO(5.0),
	SEIS(6.0),
	SIETE(7.0),
	SOTA(0.5),
	CABALLO(0.5),
	REY(0.5);

	/**
	 * Campo con el valor de la figura.
	 * 
	 */
	private double valor;

	/**
	 * Constructor privado de la clase.
	 * @param valor valor de la figura.
	 */
	private Figura(double valor) {
		setValor(valor);
	}

	/**
	 * Permite obtener el valor de la figura.
	 * @return valor el valor obtenido de la figura.
	 */
	double getValor() {
		return valor;
	}

	/**
	 * Permite establecer el valor de la figura.
	 * @param valor valor de la figura a establecer.
	 */
	private void setValor(double valor) {
		this.valor = valor;
	}
}
