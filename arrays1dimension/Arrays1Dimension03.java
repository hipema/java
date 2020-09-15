package arrays1dimension;

import java.util.Scanner;

/**
 *Ejercicio03
 *
 *	Escribe un programa que lea 10 números por teclado y que luego los
 *	muestre en orden inverso, es decir, el primero que se introduce es
 *	el último en mostrarse y viceversa.
 * 
 * VARIABLES
 * 	int i - contador para recorrer los ciclos.
 * 	int[] numero - array para almacenar los diez números introducidos por el usuario.
 * 
 * INICIO PROGRAMA 
 * 1.- Presentación del programa al usuario.
 * 2.- Introducción de los valores por el usuario en el array.
 * 3.- Impresión por pantalla recorriendo el array desde la última posición a la primera.

 * @author manuelhidalgo
 * @since 24-11-2019
 */

public class Arrays1Dimension03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("El programa pedirá 10 números y después serán impresos en orden inverso:");
		
		for (int i =0;i<10;i++) {
			System.out.print("Número "+(i+1)+": ");
			numeros[i] = scanner.nextInt();
		}		
		System.out.println("Valores introducidos en orden inverso");
		for (int i=9; i>=0;i--) {
			System.out.println("Numero " + (i+1)+": "+numeros[i]);			
		}
	}
}
