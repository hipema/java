package estructurasRepetitivas;

import java.util.Scanner;
/**
15 Ejercicios Estructuras Repetitivas en Java

Programa:
Introducir una cadena de caracteres e indicar si es un palíndromo.
Una palabra palíndroma es aquella que se lee igual adelante que atrás.

Variables a utilizar:
    cadena (string)
    cadena2 (string)
    x (int)
    pal (booleano)

ALGORITMO
    LEER cadena
    Realizamos calculos
    MOSTRAR contador

@author Manuel Hidalgo Pérez
@since 11-11-19
*/
public class Ej15Palindromo {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String cadena;
    int izquierda, derecha;
    boolean esPalindromo = true;
// Inicio del programa, explicación al usuario
    System.out.println("Introduce una cadena para comprobar si es palíndromo.");
// Pedimos datos al usuario
    System.out.print("Introduce la cadena que desees: ");
    cadena = scanner.nextLine();

    cadena = cadena.replaceAll(" ", "");
    cadena = cadena.replaceAll(".", "");
    cadena = cadena.replaceAll(",", "");
    cadena = cadena.replaceAll("á", "a");
    cadena = cadena.replaceAll("é", "e");
    cadena = cadena.replaceAll("í", "i");
    cadena = cadena.replaceAll("ó", "o");
    cadena = cadena.replaceAll("ú", "u");
    cadena = cadena.replaceAll("Á", "a");
    cadena = cadena.replaceAll("É", "e");
    cadena = cadena.replaceAll("Í", "i");
    cadena = cadena.replaceAll("Ó", "o");
    cadena = cadena.replaceAll("Ú", "u"); 

    cadena = cadena.toLowerCase(); 
    System.out.println(cadena);
    for (izquierda=0, derecha = cadena.length()-1; izquierda < derecha; izquierda++, derecha--){
      if (cadena.charAt(izquierda)!=cadena.charAt(derecha)){
        esPalindromo = false;
        break;
      }
    }

    if (esPalindromo){
      System.out.println("La cadena es un palíndromo.");
    } else {
      System.out.println("La cadena no es palíndromo.");
    }
  }
}