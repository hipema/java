package ejerciciosSecuenciales;

/*
12 Ejercicios secuenciales en Java

Programa:
Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos 
puntos en el plano. Calcula y muestra la distancia entre ellos.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    * x1 (double)
    * x2 (double)
    * y1 (double)
    * y2 (double)
   
ALGORITMO
    - LEER x1, x2, y1, y2
    - Cálculos
        * distancia = raiz cuardada de ((x2-x1)**2 + (y2-y1)**2))
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio12DistranciaEntrePuntos {
  public static void main(String[] args) {
    double x1;
    double x2;
    double y1;
    double y2;
    double distancia;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la distancia entre dos puntos dados.");
    System.out.print("Introduce el valor X del primer punto: ");
    x1 = Double.parseDouble (System.console().readLine());
    System.out.print("Introduce el valor Y del primer punto: ");
    y1 = Double.parseDouble (System.console().readLine());
    System.out.print ("Introduce el valor X del segundo punto: ");
    x2 = Double.parseDouble (System.console().readLine());
    System.out.print ("Introduce el valor Y del segundo punto: ");
    y2 = Double.parseDouble (System.console().readLine());
    
// Realizamos Cálculos 

    distancia = Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2));

// Mostramos en pantalla
    System.out.println("La distancia entre ambos puntos es " +distancia);
    
  }
}
