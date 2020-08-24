package ejerciciosSecuenciales;

import java.util.Scanner;

/**
11 Ejercicios secuenciales en Java

Pide al usuario dos números y muestra la "distancia" entre ellos (el valor
absoluto de su diferencia, de modo que el resultado sea siempre positivo)

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio11DistanciaEntreNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numero1;
    int numero2;
    int distancia;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la distancia entre dos números dados.");
    System.out.print("Introduce el primer número: ");
    numero1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    numero2 = scanner.nextInt();
    
// Realizamos Cálculos 

    distancia = Math.abs (numero1 - numero2);

// Mostramos en pantalla
    System.out.println("La distancia entre ambos números es " +distancia);
    
  }
}
