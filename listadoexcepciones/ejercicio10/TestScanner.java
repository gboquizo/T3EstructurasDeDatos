package listadoexcepciones.ejercicio10;

import java.util.Scanner;

public class TestScanner {

	/**
	 * Probando la clase Scanner
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		System.out.println(scanner.nextInt());
	}
}