package estructurasRepetitivas;

/*
11 Ejercicios Estructuras Repetitivas en Java

Programa:
Suponiendo que hemos introducido una cadena por teclado que
representa una frase (palabras separadas por espacios), realiza
un programa que cuente cuantas palabras tiene.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    contador (int)
    cadena (string)
    i (int)
    c (char)

ALGORITMO
    LEER cadena
    Función "for in" para recorrer la cadena:
      for i in cadena:
        Si i == " " --> contador +1
    MOSTRAR contador
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej11CuentaPalabras {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int contador =1;
    String cadena;
    int i;
    char c;

// Inicio del programa, explicación al usuario
    System.out.println("Introduce una cadena y te cuenta el número de palabras.");
// Pedimos datos al usuario
      System.out.print("Introduce la cadena que desees: ");
      cadena = s.nextLine();
// Recorremos la cadena y realizamos cálculos
      for (i = 0; i <cadena.length (); i+=1) { 
        c = cadena.charAt (i); 
        if (c == ' '){
          contador +=1;
        }
      }
// Mostramos resultado
      System.out.println("Tiene " +contador+" palabras.");
  }
}