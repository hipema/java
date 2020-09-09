package estructurasRepetitivas;

/**
02 Ejercicios Estructuras Repetitivas en Java

Programa:
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
 introducir). El programa debe informar de cuantos números introducidos son mayores que
 0, menores que 0 e iguales a 0.

@author: manolohidalgo_
@date: 09-11-19
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej02PideNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int contador;
    int mayor = 0;
    int igual = 0;
    int menor = 0;

// Solicitud de datos al usuario
    System.out.println("El programa pide una cantidad de números indicada e indica cuantos son positivos, negativos o iguales a cero.");
    System.out.print("Introduce la cantidad de número que vamos a introducir: ");
    contador = scanner.nextInt();
    do {
      if (contador <= 0) {
        System.out.println("El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
        contador = scanner.nextInt();
      }
    } while (contador <= 0);

    while (contador > 0){
      System.out.println("Introduce un número: ");
      numero = scanner.nextInt();
      contador = contador-1;
      if (numero > 0){
        mayor++;
      } else if (numero < 0){
        menor++;
      } else {
        igual++;
      }
    }    
    System.out.println("Has introducido todos los números:\n" + mayor + " son mayores a 0\n" + menor + " son menores a 0\n" + igual + " son iguales a 0.");
  }
}