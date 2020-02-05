package poo;

import java.util.Scanner;

import poo.Circulo;

/**
 * Test de la clase Círculo.
 * 
 * @version 1.0
 * @author manuelhidalgo
 *
 */
public class TestCirculo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Circulo c1;
    double radio;
    System.out.println("Vamos a crear un Círculo, ¿de qué radio quieres que sea?");
    radio = scanner.nextDouble();
    c1 = new Circulo(radio);
    System.out.println();
    System.out.println("Mostramos el estado del círculo creado:");
    System.out.println(c1);
    System.out.println();

    System.out.println("Hacemos que el radio del círculo crezca 27 veces:");
    c1.crecerCirculo(27);
    // System.out.println(c1);
    System.out.println();

    System.out.println("Hacemos que el radio del círculo se reduzca 10 veces:");
    c1.menguarCirculo(10);
    // System.out.println(c1);
    System.out.println();

    System.out.println("Mostramos el estado final del círculo:");
    System.out.println(c1);

    System.out.println("Cambiamos radio a 0");
    c1.setRadio(0);
    
    System.out.println("Modificamos el área del círculo");
    c1.mostrarArea();
  }
}
