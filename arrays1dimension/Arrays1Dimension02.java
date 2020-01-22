package arrays1dimension;

import java.util.Scanner;

/**
 *Ejercicio02
 *
 *	Define un array de 10 caracteres con nombre simbolo y asigna
 *	valores a los elementos según la tabla que se muestra a continuación.
 *	Muestra el contenido de todos los elementos del array. ¿Qué sucede con
 *	los valores de los elementos que no han sido inicializados?
 * 
 * VARIABLES
 * int i - contador para realizar el recorrido del ciclo.
 * String[] simbolo - array qu guarda los valores indicados en el enunciado.
 * 
 * INICIO PROGRAMA 
 * 1.- Realizamos la asignación de los valores indicados en el programa.
 * 2.- Mostramos en pantalla el array complleto, vemos que los huecos que no están
 * 		 asignados, al ser un String, nos aparecen con la indicación "null".

 * @author manuelhidalgo
 * @since 24-11-2019
 */

public class Arrays1Dimension02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		String[] simbolo = new String[10];
		
		simbolo[0]="a";
		simbolo[1]="x";
		simbolo[4]="@";
		simbolo[6]="\'\'";
		simbolo[7]="+";
		simbolo[8]="Q";
		
	
		for (i=0; i<10;i++) {
			System.out.println("Valor array posicion " + i+": "+simbolo[i]);			
		}
	}
}
