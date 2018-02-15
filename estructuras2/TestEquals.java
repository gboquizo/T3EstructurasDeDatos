
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
public class TestEquals {
	private int valor1;
	private Integer valor2;

	public TestEquals(int valor1, Integer valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public boolean equals(Object o) {
		if (this == o) // Primer paso.
			return true;
		if (!(o instanceof TestEquals)) // Segundo paso.
			return false;
		TestEquals param = (TestEquals) o; // Tercer paso.
		return param.valor1 == valor1 && param.valor2.equals(valor2);
	}
	
}

