package entornos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Euclides {

  int a;
  int b;

  // Constructor de la clase

  public Euclides(int a, int b) {

    this.a = a;
    this.b = b;

  }

  public static void main(String[] args) throws IOException {

    int num1, num2;
    String cadena;
    char salir = 's';

    BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

    //Bucle por si queremos volver a calcular el MCD

    while (salir == 's') {

      // Pedimos por teclado el primer número

      System.out.println("Introduce el primer número para el algoritmo de Euclides");
      cadena = bReader.readLine();
      num1 = Integer.parseInt(cadena.trim());

      // Pido por teclado el segundo número

      System.out.println("Introduce el segundo número para el algoritmo de Euclides");
      cadena = bReader.readLine();
      num2 = Integer.parseInt(cadena.trim());

      // Creamos el objeto
      Euclides euclides = new Euclides(num1, num2);

      // Llamamos al método que calcula el MCD
      euclides.mcd(num1, num2);

      // Pedimos si queremos volver a calcular el MCD de dos números
      System.out.println("Desea volver a calcular el MCD de otro dos números (s/n)");
      salir = bReader.readLine().charAt(0);

    }
  }

  // Metodo que calcula el MCD

  public void mcd(int num1, int num2) {

    int aux, resto = 0;
    if (num1 < num2) {
      aux = num1;
      num1 = num2;
      num2 = aux;

    }
    a = num1;
    b = num2;
    resto = a % b;

    while (resto != 0) {
      num1 = num2;
      num2 = resto;
      resto = num1 % num2;

    }
    System.out.println("El MCD de " + a + " y " + b + " es " + num2);
  }
}