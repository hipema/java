package numerosAleatorios;

import java.util.Scanner;

/**
 *Ejercicio03
 *
 *	Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 *	con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para 
 *	convertir un entero en un carácter.
 * 
 * VARIABLES
 * int aleatorios - variable que se cargara con los caracteres de valor entre el 32 y 126.
 * 
 * INICIO PROGRAMA 
 * 1.- Presentacion del programa y petición al usuario pra iniciar el programa
 * 2.- Realiación de ciclo "while true" asignando a "aleatorios" Math.random con valores entre 32 y 126,
 * 		 no incluiremos indicador alguno para que cambie el estado, de forma que será infinito.
 * 3.- Imprimimos "aleatorio" en carácter mediante casting.
 * 4.- Incluimos "Thread.sleep" para generar una ligera pausa entre los carácteres.
 *
 * Total de aciertos: Apuesta1 (contador1), Apuesta2 (contador2), Apuesta3
 * (contador3),
 *
 * @author manuelhidalgo
 * @since 23-11-2019
 */

public class NumerosAleatorios03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aleatorios;
		
		System.out.println("Este programa mostrará números aleatorios hasta aparecer el 24, después indicará cuantos han salido en total.\n");
		while (true) {
			System.out.println("Pulsa \"1\" para comenzar: ");
			aleatorios = scanner.nextInt();
			if (aleatorios==1) {
				break;
			}
		}
		while (true) {
			aleatorios = (int)(Math.random()*95)+32;
			System.out.print(((char)aleatorios));
			try{
        Thread.sleep(6);
      }catch(InterruptedException e ) {
        }
			}
	}
}
