package estructurasAlternativas;

/*
12 Ejercicios Estructuras Alternativas en Java

Programa:
Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es
un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible
por 400.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    * year (int)

ALGORITMO
    - LEER year
    - Cálculos
        *   LEER year
        *   Nota:   un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100,
                   excepto que también sea divisible por 400.
            Cálculos si:
            * year / 400 == 0 --> bisiesto
            * year / 100 == 0 --> No es bisiesto    
            * year / 4 --> bisiesto
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio12AnoBisiesto {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int year;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula si un año es bisiesto:");
    System.out.print("Introduce el año: ");
    year = s.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if ((double)year % 400 == 0){
        System.out.println("Es un año bisiesto.");
    }else if ((double)year % 100 == 0){
        System.out.println("No es un año bisiesto");
    }else if ((double)year % 4 == 0){
        System.out.println("Es un año bisiesto");
    }else{
        System.out.println("No es un año bisiesto");
    }
    }
  }