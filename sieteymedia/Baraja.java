package sieteymedia;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	
	/**
	 * N\u00famero de cartas sacadas.
	 */
	private int numeroCartasSacadas;	

	/**
	 * Envoltorio del arrayList gen\u00e9rico de Carta cartas
	 */
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	/**
	 * Constructor de la baraja
	 */
	public Baraja() {
		for (Palo palo : Palo.values()) {
			for (Figura figura : Figura.values()) {
				cartas.add(new Carta(palo, figura));
			}
		}
		Collections.shuffle(cartas);
	}

	/**
	 * Saca una carta de la baraja y la elimina
	 * 
	 * @return Carta sacada
	 */
	public Carta sacar() {
		return cartas.remove(0);
	}

	/**
	 * Baraja las cartas
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	/**
	 * Permite obtener el n\u00famero de cartas sacadas.
	 * @return las cartas que se han sacado.
	 */
	int getNumeroCartasSacadas() {
		return numeroCartasSacadas;
	}
}