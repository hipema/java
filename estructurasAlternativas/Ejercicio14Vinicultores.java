package estructurasAlternativas;

/*
14 Ejercicios Estructuras Alternativas en Java

Programa:
La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica
en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo y
tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando
lo siguiente:

si es de tipo A, 
se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
Realice un algoritmo para determinar la ganancia obtenida.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    *   precio (double)
    *   tipo (string)
    *   tamano (int)
    *   cantidad (double)

ALGORITMO
    - LEER tipo, precio, tamano, cantidad
    - Cálculos
        #   Realizamos comparaciones
        # Si tipo A
            # T1 -> ganancia == precio + (cantidad * 0.20)
            # T2 -> ganancia == precio + (cantidad * 0.30)
        # Si tipo B
            # T1 -> ganancia == precio + (cantidad * -0.30)
            # T2 -> ganancia == precio + (cantidad * -0.50)
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio14Vinicultores {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double precio;
    String tipo;
    double cantidad;
    int tamano;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
    System.out.print("Introduce los Kg. de uva entregada: ");
    cantidad = s.nextDouble();
    System.out.print("Precio por Kg. inicial: ");
    precio = s.nextDouble();
    System.out.print("Uva de valor \"A\" ó \"B\": ");
    tipo = s.next(); s.nextLine();
    System.out.print("Tipo de uva \"1\" ó \"2\": ");
    tamano = s.nextInt();

// Realizamos Cálculos y mostramos en pantalla
    if ((tipo.compareTo("A") == 0) && (tamano == 1)){
        System.out.println("La ganancia final es de: " + ((cantidad * precio)+(cantidad*0.20)));
    } else if ((tipo.compareTo("A") == 0) && (tamano == 2)){
        System.out.println("La ganancia final es de: " + ((cantidad*precio)+ (cantidad*0.30)));
    } else if ((tipo.compareTo("B") == 0) && (tamano == 1)){
        System.out.println("La ganancia final es de: " + ((cantidad*precio) + (cantidad*-0.30)));
    } else {
        System.out.println("La ganancia final es de: " + ((cantidad*precio) + (cantidad* -0.50)));
    } 
  }
}