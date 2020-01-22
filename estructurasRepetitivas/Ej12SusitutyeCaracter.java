package estructurasRepetitivas;

/*
12 Ejercicios Estructuras Repetitivas en Java

Programa:
Pide una cadena y dos caracteres por teclado (valida que sea un carácter),
sustituye la aparición del primer carácter en la cadena por el segundo carácter.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    cadena (string)
    caracterA (char)
    caracterB (char)
    cadena2 (string)
    i (int)

ALGORITMO
    LEER cadena
    Función "for in" para recorrer la cadena:
      for i in cadena:
        Si i == " " --> contador +1
    MOSTRAR contador
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej12SusitutyeCaracter {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String cadena;
    String cadena2 = "";
    char caracterA;
    char caracterB;
    int i;
    char c;

// Inicio del programa, explicación al usuario
    System.out.println("Introduce una cadena y dos carácteres, después sustituirá el segundo caracter por el primero.");
// Pedimos datos al usuario
      System.out.print("Introduce la cadena que desees: ");
      cadena = s.nextLine();
      System.out.print("Introduce un carácter: ");
      caracterA = s.next().charAt(0);
      System.out.print("Introduce el segundo carácter: ");
      caracterB = s.next().charAt(0);

    for(i=0;i<cadena.length();i+=1) {
        if(cadena.charAt(i)==caracterA){
            cadena2 = (cadena2) + caracterB;
        }else{
            cadena2 = (cadena2) + cadena.charAt(i);
        }
    }
// Mostramos resultado
        System.out.println("Cadena inicial: "+cadena);
        System.out.println("Cadena final: "+cadena2);
  }
}