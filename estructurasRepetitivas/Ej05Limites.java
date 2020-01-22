package estructurasRepetitivas;

/*
05 Ejercicios Estructuras Repetitivas en Java

Programa:
Escribe un programa que pida el limite inferior y superior de un intervalo. 
Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 

A continuación se van introduciendo números hasta que introduzcamos el 0. 
Cuando termine el programa dará las siguientes informaciones:

- La suma de los números que están dentro del intervalo (intervalo abierto).
- Cuantos números están fuera del intervalo.
- Informa si hemos introducido algún número igual a los límites del intervalo.

Autor: Manuel Hidalgo Pérez
Fecha: 10-11-19

Variables a utilizar:
    inferior (int)
    superior (int)
    numero (int)
    suma (int)
    fueraIntervalo (int)
    coincidencia (int)

ALGORITMO
    LEER inferior, superior
    COMPROBAR inferior < superior
        Si es cierto continuamos al siguiente paso
        Si no es cierto, repetir lectura de números
    LEER numero
        Si numero != 0
            si numero >= inferior and numero <= superior --> suma = suma + numero
            si numero < inferior or numero > superior --> fuera_intervalo +=1
            si numero == inferior or numero == superior --> coincidencia +=1
        Si numero == 0
            Mostrar suma
            Mostrar fuera_intervalo
            Mostrar coincidencia
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej05Limites {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int inferior;
    int superior;
    int numero;
    int suma = 0;
    int fueraIntervalo = 0;
    int coincidencia = 0;

// Inicio del programa, explicación al usuario
    System.out.println("El programa solicitará un límite inferior y superior de intervalo.");
    System.out.println("Después pedirá la introducción de números a analizar, para finalizar de introducir números, pulsa 0");
    System.out.println("Mostrará la siguiente información: ");
    System.out.println("Suma de los números que están dentro del intervalo");
    System.out.println("Cuantos números están fuera del intervalo");
    System.out.println("Si se ha introducido alguno de los números que marcan los límites de los intervalos");
// Pedimos límites al usuario
    System.out.print("Introduce el límite inferior: ");
    inferior = s.nextInt();
    System.out.print("Introduce el límite superior: ");
    superior = s.nextInt();
// Comprobamos valores de los límites
    while (inferior > superior){
      System.out.print("Introduce el límite inferior: ");
      inferior = s.nextInt();
      System.out.print("Introduce el límite superior: ");
      superior = s.nextInt();
    }
// Pedimos al usuario insertar números
    System.out.print("Inserta el número que desees: ");
    numero = s.nextInt();
    while (numero != 0){
        if (numero >= inferior && numero < superior){
          suma = suma + numero;
          System.out.print("Inserta un nuevo valor: ");
          numero = s.nextInt();
        } else if (numero == superior){
          System.out.println("Inserta un nuevo valor: ");
          numero = s.nextInt();
        } else {
          fueraIntervalo +=1;
          System.out.print("Inserta un nuevo valor: ");
          numero = s.nextInt();
        }
        if (numero == inferior || numero == superior){
          coincidencia +=1;
          System.out.print("Inserta un nuevo valor: ");
          numero = s.nextInt();
        }
     }
// Al introducir 0, mostramos resultados
        System.out.println("El valor de la suma de los números introducidos en el rango " + inferior +"-" +superior +" es de " +suma);
        System.out.println("Se han introducido un total de " + fueraIntervalo + " números fuera del intervalo " + inferior+"-"+superior);
        if (coincidencia == 0){
          System.out.println("No se ha introducido ningún valor igual a los límites del intervalo");
        } else {
          System.out.println("Alguno de los valores introducidos ha coincidido con alguno de los límites del intervalo");
        }
  }
}