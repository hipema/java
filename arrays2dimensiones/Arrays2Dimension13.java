package arrays2dimensiones;

import java.util.Scanner;

/**
 *Ejercicio13
 *
 *	Realiza un programa que calcule la estatura media, mínima y máxima en centímetros
 *	de personas de diferentes países. El array que contiene los nombres de los paises
 *	es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre
 *	las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números
 *	aleatorios generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar.
 *	Los nombres de los países se deben mostrar utilizando el array de países (no se pueden escribir
 *	directamente).
 *
 * VARIABLES
 *	String[] pais = {"España", "Rusia", "Japon", "Australia"}
 *	int[4][10] medidas
 *	int valorMaximo
 *	int valorMinimo
 *	arrayMaximo
 *	arrayMinimo
 *	suma[]
 *
 * INICIO PROGRAMA 
 * 1.- Inicializamos variables a utilizar.
 * 2.- Recorremos filas(i)
 * 3.- 		reiniciamos valores de medias.
 * 4.- 		Recorremos columnas (j)
 * 5.- 			Asignamos valores al array medidas
 * 6.-			Comparamos valores máximo, mínimo.
 * 7.-			Si es la última posición de la fila (i), asignamos el valor de las variables maximo y minimo al
 * 						array correspondiente.
 * 8.- Realizamos muestra por pantalla utilizando printf

 * @author manuelhidalgo
 * @since 28-11-2019
 */

public class Arrays2Dimension13 {

	public static void main(String[] args) {
		//Definimos las variables a utilizar en el programa
		Scanner scanner = new Scanner(System.in);
		String[] pais = {"España", "Rusia", "Japon", "Australia"};
		int[][] medidas = new int[4][10];
		int valorMaximo;
		int valorMinimo;
		int[] arrayMaximo = new int[4];
		int[] arrayMinimo = new int[4];
		int[] suma = new int[4];
		
		// Hacemos los cálculos para rellenar la tabla de datos de alturas aleatoriamente.
		for (int i = 0; i<4; i++) {
			valorMaximo = 140; // inicializamos la variable para calcular en cada fila cual será el valor máximo antes de entrar al siguiente buclel.
			valorMinimo = 210; // inicializamos la variable para calcular en cada fila cual será el valor mínimo antes de entrar al siguiente buclel.
			for (int j=0; j<10; j++) {
				medidas[i][j]=(int)(Math.random()*71+140); // genera números aleatorios para medidas entre 140 y 210 cm.
				suma[i]+= medidas[i][j]; // suma los valores de la fila en un array 
				if (medidas[i][j]>valorMaximo) {
					valorMaximo=medidas[i][j]; // si el valor asignado a esa "celda" es mayor al valor máximo, actualizamos variable.
				}
				if (medidas[i][j]<valorMinimo) {
					valorMinimo = medidas[i][j]; // si el valor asignado a esa "celda" es menor al valor máximo, actualizamos variable.
				}
				if (j==9) {
					arrayMaximo[i]=valorMaximo; // acumulamos el valor máximo en la posición correspondiente a la fila que después identificaremos con cada país.
					arrayMinimo[i]=valorMinimo; // acumulamos el valor mínimo en la posición correspondiente a la fila que después identificaremos con cada país.
				}
			}
		}
		
	 // Comenzamos la maquetación para la impresión en pantalla.
		System.out.printf("%56s %3s %3s", "MED", "MAX", "MIN");
		System.out.println("");
		for (int i=0; i<4; i++) {
				System.out.printf("%11s", pais[i]+": ");
				for (int j=0; j<10; j++) {
					System.out.printf("%3d ", medidas[i][j]);
				}
				System.out.printf("%1s ", "|");
				System.out.printf("%3d ", (suma[i]/10));
				System.out.printf("%3d ", arrayMaximo[i]);
				System.out.printf("%3d ", arrayMinimo[i]);
				System.out.println("");
					
					
					System.out.println("");
		}
	}
}
