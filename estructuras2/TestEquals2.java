package estructuras2;

/**
 * <h1>C\u00f3digos de la presentaci\u00f3n "Estructuras (II)"</h1>
 * 
 * C\u00f3digos de la presentaci\u00f3n "Estructuras (II)"
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class TestEquals2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TestEquals test1 = new TestEquals(1, new Integer(2));
		TestEquals test2 = new TestEquals(1, new Integer(2));
		System.out.println(test1.equals(test2));
	}
}
