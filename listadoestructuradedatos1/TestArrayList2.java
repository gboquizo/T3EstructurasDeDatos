package listadoestructuradedatos1;

import java.util.ArrayList;
import java.util.Date;

/**
*
* Implementa el siguiente trozo de c\u00f3digo y contesta:
* <ul> 
* 		<li>a. \u00bfQu\u00e9 estructura de datos se instancia en este c\u00f3digo?</li>
* 		<li>b. \u00bfEn qu\u00e9 paquete se encuentra?</li>
* 		<li>c. Localiza el interfaz java.util.Collection que implementa e indica al menos
* 				tres m\u00e9todos implementados por la clase (signatura y descripci\u00f3n)</li>
* 		<li>d. \u00bfSe permiten elementos duplicados?</li>
* 		<li>e. \u00bfHay que saber su tama\u00f1o en su creaci\u00f3n?</li>
* 		<li>f. \u00bfEs una estructura din\u00e1mica o est\u00e1tica?</li>
* 		<li>g. \u00bfEs una estructura homog\u00e9nea o
* 				heterog\u00e9nea</li>
* 		<li> h. \u00bfSe utiliza el autoboxing?<li>
* 		<li> i. \u00bfExiste alg\u00fan Wrapper?</li>
* </ul>
*
* @author Guillermo Boquizo S\u00e1nchez
* @version 1.0
*
**/
public class TestArrayList2 {
	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
	public static void main(String[] args) {
		// Creaci\u00f3n de una lista vac\u00eda.
		ArrayList arrayList = new ArrayList();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());

		// Se a\u00f1aden distintos elementos, de distintos tipos.
		arrayList.add(1);
		arrayList.add(new String("hola"));
		arrayList.add(new String("hola"));
		arrayList.add(new Double("0"));
		arrayList.add(new Date());
		System.out.println(arrayList);
	}
}