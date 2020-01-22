package ejerciciosFinalT1;

import ejerciciosFinalT1.FuncionesEjFinalT1;
import java.util.Scanner;

/**
 * Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de mezclar los números de ambos de forma alterna, se coge un número
 * de a, luego de b, luego de a, etc. Los arrays a y b pueden tener longitudes
 * diferentes; por tanto, si se terminan los números de un array se terminan de
 * coger todos los que quedan del otro.
 * Ejemplos:
 * Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
 * Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
 * Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
 * Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
 * 
 * @author manuelhidalgo
 * @since 10-12-2019
 *
 */
public class Ejercicio50MezclaArrays {
	public static void main(String[] args) {
		int[] arrayA1 = {8, 9, 0};
		int[] arrayB1 = {1, 2, 3};
		int[] arrayA2 = {4, 3};
		int[] arrayB2 = {7, 8, 9, 10};
		int[] arrayA3 = {8, 9, 0, 3};
		int[] arrayB3 = {1};
		int[] arrayA4 = { };
		int[] arrayB4 = {1, 2, 3};
		int[] array1 = FuncionesEjFinalT1.mezcla(arrayA1, arrayB1);
		int[] array2 = FuncionesEjFinalT1.mezcla(arrayA2, arrayB2);
		int[] array3 = FuncionesEjFinalT1.mezcla(arrayA3, arrayB3);
		int[] array4 = FuncionesEjFinalT1.mezcla(arrayA4, arrayB4);

		System.out.print("El resultado de array1 es: ");
		FuncionesEjFinalT1.imprimeArray(array1);
		System.out.println();
		System.out.print("El resultado de array2 es: ");
		FuncionesEjFinalT1.imprimeArray(array2);
		System.out.println();
		System.out.print("El resultado de array3 es: ");
		FuncionesEjFinalT1.imprimeArray(array3);
		System.out.println();
		System.out.print("El resultado de array4 es: ");
		FuncionesEjFinalT1.imprimeArray(array4);
		System.out.println();
	}
}
