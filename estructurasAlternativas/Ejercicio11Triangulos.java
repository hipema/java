package estructurasAlternativas;

/**
11 Ejercicios Estructuras Alternativas en Java

Programa:
Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
    - Si se cumple Pitágoras entonces es triángulo rectángulo
    - Si sólo dos lados del triángulo son iguales entonces es isósceles.
    - Si los 3 lados son iguales entonces es equilátero.
    - Si no se cumple ninguna de las condiciones anteriores, es escaleno.

@author: manolohidalgo_
@date: 09-11-19
*/

import java.util.Scanner;

// Inicio del programa y declaración de variables:
public class Ejercicio11Triangulos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int ladoA;
    int ladoB;
    int ladoC;
    boolean rectangulo = false;

// Solicitud de datos al usuario
    System.out.println("Este programa muestra la clasificación de un triángulo:");
    System.out.print("Introduce el valor del lado A: ");
    ladoA = scanner.nextInt();
    System.out.print("Introduce el valor del lado B: ");
    ladoB = scanner.nextInt();
    System.out.print("Introduce el valor del lado C: ");
    ladoC = scanner.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    // Para calcular el Teorema de Pitágoras debemos hallar en primer lugar la hipotenusa.
    // Una vez sabemos cual es el lado más largo, comprobamos Pitágoras, si se cumple
    // el valor de rectángulo pasa a true.
    if (ladoA > ladoB && ladoA > ladoC) {
      if ((Math.pow(ladoA,2)) == (Math.pow(ladoB,2)) + (Math.pow(ladoC,2))) {
        rectangulo = true;
      } 
    } else if (ladoB > ladoA && ladoB > ladoC) {
      if ((Math.pow(ladoB,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoC,2))) {
        rectangulo = true;
      } 
    } else if (ladoC > ladoA && ladoC > ladoB) {
      if ((Math.pow(ladoC,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoB,2))) {
        rectangulo = true;
      } 
    }
    
    // Una vez sabemos si es rectángulo, continuamos con el resto de comprobaciones.
    // Dos lados iguales
    if ((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB)
        || (ladoB == ladoC && ladoB != ladoA)) {
      if (rectangulo) {
        System.out.println("Es un triángulo rectángulo e isósceles.");
      } else {
        System.out.println("Es un triángulo isósceles.");
      }
    // Tres lados iguales
    }else if (ladoA == ladoB && ladoB == ladoC) {
      if (rectangulo) {
        System.out.println("Es un triángulo rectángulo y equilátero.");
      } else {
        System.out.println("Es un triángulo equilátero.");
      }
    }else {
      if (rectangulo) {
        System.out.println("Es un triángulo rectángulo y escaleno.");
      } else {
        System.out.println("Es un triángulo escaleno.");
      }
    } 
    }
  }