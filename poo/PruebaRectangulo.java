package poo;

import poo.Rectangulo;

/**
 * Prueba la clase rectángulo.
 * 
 * @author manuelhidalgo
 *
 */

public class PruebaRectangulo {
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(2, 3);
		Rectangulo r2 = new Rectangulo(3, 2);
		Rectangulo r3 = new Rectangulo(12, 2);

		
		// Probamos que se muestran los rectángulos
		System.out.println("Rectángulo1 (2x3):\n" + r1);
		System.out.println("Rectángulo2 (3x2):\n" + r2);
		System.out.println("Rectángulo3 (4x2):\n" + r3);
		System.out.println("Números de rectángulos: " + Rectangulo.rectangulosCreados());
	}
}
