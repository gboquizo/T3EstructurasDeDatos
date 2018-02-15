package listadoestructuradedatos1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

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
public class TestArrayList {
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
		
		System.out.println("tama\u00f1o del ArrayList: " + arrayList.size());
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
		System.out.println("arrayList.contains(1): " + arrayList.contains(1));
		System.out.println("arrayList.contains(\"hola\"): " + arrayList.contains("hola"));
		System.out.println("arrayList.contains(\"adios\"): " + arrayList.contains("adios"));
		System.out.println("arrayList.contains(1): " + arrayList.contains(1));
		
		/*
		 * System.out.println("arrayList.get(arrayList.size()): "+
		 * arrayList.get(arrayList.size()));//
		 * java.lang.IndexOutOfBoundsException
		 */
		
		// \u00daltimo elemento.
		System.out.println("arrayList.get(arrayList.size()-1): " + arrayList.get(arrayList.size()-1));
		
		// Primer elemento.
		System.out.println("arrayList.get(0): " + arrayList.get(0));
		System.out.println("arrayList.get(0) instanceof Integer: " + (arrayList.get(0) instanceof Integer));
		
		// Recorrido con Iterator.
		for (Iterator iterator = arrayList.iterator();iterator.hasNext();){
			Object object =iterator.next();
			System.out.println(object + " - ");
		}
		System.out.println("\narrayList.indexOf(\"hola\"): "
		+ arrayList.indexOf("hola"));
		
		//Conversi\u00f3n a array.
		Object[] array = arrayList.toArray();
		for (Object object : array){
			System.out.println(object + " - ");
		}
		//Borrado de elementos.
		System.out.println("\narrayList.remove(0): " + arrayList.remove(0));
		System.out.println("arrayList.remove(\"hola\"): " + arrayList.remove("hola"));
		
		// Se borran todos los elementos de la lista.
		arrayList.clear();
		System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
	}
}