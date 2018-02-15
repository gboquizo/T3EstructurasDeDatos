package listadoestructuradedatos1;

/**
 * 
 * <p>\u00bfQu\u00e9 es el autoboxing/unboxing?</p> 
 * <p>Expl\u00edcalo mediante tu propio c\u00f3digo en Java "autoboxing.java"</p>
 * 
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 *
 */
public class Autoboxing {

	//Integer i = new Integer(1);     //Anteriormente era necesario usar el constructor. 
									 //para crear un wrapper desde un primitivo.
	Integer i = 1;//Ahora se puede realizar directamente.
	
	//Integer a = new Integer(1); int b = a.intValue();
	//int b = a;  //Lo mismo para los casos de extracci\u00f3n de primitivo desde envoltorio.
	Integer a = 10; Integer b = 3; int c = a + b;
}