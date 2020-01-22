package ejerciciosSecuenciales;

/*
11 Ejercicios secuenciales en Java

Programa:
Pide al usuario dos números y muestra la "distancia" entre ellos (el valor
absoluto de su diferencia, de modo que el resultado sea siempre positivo)

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    * numero1 (double)
    * numero2 (double)
    * distancia (double)
   
ALGORITMO
    - LEER numero1, numero2
    - Cálculos
        * distancia = absoluto (numero1 - numero2)
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio11DistanciaEntreNumeros {
  public static void main(String[] args) {
    double numero1;
    double numero2;
    double distancia;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la distancia entre dos números dados.");
    System.out.print("Introduce el primer número: ");
    numero1 = Double.parseDouble (System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    numero2 = Double.parseDouble (System.console().readLine());
    
// Realizamos Cálculos 

    distancia = Math.abs (numero1 - numero2);

// Mostramos en pantalla
    System.out.println("La distancia entre ambos números es " +distancia);
    
  }
}
