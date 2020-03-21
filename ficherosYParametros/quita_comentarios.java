package ficherosYParametros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que quita los comentarios de un programa de Java. 
 * Se utiliza de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero
 * sin los comentarios.
 * 
 * @author manuelhidalgo
 * 
 * Excepcionalmente el nombre de este programa no usa camelcase por imposición de
 * quien lo encargó.
 * 
 */

public class quita_comentarios {

  public static void main(String[] args) {
    
    // ¿Número de parámetros correcto?
    if (args.length != 2) {
      System.err.println("Error en el número de parámetros"); // mensaje a la salida de error
      System.exit(1);
    }
    
    // Averiguamos fichero origen y destino
    String ficheroOrigen = args[0];
    String ficheroDestino = args[1];
    
    // Proceso
    try {
      // Abrimos fichero origen
      BufferedReader bOrigen = new BufferedReader(new FileReader(ficheroOrigen));
      // Abrimos fichero destino
      BufferedWriter bDestino = new BufferedWriter(new FileWriter(ficheroDestino));
      
   // necesaria para detectar bloques de comentarios /* ...*/
      boolean estoyEnBloqueComentario = false; 
      // Leo cada línea del fichero origen y si no es un comentario la escribo en el destino.
      String linea = bOrigen.readLine();
      while (linea != null) {
        // ¿Bloque /*....*/
        boolean escribeLinea = true;
        if (estoyEnBloqueComentario) {
          if (linea.trim().endsWith("*/")) {
            estoyEnBloqueComentario = false;
          }
        } else if (linea.trim().startsWith("/*")) {
          estoyEnBloqueComentario = true;
        } else {
          
          if (linea.contains("//")){ // ¿hay comentario en la línea?
            // quitar de línea el comentario //
            int dondeEmpiezaBarra2 = linea.indexOf("//");
            linea = linea.substring(0, dondeEmpiezaBarra2);
            // si la línea contiene solo espacios o está vacía, no la escribo.
            if (linea.trim().equals("")) {
              escribeLinea = false;
            }
          }
          // escribimos línea sin comentarios
          if (escribeLinea && !estoyEnBloqueComentario) {
            bDestino.write(linea);
            bDestino.newLine(); // añade salto de línea
          }  
        }
       
        // Leemos nueva línea
        linea = bOrigen.readLine();
        }
      System.out.println("Archivo sin comentarios creado.");
      // Cerramos los archivos.
      bOrigen.close();
      bDestino.close();
      
    } catch (FileNotFoundException e){
      System.err.println("No se encuentra el archivo.");
      System.exit(1);
    } catch (IOException e) {
      System.err.println("Error de entrada/salida al manejar el fichero");
      System.exit(2);
    }
  }
}
