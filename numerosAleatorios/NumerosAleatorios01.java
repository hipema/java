package numerosAleatorios;

import java.util.Scanner;

/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas) de forma que la
 * probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea
 * de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 =
 * 2/6.
 * 
 * VARIABLES
 * String apuesta1[] - array 
 * String apuesta2[] - array 
 * String apuesta3[] - array 
 * String resultados[] - array 
 * int contador1 - cuenta el numero de aciertos de la apuesta 1 
 * int contador2 - cuenta el numero de aciertos de la apuesta 2
 * int contador3 - cuenta el numero de aciertos de la apuesta 3 
 * int i
 * 
 * 
 * INICIO PROGRAMA 
 * 01. Pedimos apuestas al usuario. 
 * - Apuesta 1. For de i=0 hasta i<15, asignando en cada pasada valor al array "apuesta1"
 * 		si valor != de 1, x, 2 --> pedir de nuevo el valor 
 * - Apuesta 2. For de i=0 hasta i<15, asignando en cada pasada valor al array "apuesta2"
 * 		si valor != de 1, x, 2 --> pedir de nuevo el valor 
 * - Apuesta 3. For de i=0 hasta i<15, asignando en cada pasada valor al array "apuesta3"
 * 		si valor != de 1, x, 2 --> pedir de nuevo el valor 
 * 02. Calculamos el resultado de los partidos para el array "real" 
 * - 	Resultados. For de i=0 hasta i<15, asignando en cada pasada valor al array "resultados"
 * 		utilizando la función Math.Random (1, x, 2)
 * 03. Realizamos comparación entre las distintas apuestas: 
 * - for i=0;i<15; i++ 
 * si apuesta1[]=resultados[] contador1++ 
 * si apuesta2[]=resultados[] contador2++ 
 * si apuesta3[]=resultados[] contador3++ 
 * 04. Mostrar resultados de las columnas
 * Mostrar pantalla
 * Partido	Apuesta1 	Apuesta2 	Apuesta3 	Resultado
 * for i=0; i<15; i++ 
 * Mostrar pantalla "Partido "[] apuesta1[] apuesta2[] apuesta3[] resultado[]
 * 
 *
 * Total de aciertos: Apuesta1 (contador1), Apuesta2 (contador2), Apuesta3
 * (contador3),
 *
 * @author manuelhidalgo
 * @since 20-11-2019
 */

public class NumerosAleatorios01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] apuesta1;
		String[] apuesta2;
		String[] apuesta3;
		String[] resultados;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int i;
		String pleno15;
		String[] posibilidades = {"1", "1", "1", "x", "x", "2"};
		int aleatorio;

		apuesta1 = new String[14];
		apuesta2 = new String[14];
		apuesta3 = new String[14];
		resultados = new String[15];

		System.out.println(
		    "Este programa pide que hagas 3 apuestas para la Quiniela y después lo compara con un resultado aleatorio.");
		System.out.println(
		    "--------------------------------------------------------------------------------------------------------\n");
		System.out.println("Introduce los valores de la PRIMERA apuesta:");
		for (i = 0; i < 14; i++) {
			while (true) { // comprobamos que la apuesta realizada tiene un valor aceptado.
				System.out.print("Introduce tu apuesta en el partido " + (i + 1) + ": ");
				apuesta1[i] = scanner.nextLine();
				if ((apuesta1[i].compareTo("1") != 0) && (apuesta1[i].compareTo("2") != 0) && (apuesta1[i].compareTo("x") != 0)) {
					System.out.println("ERROR: debe introducir los valores \"1\", \"2\" ó \"x\":");
				} else {
					break;
				}
			}
		}
		System.out.println("Introduce los valores de la SEGUNDA apuesta:");
		for (i = 0; i < 14; i++) {
			while (true) { // comprobamos que la apuesta realizada tiene un valor aceptado.
				System.out.print("Introduce tu apuesta en el partido " + (i + 1) + ": ");
				apuesta2[i] = scanner.nextLine();
				if ((apuesta2[i].compareTo("1") != 0) && (apuesta2[i].compareTo("2") != 0) && (apuesta2[i].compareTo("x") != 0)) {
					System.out.println("ERROR: debe introducir los valores \"1\", \"2\" ó \"x\":");
				} else {
					break;
				}
			}
		}
		System.out.println("Introduce los valores de la TERCERA apuesta:");
		for (i = 0; i < 14; i++) {
			while (true) { // comprobamos que la apuesta realizada tiene un valor aceptado.
				System.out.print("Introduce tu apuesta en el partido " + (i + 1) + ": ");
				apuesta3[i] = scanner.nextLine();
				if ((apuesta3[i].compareTo("1") != 0) && (apuesta3[i].compareTo("2") != 0) && (apuesta3[i].compareTo("x") != 0)) {
					System.out.println("ERROR: debe introducir los valores \"1\", \"2\" ó \"x\":");
				} else {
					break;
				}
			}
		}
		while (true) { // Realizamos el pleno al 15 y comprobamos que el valor es aceptado.
			System.out.print("Introduce tu apuesta en el pleno al 15 : ");
			pleno15 = scanner.nextLine();
			if ((pleno15.compareTo("1") != 0) && (pleno15.compareTo("2") != 0) && (pleno15.compareTo("x") != 0)) {
				System.out.println("ERROR: debe introducir los valores \"1\", \"2\" ó \"x\":");
			} else {
				break;
			}
		}
		for (i=0; i<14; i++) {
			aleatorio = (int)(Math.floor(Math.random()*6));
			resultados[i] = posibilidades[aleatorio];
			System.out.println("Partido "+(i+1)+": " + resultados[i]);
			if (apuesta1[i].compareTo(resultados[i]) == 0) {
				contador1++;
			}
			if (apuesta2[i].compareTo(resultados[i]) == 0) {
				contador2++;
			}
			if (apuesta3[i].compareTo(resultados[i]) == 0) {
				contador3++;
			}	
		}
		aleatorio = (int)(Math.floor(Math.random()*6));
		resultados[14] = posibilidades[aleatorio];
		System.out.println("Partido  del Pleno al 15: " + resultados[14]+"\n");
		System.out.println("  Partido   Apuesta1  Apuesta2  Apuesta3  Resultado"); 
		System.out.println("  -------   --------  --------  --------  ---------");
		for (i=0; i<14; i++) {
			System.out.printf("%-10s	%1s %8s %10s %9s\n", "Partido "+(i+1),apuesta1[i],apuesta2[i],apuesta3[i],resultados[i]);
		}
		System.out.printf("\n%-14s	%1s %8s %10s %9s\n", "Total aciertos ",contador1,contador2,contador3," ");
		System.out.printf("%-14s	%1s %8s %10s %9s\n", "Total aciertos ",contador1,contador2,contador3," ");
		System.out.printf("\n%-10s	%1s %8s %10s %9s\n", "Pleno al 15 ",pleno15," "," ",resultados[14]);
		if (pleno15.compareTo(resultados[14]) == 0 && contador1==14 || contador2==14 || contador3==14) {
			System.out.println("\n¡¡¡ACERTASTE EL PLENO AL 15!!!");
			if (contador1==14) {
				System.out.println("¡La Apuesta 1 te ha hecho ganar una pasta!");
			} else if (contador2==14){
				System.out.println("¡La Apuesta 2 te ha hecho ganar una pasta!");
			} else {
				System.out.println("¡La Apuesta 3 te ha hecho ganar unas pasta!");
			}
		}
	}
}
