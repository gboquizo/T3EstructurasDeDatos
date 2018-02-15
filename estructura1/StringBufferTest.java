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

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abababab");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.setCharAt(sb1.length() - 1, 'B');
		System.out.println(sb1);
		sb1.replace(2, 3, "AB");
		System.out.println(sb1);
		sb1.insert(4, "CD");
		System.out.println(sb1);
		sb1.delete(0, 2);
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer(2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		for (int i = 0; i < 10; i++)
			sb2.append(i);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2);
	}
}