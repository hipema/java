package estructurasAlternativas;

/**
07 Ejercicios Estructuras Alternativas en Java

El programa calcula el resultado de una potencia, recibiendo la
base y exponente. Pueden ocurrir tres casos:

- El exponente sea positivo, sólo tienes que imprimir la potencia.
- El exponente sea 0, el resultado es 1.
- El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

@author: manolohidalgo_
@date: 09-11-19
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio07Potencia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int base;
    int exponente;

// Solicitud de datos al usuario
    System.out.println("Calculamos la potencia de un número:");
    System.out.print("Introduce la base de la potencia: ");
    base = scanner.nextInt();
    System.out.print("Introduce el exponente de la potencia: ");
    exponente = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (base >= 1) {
      System.out.println("El resultado es " + (Math.pow(base, exponente)));
    }else if (exponente == 0) {
       System.out.println("El resultado es 1.");
    }else {
        System.out.println("El resultado es " + (Math.pow(base, 1/exponente)));
    }
    }
  }