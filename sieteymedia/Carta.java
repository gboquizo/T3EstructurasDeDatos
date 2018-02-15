package sieteymedia;

import sieteymedia.Figura;
import sieteymedia.Palo;

/**
 * La carta que constar\u00e1 de un palo y una figura.
 * 
 * @author Guillermo Boquizo S\u00e1nchez.
 * @version 1.0
 */
public class Carta {

	/**
	 * Enumeraci\u00f3n que constar\u00e1 de las figuras.
	 */
	private Figura figura;

	/**
	 * Enumeraci\u00f3n que constar\u00e1 de los palos.
	 */
	private Palo palo;

	/**
	 * Constructor que asignar\u00e1 a cada uno de los palos y figuras su valor
	 * correspondiente dependiendo de la carta generada.
	 * 
	 * @param palo palo generado al sacar carta.
	 * @param figura figura generada al sacar carta.
	 */
	Carta(Palo palo, Figura figura) {
		setPalo(palo);
		setFigura(figura);
	}

	/**
	 * Permite obtener la figura.
	 * @return figura la figura obtenida.
	 */
	Figura getFigura() {
		return figura;
	}

	/**
	 * Permite establecer la figura.
	 * @param figura figura establecida.
	 */
	private void setFigura(Figura figura) {
		this.figura = figura;
	}

	/**
	 * Permite obtener el palo.
	 * @return palo el palo obtenido.
	 */
	Palo getPalo() {
		return palo;
	}

	/**
	 * Permite establecer el palo.
	 * @param palo el palo establecido.
	 */
	private void setPalo(Palo palo) {
		this.palo = palo;
	}

	/**
	 * Permite obtener el valor de la carta.
	 * @return el valor de la carta.
	 */
	double getValor() {
		return getFigura().getValor();
	}

	/**
	*Permite mostrar la carta con su figura y su palo. 
	*/
	@Override
	public String toString() {
		return "[" + figura + " de " + palo + "]";
	}
}