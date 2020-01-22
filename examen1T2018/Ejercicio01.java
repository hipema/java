package examen1T2018;
import examen1T2018.funcionesExamen1T;
import java.util.Scanner;

import ejerciciosFinalT1.FuncionesEjFinalT1;

/**
 * 
 * Muestra un menú con las siguientes opciones:
 * 
 * - Introducir (por teclado) una fecha en formato dd/mm/aaaa. Pide una fecha al
 * usuario, si no se introduce correctamente se devuelve un mensaje de error.
 * Usa una función booleana para validar la fecha.
 * 
 * - Sumar días a la fecha. Pide un número de días (positivo) para sumar a la
 * fecha introducida previamente y actualiza su valor. Esta opción sólo podrá
 * realizarse si hay una fecha introducida, si no la hay mostrará un mensaje de
 * error, si el número de días introducido no es positivo también. Usa una
 * función que recibirá la fecha, el número de días a sumarle y devolverá la
 * nueva fecha.
 * 
 * - Restar días a la fecha. Pide un número de días (negativo) para sumar a la
 * fecha introducida previamente y actualiza su valor. Esta opción sólo podrá
 * realizarse si hay una fecha introducida, si no la hay mostrará un mensaje de
 * error, si el número de días introducido no es negativo también. Usa la
 * función del apartado anterior.
 *
 * - Comparar la fecha introducida con otra. Pide una fecha al usuario (válida,
 * si no lo es da error) y la comparará con la que tenemos almacenada,
 * posteriormente mostrará si esta fecha es anterior, igual o posterior a la que
 * tenemos almacenada, usará una función para ello a la que le pasaremos las dos
 * fechas y devolverá un valor negativo si la 1ª es ANTERIOR a la 2ª, 0 si son
 * IGUALES y un valor positivo si es POSTERIOR.
 *
 * - Mostrar fecha.
 * 
 * - Terminar.
 * 
 * @author Rafael del Castillo
 *
 */

// Inicio del programa y declaración de variables:

public class Ejercicio01 {
  public static void main(String[] args) {
  	Scanner scanner = new Scanner(System.in);
    String fecha1 = "01/01/199990";
    String fecha2 = "12/12-1999";
    String fecha3 = "21/15/0999";
    String fecha4 = "45/00/1999";
    String fecha5 = "01/12/1999";
    String fecha6;
    boolean esFechaCorrecta;
    int sumaDias;
    
    System.out.println("Validación de fecha");
    System.out.println("-------------------");
    System.out.println("Fecha 1: "+funcionesExamen1T.validaFecha(fecha1));
    System.out.println("Fecha 2: "+funcionesExamen1T.validaFecha(fecha2));
    System.out.println("Fecha 3: "+funcionesExamen1T.validaFecha(fecha3));
    System.out.println("Fecha 4: "+funcionesExamen1T.validaFecha(fecha4));
    System.out.println("Fecha 5: "+funcionesExamen1T.validaFecha(fecha5));
    
    System.out.println("Sumamos día a la fecha");
    System.out.println("----------------------");
    System.out.print("Introduce una fecha por teclado dd/mm/aaaa: ");
    fecha6 = scanner.nextLine();
    esFechaCorrecta = funcionesExamen1T.validaFecha(fecha6);
    while (!esFechaCorrecta) {
    	System.out.println("ERROR: Fecha introducida incorrecta.");
    	System.out.print("Introduce una fecha por teclado dd/mm/aaaa: ");
      fecha6 = scanner.nextLine();
      esFechaCorrecta = funcionesExamen1T.validaFecha(fecha6);
    }
    System.out.print("Días a sumar: ");
    sumaDias = scanner.nextInt();
    while (sumaDias <0) {
    	System.out.println("ERROR: La cantidad de días a sumar debe ser positiva.");
    	System.out.print("Días a sumar: ");
      sumaDias = scanner.nextInt();
    }
    
    System.out.println("La nueva fecha es: "+fechaConSumaDeDias);
  }
}