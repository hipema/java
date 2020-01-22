package estructurasRepetitivas;

/*
08 Ejercicios Estructuras Repetitivas en Java

Programa:
Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    totalSegundos (int)
    segundos (int)
    minutos (int)
    horas (int)
    i (int)

ALGORITMO
    LEER totalSegundos
    Función "for in" para realizar el recorrido en orden inverso range (0, totalsegundos, -1)
    horas = totalsegundos // 3600
    minutos = totalsegundos // 60 - (horas*3600)
    segundos = totalsegundos - (horas * 3600) - (minutos * 60)
    print (horas, minutos, segundos)
    sleep
    MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej08Cronometro {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int totalSegundos;
    int segundos;
    int minutos;
    int horas;
    int i;

// Inicio del programa, explicación al usuario
    System.out.println("Cuenta atrás de un tiempo indicado en segundos");
// Pedimos datos al usuario
    System.out.print("Indicanos el tiempo en segundos: ");
    totalSegundos = s.nextInt();
// Iniciamos el cilo para calcular el tiempo.   
    for (totalSegundos = totalSegundos; totalSegundos>0; totalSegundos-=1){
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e ) {
        }
      horas = totalSegundos / 3600;
      minutos = totalSegundos / 60 - (horas*60);
      segundos = totalSegundos - (horas*3600) - (minutos*60);
      System.out.println("Quedan " + horas+" horas, "+minutos+" minutos y "+ segundos +" segundos.");
    } 
  }
}