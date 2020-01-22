package ejerciciosSecuenciales;

/*
20 Ejercicios secuenciales en Java

Programa:
Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos
o 10 céntimos).

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * dosEuros (long)
    * unEuro (long)
    * cincuentaCent (long)
    * veinteCent (long)
    * diezCent (long)
    * total (long)
    * euros (long)
    * centimos (log)
    
ALGORITMO
    - LEER dosEuros, unEuro, cincuentaCent, veinteCent, diezCent
    - Cálculos
    *   Pasamos todos los importes a céntimos
        * total = dosEuros*200 + unEuro * 100 + cincuentaCent * 50 + veinteCent * 20 + diezCent * 10
    *   Dividimos el importe en euros y céntimos
        * euros = total / 100
        * centimos = total - (euros * 100)
        
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio20Monedero {
  public static void main(String[] args) {
    long dosEuros;
    long unEuro;
    long cincuentaCent;
    long veinteCent;
    long diezCent;
    long total;
    long euros;
    long centimos;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el dinero total que tenemos en euros y céntimos, contando las diferentes monedas.");
    System.out.print("Monedas de 2 euros: ");
    dosEuros = Long.parseLong(System.console().readLine());
    System.out.print("Monedas de 1 euro: ");
    unEuro = Long.parseLong(System.console().readLine());
    System.out.print ("Monedas de 50 céntimos: ");
    cincuentaCent = Long.parseLong(System.console().readLine());
    System.out.print ("Monedas de 20 céntimos: ");
    veinteCent = Long.parseLong(System.console().readLine());
    System.out.print ("Monedas de 10 céntimos: ");
    diezCent = Long.parseLong(System.console().readLine());
    
// Realizamos Cálculos 
    total = dosEuros * 200 + unEuro * 100 + cincuentaCent * 50 + veinteCent * 20 + diezCent * 10;
    euros = total / 100;
    centimos = total - (euros * 100);
// Mostramos en pantalla
    System.out.println("Se dispone de " +euros + " euros y "+centimos + " céntimos.");
    
  }
}
