package estructurasRepetitivas;

/*
02 Ejercicios Estructuras Repetitivas en Java

Programa:
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
 introducir). El programa debe informar de cuantos números introducidos son mayores que
 0, menores que 0 e iguales a 0.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    numero (int)
    contador (int)
    mayor (int)
    menor (int)
    igual (int)

ALGORITMO
    - LEER contador
    - Cálculos
        While contador >0 - Introducir números
        En cada ciclo, sumar a "mayor, menor o igual" según el número introducido.
    -   MOSTRAR resultados 
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej02PideNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int contador;
    int mayor = 0;
    int igual = 0;
    int menor = 0;

// Solicitud de datos al usuario
    System.out.println("El programa pide una cantidad de números indicada e indica cuantos son positivos, negativos o iguales a cero.");
    System.out.print("Introduce la cantidad de número que vamos a introducir: ");
    contador = s.nextInt();

    while (contador > 0){
      System.out.println("Introduce un número: ");
      numero = s.nextInt();
      contador = contador-1;
      if (numero > 0){
        mayor += 1;
      } else if (numero < 0){
        menor +=1;
      } else {
        igual +=1;
      }
    }    
    System.out.println("Has introducido todos los números:\n" + mayor + " son mayores a 0\n" + menor + " son menores a 0\n" + igual + " son iguales a 0.");
  }
}