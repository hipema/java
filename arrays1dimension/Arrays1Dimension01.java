package arrays1dimension;

import java.util.Scanner;

/**
 *  Ejercicio01
 *
 *	Define un array de 12 números enteros con nombre num y asigna los valores
 *	según la tabla que se muestra a continuación. Muestra el contenido de todos
 *	los elementos del array. ¿Qué sucede con los valores de los elementos que no
 *	han sido inicializados?
 * 
 * VARIABLES
 * int i - contador para recorrer el ciclo.
 * int[] num - variable pra guardar los números indicados.
 * 
 * INICIO PROGRAMA 
 * 1.- Asignamos valores indicados al array.
 * 2.- Observamos al ejecutar, que los huecos donde no se ha asignado valor, se le asigna
 * 		 automáticamente el valor 0.

 * @author manuelhidalgo_
 * @since 24-11-2019
 */

public class Arrays1Dimension01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int[] num = new int[12];
		
		num[0]=39;
		num[1]=-2;
		num[4]=0;
		num[6]=14;
		num[8]=5;
		num[9]=120;		
	
		for (i=0; i<12;i++) {
			System.out.println("Valor array posición " + i+": "+num[i]);			
		}
	}
}
