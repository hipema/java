package ejerciciosSecuenciales;

import java.util.Scanner;

/*
07 Ejercicios secuenciales en Java

Programa:
Realiza un programa que reciba una cantidad de minutos y muestre por
pantalla a cuantas horas y minutos corresponde.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    - minutos (long)
    - horas (long)
    - minutos2 (long)
    
ALGORITMO
    - LEER minutos
    - Cálculos
        - horas = minutos / 60
        - minutos2 = minutos - (horas * 60)
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio07ConvertirMinutos {
  public static void main(String[] args) {
  	Scanner scanner = new Scanner(System.in);
  	long minutos;
    long horas;
    long minutos2;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula en horas y minutos una cantidad de minutos indicada.");
    System.out.print("Indica la cantidad de minutos: ");
      minutos = scanner.nextLong();

// Realizamos Cálculos 

horas = minutos / 60;
minutos2 = minutos - (horas *60);

// Mostramos en pantalla
    System.out.println("El resultado es "+horas + "horas y "+ minutos2 + "minutos.");
    
  }
}
