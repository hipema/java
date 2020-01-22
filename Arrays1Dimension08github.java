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
 * 
 * INICIO PROGRAMA 

 * @author manuelhidalgo
 * @since 26-11-2019
 */

public class Arrays1Dimension08github {

  public static void main(String[] args) {
  
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    Scanner scanner = new Scanner (System.in);              
    int[] temperatura = new int[12];
    int i, j;
    
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
          
    for (i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura[i] = scanner.nextInt();
    }

    for (i = 0; i < 12; i++) {
      System.out.printf(azul + "%12s " + verde + "│", mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print(morado + "▄");
      }
      System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);
    }
  }
}