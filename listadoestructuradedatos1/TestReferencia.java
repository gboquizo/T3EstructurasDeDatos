package listadoestructuradedatos1;

import java.text.MessageFormat;

public class TestReferencia {
	static char[] vector1; //Referencia (puntero a memoria din\u00e1mica).
	static char[] vector2; // Referencia (puntero a memoria din\u00e1mica).

	/**
	 * 
	 * Gesti\u00f3n de referencia y reserva de memoria din\u00e1mica.
	 * 
	 * @param args array de cadenas que no se usa.
	 */
	public static void main(String[] args) {
		if (vector1 == null)
			System.out.println(MessageFormat.format("vector vale null: {0}. Todav\u00eda no apunta a la memoria din\u00e1mica", vector1));

		vector1 = new char[5];  // Reserva de memoria y asignaci\u00f3n.
		vector2 = vector1;     // ASIGNACI\u00f3N: ambas apuntan al mismo trozo de
							   // memoria.

		if (vector1 == vector2)// COMPARACI\u00f3N.
			System.out.println("Ambas apuntan al mismo trozo de memoria. ");

		vector2 = new char[5]; // reserva de memoria y asignaci\u00f3n.
		if (vector1 != vector2)
			System.out.println("NO apuntan al mismo trozo de memoria. ");

		for (char caracter : vector1) {
			System.out.print(caracter + "-");
		}
		System.out.println();
		for (char caracter : vector2) {
			System.out.print(caracter + "-");

		}
	}
}