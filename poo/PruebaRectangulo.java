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
		Rectangulo r3 = new Rectangulo(9, 2);
		Rectangulo r4 = new Rectangulo(2, 3);

		// Probamos que se muestran los rectángulos
		System.out.println("Rectángulo1 (2x3):\n" + r1);
		System.out.println("Rectángulo2 (3x2):\n" + r2);
		System.out.println("Rectángulo3 (9x2):\n" + r3);
		System.out.println("Números de rectángulos: " + Rectangulo.rectangulosCreados());
		System.out.println("Prueba acceso a base:\n" + r3.getBase());
		System.out.println(Rectangulo.esLadoCorrecto(r3.getBase()));
	
		// Probamos los Métodos:
		System.out.println("Perímetro r1: " + r1.perimetro());
		System.out.println("Perímetro r2: " + r2.perimetro());
		System.out.println("Perímetro r3: " + r3.perimetro());
		System.out.println();
		System.out.println("Área r1: " + r1.area());
		System.out.println("Área r2: " + r2.area());
		System.out.println("Área r3: " + r3.area());
		System.out.println();
		System.out.println("Comparamos r1 con r2: " + r1.compara(r2));
		System.out.println("¿Son el mismo rectángulo r1 y r2?: " + r1.esGemelo(r2));
		System.out.println("¿Son el mismo rectángulo r1 y r4?: " + r1.esGemelo(r4));
		
	}
}
