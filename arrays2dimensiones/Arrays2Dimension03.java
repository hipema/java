package arrays2dimensiones;

import java.util.Scanner;

/**
 *Ejercicio02
 *
 *  Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas
 *  por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de
 *  cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 *Ejercicio 03
 *  Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de forma
 *  aleatoria (valores entre 100 y 999).
 *
 * VARIABLES
 *  
 *
 * INICIO PROGRAMA 
 * 

 * @author manuelhidalgo
 * @since 27-11-2019
 */

public class Arrays2Dimension03 {

  public static void main(String[] args) {
    //Definimos las variables a utilizar en el programa
    Scanner scanner = new Scanner(System.in);
    int[][] numeros = new int[4][5];
    int[] sumaFila = new int[4];
    int [] sumaColumna = new int[6];
    
    for (int i=0; i < 4; i++) {
      for (int j= 0; j< 5; j++) {
        numeros[i][j] = (int)(Math.random()*900)+100;
        sumaColumna[5] += numeros[i][j]; // Esta suma el total.
        sumaFila[i]+= numeros[i][j];
        sumaColumna[j] += numeros[i][j];
      }
    }
    System.out.printf("%12s %10s %10s %10s %10s %10s %10s", "", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Suma Fila");
    System.out.println("");
    for (int i =0; i<5; i++) { // esto leería las filas
      if (i==4) {
      System.out.printf("%12s", "Suma Columna");
      }else {
        System.out.printf("%12s", "Fila "+(i+1));
      }
      for (int j=0; j<6; j++) {
        if (i == 4) {
          System.out.printf("%11d", sumaColumna[j]);
        } else if (j == 5){
          System.out.printf("%11d", sumaFila[i]);
        } else {
          System.out.printf("%11d", numeros[i][j]);
        }
      }
      System.out.println("");
    }
  }
}