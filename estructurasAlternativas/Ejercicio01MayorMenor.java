package estructurasAlternativas;

import java.util.Scanner;

/**
01 Ejercicios Estructuras Alternativas en Java

Programa que pide dos números e indica el mayor de ellos o si
son iguales.

@author: manolohidalgo_
@date: 07-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio01MayorMenor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numero1;
    int numero2;

// Solicitud de datos al usuario
    System.out.println("Este programa pide dos números y calcula cual es mayor.");
    System.out.print("Introduce el primer número: ");
    numero1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    numero2 = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if (numero1 > numero2){
        System.out.println("El primer número, " +numero1 + ", es mayor que el número dos," +numero2);
    }else if (numero1 < numero2){
        System.out.println("El segundo número, " +numero2 + ", es mayor que el primer número " +numero1);
    }else {
        System.out.println("Ambos números son iguales, " +numero1);
    }    
  }
}
