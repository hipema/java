package estructurasAlternativas;

/*
11 Ejercicios Estructuras Alternativas en Java

Programa:
Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
    - Si se cumple Pitágoras entonces es triángulo rectángulo
    - Si sólo dos lados del triángulo son iguales entonces es isósceles.
    - Si los 3 lados son iguales entonces es equilátero.
    - Si no se cumple ninguna de las condiciones anteriores, es escaleno.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    * ladoA (int)
    * ladoB (int)
    * ladoC (int)

ALGORITMO
    - LEER ladoA, ladoB, ladoC
    - Cálculos
        *   Realizamos las comparaciones según las indicaciones del encabezado.
            #   Si se cumple Pitágoras entonces es triángulo rectángulo (C**2 = A**2 + B**2)
                - Aún siendo rectángulo también podría ser de alguno de los siguientes tipos.
            #   Si sólo dos lados del triángulo son iguales entonces es isósceles. 
            #   Si los 3 lados son iguales entonces es equilátero. (C == A == B)
            #   Si no se cumple ninguna de las condiciones anteriores, es escaleno.
    - MOSTRAR resultado
*/

import java.util.Scanner;

// Inicio del programa y declaración de variables:
public class Ejercicio11Triangulos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int ladoA;
    int ladoB;
    int ladoC;

// Solicitud de datos al usuario
    System.out.println("Este programa muestra la clasificación de un triángulo:");
    System.out.print("Introduce el valor del lado A: ");
    ladoA = s.nextInt();
    System.out.print("Introduce el valor del lado B: ");
    ladoB = s.nextInt();
    System.out.print("Introduce el valor del lado C: ");
    ladoC = s.nextInt();
    
// Realizamos Cálculos y mostramos en pantalla
    if ((Math.pow(ladoC,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoB,2))) {
      System.out.println("Es un triángulo rectángulo.");
    }
    if ((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA)) {
      System.out.println("Es un triángulo Isósceles.");
    }else if (ladoA == ladoB && ladoB == ladoC) {
      System.out.println("Es un triángulo equilátero.");
    }else {
      System.out.println("Es un triángulo escaleno.");
    } 
    }
  }
/*
  if C**2 == (A**2 + B**2):
    print ("\nEs un triángulo rectángulo")
    
  if (A == B and A != C) or (A == C and A != B) or (B == C and B != A):
      print ("\nEs un triángulo Isósceles")
  elif A == B == C:
      print ("\nEs un triángulo Equilátero")
  else:
      print ("\nEs un triángulo Escaleno") */