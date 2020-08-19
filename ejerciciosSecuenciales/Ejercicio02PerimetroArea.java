package ejerciciosSecuenciales;

import java.util.Scanner;

/**
02 Ejercicios secuenciales en Java

Calcula el perí­metro y área de un rectángulo dada su base y su altura.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio02PerimetroArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double base;
    double altura;
    double area;
    double perimetro;

// Solicitud de datos al usuario
    System.out.println("Programa que calcula el area y perimetro de un rectangulo, dada su base y altura: ");
    System.out.print("Dame el valor de la \"base\" del rectángulo: ");
      base = scanner.nextDouble();

    System.out.print("Dame el valor de la \"altura\" del rectángulo: ");
      altura = scanner.nextDouble();

// Realizamos Cálculos
    area = base * altura;
    perimetro = 2 * (base + altura);

// Mostramos resultados en pantalla
    System.out.println("El área de este rectángulo es " +area);
    System.out.println("El perímetro de este rectángulo es " + perimetro);

  }
}