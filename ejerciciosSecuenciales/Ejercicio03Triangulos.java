package ejerciciosSecuenciales;

/*
03 Ejercicios secuenciales en Java

Programa:
Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    - base (double)
    - altura (double)
    - hipotenusa (double)

ALGORITMO
    - LEER base, altura
    - Cálculos
        - hipotenusa**2 = base**2 + altura**2
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio03Triangulos {
  public static void main(String[] args) {
    double base;
    double altura;
    double hipotenusa;

// Solicitud de datos al usuario
    System.out.println("Programa que calcula el area y perimetro de un rectangulo, dada su base y altura: ");
    System.out.print("Dame el valor de la \"base\" del rectángulo: ");
      base = Double.parseDouble (System.console().readLine());

    System.out.print("Dame el valor de la \"altura\" del rectángulo: ");
      altura = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos
      hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

// Mostramos resultados en pantalla
    System.out.println("El área de este rectángulo es " +hipotenusa);

  }
}
