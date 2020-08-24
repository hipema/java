package ejerciciosSecuenciales;

import java.util.Scanner;

/**
14 Ejercicios secuenciales en Java

Recibe un número de dos cifras, y devuelve su inverso.

@author: manolohidalgo_
@date: 02-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio14InvierteNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numero;
    int digito1;
    int digito2;
    int inverso;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el número inverso a uno dado de dos cifras.");
    System.out.print("Introduce el valor del número: ");
    numero = scanner.nextInt();
// Realizamos Cálculos 
    digito1 = numero / 10;
    digito2 = numero % 10;
    inverso = digito2 *10 + digito1;

// Mostramos en pantalla
    System.out.println("El numero inverso es "+inverso);
    
  }
}
