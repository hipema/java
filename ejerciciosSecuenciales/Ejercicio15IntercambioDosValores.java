package ejerciciosSecuenciales;

/*
15 Ejercicios secuenciales en Java

Programa:
Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide
realizar un algoritmo que intercambie los valores de ambas variables y
muestre cuanto valen al final las dos variables.

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * valorA (long)
    * valorB (long)
    * valorC (long)
   
ALGORITMO
    - LEER valorA, valorB
    - Cálculos
        * valorC = valorA
        * valorA = valorB
        * valorB = valorC
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio15IntercambioDosValores {
  public static void main(String[] args) {
    long valorA;
    long valorB;
    long valorC;

// Solicitud de datos al usuario
    System.out.println("Este programa pide dos valores e intercambia el valor entre ambas variables.");
    System.out.print("Introduce el valor A: ");
    valorA = Long.parseLong(System.console().readLine());
    System.out.print("Introduce el valor B: ");
    valorB = Long.parseLong(System.console().readLine());
    
    
// Realizamos Cálculos 
    valorC = valorA;
    valorA = valorB;
    valorB = valorC;

// Mostramos en pantalla
    System.out.println("Tras el cambio, valor A= "+valorA + " y valor B = "+valorB);
    
  }
}
