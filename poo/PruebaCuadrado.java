package poo;
import poo.Cuadrado;

/**
 * Prueba la clase cuadrado.
 * 
 * @author manuelhidalgo
 *
 */

public class PruebaCuadrado {
	public static void main(String[] args) {
	Cuadrado c1 = new Cuadrado (5);
	
	//Probamos que se muestran los cuadrados
		System.out.println("Cuadrado 1 (5):\n" +c1);

	// Obtener lado del cuadrado.
		System.out.println("El lado del cuadrado es: " + c1.getLado());
	}

}
