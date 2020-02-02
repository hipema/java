package poo;
import poo.Fraccion;
/**
 * Test para la prueba de la clase Fracción.
 * 
 * @author manuelhidalgo
 *
 */
public class PruebaFraccion {

	public static void main(String[] args) {
		Fraccion f1, f2, f3, f4, f5;
		System.out.println("Creamos f1 con valor 12/36.");
		f1 = new Fraccion (12,36);
		System.out.println("Mostramos f1: "+f1);
		System.out.println();
		
		System.out.println("Numerador: "+ f1.getNumerador());
		System.out.println("Denominador: "+ f1.getDenominador());
		
		System.out.println("Cambiamos numerador a 4");
		f1.setNumerador(4);
		System.out.println("Nuevo numerador: "+ f1.getNumerador());
		System.out.println();
		
		System.out.println("Cambiamos denominador a 8");
		f1.setDenominador(8);
		System.out.println("Nuevo denominador: "+ f1.getDenominador());
		System.out.println();
		
		System.out.println("Resultado de la fracción: "+ f1.obtenerResultado());
		System.out.println();
		
		System.out.println("Multiplicar fracción por un número, ej.5");
		f1.multiplicaNumero(5);
		System.out.println("La fracción resultante es "+ f1 +", cuyo resultado es "+f1.obtenerResultado());
		System.out.println();
		
		System.out.println("Multiplicar fracción por otra de (3/6):");
		f2 = new Fraccion (3,6);
		f1.multiplicaFracciones(f2);
		System.out.println("La fracción resultante es: "+ f1);
		System.out.println();
		
		System.out.println("Sumar dos fracciones (3/4) y (2/3):");
		f3 = new Fraccion (3,4);
		f4 = new Fraccion (2,3);
		System.out.println("Resultado de la fraccion3: "+ f3.obtenerResultado());
		System.out.println("Resultado de la fraccion4: "+ f4.obtenerResultado());
		System.out.println("Suma de resultados es: "+(f3.obtenerResultado()+f4.obtenerResultado()));
		f3.sumarFracciones(f4);
		System.out.println("La fracción resultante es: "+f3+" cuyo resultado es "+f3.obtenerResultado());
		System.out.println();
		
		System.out.println("Restar dos fracciones (18/4) y (2/3):");
		f3 = new Fraccion (18,4);
		f4 = new Fraccion (2,3);
		System.out.println("Resultado de la fraccion3: "+ f3.obtenerResultado());
		System.out.println("Resultado de la fraccion4: "+ f4.obtenerResultado());
		System.out.println("Resta de resultados es: "+(f3.obtenerResultado()-f4.obtenerResultado()));
		f3.restarFracciones(f4);
		System.out.println("La fracción resultante es: "+f3+" cuyo resultado es "+f3.obtenerResultado());
		System.out.println();
		
		f5 = new Fraccion (2100,180);
		System.out.println("La Fracción es 2100/180, cuyo resultado es "+f5.obtenerResultado());
		f5.simplificaFraccion();
		System.out.println("Simplificamos fracción resultando "+f5+ " cuyo resultado es "+ f5.obtenerResultado());
	}
}
