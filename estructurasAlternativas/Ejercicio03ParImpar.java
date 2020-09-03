package estructurasAlternativas;

import java.util.Scanner;

/**
03 Ejercicios Estructuras Alternativas en Java

Este programa lee un número e indica si es par o impar.

@author: manolohidalgo_
@date: 07-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio03ParImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numero;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula si un número es par o impar.");
    System.out.print("Introduce el número: ");
    numero = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (numero % 2 == 0){
        System.out.println("El número, " +numero + " es par.");
    }else {
        System.out.println("El número " +numero + " es impar.");
    }  
  }
}
