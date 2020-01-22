package estructurasAlternativas;

/**
18 Ejercicios Estringucturas Alternativas en Java

Programa:
Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
Si introducimos otro número nos da un error.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    #   dado (int)

ALGORITMO
    - LEER dado
    - Cálculos
       #   Realizamos cálculos de comparación y mostramos resultado
  
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio18MenuDiaSemana {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dia;

// Solicitud de datos al usuario
    System.out.println("El programa te devuelve el día de la semana seleccionando:");
    System.out.println("1.- Lunes.");
    System.out.println("2.- Martes.");
    System.out.println("3.- Miércoles.");
    System.out.println("4.- Jueves.");
    System.out.println("5.- Viernes.");
    System.out.println("6.- Sábado.");
    System.out.println("7.- Domingo.");
    dia = s.nextInt();

// Realizamos comparaciones y mostramos el resultado
    if (dia == 1){
      System.out.println("El día seleccionado es LUNES");
    } else if (dia ==2){
      System.out.println("El día seleccionado es MARTES");
    } else if (dia == 3){
      System.out.println("El día seleccionado es MIÉRCOLES");
    } else if (dia == 4){
      System.out.println("El día seleccionado es JUEVES");
    } else if (dia == 5){
      System.out.println("El día seleccionado es VIERNES");
    } else if (dia == 6){
      System.out.println("El día seleccionado es SÁBADO");
    } else if (dia == 7){
      System.out.println("El día seleccionado es DOMINGO");
    } else {
      System.out.println("ERROR: número incorrecto.");
    }
  }
}