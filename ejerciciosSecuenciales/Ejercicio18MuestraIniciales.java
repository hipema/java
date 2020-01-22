package ejerciciosSecuenciales;

/*
18 Ejercicios secuenciales en Java

Programa:
Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * nombre (str)
    * apellido1 (str)
    * apellido2 (str)
    * iniciales (str)
   
ALGORITMO
    - LEER nombre, apellido1, apellido2
    - Cálculos
        
          
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio18MuestraIniciales {
  public static void main(String[] args) {
    String nombre;
    String apellido1;
    String apellido2;
    String iniciales;

// Solicitud de datos al usuario
    System.out.println("Este programa pide nombre y apellidos y después devuelve las iniciales.");
    System.out.print("Nombre: ");
    nombre = System.console().readLine();
    System.out.print("Primer apellido: ");
    apellido1 = System.console().readLine();
    System.out.print("Segundo apellido: ");
    apellido2 = System.console().readLine();

// Realizamos operaciones 
    iniciales = nombre.substring(0,1)+apellido1.substring(0,1)+apellido2.substring(0,1);

// Mostramos en pantalla
    System.out.println("Las iniciales son: " +iniciales);
    
  }
}
