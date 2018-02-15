package estructura1;

/**
 * <h1>C\u00f3digos de la presentaci\u00f3n "String, Wrappers, Autoboxing/Auto-unboxing,
 * instanceof"</h1>
 * Implementa los c\u00f3digos de String, Wrappers,
 * Autoboxing/Auto-unboxing, instanceof y entrega el documento
 * "codigosStringsApellido1Apellido2Nombre.zip" donde aparecer\u00e1n empaquetados:
 * <ul>
 * 		<li>C\u00f3digos fuentes (*.java) de la presentaci\u00f3n.</li>
 * </ul>
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("0");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		for (int i = 1; i < 10; i++)
			sb.append(i);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
	}
}