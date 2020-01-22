package ejerciciosSecuenciales;

/*
06 Ejercicios secuenciales en Java

Programa:
Calcular la media de tres números pedidos por teclado.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    - numero1 (double)
    - numero2 (double)
    - numero3 (double)

ALGORITMO
    - LEER numero1, numero2, numero3
    - Cálculos
        - numero1 + numero2 + numero3) / 3
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio06Media {
  public static void main(String[] args) {
    double numero1;
    double numero2;
    double numero3;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la media de tres números introducidos");
    System.out.print("Indica el primer número: ");
      numero1 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica el segundo número: ");
      numero2 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica el tercer número: ");
      numero3 = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos y mostramos en pantalla
    System.out.println("La media entre "+numero1 + ", "+ numero2 + "y " + numero3 + " es " + ((numero1 + numero2 + numero3)/3));
    
  }
}
