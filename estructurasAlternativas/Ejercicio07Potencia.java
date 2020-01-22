package estructurasAlternativas;

/*
07 Ejercicios Estructuras Alternativas en Java

Programa:
Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base
y el exponente. Pueden ocurrir tres cosas:

- El exponente sea positivo, sólo tienes que imprimir la potencia.
- El exponente sea 0, el resultado es 1.
- El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    * base (long)
    * exponente (long)
ALGORITMO
    - LEER base, exponente
    - Cálculos
    *   Comparar si exponente es > 0 --> mostrar potencia
    *   Si es 0 --> 1
    *   Si es < 0 --> resultado es base elevada a 1/exponente
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio07Potencia {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int base;
    int exponente;

// Solicitud de datos al usuario
    System.out.println("Este programa nos calcula la potencia de un número dado y su exponente.");
    System.out.print("Introduce la base de la potencia: ");
    base = s.nextInt();
    System.out.print("Introduce el exponente de la potencia: ");
    exponente = s.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (base > 1) {
      System.out.println("El resultado es " + (Math.pow((double)base, (double)exponente)));
    }else if (base == 0) {
       System.out.println("El resultado es 0.");
    }else {
        System.out.println("El resultado es " + (Math.pow((double)base, 1/(double)exponente)));
    }
    }
  }