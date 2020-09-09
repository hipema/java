package estructurasRepetitivas;

/**
01 Ejercicios Estructuras Repetitivas en Java

Programa:
Crea una aplicación que permita adivinar un número. La aplicación genera
un número aleatorio del 1 al 100. A continuación va pidiendo números y va
respondiendo si el número a adivinar es mayor o menor que el introducido,
a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos 
intentos lo has acertado), si se llega al limite de intentos te muestra el 
número que había generado.

@author: manolohidalgo_
@date: 09-11-19

Variables a utilizar:
    #   numero (int)
    #   intento (int)
    #   contador (int)

ALGORITMO
    - LEER mes
    - Cálculos
        Asignamos valor a numero de forma aleatoria - numero = random.randint (1,100)
    
        Pedir usuario que realice intentos

    -   MOSTRAR resultados mediante condicionales y ciclo while 
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class prueba {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int intento;
    int contador = 9;

// Solicitud de datos al usuario
    
    for (int i = 0; i <= 100; i++) {
      numero = (int) (Math.random()*50+51);
      System.out.println(numero);
      if (numero > 100) {
        System.out.println("Este se ha pasado");
      } else if (numero < 2) {
        System.out.println("menor que dos");
      }
    }
  }
}