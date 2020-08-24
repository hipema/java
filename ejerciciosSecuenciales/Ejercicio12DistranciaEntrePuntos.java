package ejerciciosSecuenciales;

import java.util.Scanner;

/**
12 Ejercicios secuenciales en Java

Programa:
Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos 
puntos en el plano. Calcula y muestra la distancia entre ellos.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio12DistranciaEntrePuntos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int x1;
    int x2;
    int y1;
    int y2;
    double distancia;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la distancia entre dos puntos dados.");
    System.out.print("Introduce el valor X del primer punto: ");
    x1 = scanner.nextInt();
    System.out.print("Introduce el valor Y del primer punto: ");
    y1 = scanner.nextInt();
    System.out.print ("Introduce el valor X del segundo punto: ");
    x2 = scanner.nextInt();
    System.out.print ("Introduce el valor Y del segundo punto: ");
    y2 = scanner.nextInt();
    
// Realizamos Cálculos 

    distancia = Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2));

// Mostramos en pantalla
    System.out.println("La distancia entre ambos puntos es " +distancia);
    
  }
}
