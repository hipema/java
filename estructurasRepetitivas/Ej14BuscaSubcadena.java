package estructurasRepetitivas;

/*
14 Ejercicios Estructuras Repetitivas en Java

Programa:
Realizar un programa que compruebe si una cadena contiene una subcadena.
Las dos cadenas se introducen por teclado.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    cadena (string)
    subcadena (string)
    y (int)
    aux (int)
    x (int)

ALGORITMO
    LEER cadena
    Realizamos calculos
    MOSTRAR contador
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej14BuscaSubcadena {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String cadena;
    String subcadena;
    int y = 0;
    int aux = 0;
    int x = 0;

// Inicio del programa, explicación al usuario
    System.out.println("El programa comprueba si una cadena contiene una subcadena.");
// Pedimos datos al usuario
    System.out.print("Introduce la cadena que desees: ");
    cadena = s.nextLine();
    System.out.print("Introduce la subcadena a buscar: ");
    subcadena = s.nextLine();
// Comprobar si la cadena contiene a la subcadena y mostrar por pantalla:
    for (x =0; x < cadena.length(); x+=1){
      if (subcadena.length()== aux){
        System.out.println("La subcadena está dentro de la cadena.");
        break;
      } else if (cadena.charAt (x) == subcadena.charAt (y)){
        aux +=1;
        y +=1;
      } else{
        aux = 0;
        y =0;
      }
    }
    if (aux == 0){
      System.out.println("La subcadena no está dentro de la cadena.");
    }
  }
}