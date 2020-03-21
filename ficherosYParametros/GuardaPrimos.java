package ficherosYParametros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class GuardaPrimos {
  

  public static void main(String[] args) {
    
    int NUMERO = 500; // Constante que indica cuantos números primos obtendremos.
    // Abre fichero primos.dat
    try {
      BufferedWriter escritura = new BufferedWriter(new FileWriter("primos.dat"));
      // Escribimos el número 2 como inicio del archivo.
      escritura.write("2");
      escritura.newLine();
    
      // Comenzamos la comprobación de números primos.
      int numEsPrimo = 3;
      
      while (numEsPrimo <= NUMERO){
        int divisor = 3;
        boolean esPrimo = true;
        while ((divisor <= Math.sqrt(numEsPrimo)) && esPrimo) {
          if (numEsPrimo%divisor == 0) {
            esPrimo = false;
          }
          divisor +=2;
        }
        if (esPrimo) {
          // guardamos número en el archivo
          escritura.write(Integer.toString(numEsPrimo));
          escritura.newLine();
          System.out.println(numEsPrimo);
        }
        numEsPrimo +=2;
      }
      escritura.close();
      System.out.println("Archivo \"primos.dat\" con los números primos entre 1 y "+ NUMERO + " creado correctamente.");
    } catch (FileNotFoundException e){
      System.err.println("No se encuentra el archivo.");
      System.exit(1);
    } catch (IOException e) {
      System.err.println("Error de entrada/salida al manejar el fichero");
      System.exit(2);
    }
  }
}
