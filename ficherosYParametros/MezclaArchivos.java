package ficherosYParametros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MezclaArchivos {
  

  public static void main(String[] args) {
    // Comprobamos los argumentos recibidos
    String fichero1 = null;
    String fichero2 = null;
    try {
      if (args.length !=2) {
        System.err.println("Número de parámetros recibido incorrecto.");
        System.exit(2);
      } else { // asignamos nombres de los ficheros según los argumentos recibidos.
        fichero1 = args[0];
        fichero2 = args[1];
      }
    } catch (Exception e){
      System.out.println("Se ha producido un error.");
      System.exit(1);
    }
    // Abrimos archivos de lectura y archivo de escritura
    try {
      BufferedReader lectura1 = new BufferedReader(new FileReader(fichero1));
      BufferedReader lectura2 = new BufferedReader(new FileReader(fichero2));
      BufferedWriter mezcla = new BufferedWriter(new FileWriter("mezcla.txt"));
      
      // Leemos y mostramos la primera línea por pantalla.
      String linea1 = lectura1.readLine();
      String linea2 = lectura2.readLine();
      
      while (linea1 != null || linea2 != null) {
        if (linea1 != null) {
          mezcla.write(linea1);
          mezcla.newLine();
          linea1 = lectura1.readLine();
        }
        if (linea2 != null) {
          mezcla.write(linea2);
          mezcla.newLine();
          linea2 = lectura2.readLine();
        }
      }
      // Cerramos ficheros
      lectura1.close();
      lectura2.close();
      mezcla.close();
           
      System.out.println("Archivos mezclados correctamente en el fichero mezcla.txt");
      
    } catch (FileNotFoundException error){
      System.err.println("No se encuentra el archivo.");
      System.exit(1);
    } catch (IOException error) {
      System.err.println("Error de entrada/salida al manejar el fichero");
      System.exit(2);
    }
  }
}