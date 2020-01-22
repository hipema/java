package estructurasRepetitivas;

/*
06 Ejercicios Estructuras Repetitivas en Java

Programa:
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

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
    Scanner s = new Scanner(System.in);
    double base;
    int exponente;
    int i;
    double resultado;

// Inicio del programa, explicación al usuario
    System.out.println("El programa solicitará un número real como base y el exponente (entero positivo) para calcular una potencia.");
// Pedimos datos al usuario
    System.out.print("Introduce la base de la potencia: ");
    base = s.nextDouble();
    do {
      System.out.print("Introduce el exponente (entero positivo) de la potencia: ");
      exponente = s.nextInt();
    } while (exponente <= 0);
    resultado = base;
// Realizamos bucle para repetir la multiplicación de la base consigo misma hasta obtener el resultado de la potencia.
    for (i=1; i<exponente;i+=1){
      resultado = (resultado*base);
    }
// Mostramos el resultado
    System.out.println("El resultado de la potencia es " + resultado);
  }
}
