package ejerciciosSecuenciales;

import java.util.Scanner;

/**
04 Ejercicios secuenciales en Java

Recibe dos números y muestra el resultado de la suma, resta, división y multiplicación de ambos.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio04SumaRestaMultiplicacionDivision {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double numero1;
    double numero2;

// Solicitud de datos al usuario
    System.out.println("Escribe dos números para obtener el resultado de su suma, resta, multiplicación y división");
    System.out.print("Dame el valor del primer número: ");
      numero1 = scanner.nextDouble();

    System.out.print("Dame el valor del segundo número: ");
      numero2 = scanner.nextDouble();

// Realizamos Cálculos y mostramos en pantalla
    System.out.println("La suma de estos números es " + (numero1 + numero2));
    System.out.println("La resta de estos números es " + (numero1 - numero2));
    System.out.println("La multiplicación de estos números es " + (numero1 * numero2));
    System.out.println("La división de estos números es " + (numero1 / numero2));

  }
}
