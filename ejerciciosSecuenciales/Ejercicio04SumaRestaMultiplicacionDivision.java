package ejerciciosSecuenciales;

/*
04 Ejercicios secuenciales en Java

Programa:
Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    - numero1 (double)
    - numero2 (double)
    - suma (double)
    - resta (double)
    - multiplicacion (double)
    - division (double)

ALGORITMO
    - LEER numero1, numero2
    - Cálculos
        - suma = numero 1 + numero2
        - resta = numero 1 - numero2
        - multiplicacion = numero1 * numero2
        - division = numero1 / numero2 
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio04SumaRestaMultiplicacionDivision {
  public static void main(String[] args) {
    double numero1;
    double numero2;

// Solicitud de datos al usuario
    System.out.println("Escribe dos números para obtener el resultado de su suma, resta, multiplicación y división");
    System.out.print("Dame el valor del primer número: ");
      numero1 = Double.parseDouble (System.console().readLine());

    System.out.print("Dame el valor del segundo número: ");
      numero2 = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos y mostramos en pantalla
    System.out.println("La suma de estos números es " + (numero1 + numero2));
    System.out.println("La resta de estos números es " + (numero1 - numero2));
    System.out.println("La multiplicación de estos números es " + (numero1 * numero2));
    System.out.println("La división de estos números es " + (numero1 / numero2));

  }
}
