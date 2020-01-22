package estructurasRepetitivas;

/*
01 Ejercicios Estructuras Repetitivas en Java

Programa:
Crea una aplicación que permita adivinar un número. La aplicación genera
un número aleatorio del 1 al 100. A continuación va pidiendo números y va
respondiendo si el número a adivinar es mayor o menor que el introducido,
a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos 
intentos lo has acertado), si se llega al limite de intentos te muestra el 
número que había generado.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

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
public class Ej01AdivinaNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int intento;
    int contador = 9;

// Solicitud de datos al usuario
    numero = (int) (Math.random()*100+1);
    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. Tienes 10 intentos.");
    System.out.print("Introduce el número que creas posible: ");
    intento = s.nextInt();
    while (intento != numero && contador <= 10 && contador > 0){
      if (numero > intento){
        System.out.println("El número que buscas es mayor, te quedan " + contador + " intentos: ");
      } else {
        System.out.println("El número que buscas es menor, te quedan " +contador + " intentos: ");
      }
      System.out.print("Introduce un nuevo valor: ");
      intento = s.nextInt();
      contador = contador-1;
    }
    if (numero == intento){
      System.out.print("¡CORRECTO! "+ numero + " era el número que estabas buscando, has necesitado " + (10-contador) +" intentos.");
    } else {
      System.out.print("LO SENTIMOS, se han acabado todos los intentos, el número que estabas buscando era " + numero);
    }
  }
}