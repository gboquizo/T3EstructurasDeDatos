package sieteymedia;

import utiles.Teclado;

public class Partida {

	private static final double SIETEYMEDIA = 7.5;

	private Jugadores participantes;

	private Baraja baraja;

	public Partida(Jugadores participantes) {
		this.participantes = participantes;
		baraja = new Baraja();
		baraja.barajar();
	}

	public void jugar() {
		incPartidas();
		double puntuacion0 = 0;
		double puntuacion1 = 0;
		for (int i = 0; i < participantes.size(); i++) {
			mano(participantes.get(i));
		}
		System.out.println(comprobarResultado(puntuacion0, puntuacion1));
		limpiarPuntuacion();

	}

	private void limpiarPuntuacion() {
		for (int i = 0; i < participantes.size(); i++) {
			participantes.get(i).limpiarPuntos();
		}

	}

	private void mano(Jugador participante) {
		System.out.println("\nMano para el jugador " + participante.getAlias());
		Carta carta;
		double resultado = 0;
		do {
			if (baraja.getNumeroCartasSacadas() >= 40) {
				System.out.println("\nNo quedan m\u00e1s cartas");
				break;
			}
			carta = baraja.sacar();
			System.out.println("\nLa carta otorgada es el " + carta);
			resultado += carta.getValor();
			System.out.println("\nEn total lleva: " + resultado + " puntos.");
			if (resultado >= SIETEYMEDIA) {

				break;
			}
		} while (Teclado.deseaContinuar());

		participante.setPuntuacion(resultado);
	}

//	private String comprobarGanador() {
//		String mensaje = "";
//		for (int i = 0; i < participantes.size(); i++) {
//			for (int j = 0; j < participantes.size(); j++) {
//				if (participantes.get(i).getPuntuacion() > participantes.get(j).getPuntuacion()
//						&& participantes.get(i).getPuntuacion() <= SIETEYMEDIA && participantes.get(j).getPuntuacion() > SIETEYMEDIA) {
//					participantes.get(i).incrPartidasGanadas();
//					participantes.get(j).incrPartidasPerdidas();
//					mensaje = "\nEl ganador de la partida es: " + participantes.get(i).getAlias() + "\n "
//							+ participantes.get(j).getAlias() + " ha perdido la partida";
//
//				} else if (participantes.get(i).getPuntuacion() < participantes.get(j).getPuntuacion()
//						&& participantes.get(j).getPuntuacion() <= SIETEYMEDIA && participantes.get(i).getPuntuacion() > SIETEYMEDIA) {
//					participantes.get(j).incrPartidasGanadas();
//					participantes.get(i).incrPartidasPerdidas();
//					mensaje = "\nEl ganador de la partida es: " + participantes.get(j).getAlias() + "\n "
//							+ participantes.get(i).getAlias() + " ha perdido la partida";
//
//				}
//
//				else if (participantes.get(i).getPuntuacion() > SIETEYMEDIA && participantes.get(j).getPuntuacion() > SIETEYMEDIA) {
//					participantes.get(i).incrPartidasPerdidas();
//					participantes.get(j).incrPartidasPerdidas();
//					mensaje = "\n\u00a1Ambos jugadores pierden!";
//				} else
//					mensaje = "\n\u00a1Ambos jugadores empatan!";
//			}
//		}
//		return mensaje;
//	}
	
	public String comprobarResultado(double puntuacion1, double puntuacion2) {
		if (baraja.getNumeroCartasSacadas() >= 40)
			return "\nYa has sacado todas las cartas de la baraja.";
		if (puntuacion1 > 7.5 && puntuacion2 <= 7.5) {
			participantes.get(1).incrPartidasGanadas();
			return "\n" + participantes.get(1).getAlias() + " ha ganado la partida";
		} else if (puntuacion2 > 7.5 && puntuacion1 <= 7.5) {
			participantes.get(0).incrPartidasGanadas();
			return "\n" + participantes.get(0).getAlias() + " ha ganado la partida";
		} else if (puntuacion2 > 7.5 && puntuacion1 > 7.5) {
			return "\n\u00a1Ambos jugadores pierden!";
		} else if (puntuacion1 == puntuacion2) {
			return "\n\u00a1Los dos jugadores empatan!";
		} else {
			if (puntuacion1 > puntuacion2) {
				participantes.get(0).incrPartidasGanadas();
				return "\n" + participantes.get(0).getAlias() + " ha ganado la partida";
			} else {
				participantes.get(1).incrPartidasGanadas();
				return "\n" + participantes.get(1).getAlias() + " ha ganado la partida";
			}
		}
	}

	private void incPartidas() {
		participantes.get(0).incrPartidasJugadas();
		participantes.get(1).incrPartidasJugadas();
	}
}