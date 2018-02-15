package sieteymedia;

public class Jugador implements Comparable<Jugador> {

	/**
	 * Alias o nombre del jugador
	 */
	private String alias;

	/**
	 * Partidas jugadas por el jugador
	 */

	private int partidasJugadas;

	/**
	 * Partidas ganadas por el jugador
	 */

	private int partidasGanadas;

	/**
	 * Partidas empatadas por el jugador
	 */

	private int partidasPerdidas;

	/**
	 * Puntuaci\u00f3n del jugador
	 */

	private double puntuacion;

	/**
	 * Constructor que asignar\u00e1 tanto el alias como el n\u00famero de jugadas, ganadas,
	 *  y perdidas, puestas inicialmente a 0.
	 * 
	 * @param alias nombre del jugador
	 */
	public Jugador(String alias) {
		setAlias(alias);
		setPartidasJugadas(0);
		setPartidasGanadas(0);
		setPartidasPerdidas(0);
		setPuntuacion(0);
	}

	/**
	 * Incrementa las partidas jugadas
	 */
	void incrPartidasJugadas() {
		setPartidasJugadas((getPartidasJugadas() + 1));
	}

	/**
	 * Incrementa las partidas ganadas
	 */
	void incrPartidasGanadas() {
		setPartidasGanadas((getPartidasGanadas() + 1));
	}

	/**
	 * Incrementa las partidas perdidas
	 */
	void incrPartidasPerdidas() {
		setPartidasPerdidas((getPartidasPerdidas() + 1)) ;
	}

	/**
	 * Incrementa las partidas perdidas
	 */
	void incrPuntuacion(double puntuacion) {
		setPuntuacion(getPuntuacion() + puntuacion);
	}

	/**
	 * @return partidas jugadas
	 */
	int getPartidasJugadas() {
		return partidasJugadas;
	}

	/**
	 * @param partidas jugadas a establecer
	 */
	private void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	/**
	 * @return partidas ganadas
	 */
	int getPartidasGanadas() {
		return partidasGanadas;
	}

	/**
	 * @param partidas ganadas a establecer
	 */
	private void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	private void setPartidasPerdidas(int partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;

	}

	int getPartidasPerdidas() {
		return partidasPerdidas;
	}

	/**
	 * @return nombre del jugador
	 */
	String getAlias() {
		return alias;
	}

	/**
	 * @param nombre del jugador que se desea
	 */
	private void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Obtiene la puntuacion
	 * 
	 * @return puntuacion
	 */
	double getPuntuacion() {
		return puntuacion;
	}

	/**
	 * Establece la puntuaci\u00f3n del jugador
	 * 
	 * @param puntuacion
	 */
	void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public void limpiarPuntos() {
		setPuntuacion(0);

	}

	/**
	 * @retun toString del jugador
	 */
	public String toString() {
		return "Jugador [Nombre del jugador: " + alias + ", partidas jugadas: " + partidasJugadas
				+ ", partidas ganadas: " + partidasGanadas + ", partidas perdidas: " + partidasPerdidas + "]";
	}

	/**
	 * Compara los jugadores para poder ordenarlos
	 */
	@Override
	public int compareTo(Jugador jugador) {
		return getPartidasGanadas() - jugador.getPartidasGanadas();
	}

	/**
	 * Comprueba que el jugador es el mismo, por nombre
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Jugador other = (Jugador) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equalsIgnoreCase(other.alias))
			return false;
		return true;
	}
}