package arrays2dimensiones;

import java.util.Scanner;

/**
 *Ejercicio02
 *
 *	Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas
 *	por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de
 *	cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * VARIABLES
 *	
 *
 * INICIO PROGRAMA 
 * 

 * @author manuelhidalgo
 * @since 27-11-2019
 */

public class Arrays2Dimension02 {

	public static void main(String[] args) {
		//Definimos las variables a utilizar en el programa
		Scanner scanner = new Scanner(System.in);
		int[][] numeros = new int[6][5];
		int i;
		int j;
		
		// Información al usuario y petición de datos
		System.out.println("Incluye 20 números, repartidos en cuatro filas y cinco columnas.");
		for (i=0; i<5; i++) {
			for (j=0; j<4; j++) {
        System.out.println("Incluye un número el número de la posición" + " \""+(i+1)+"\""+ " \""+(j+1)+"\""+": ");
				numeros[i][j] = scanner.nextInt();
				numeros[i][4] += numeros[i][j];
				numeros[5][j] += numeros[i][j];
				numeros[5][4] += numeros[i][j];
			}
		}
		System.out.printf("%12s %10s %10s %10s %10s %10s", "", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Suma Fila");
		System.out.println("");
		for (i=0; i<6; i++) {
			if (i==5) {
				System.out.printf("%12s", "Suma Columna");
			}else {
				System.out.printf("%12s", "Fila "+(i+1));	
			}
			for (j=0; j<5; j++) {
        System.out.printf("%11d", numeros[i][j]);
			}
			System.out.println("");
		}
	}
}
