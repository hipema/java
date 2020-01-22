package estructurasRepetitivas;

/*
07 Ejercicios Estructuras Repetitivas en Java

Programa:
Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €,
el segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un programa para
determinar cuánto debe pagar mensualmente y el total de lo que pagará después de
los 20 meses.

Autor: Manuel Hidalgo Pérez
Fecha: 11-11-19

Variables a utilizar:
    cuota1 (double)
    mensualidades (int)
    totalPagado (double)
    i (int)

ALGORITMO
    LEER cuota1, mensualidades
    Realizar ciclo for realizando (totalPagado = totalPagado *2 ) y en cada ciclo hasta que i = mensualidades
    MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ej07Intereses {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    double cuota;
    int mensualidades;
    int mes;
    double totalPagado = 0;

// Inicio del programa, explicación al usuario
    System.out.println("El programa calcula la cuota correspondiente al pago mensual y el total a pagar al final de la financiación  por la compra de un producto.");
// Pedimos datos al usuario
    System.out.print("Introduce la primera cuota a pagar: ");
    cuota = s.nextDouble();
    System.out.print("Introduce el número de meses de financiación: ");
    mensualidades = s.nextInt();
    
    for (mes=1; mes < mensualidades+1; mes+=1){
      System.out.println("Cuota "+ mes +": "+ cuota);
      totalPagado = totalPagado + cuota;
      cuota = cuota*2;
    } 
// Mostramos el resultado
    System.out.println("Total pagado por el producto: " + (int)totalPagado);
  }
}