package ficherosYParametros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeePrimos {
  

  public static void main(String[] args) {
    // Abre fichero primos.dat
    try {
      BufferedReader lectura = new BufferedReader(new FileReader("primos.dat"));
      
      // Leemos y mostramos la primera línea por pantalla.
      System.out.println(lectura.readLine());
    
      // Continuamos leyendo hasta el final del archivo.
      while (lectura.readLine() != null){
        System.out.println(lectura.readLine());
      }
      lectura.close();
      System.out.println("Fin del contenido del archivo \"primos.dat\"");
    } catch (FileNotFoundException e){
      System.err.println("No se encuentra el archivo.");
      System.exit(1);
    } catch (IOException e) {
      System.err.println("Error de entrada/salida al manejar el fichero");
      System.exit(2);
    }
  }
}
