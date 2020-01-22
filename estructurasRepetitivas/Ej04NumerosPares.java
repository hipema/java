package estructurasRepetitivas;

/*
04 Ejercicios Estructuras Repetitivas en Java

Programa:
Escribir un programa que imprima todos los números pares entre dos números
que se le pidan al usuario.

Autor: Manuel Hidalgo Pérez
Fecha: 10-11-19

Variables a utilizar:
    numero1 (int)
    numero2 (int)
    i (int)

ALGORITMO
    - LEER numero1, numero2
    - Cálculos
        Crear rango con la función "for in" y dar condición.
            Si i%2 == 0 --> implica que es par y se ha de imprimir''
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej04NumerosPares {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero1;
    int numero2;
    double i;

// Solicitud de datos al usuario
    System.out.println("El programa imprimirá todos los números pares entre dos números indicados.");
    System.out.print("Introduce el primer número: ");
    numero1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    numero2 = s.nextInt();
// Realización del ciclo para hacer cálculos y mostrar en pantalla
    for (i=numero1; i <= numero2; i = i+1){
      if (i%2==0){
        System.out.println((int)i); 
        }
    }
  }
}