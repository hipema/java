package estructurasAlternativas;

/*
19 Ejercicios Estringucturas Alternativas en Java

Programa:
Escribe un programa que pida un número entero entre uno y doce e imprima el
número de días que tiene el mes correspondiente.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    #   mes (int)

ALGORITMO
    - LEER mes
    - Cálculos
       #   Realizamos cálculos de comparación y mostramos resultado
        # Si es 1 --> Enero --> 31
        # Si es 2 --> Febrero --> 28
        # Si es 3 --> Marzo --> 31
        # Si es 4 --> Abril --> 30
        # Si es 5 --> Mayo --> 31
        # Si es 6 --> Junio --> 30
        # Si es 7 --> Julio --> 31
        # Si es 8 --> Agosto --> 31
        # Si es 9 --> Septiembre --> 30
        # Si es 10 --> Octubre --> 31
        # Si es 11 --> Noviembre --> 30
        # Si es 12 --> Diciembre --> 31
        # Si es otro número --> ERROR: la numeración debe ser de 1 a 12.
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio19NumeroDiasMes {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int mes;

// Solicitud de datos al usuario
    System.out.println("El programa te devuelve el día de la semana seleccionando:");
    System.out.println(" 1.- Enero.");
    System.out.println(" 2.- Febreo.");
    System.out.println(" 3.- Marzo.");
    System.out.println(" 4.- Abril.");
    System.out.println(" 5.- Mayo.");
    System.out.println(" 6.- Junio.");
    System.out.println(" 7.- Julio.");
    System.out.println(" 8.- Agosto.");
    System.out.println(" 9.- Septiembre.");
    System.out.println("10.- Octubre.");
    System.out.println("11.- Noviembre.");
    System.out.println("12.- Diciembre.");
    mes = s.nextInt();

// Realizamos comparaciones y mostramos el resultado
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
      System.out.println("El mes seleccionado tiene 31 días");
    } else if (mes ==2){
      System.out.println("Febrero tiene 28 días");
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
      System.out.println("El mes seleccionado tiene 30 días");
    } else {
      System.out.println("Error, el mes debe estar entre 1-12.");
    } 
  }
}