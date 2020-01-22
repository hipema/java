package estructurasRepetitivas;

/*
10 Ejercicios Estructuras Repetitivas en Java

Programa:
Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    contador (int)
    cadena (string)
    caracter (string)
    i (int)

ALGORITMO
    LEER cadena, caracter
    Función "for in" para recorrer la cadena:
    for i in cadena:
        Si i == caracter --> contador +1
    MOSTRAR contador
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej10BuscaCaracter {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int contador =0;
    String cadena;
    char caracter;
    int i;
    char c;

// Inicio del programa, explicación al usuario
    System.out.println("Introduce una cadena y un carácter, te mostraremos cuantas veces aparece en la misma.");
// Pedimos datos al usuario
      System.out.print("Introduce la cadena que desees: ");
      cadena = s.nextLine();
      System.out.print("Introduce el carácter que desees buscar: ");
      caracter = s.next().charAt(0);
// Recorremos la cadena y realizamos cálculos
      for (i = 0; i < cadena.length (); i+=1) { 
        c = cadena.charAt (i); 
        if (c == caracter){
          contador +=1;
        }
      }
// Mostramos resultado
      System.out.println("El carácter " +caracter+" aparece "+ contador + "veces.");
  }
}