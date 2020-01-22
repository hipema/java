package estructurasAlternativas;

/**
15 Ejercicios Estructuras Alternativas en Java

Programa:
El director de una escuela está organizando un viaje de estudios, y requiere determinar
cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de
65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos
de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
pagar cada alumno por el viaje.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    *   alumnos (int)
    *   precio (double)

ALGORITMO
    - LEER tipo, precio, tamano, cantidad
    - Cálculos
        #   Realizamos comparaciones
        # Si alumnos < 30
            # precio = 4000
            # 30 a 49 -> 95 por alumno
            # 50 a 99 -> 70 por alumno
            # >= 100 -> 65 por alumno
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio15ViajeEstudios {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alumnos;
    double precio;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el precio a pagar por alumno en el viaje fin de curso, según la cantidad que se apunte.:");
    System.out.print("Número de alumnos: ");
    alumnos = s.nextInt();

// Realizamos Cálculos y mostramos en pantalla
    if (alumnos < 30){
        System.out.println("El coste del autobús es de 4000 euros y cada alumno debe pagar " + (4000/alumnos) + " euros.");
    } else if (alumnos >= 30 && alumnos <= 49){
        System.out.println("El pago a la agencia es de " + alumnos*95 + " euros y cada alumno debe pagar 95 euros");
    } else if (alumnos >= 50 && alumnos <=99){
        System.out.println("El pago a la agencia es de " + alumnos*70 + " euros y cada alumno debe pagar 70 euros");
    } else {
        System.out.println("El pago a la agencia es de " + alumnos*65 + " euros y cada alumno debe pagar 65 euros");
    }
  }
}