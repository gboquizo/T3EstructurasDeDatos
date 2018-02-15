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
public class TestHashCode2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TestHashCode test1 = new TestHashCode(1, new Integer(2));
		TestHashCode test2 = new TestHashCode(1, new Integer(2));
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
	}
}