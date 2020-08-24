package ejerciciosSecuenciales;

import java.util.Scanner;

/**
13 Ejercicios secuenciales en Java

Lee un número por teclado y calcula su raíz cuadrada y cúbica.

@author: manolohidalgo_
@date: 02-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio13RaizCuadradaCubica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double numero;
    double raiz2;
    double raiz3;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la raiz cuadrada y cúbica de un número.");
    System.out.print("Introduce el valor del número: ");
    numero = scanner.nextDouble();
    
// Realizamos Cálculos 
    raiz2 = Math.sqrt (numero);
    raiz3 = Math.pow (numero,1.0/3.0);

// Mostramos en pantalla
    System.out.println("La raiz cuadrada de "+numero + " es " + raiz2);
    System.out.println("La raiz cúbica de "+numero + " es " + raiz3);
    
  }
}
