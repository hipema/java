package ejerciciosSecuenciales;

/*
09 Ejercicios secuenciales en Java

Programa:
Una tienda ofrece un descuento del 15% sobre el total de la compra y un
cliente desea saber cuanto deberá pagar finalmente por su compra.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    * precio (double)
    * total (double)
    
ALGORITMO
    - LEER precio
    - Cálculos
        * total = precio - (precio *0.15)
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio09Descuento {
  public static void main(String[] args) {
    double precio;
    double total;

// Solicitud de datos al usuario
    System.out.println("Este programa indica el precio final del producto tras el 15% de descuento.");
    System.out.print("Indica el precio del producto sin descuento: ");
      precio = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos 

total = precio - (precio*0.15);

// Mostramos en pantalla
    System.out.println("El precio final del producto es de " +total);
    
  }
}
