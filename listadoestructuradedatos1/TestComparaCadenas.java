package listadoestructuradedatos1;
/**
 * 
 * Entrega el siguiente c\u00f3digo comentado con los resultados a la derecha de cada
 * System.out.println() y contesta:
 * <ul>
 * 		<li>a. \u00bfC\u00f3mo se comparan dos cadenas?</li>
 * 		<li>b. \u00bfPara qu\u00e9 se utiliza el operador de comparaci\u00f3n == entre objetos?</li>
 * 		<li>c. Una cadena puede crearse mediante new o directamente con su literal.
 * 				\u00bfSe crean de igual manera? \u00bfSe aprovecha la memoria de alguna manera?</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestComparaCadenas {
	public static void main(String[] args) {

		String string1 = new String("Hola");
		String string2 = new String("Hola");
		System.out.println("string1 == string2: " + (string1 == string2)); //false
		System.out.println("string1.equals(string2: " + string1.equals(string2)); //true

		String string3 = "Hola";
		String string4 = "Hola";
		System.out.println("\nstring3 == string4: " + (string3 == string4)); //true
		System.out.println("string3.equals(string4: " + string3.equals(string4)); //true

		String strinMay = "Hola";
		String strinMin = "hola";
		System.out.println("\nstrinMay == strinMin: " + (strinMay == strinMin)); //false
		System.out.println("strinMay.equals(strinMin): " + (strinMay.equals(strinMin))); //false
		System.out.println("strinMay.equals(strinMin): " + (strinMay.equalsIgnoreCase(strinMin))); //true
	}
}