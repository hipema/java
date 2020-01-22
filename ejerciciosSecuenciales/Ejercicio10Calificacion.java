package ejerciciosSecuenciales;

/*
10 Ejercicios secuenciales en Java

Programa:
Un alumno desea saber cual será su calificación final en la materia de Algoritmos.
* Dicha calificación se compone de los siguientes porcentajes:

* 55% del promedio de sus tres calificaciones parciales.
* 30% de la calificación del examen final.
* 15% de la calificación de un trabajo final.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    * parcial1 (double)
    * parcial2 (double)
    * parcial3 (double)
    * parciales (double)
    * examen (double)
    * trabajo (double)
    * nota (double)
    
ALGORITMO
    - LEER parcial1, parcial2, parcial3, examen, trabajo
    - Cálculos
        * parciales = (parcial1 + parcial2 + parcial3) /3
        * nota = parciales * 0.55 + examen * 0.3 + trabajo * 0.15
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio10Calificacion {
  public static void main(String[] args) {
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
    parcial1 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica la nota del segundo parcial: ");
    parcial2 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica la nota del tercer parcial: ");
    parcial3 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica la nota del exámen: ");
    examen = Double.parseDouble (System.console().readLine());
    System.out.print("Indica la nota del trabajo final: ");
    trabajo = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos 
    parciales = (parcial1 + parcial2 + parcial3) /3;
    nota = parciales * 0.55 + examen * 0.3 + trabajo * 0.15;

// Mostramos en pantalla
    System.out.println("La nota final es de " +nota);
    
  }
}
