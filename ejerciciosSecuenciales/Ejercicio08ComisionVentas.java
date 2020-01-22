package ejerciciosSecuenciales;

/*
08 Ejercicios secuenciales en Java

Programa:
Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por
las tres ventas que realiza en el mes y el total que recibirá en el mes tomando
en cuenta su sueldo base y comisiones.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    * salarioBase (double)
    * ventaComision1 (double)
    * ventaComision2 (double)
    * ventaComision3 (double)
    * comision (double)
    * salarioTotal (double)
    
ALGORITMO
    - LEER salarioBase, ventaComision1, ventaComision2, ventaComision3
    - Cálculos
        * comision = ventaComision1*0.1 + ventaComision2*0.1 + ventaComision3*0.1
        * salarioTotal = salarioBase + comision
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio08ComisionVentas {
  public static void main(String[] args) {
    double salarioBase;
    double ventaComision1;
    double ventaComision2;
    double ventaComision3;
    double comision;
    double salarioTotal;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el salario del trabajador contando salario y comisiones.");
    System.out.print("Indica el salario base: ");
      salarioBase = Double.parseDouble (System.console().readLine());
    System.out.print("Indica el importe de la primera venta: ");
      ventaComision1 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica el importe de la segunda venta: ");
      ventaComision2 = Double.parseDouble (System.console().readLine());
    System.out.print("Indica el importe de la tercera venta: ");
      ventaComision3 = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos 

comision = ventaComision1*0.1 + ventaComision2*0.1 + ventaComision3*0.1;
salarioTotal = salarioBase + comision;

// Mostramos en pantalla
    System.out.println("El sueldo total a recibir es "+salarioTotal + ". \nEquivalente al salario base: "+salarioBase + " y comisiones: "+comision);
    
  }
}
