package estructurasRepetitivas;

/*
13 Ejercicios Estructuras Repetitivas en Java

Programa:
Realizar un programa que lea una cadena por teclado y convierta
las mayúsculas a minúsculas y viceversa.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    cadena1 (string)
    cadena2 (string)
    pos (int)

ALGORITMO
    LEER cadena
    Realizamos calculos
    MOSTRAR contador
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej13ConvierteMayusculasMinusculas {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String cadena1;
    String cadena2 = " ";
    int pos;

// Inicio del programa, explicación al usuario
    System.out.println("Introduce una cadena con mayúsculas y minúsculas, el resultado te las invertirá.");
// Pedimos datos al usuario
    System.out.print("Introduce la cadena que desees: ");
    cadena1 = s.nextLine();
// Construir la nueva cadena en base a los carácteres:
// Falla el pasar a mayúsculas y minúsculas
    for (pos=0; pos < cadena1.length(); pos +=1){
      if (cadena1.charAt (pos) >= 'A' && cadena1.charAt (pos) <= 'Z' || cadena1.charAt (pos) >= 'Á' && cadena1.charAt (pos) <= 'Ú' || cadena1.charAt (pos) == 'Ñ'){
        cadena2 += Character.toLowerCase(cadena1.charAt(pos));
      } else if (cadena1.charAt (pos) >= 'a' && cadena1.charAt (pos) <= 'z' || cadena1.charAt (pos) >= 'á' && cadena1.charAt (pos) <= 'ú' || cadena1.charAt (pos) == 'ñ'){
        cadena2 += Character.toUpperCase(cadena1.charAt(pos));
      } else{
        cadena2 += " ";
      }
}
        
// Mostramos resultado
    System.out.println(cadena2);
// Mostramos resultado
      System.out.println("Cadena inicial: "+cadena1);
      System.out.println("Cadena final: "+cadena2);
  }
}