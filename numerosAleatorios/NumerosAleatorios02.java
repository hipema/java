package numerosAleatorios;

import java.util.Scanner;

/**
 *Ejercicio02
 *
 *Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que
 * no termine de generar números hasta que no saque el 24. El  programa deberá decir al
 * final cuántos números se ha2n generado.
 * 
 * VARIABLES
 * int aleatorios - variable donde asignaremos el valor aleatorio
 * int contador - variable para contar los números que van apareciendo en pantalla.
 * int i - contador para realizar el recorrido en los bucles
 * 
 * INICIO PROGRAMA 
 * 1.- Presentación del programa al usuario e Iniciamos el programa
 * 2.- Bucle para la realiación de números aleatorios y presentación en pantalla mientras que
 * 		 el resultado de este número sea distinto de 24.
 * 3.- En el mismo bucle, al finalizar cada ronda, realizamos un incremento de 1 en el contador
 * 		 para que sepamos cuantos números han aparecido en pantalla.
 *
 * @author manuelhidalgo
 * @since 20-11-2019
 */

public class NumerosAleatorios02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int aleatorios;
		int i;
		
		System.out.println("Este programa mostrará números aleatorios hasta aparecer el 24, después indicará cuantos han salido en total.\n");
		while (true) {
			System.out.println("Pulsa \"1\" para comenzar: ");
			aleatorios = scanner.nextInt();
			if (aleatorios==1) {
				break;
			}
		}
		for (i=0; aleatorios !=24; i++) {
			aleatorios = (int)(Math.random()*50);
			aleatorios = aleatorios*2;
			System.out.println("Número: "+aleatorios);
			contador++;
		}
		System.out.println("Se han mostrado un total de "+contador+" números en pantalla.");
	}
}
