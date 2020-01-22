package ejerciciosSecuenciales;

/**
02 Ejercicios secuenciales en Java

Programa:
Calcular el perí­metro y área de un rectángulo dada su base y su altura.

Autor: Manuel Hidalgo Pérez
Fecha: 01-11-19

Variables a utilizar:
    - base (numero)
    - altura (numero)
    - area (numero)
    - perimetro (numero)

ALGORITMO
    - LEER base, altura
    - Cálculos
        - area = base * altura
        - perimetro = 2*(base+altura)
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:

public class Ejercicio02PerimetroArea {
  public static void main(String[] args) {
    double base;
    double altura;
    double area;
    double perimetro;

// Solicitud de datos al usuario
    System.out.println("Programa que calcula el area y perimetro de un rectangulo, dada su base y altura: ");
    System.out.print("Dame el valor de la \"base\" del rectángulo: ");
      base = Double.parseDouble (System.console().readLine());

    System.out.print("Dame el valor de la \"altura\" del rectángulo: ");
      altura = Double.parseDouble (System.console().readLine());

// Realizamos Cálculos
    area = base * altura;
    perimetro = 2 * (base + altura);

// Mostramos resultados en pantalla
    System.out.println("El área de este rectángulo es " +area);
    System.out.println("El perímetro de este rectángulo es " + perimetro);

  }
}