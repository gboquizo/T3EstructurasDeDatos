package estructura1;

/**
 * <h1>C\u00f3digos de la presentaci\u00f3n "String, Wrappers,
 * Autoboxing/Auto-unboxing, instanceof"</h1> Implementa los c\u00f3digos de
 * String, Wrappers, Autoboxing/Auto-unboxing, instanceof y entrega el documento
 * "codigosStringsApellido1Apellido2Nombre.zip" donde aparecer\u00e1n
 * empaquetados:
 * <ul>
 * <li>C\u00f3digos fuentes (*.java) de la presentaci\u00f3n.</li>
 * </ul>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class StringTest {
	public static void main(String[] args) {

		String s1 = new String();
		String s2 = new String(" ababABAB ");// Tiene espacios en blanco.
		String s3 = "Ejemplo";
		System.out.println(s1.compareTo(" "));// es un espacio en blanco.
		System.out.println(s2.concat((s3)));
		System.out.println(s1.indexOf('h'));
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s2.indexOf('b'));
		System.out.println(s2.lastIndexOf('b'));
		System.out.println(s3.length());
		System.out.println(s3.charAt(1));
		System.out.println(s2.replace('A', 'x'));
	}
}