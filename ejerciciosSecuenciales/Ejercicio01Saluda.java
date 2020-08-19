package ejerciciosSecuenciales;

/**
01 Ejercicios secuenciales en Java

Este programa solicita un nombre al usuario y a continuación lo saluda.
@author: manolohidalgo_
@date: 04-11-19
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