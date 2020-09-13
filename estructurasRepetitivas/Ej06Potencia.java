package estructurasRepetitivas;

/**
06 Ejercicios Estructuras Repetitivas en Java

Programa:
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

@author: manolohidalgo_
@date: 11-11-19

Variables a utilizar:
    base (double)
    exponente (int)
    i (int)
    resultado (double)

ALGORITMO
    LEER base, exponente
    Crear "do-while" para hasta que el exponente sea positivo.
    Realizar ciclo for multiplicando base * base tantas veces como indique el exponente.
    MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej06Potencia {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double base;
    int exponente;
    double resultado;

    // Inicio del programa, explicación al usuario
    System.out.println("El programa solicitará un número real como base y el exponente "
        + "(entero positivo) para calcular una potencia.");
    // Pedimos datos al usuario
    System.out.print("Introduce la base de la potencia: ");
    base = scanner.nextDouble();
    do {
      System.out.print("Introduce el exponente (entero positivo) de la potencia: ");
      exponente = scanner.nextInt();
      if (exponente <= 0) {
        System.out.println("Error, el exponente debe ser un entero positivo.");
      }
    } while (exponente <= 0);
    resultado = base;
    // Realizamos bucle para repetir la multiplicación de la base consigo misma hasta obtener el resultado de la potencia.
    for (int i=1; i<exponente;i++){
      resultado = (resultado*base);
    }
    // Mostramos el resultado
    System.out.println("El resultado de la potencia es " + resultado);
  }
}
