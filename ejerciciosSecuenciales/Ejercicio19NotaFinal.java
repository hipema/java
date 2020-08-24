package ejerciciosSecuenciales;

import java.util.Scanner;

/**
19 Ejercicios secuenciales en Java

Programa que calcula la nota final de un estudiante,
considerando que por cada respuesta correcta suma 5 puntos,
por una incorrecta resta 1 y por respuestas en blanco 0. 

@author: manolohidalgo_
@date: 02-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio19NotaFinal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int notaFinal;
    int correctas;
    int incorrectas;
    int noContestadas;
    int notaMaxima;
    double notaSobre10;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la nota final de un alumno considerando que cada respuesta correcta suma 5 puntos, cada incorrecta resta un punto, y las no contestadas no se valoran.");
    System.out.print("Total de preguntas correctas: ");
    correctas = scanner.nextInt();
    System.out.print("Total de preguntas incorrectas: ");
    incorrectas = scanner.nextInt();
    System.out.print ("Total de preguntas no contestadas: ");
    noContestadas = scanner.nextInt();
    
// Realizamos Cálculos 
    notaMaxima = (correctas + incorrectas + noContestadas) * 5;
    notaFinal = (correctas*5) + (incorrectas*(-1));
// Importante realizar el casting a una de las dos variables en el momento de la división
// si no se realiza, el resultado que devolvería sería un int.
    notaSobre10 = (double)(notaFinal*10) / notaMaxima;
    
// Mostramos en pantalla
    System.out.printf("La nota final es de: " + notaFinal + ", que se corresponde con un %5.2f sobre 10", notaSobre10);
    
  }
}