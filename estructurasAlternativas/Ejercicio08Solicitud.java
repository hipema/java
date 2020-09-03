package estructurasAlternativas;

/**
08 Ejercicios Estructuras Alternativas en Java

Programa:
Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

@author: manolohidalgo_
@date: 09-11-19
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio08Solicitud {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nota;
    int edad;
    String sexo;

// Solicitud de datos al usuario
    System.out.println("Este programa nos calcula la aceptación de una solicitud"
        + " en base a los siguientes parámetros:");
    System.out.print("Edad: ");
    edad = scanner.nextInt();
    System.out.print("Nota: ");
    nota = scanner.nextInt(); scanner.nextLine();
    System.out.print("Sexo (M o F): ");
    sexo = scanner.nextLine();
    
// Realizamos Cálculos y mostramos en pantalla
    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
      System.out.println("El valor de sexo introducido es incorrecto.\n"
          + "por favor, reenvíe el formulario.");
    } else if ((nota > 5) && (edad > 18) && (sexo.toUpperCase().equals("M"))) {
      System.out.println("POSIBLE");
    }else if ((nota > 5) && (edad > 18) && (sexo.toUpperCase().equals("F"))) {
       System.out.println("ACEPTADA");
    }else {
        System.out.println("NO ACEPTADA");
    }
    }
  }