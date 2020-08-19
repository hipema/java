package ejerciciosSecuenciales;

import java.util.Scanner;

/**
07 Ejercicios secuenciales en Java

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio07ConvertirMinutos {
  public static void main(String[] args) {
  	Scanner scanner = new Scanner(System.in);
  	int minutos;
  	int horas;
  	int minutos2;

  	// Solicitud de datos al usuario
    System.out.println("Este programa calcula en horas y minutos una cantidad de minutos indicada.");
    System.out.print("Indica la cantidad de minutos: ");
    minutos = scanner.nextInt();

    // Realizamos Cálculos 

    horas = minutos / 60;
    minutos2 = minutos % 60;

    // Mostramos en pantalla
    System.out.println("El resultado es "+horas + " horas y "+ minutos2 + " minutos.");
    
  }
}
