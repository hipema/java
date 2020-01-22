package arrays1dimension;

import java.util.Scanner;

/**
 *Ejercicio08
 *
 *	Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 *	determinado año y que muestre a continuación un diagrama de barras horizontales con
 *	esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier
 *	otro carácter.
 * 
 * VARIABLES
 *	String[] mes - guarda los valores en un array de los meses del año.
 *	int[] temperatura - guarda los valores dados por el usuario de la temperatura media de cada mes.
 *	String caracterNegativo - guardará la cantidad de carácteres "▄" para representar la temperatura negativa.
 *	String caracterPositivo - guardará la cantidad de carácteres "▄" para representar la temperatura positiva.
 *
 * INICIO PROGRAMA 
 * 1.- Explicación del programa y petición de datos al usuario.
 * 2.- Controlamos que la temperatura indicada por el usuario en cada mes esté entre los máximos y mínimos.
 * 3.- Ciclo for para recorrer los diferentes meses del año, ver la temperatura asociada en el otro array
 * 		 y realizar un nuevo ciclo dentro del bucle para calcular los caracteres positivos y negativos que hemos
 * 		 de representar.
 * 4.- Presentación de salida de texto formateada por pantalla.

 * @author manuelhidalgo
 * @since 26-11-2019
 */

public class Arrays1Dimension08 {

	public static void main(String[] args) {
		//Definimos las variables a utilizar en el programa
		Scanner scanner = new Scanner(System.in);
		String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int[] temperatura = new int[12];
		String caracterNegativo = "";
		String caracterPositivo = "";		
		
		// Pedimos inserción de las temperaturas medias de cada mes.
		System.out.println("Programa que pide la temperatura media de los meses del año y lo muestra en un gráfico.\n Máximo 50ºC, mínimo -20ºC.");
		for (int i=0;i<12;i++) {
			do {
				System.out.print("Temperatura media de "+mes[i]+": ");
				temperatura[i] = scanner.nextInt();
				if (temperatura[i]<-20) {
					System.out.println("ERROR:Temperatura indicada menor a la soportada.");
				}
				if (temperatura[i]>50) {
					System.out.println("ERROR: Temperatura indicada máxima a la soportada.");
				}
			} while (temperatura[i]<-20 || temperatura[i]>50);
		}
		System.out.println("");
		//Calculo de caracteres positivos-negativos y muestra en pantalla.
		for (int i=0; i<12;i++) {
			System.out.printf("%-10s %5s", mes[i], temperatura[i]+"ºC");
			if (temperatura[i] <0) {
				for (int j=temperatura[i];j<0; j++) {
					caracterNegativo = caracterNegativo+"▄";
				}
			} else if  (temperatura[i] > 0) {
				for (int j=temperatura[i]; j>0; j--) {
					caracterPositivo = caracterPositivo+"▄";
				}
			} else {
				caracterNegativo = "";
				caracterPositivo = "";
			}
			System.out.printf("%20s %1d %-50s", caracterNegativo, 0, caracterPositivo);
			System.out.println("");
			caracterNegativo = "";
			caracterPositivo = "";
		}
	}
}
