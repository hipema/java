package estructurasAlternativas;

/**
12 Ejercicios Estructuras Alternativas en Java

Programa:
Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es
un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible
por 400.

@author: manolohidalgo_
@date: 09-11-19
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio12AnoBisiesto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula si un año es bisiesto:");
    System.out.print("Introduce el año: ");
    year = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (year % 400 == 0){
        System.out.println("Es un año bisiesto.");
    }else if (year % 100 == 0){
        System.out.println("No es un año bisiesto");
    }else if (year % 4 == 0){
        System.out.println("Es un año bisiesto");
    }else{
        System.out.println("No es un año bisiesto");
    }
    }
  }