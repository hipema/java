package ejerciciosSecuenciales;

/*
05 Ejercicios secuenciales en Java

Programa:
Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    - farenheit (double)
    - celsius (double)

ALGORITMO
    - LEER farenheit
    - Cálculos
        - celsius = (farenheit - 32) / 1.8
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio05ConvertirGrados {
  public static void main(String[] args) {
    double farenheit;
    double celsius;

// Solicitud de datos al usuario
    System.out.println("Este programa pasa de grados Farenheit a Celsius");
    System.out.print("Dame la temperatura en grados Farenheit: ");
      farenheit = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos
    celsius = (farenheit - 32) / 1.8;

// Mostramos en pantalla
    System.out.println(farenheit +" grados Farenheit son " +celsius + " grados celsius.");
    
  }
}
