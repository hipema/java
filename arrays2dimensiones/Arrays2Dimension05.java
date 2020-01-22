package arrays2dimensiones;

import java.util.Scanner;

/**
 *Ejercicio05
 *
 *	Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos
 *	comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
 *	tanto del máximo como del mínimo.
 *
 * VARIABLES
 *	
 *
 * INICIO PROGRAMA 
 * 

 * @author manuelhidalgo
 * @since 27-11-2019
 */

public class Arrays2Dimension05 {

	public static void main(String[] args) {
		//Definimos las variables a utilizar en el programa
		Scanner scanner = new Scanner(System.in);
		int[][] numeros = new int[6][10];
		int i;
		int j;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		// Información al usuario y petición de datos
		System.out.println("El programa rellenará una tabla de 6 filas y 10 columnas con números enteros positivos entre 0 y 1000 (ambos incluidos).\nE indicará los valores máximos y mínimos.\n");
		for (i=0; i<6; i++) {
			for (j=0; j<10; j++) {
				numeros[i][j] = (int)(Math.random()*1001);
				if (numeros[i][j]>maximo) {
					maximo = numeros[i][j];
				}
				if (numeros[i][j]<minimo) {
					minimo = numeros[i][j];
				}
			}
		}
		System.out.printf("%11s %11s %11s %11s %11s %11s %11s %11s %11s %11s ", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Columna 6", "Columna 7", "Columna 8", "Columna 9", "Columna 10");
		System.out.println("");
		for (i=0; i<6; i++) {
			for (j=0; j<10; j++) {
				System.out.printf("%11s ", numeros[i][j]);
				if (j==9) {
					System.out.println("");
				}
			}
		}
		System.out.println("\nEl valor máximo es: "+ maximo);
		System.out.println("El valor mínimo es: "+ minimo);
	}
}
