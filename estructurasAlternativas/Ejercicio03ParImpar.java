package estructurasAlternativas;

/*
03 Ejercicios Estructuras Alternativas en Java

Programa:
Escribe un programa que lea un número e indique si es par o impar.

Autor: Manuel Hidalgo Pérez
Fecha: 07-11-19

Variables a utilizar:
    * numero (long)
ALGORITMO
    - LEER numero
    - Cálculos
    *   si numero / 2 --> resto = 0, es par.        
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio03ParImpar {
  public static void main(String[] args) {
    long numero;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula si un número es par o impar.");
    System.out.print("Introduce el número: ");
    numero = Long.parseLong(System.console().readLine());
    
// Realizamos Cálculos y mostramos en pantalla
    if ((double)numero % 2 == 0){
        System.out.println("El número, " +numero + " es par.");
    }else {
        System.out.println("El número " +numero + " es impar.");
    }  
  }
}
