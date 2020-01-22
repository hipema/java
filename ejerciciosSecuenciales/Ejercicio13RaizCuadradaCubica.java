package ejerciciosSecuenciales;

/*
13 Ejercicios secuenciales en Java

Programa:
Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y 
su raíz cúbica. PSeInt no tiene ninguna función predefinida que permita
calcular la raíz cúbica, ¿cómo se puede calcular?

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * numero (double)
    * raiz2 (double)
    * raiz3 (double)
   
ALGORITMO
    - LEER numero
    - Cálculos
        * raiz2 = math.sqrt (numero)
        * raiz3 = math.pow (numero, (1/3))
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio13RaizCuadradaCubica {
  public static void main(String[] args) {
    double numero;
    double raiz2;
    double raiz3;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la raiz cuadrada y cúbica de un número.");
    System.out.print("Introduce el valor del número: ");
    numero = Double.parseDouble (System.console().readLine());
    
// Realizamos Cálculos 
    raiz2 = Math.sqrt (numero);
    raiz3 = Math.pow (numero,1.0/3.0);

// Mostramos en pantalla
    System.out.println("La raiz cuadrada de "+numero + " es " + raiz2);
    System.out.println("La raiz cúbica de "+numero + " es " + raiz3);
    
  }
}
