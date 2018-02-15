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

public class AutoBoxingUnboxingTest3 {
	public static void main(String[] args) {
		MiClase a = new MiClase(1);
		MiClase b = new MiClase(2);
		System.out.println("A: " + a + " y B: " + b);
		cambiar(a, b);
		System.out.println("A: " + a + " y B: " + b);
	}

	public static void cambiar(MiClase a, MiClase b) {
		int tmp = a.getValor();
		a.setValor(b.getValor());
		b.setValor(tmp);
	}

}
