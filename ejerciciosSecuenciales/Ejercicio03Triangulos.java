package ejerciciosSecuenciales;

import java.util.Scanner;

/**
03 Ejercicios secuenciales en Java

Calcula la hipotenusa de un triángulo rectángulo conociendo sus catetos.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio03Triangulos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double base;
    double altura;
    double hipotenusa;

// Solicitud de datos al usuario
    System.out.println("Programa que calcula el area y perimetro de un rectangulo, dada su base y altura: ");
    System.out.print("Dame el valor de la \"base\" del rectángulo: ");
      base = scanner.nextDouble();

    System.out.print("Dame el valor de la \"altura\" del rectángulo: ");
      altura = scanner.nextDouble();

// Realizamos Cálculos
      hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

// Mostramos resultados en pantalla
    System.out.println("El área de este rectángulo es " +hipotenusa);

  }
}
