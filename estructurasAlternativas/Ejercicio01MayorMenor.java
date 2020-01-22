package estructurasAlternativas;

/*
01 Ejercicios Estructuras Alternativas en Java

Programa:
Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.

Autor: Manuel Hidalgo Pérez
Fecha: 07-11-19

Variables a utilizar:
    * numero1 (double)
    * numero2 (double)
ALGORITMO
    - LEER numero1, numero2
    - Cálculos
    *   si numero1 > numero2
        si numero1 < numero2
        si numero1 = numero2        
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio01MayorMenor {
  public static void main(String[] args) {
    double numero1;
    double numero2;

// Solicitud de datos al usuario
    System.out.println("Este programa pide dos números y calcula cual es mayor.");
    System.out.print("Introduce el primer número: ");
    numero1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    numero2 = Long.parseLong(System.console().readLine());
    
// Realizamos Cálculos y mostramos en pantalla
    if (numero1 > numero2){
        System.out.println("El primer número, " +numero1 + " es mayor que el número dos," +numero2);
    }else if (numero1 < numero2){
        System.out.println("El segundo número, " +numero2 + " es mayor que el priner número " +numero1);
    }else {
        System.out.println("El primer número, "+numero1 + " es igual que el segundo número, " +numero2);
    }    
  }
}
