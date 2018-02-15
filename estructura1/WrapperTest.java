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

public class WrapperTest {
	public static void main(String[] args) {
		String texto = new String("3");
		byte b = Byte.parseByte(texto);
		System.out.println(Byte.toString(b));
		short s = Short.parseShort(texto);
		System.out.println(Short.toString(s));
		int i = Integer.parseInt(texto);
		System.out.println(Integer.toString(i));
		long l = Long.parseLong(texto);
		System.out.println(Long.toString(l));
		float f = Float.parseFloat(texto);
		System.out.println(Float.toString(f));
		double d = Double.parseDouble(texto);
		System.out.println(Double.toString(d));
	}
}