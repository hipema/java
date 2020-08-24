package ejerciciosSecuenciales;

import java.util.Scanner;

/**
15 Ejercicios secuenciales en Java

Programa que recibe dos variables numéricas A y B, y después
intercambia los valores de las mismas.

@author: manolohidalgo_
@date: 02-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio15IntercambioDosValores {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int valorA;
    int valorB;
    int valorC;

// Solicitud de datos al usuario
    System.out.println("Este programa pide dos valores e intercambia el valor entre ambas variables.");
    System.out.print("Introduce el valor A: ");
    valorA = scanner.nextInt();
    System.out.print("Introduce el valor B: ");
    valorB = scanner.nextInt();
    
    
// Realizamos Cálculos 
    valorC = valorA;
    valorA = valorB;
    valorB = valorC;

// Mostramos en pantalla
    System.out.println("Tras el cambio, valor A= "+valorA + " y valor B = "+valorB);
    
  }
}
