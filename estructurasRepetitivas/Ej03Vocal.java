package estructurasRepetitivas;

/*
03 Ejercicios Estructuras Repetitivas en Java

Programa:
Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
contrario, el programa termina cuando se introduce un espacio.

Autor: Manuel Hidalgo Pérez
Fecha: 10-11-19

Variables a utilizar:
    caracteres (string)
    longitud (int)

ALGORITMO
    - LEER caracteres
    - Cálculos
        COMPROBAR si ESPACIO --> FIN
            Si no:
            Vocales
            No vocales
            Reiniciar programa
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej03Vocal {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String caracteres;
    int longitud;
    int contador;
    char c;
    int vocal = 2;

// Solicitud de datos al usuario
    System.out.println("El programa analizará si los carácteres son vocales o no.");
    System.out.print("Introduce los carácteres a analizar, en caso de querer terminar el programa, introduce un espacio: ");
    caracteres = s.nextLine();

    while (caracteres.compareTo(" ") != 0){
      longitud = caracteres.length();
      for (contador=0;(contador < longitud);contador=contador+1){
        c = caracteres.charAt (contador);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          vocal = 0;
        } else {
          vocal =1;
          caracteres = " ";
          break;
        }
      }
      if (vocal == 0){
        System.out.println("Los carácteres son VOCALES.");
       } else {
         System.out.println("Los carácteres no son VOCALES");
       }
      System.out.print("Introduce nuevos carácteres a analizar, en caso de querer terminar el programa, introduce un espacio: ");
      caracteres = s.nextLine();  
      /*if (caracteres == " "){
        vocal = 2;
      } */
     }
    System.out.println("FIN DEL PROGRAMA");
  }
}