package arrays1dimension;

import java.util.Scanner;

/**
 *Ejercicio05
 *
 *	Escribe un programa que pida 10 números por teclado y que luego muestre los
 *	números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 *	máximo y del mínimo respectivamente.
 * 
 * VARIABLES
 * 	int i - contador para recorrer los ciclos for.
 * 	int[] numero - array que almacenará los diez números introducidos por el usuario.
 * 	int maximo = Integer.MIN_VALUE - definición inicial de la variable que guardará el valor máximo, inicializada
 * 																	 mediante el valor mínimo disponible en java.
 * 	int minimo = Integer.MAX_VALUE; - definición inicial de la variable que guardará el valor mínimo, inicializada
 * 																		mediante el valor máximo disponible en java.
 * 
 * INICIO PROGRAMA 
 * 1.- Presentación del programa y petición de los numeros al usuario.
 * 2.- Conforme el usuario vaya introduciendo números, se actualizará la variable "máximo" y "mínimo".
 * 3.- Mediante un ciclo for indicamos que muestre por pantalla los numeros introducidos en el primer array.
 * 		 Introducimos condición para que en caso de que el número del array coincida con el almacenado en "máximo"
 * 		 o "mínimo", muestre el mensaje a su lado indicandolo.

 * @author manuelhidalgo
 * @since 24-11-2019
 */

public class Arrays1Dimension05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int[] numero = new int[10];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		System.out.println("Programa que pide 10 números y calcula el máximo y mínimo.");
		for (i=0;i<10;i++) {
			System.out.print("Introduce el número "+(i+1)+": ");
			numero[i] = scanner.nextInt();
			if (numero[i]<minimo) {
				minimo  = numero[i];
			}
			if (numero[i]>maximo) {
				maximo = numero[i];
			}
		}
		for (i=0; i<10;i++) {
			if (numero[i]==maximo) {
				System.out.println("Número "+ (i+1)+": "+numero[i] + " máximo.");
				}
			if (numero[i]== minimo) {
				System.out.println("Número "+ (i+1)+": "+numero[i] + " mínimo.");
			}
			if (numero[i] == maximo || numero[i] == minimo) {
			} else {
				System.out.println("Número "+ (i+1)+": "+numero[i]);
			}
		}
	}
}
