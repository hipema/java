package ejerciciosSecuenciales;

import java.util.Scanner;

/**
09 Ejercicios secuenciales en Java

Calcula el precio final de una compra aplicando un descuento del 15%,
conociendo previamente el precio sin descuento.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio09Descuento {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double precioCompra;
    double precioDescuento;

    // Solicitud de datos al usuario
    System.out.println("Este programa indica el precio final del producto tras el 15% de descuento.");
    System.out.print("Indica el precio del producto sin descuento: ");
    precioCompra = scanner.nextDouble();

    // Realizamos Cálculos 

    precioDescuento = precioCompra - (precioCompra * 0.15);

    // Mostramos en pantalla
    System.out.println("El precio final del producto es de " + precioDescuento);
    
  }
}
