package estructurasAlternativas;

/**
10 Ejercicios Estructuras Alternativas en Java

Programa:
Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:

- exteriores
- tangentes exteriores
- secantes
- tangentes interiores
- interiores
- concéntricas

@author: manolohidalgo_
@date: 09-11-19
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio10Circunferencias {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x1;
    int x2;
    int y1;
    int y2;
    int r1;
    int r2;
    double distancia;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula como son dos circunferencias entre sí, "
        + "conociendo sus centros y radios:");
    System.out.print("Introduce el valor \"x\" de la primera circunferencia: ");
    x1 = scanner.nextInt();
    System.out.print("Introduce el valor \"y\" de la primera circunferencia: ");
    y1 = scanner.nextInt();
    System.out.print("Introduce el radio de la primera circunferencia: ");
    r1 = scanner.nextInt();
    System.out.print("Introduce el valor \"x\" de la segunda circunferencia: ");
    x2 = scanner.nextInt();
    System.out.print("Introduce el valor \"y\" de la segunda circunferencia: ");
    y2 = scanner.nextInt();
    System.out.print("Introduce el radio de la segunda circunferencia: ");
    r2 = scanner.nextInt();
    
// Realizamos Cálculos de la distancia entre ambas circunferencias
    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

    // Hacemos comparaciones y mostramos en pantalla.
    if (distancia == 0) {
      System.out.println("Concéntricas.");
    } else if (distancia > (r1+r2)) {
      System.out.println("Exteriores.");
    } else if ((distancia > 0) && distancia < Math.abs(r1-r2)) {
      System.out.println("Interiores.");
    } else if (distancia == (r1+r2)) {
      System.out.println("Tangentes exteriores.");
    } else if (distancia == Math.abs(r1-r2)) {
      System.out.println("Tangentes interiores.");
    } else if (distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {
      System.out.println("Secantes.");
    }
    }
  }