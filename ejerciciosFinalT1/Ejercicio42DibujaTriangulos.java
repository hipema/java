package ejerciciosFinalT1;

import ejerciciosFinalT1.FuncionesEjFinalT1;
import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para pintar las líneas.
 * 
 * Ejemplo 1:
 * Introduzca la altura de la figura: 8 
 * 	
 * 	********
 *	*     *
 *	*    *
 *	*   *
 *	*  *
 *	* *
 *	**
 *	*
 *
 * Ejemplo 2: Introduzca la altura de la figura: 5
 *	*****
 *	*  *
 *	* *
 *	**
 *	*
 * 
 * @author manuelhidalgo
 * @since 10-12-2019
 *
 */
public class Ejercicio42DibujaTriangulos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Este programa dibuja un triángulo de la altura indicada.");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		System.out.print("Introduce la altura: ");
		numero = scanner.nextInt();
		while (numero < 0) {
			System.out.println("ERROR: el número introducido es negativo.");
			System.out.print("Introduce el número entero positivo: ");
			numero = scanner.nextInt();
		}
		FuncionesEjFinalT1.imprimirTriangulo(numero);
	}
}
