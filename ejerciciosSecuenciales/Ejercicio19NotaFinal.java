package ejerciciosSecuenciales;

/*
19 Ejercicios secuenciales en Java

Programa:
Escribir un algoritmo para calcular la nota final de un estudiante,
considerando que por cada respuesta correcta 5 puntos, por una incorrecta
-1 y por respuestas en blanco 0. Imprime el resultado obtenido por el
estudiante.

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * notaFinal (long)
    * correctas (long)
    * incorrectas (long)
    * noContestadas (long)
    * notaMaxima (long)
    * notaSobre10 (long)
    
ALGORITMO
    - LEER correctas, incorrectas, noContestadas
    - Cálculos
    *   notaFinal = correctas *5 + incorrectas *(-1)
        
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio19NotaFinal {
  public static void main(String[] args) {
    long notaFinal;
    long correctas;
    long incorrectas;
    long noContestadas;
    long notaMaxima;
    long notaSobre10;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la nota final de un alumno considerando que cada respuesta correcta suma 5 puntos, cada incorrecta resta un punto, y las no contestadas no se valoran.");
    System.out.print("Total de preguntas correctas: ");
    correctas = Long.parseLong(System.console().readLine());
    System.out.print("Total de preguntas incorrectas: ");
    incorrectas = Long.parseLong(System.console().readLine());
    System.out.print ("Total de preguntas no contestadas: ");
    noContestadas = Long.parseLong(System.console().readLine());
    
// Realizamos Cálculos 
    notaMaxima = (correctas + incorrectas + noContestadas) * 5;
    notaFinal = (correctas*5) + (incorrectas*(-1));
    notaSobre10 = (notaFinal*10) / notaMaxima;
    
// Mostramos en pantalla
    System.out.println("La nota final es de: "+notaFinal + ", que se corresponde con un " + notaSobre10 + " sobre 10.");
    
  }
}