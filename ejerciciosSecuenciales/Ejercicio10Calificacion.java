package ejerciciosSecuenciales;

import java.util.Scanner;

/**
10 Ejercicios secuenciales en Java

Calcula la calificación final de un alumno en la materia de Algoritmos.
* Dicha calificación se compone de los siguientes porcentajes:
* 55% del promedio de sus tres calificaciones parciales.
* 30% de la calificación del examen final.
* 15% de la calificación de un trabajo final.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio10Calificacion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double parcial1;
    double parcial2;
    double parcial3;
    double parciales;
    double examen;
    double trabajo;
    double nota;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la nota final de un alumno teniendo en cuenta "+
                        "que la nota se compone de un 55% del valor de los parciales, un 30% de la" +
                        "calificación del exámen final y otro 15% de la calificación del trabajo final.");
    System.out.print("Indica la nota del primer parcial: ");
    parcial1 = scanner.nextDouble();
    System.out.print("Indica la nota del segundo parcial: ");
    parcial2 = scanner.nextDouble();
    System.out.print("Indica la nota del tercer parcial: ");
    parcial3 = scanner.nextDouble();
    System.out.print("Indica la nota del exámen: ");
    examen = scanner.nextDouble();
    System.out.print("Indica la nota del trabajo final: ");
    trabajo = scanner.nextDouble();

// Realizamos Cálculos 
    parciales = (parcial1 + parcial2 + parcial3) /3;
    nota = parciales * 0.55 + examen * 0.3 + trabajo * 0.15;

// Mostramos en pantalla
    System.out.println("La nota final es de " +nota);
    
  }
}
