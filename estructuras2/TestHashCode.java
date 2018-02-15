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
public class TestHashCode {
	private int valor1;
	private Integer valor2;

	public TestHashCode(int valor1, Integer valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public int hashCode() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(Integer.toString(valor1));
		buffer.append(valor2.toString());
		return buffer.toString().hashCode();
	}
}