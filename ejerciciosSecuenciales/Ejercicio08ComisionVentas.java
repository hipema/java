package ejerciciosSecuenciales;

import java.util.Scanner;

/**
08 Ejercicios secuenciales en Java

Calcula las comisiones de un vendedor y su salario total, conociendo un
salario base y el valor de las tres ventas realizadas.

@author: manolohidalgo_
@date: 01-11-19
*/

// Inicio del programa y declaración de variables:

public class Ejercicio08ComisionVentas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double salarioBase;
    double venta1;
    double venta2;
    double venta3;
    double comision;
    double salarioTotal;

    // Solicitud de datos al usuario
    System.out.println("Este programa calcula el salario del trabajador contando salario y comisiones.");
    System.out.print("Indica el salario base: ");
      salarioBase = scanner.nextDouble();
    System.out.print("Indica el importe de la primera venta: ");
      venta1 = scanner.nextDouble();
    System.out.print("Indica el importe de la segunda venta: ");
      venta2 = scanner.nextDouble();
    System.out.print("Indica el importe de la tercera venta: ");
      venta3 = scanner.nextDouble();

    // Realizamos Cálculos 

    comision = 0.1 * (venta1 + venta2 + venta3);
    salarioTotal = salarioBase + comision;

    // Mostramos en pantalla
    System.out.println("El sueldo total a recibir es "+salarioTotal + ". \nEquivalente al salario base: "+salarioBase + " y comisiones: "+comision);
    
  }
}
