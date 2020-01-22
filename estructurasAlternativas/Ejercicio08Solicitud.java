package estructurasAlternativas;

/*
08 Ejercicios Estructuras Alternativas en Java

Programa:
Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    * nota (long)
    * edad (long)
    * sexo (string)
ALGORITMO
    - LEER nota, edad, sexo
    - Cálculos
        *   Comparar si nota >= 5   edad    >= 18   sexo = M --> ACEPTADA
        *   Comparar si nota >= 5   edad    >= 18   sexo = F --> POSIBLE
        *   Si no --> NO ACEPTADA
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio08Solicitud {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long nota;
    long edad;
    String sexo;

// Solicitud de datos al usuario
    System.out.println("Este programa nos calcula la aceptación de una solicitud en base a los siguientes parámetros:");
    System.out.print("Edad: ");
    edad = s.nextInt();
    System.out.print("Nota: ");
    nota = s.nextInt(); s.nextLine();
    System.out.print("Sexo (M o F): ");
    sexo = s.nextLine();
    
// Realizamos Cálculos y mostramos en pantalla
    if ((nota > 5) && (edad > 18) && (sexo.compareTo("M") == 0)) {
      System.out.println("POSIBLE");
    }else if ((nota > 5) && (edad > 18) && (sexo.compareTo("F") == 0)) {
       System.out.println("ACEPTADA");
    }else {
        System.out.println("NO ACEPTADA");
    }
    }
  }