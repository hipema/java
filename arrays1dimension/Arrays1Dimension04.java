package arrays1dimension;

import java.util.Scanner;

/**
 *Ejercicio04
 *
 *	Define tres arrays de 20 números enteros cada una, con nombres numero,
 *	cuadrado y cubo. Carga el array numero con valores aleatorios entre 0
 *	y 100. En el array cuadrado se deben almacenar los cuadrados de los valores
 *	que hay en el array numero. En el array cubo se deben almacenar los cubos de
 *	los valores que hay en numero. A continuación, muestra el contenido de los tres
 *	arrays dispuesto en tres columnas.
 * 
 * VARIABLES
 * 	int i - contador para recorrer los diferentes ciclos.
 * 	int[] numero - array de 20 números enteros entre 0 y 100.
 * 	int[] cuadrado - array que almacenará el valor de la multiplación por si mismo del array anterior.
 * 	int[] cubo - array que almacenará el valor de la multiplicación entre los dos arrays anteriores.
 * 
 * INICIO PROGRAMA 
 * 1.- Presentación del programa al usuario.
 * 2.- Obtención del array inicial mediante la función Math.random
 * 3.- Cálculo de las dos arrays siguientes, cuadaro y cubo, multiplicando su valor.
 * 4.- Muestra en pantalla con formato para una mejor visualización de los valores.

 * @author manuelhidalgo
 * @since 24-11-2019
 */

public class Arrays1Dimension04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		System.out.println("Carga el array de 20 dígitos con valores aleatorios entre 0 y 100, y el programa calcularará los cuadrados y cubos en los otros arrays.");
		for (i=0;i<20;i++) {
			numero[i] = (int)(Math.random()*100+1);
			cuadrado[i] = numero[i]*numero[i];
			cubo[i] = cuadrado[i]*numero[i];
		}
		System.out.printf("%6s %8s %8s\n", "Numero", "Cuadrado", "Cubo");
		for (i=0;i<20;i++) {
			System.out.printf("%6d %8d %8d\n", numero[i], cuadrado[i], cubo[i]);	
		}
	}
}
