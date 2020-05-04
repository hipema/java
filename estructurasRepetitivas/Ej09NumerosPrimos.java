package estructurasRepetitivas;

/*
08 Ejercicios Estructuras Repetitivas en Java

Programa:
Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números
primos que queremos mostrar.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    numPrimos (int)
    contar (int)
    primo (int)

ALGORITMO
    LEER numPrimos
    Cálculos
    Mostrar Resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej09NumerosPrimos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numPrimos;
    double contar =1;
    int esPrimo;
    int divisor;
    double n = 3;
    double num;

// Inicio del programa, explicación al usuario
    System.out.println("El programa nos muestra una cantidad solicitada de números primos.");
// Pedimos datos al usuario
      System.out.print("Indicanos la cantidad de los primeros números primos que deseas conocer: ");
      numPrimos = s.nextInt();
// Iniciamos el ciclo para calcular el tiempo.   
    System.out.println("1: 2");
    contar = 1;
    num = 3;
    while (contar < numPrimos){
      esPrimo = 1;
      divisor=3;
      while ((divisor<=Math.sqrt((num))) && esPrimo == 1) {
        if (num%divisor==0) {
          esPrimo = 0;
        }
        divisor +=2;
      }
      if (esPrimo == 1){
        contar +=1;
        System.out.println(contar + ": " + num);
      }
      num +=2;
    }
  }
}