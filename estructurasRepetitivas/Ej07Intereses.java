package estructurasRepetitivas;

/**
07 Ejercicios Estructuras Repetitivas en Java

Programa:
Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €,
el segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un programa para
determinar cuánto debe pagar mensualmente y el total de lo que pagará después de
los 20 meses. Este programa puede servir para calcular otras compras y con 
diferentes plazos.

@author: manolohidalgo_
Fecha: 11-11-19
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej07Intereses {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double cuota;
    int mensualidades;
    double totalPagado = 0;

// Inicio del programa, explicación al usuario
    System.out.println("El programa calcula la cuota correspondiente al pago mensual y el total a pagar al final de la financiación  por la compra de un producto.");
// Pedimos datos al usuario
    System.out.print("Introduce la primera cuota a pagar: ");
    cuota = scanner.nextDouble();
    System.out.print("Introduce el número de meses de financiación: ");
    mensualidades = scanner.nextInt();
    
    for (int i=1; i <= mensualidades; i++){
      System.out.println("Cuota "+ i +": "+ cuota);
      totalPagado = totalPagado + cuota;
      cuota = cuota*2;
    } 
// Mostramos el resultado
    System.out.println("Total pagado por el producto: " + (int)totalPagado);
  }
}