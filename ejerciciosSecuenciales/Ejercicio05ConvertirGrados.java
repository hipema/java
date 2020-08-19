package ejerciciosSecuenciales;

import java.util.Scanner;

/**
05 Ejercicios secuenciales en Java

Convierte un valor dado en grados Fahrenheit a grados Celsius.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio05ConvertirGrados {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double fahrenheit;
    double celsius;

// Solicitud de datos al usuario
    System.out.println("Este programa pasa de grados Farenheit a Celsius");
    System.out.print("Dame la temperatura en grados Farenheit: ");
      fahrenheit = scanner.nextDouble();

// Realizamos Cálculos
    celsius = (fahrenheit - 32) / 1.8;

// Mostramos en pantalla
    System.out.println(fahrenheit +" grados Farenheit son " +celsius + " grados celsius.");
    
  }
}
