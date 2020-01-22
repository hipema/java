package arrays1dimension;

import java.util.Scanner;

/**
 *Ejercicio10
 *
 *	Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 *	y que los almacene en un array. El programa debe ser capaz de pasar todos los
 *	números pares a las primeras posiciones del array (del 0 en adelante) y todos
 *	los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario..
 * 
 * VARIABLES
 * 	int[] aleatorios - array de 20 espacios donde colocaremos los números aleatorios
 * 	int[] pares - array auxiliar para colocar los números pares, también de 20 espacios, que será
 * 								el máximo posible en caso de que todos saliesen pares.
 * 	int[] impares - array auxiliar para colocar los números impares, también de 20 espacios, que será
 * 									el máximo posible en caso de que todos saliesen impares.
 * 	int i					- contador auxiliar para realizar los recorridos en los bucles for.
 * 	int lanzador	- variable que guarda el lanzador del programa para que lo ejecute el usuario.
 * 	int contadorPares - realizará el conteo de cuantos números pares se guardan en el array "pares"
 * 	int contadorImpares - realizará el conteo de cuantos números impares se guardan en el array "impares"
		
 * INICIO PROGRAMA 
 * 1.- Explicación del programa y petición de inicio al usuario.
 * 2.- Cálculo del array inicial mediante números aleatorios.
 * 3.- Separación del array mediante dos arrays auxiliares, "pares" e "impares".
 * 4.- Ordenación y sobreescritura del array original, incluyendo primero los números pares y después
 * 		 los impares.
 * 5.- Mostramos en pantalla el array ordenado.

 * @author manuelhidalgo
 * @since 26-11-2019
 */

public class Arrays1Dimension10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] aleatorios = new int[20];
		int[] pares = new int [20];
		int[] impares = new int [20];
		int i;
		int lanzador;
		int contadorPares = 0;
		int contadorImpares = 0;
		
		// Inicio de programa.
		System.out.println("Programa que genera un listado de 20 números aleatorios y después ordena los pares en las primeras posiciones.");
			do {
				System.out.println("Pulsa \"1\" para iniciar el programa: ");
				lanzador = scanner.nextInt();
				if (lanzador != 1) {
					System.out.println("ERROR: opción incorrecta.");
				}
			} while (lanzador != 1);
			
		//Cálculo del array inicial, generando sus números aleatorios.
			System.out.println("");
			System.out.println("Array inicial: ");
			for (i=0; i<20;i++) {
				aleatorios[i]=(int)(Math.floor(Math.random()*101));
				System.out.print(aleatorios[i]+",");
			} 
			// Separamos el array en dos, uno con números pares y otro impares.
			for (i=0; i<20; i++) {
				if (aleatorios[i]%2 == 0) {
					pares[contadorPares]=aleatorios[i];
					contadorPares++;
				} else {
					impares[contadorImpares] = aleatorios[i];
					contadorImpares++;
				}
			}
			// Colocamos primero los números pares y en el siguiente los impares
			for (i=0; i<contadorPares; i++) {
				aleatorios[i] = pares[i];
			}
			for (i=0; i<contadorImpares; i++) {
				aleatorios[i+contadorPares] = impares[i];
			}
			//Imprimimos de nuevo el array en orden
			System.out.println("\nArray ordenado: ");
			for (i=0; i<20; i++) {
				System.out.print(aleatorios[i]+",");	
			}
	}
}
