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

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    * x1 (int)
    * x2 (int)
    * y1 (int)
    * y2 (int)
    * r1 (int)
    * r2 (int)
ALGORITMO
    - LEER x1, x2, y1, y2, r1, r2
    - Cálculos
        *   Debemos saber
            * exteriores (distancia > r1+r2)
            * tangentes exteriores (distancia = r1+r2)
            * secantes (distancia < (r1+r2) and > abs (r1-r2))
            * tangentes interiores (distancia = r1-r2)
            * interiores (distancia > 0 and distancia < abs (r1-r2)
            * concéntricas (distancia = 0)
            * distancia entre dos circunferencias es: raiz cuadrada de ((x2-x1)**2+(y2-y1)**2)
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio10Circunferencias {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x1;
    int x2;
    int y1;
    int y2;
    int r1;
    int r2;
    double distancia;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula como son dos circunferencias entre sí, conociendo sus centros y radios:");
    System.out.print("Introduce el valor \"x\" de la primera circunferencia: ");
    x1 = s.nextInt();
    System.out.print("Introduce el valor \"y\" de la primera circunferencia: ");
    y1 = s.nextInt();
    System.out.print("Introduce el radio de la primera circunferencia: ");
    r1 = s.nextInt();
    System.out.print("Introduce el valor \"x\" de la segunda circunferencia: ");
    x2 = s.nextInt();
    System.out.print("Introduce el valor \"y\" de la segunda circunferencia: ");
    y2 = s.nextInt();
    System.out.print("Introduce el radio de la segunda circunferencia: ");
    r2 = s.nextInt();
    
// Realizamos Cálculos de la distancia entre ambas circunferencias
    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

    // Hacemos comparaciones y mostramos en pantalla.
    if (distancia > (r1+r2)) {
      System.out.println("Exteriores");
    }else if (distancia == (r1+r2)){
      System.out.println("Tangentes exteriores");
    }else if (distancia < (r1+r2) && distancia > (r1-r2)) {
      System.out.println("Secantes");
    }else if (distancia == (r1-r2)){
      System.out.println("Tangentes interiores");
    }else if (distancia > 0 && distancia < (r1-r2)){
      System.out.println("Interiores");
    }else {
      System.out.println("Concéntricas");
    }
    }
  }