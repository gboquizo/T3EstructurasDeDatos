package utiles;
public class Matematicas {
	/**
	*Genera un n\u00famero aleatorio entre un m\u00e1ximo y un m\u00ednimo
	*@param max: El m\u00e1ximo pasado por par\u00e1metro
	*@param min: El m\u00e1ximo pasado por par\u00e1metro
	*/
	public static int getAleatorio(int max, int min) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
}