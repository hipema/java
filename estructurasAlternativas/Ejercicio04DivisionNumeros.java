package estructurasAlternativas;

import java.util.Scanner;

/**
04 Ejercicios Estructuras Alternativas en Java

Este programa pide al usuario dos números, muestra el resultado
de su división, en caso de que el segundo sea 0, muestra un mensaje
de error.

@author: manolohidalgo_
@date: 08-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio04DivisionNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numerador;
    int denominador;

// Solicitud de datos al usuario
    System.out.println("Este programa muestra la division entre dos números enteros:");
    System.out.print("Introduce el primer número: ");
    numerador = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    denominador = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (denominador != 0){
        System.out.println((double)numerador/(double)denominador);
    }else {
        System.out.println("El segundo número introducido es 0. "
            + "Reinicie el programa e introduzca un valor válido.");
    }  
  }
}
