package estructurasAlternativas;

/*
17 Ejercicios Estringucturas Alternativas en Java

Programa:
Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar
un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la
cara opuesta al resultado obtenido.

Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el
mensaje: “ERROR: número incorrecto.”.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    #   dado (int)

ALGORITMO
    - LEER dado
    - Cálculos
       #   Realizamos cálculos de comparación y mostramos resultado
        # Si es 1 --> En la cara opuesta está el ""seis"".
        # Si es 2 --> En la cara opuesta está el ""cinco"".
        # Si es 3 --> En la cara opuesta está el ""cuatro"".
        # Si es 4 --> En la cara opuesta está el ""tres"".
        # Si es 5 --> En la cara opuesta está el ""dos"".
        # Si es 6 --> En la cara opuesta está el ""uno"".
        # Si es otro número --> ERROR: número incorrecto.
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio17DadoSeisCaras {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dado;

// Solicitud de datos al usuario
    System.out.println("El programa indica el número aparecido en el lado opuesto al que sale en el dado:");
    System.out.print("Resultado de la cara obtenida: ");
    dado = s.nextInt();

// Realizamos comparaciones y mostramos el resultado
    if (dado == 1){
        System.out.println("En la cara opuesta está el \"seis\".");
    } else if (dado ==2){
        System.out.println("En la cara opuesta está el \"cinco\".");
    } else if (dado ==3){
        System.out.println("En la cara opuesta está el \"cuatro\".");
    } else if (dado == 4){
        System.out.println("En la cara opuesta está el \"tres\".");
    } else if (dado == 5){
        System.out.println("En la cara opuesta está el \"dos\".");
    } else if (dado == 6){
        System.out.println("En la cara opuesta está el \"uno\".");
    } else {
        System.out.println("ERROR: número incorrecto.");
    }
  }
}