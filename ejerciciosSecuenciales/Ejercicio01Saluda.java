package ejerciciosSecuenciales;

/*
01 Ejercicios secuenciales en Java

Programa:
Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

Autor: Manuel Hidalgo Pérez
Fecha: 04-11-19

Variables a utilizar:
nombre (str)

ALGORITMO
    - LEER nombre
    - ESCRIBIR nombre
*/

// Inicio del programa y declaración de variables:

public class Ejercicio01Saluda {
  public static void main(String[] args) {
    String nombre;
    System.out.print("Dime tu nombre: ");
    nombre = System.console().readLine();
    System.out.println("Hola " + nombre);
  }
}