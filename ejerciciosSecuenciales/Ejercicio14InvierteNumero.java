package ejerciciosSecuenciales;

/*
14 Ejercicios secuenciales en Java

Programa:
Dado un número de dos cifras, diseñe un algoritmo que permita obtener el
número invertido.

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * numero (long)
    * digito1 (long)
    * digito2 (long)
    * inverso (long)
   
ALGORITMO
    - LEER numero
    - Cálculos
        * digito1 = numero // 10
        * digito2 = numero - (digito1*10)
        * inverso = digito2 * 10 + digito1
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio14InvierteNumero {
  public static void main(String[] args) {
    long numero;
    long digito1;
    long digito2;
    long inverso;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el número inverso a uno dado de dos cifras.");
    System.out.print("Introduce el valor del número: ");
    numero = Long.parseLong((System.console().readLine()));
    
// Realizamos Cálculos 
    digito1 = numero / 10;
    digito2 = numero - digito1*10;
    inverso = digito2 *10 + digito1;

// Mostramos en pantalla
    System.out.println("El numero inverso es "+inverso);
    
  }
}
