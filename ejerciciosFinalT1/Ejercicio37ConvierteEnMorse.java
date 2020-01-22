package ejerciciosFinalT1;

import ejerciciosFinalT1.FuncionesEjFinalT1;
import java.util.Scanner;

/**
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el..___.____...__en Morse.
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde
 * la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal. 
 * 1.____
 * 2..___
 * 3...__
 * 4...._
 * 5.....
 * 6_....
 * 7__...
 * 8___.. 
 * 9____.
 * 0_____
 * 
 * @author manuelhidalgo
 * @since 10-12-2019
 *
 */
public class Ejercicio37ConvierteEnMorse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Este programa convierte un número a código morse.");
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.print("Introduce el número entero positivo: ");
		numero = scanner.nextInt();
		while (numero < 0) {
			System.out.println("ERROR: el número introducido es negativo.");
			System.out.print("Introduce el número entero positivo: ");
			numero = scanner.nextInt();
		}
		System.out.println("El número " + numero + " en morse es:");
		System.out.println(FuncionesEjFinalT1.codigoMorse(numero));
	}
}
