package ejerciciosSecuenciales;

import java.util.Scanner;

/**
06 Ejercicios secuenciales en Java

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio06Media {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double numero1;
    double numero2;
    double numero3;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la media de tres números introducidos");
    System.out.print("Indica el primer número: ");
      numero1 = scanner.nextDouble();
    System.out.print("Indica el segundo número: ");
      numero2 = scanner.nextDouble();
    System.out.print("Indica el tercer número: ");
      numero3 = scanner.nextDouble();

// Realizamos Cálculos y mostramos en pantalla
    System.out.println("La media entre "+numero1 + ", "+ numero2 + " y " + numero3 + " es " + ((numero1 + numero2 + numero3)/3));
    
  }
}
