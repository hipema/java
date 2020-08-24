package ejerciciosSecuenciales;

import java.util.Scanner;

/**
20 Ejercicios secuenciales en Java

Programa que nos muestra cuanto dinero tenemos (en euros y céntimos)
después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos
o 10 céntimos).

@author: manolohidalgo_
@date: 02-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio20Monedero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int dosEuros;
    int unEuro;
    int cincuentaCent;
    int veinteCent;
    int diezCent;
    int total;
    int euros;
    int centimos;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el dinero total que tenemos en euros y céntimos, contando las diferentes monedas.");
    System.out.print("Monedas de 2 euros: ");
    dosEuros = scanner.nextInt();
    System.out.print("Monedas de 1 euro: ");
    unEuro = scanner.nextInt();
    System.out.print ("Monedas de 50 céntimos: ");
    cincuentaCent = scanner.nextInt();
    System.out.print ("Monedas de 20 céntimos: ");
    veinteCent = scanner.nextInt();
    System.out.print ("Monedas de 10 céntimos: ");
    diezCent = scanner.nextInt();
    
// Realizamos Cálculos 
    total = dosEuros * 200 + unEuro * 100 + cincuentaCent * 50 + veinteCent * 20 + diezCent * 10;
    euros = total / 100;
    centimos = total % 100;
// Mostramos en pantalla
    System.out.println("Se dispone de " +euros + " euros y "+centimos + " céntimos.");
    
  }
}
