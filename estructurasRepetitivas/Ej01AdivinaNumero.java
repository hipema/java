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
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej01AdivinaNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroAleatorio;
    int intento;
    int contador = 10;

    // Obtención de número aleatorio
    numeroAleatorio = (int) (Math.random()*100+1);
    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. "
        + "Tienes 10 intentos.");
    System.out.println(numeroAleatorio);
    // Realización del ciclo do-while
    do {
      System.out.println("Número contador: " + contador);
      System.out.print("Introduce el número que creas posible: ");
      intento = scanner.nextInt();
      if (intento > numeroAleatorio) {
        System.out.println("El número que buscas es menor, te quedan "
            + (contador-1) + " intentos: ");
      } else if (intento < numeroAleatorio){
        System.out.println("El número que buscas es mayor, te quedan "
            + (contador-1) + " intentos: ");
      } else {
        System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que estabas "
            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
      }
      contador--;
    } while (intento != numeroAleatorio && contador > 0);
    if (contador == 0) {
      System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
    }
  }
}