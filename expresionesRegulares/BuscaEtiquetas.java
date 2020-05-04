package expresionesRegulares;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/**
 * Este programa busca el contenido de una etiqueta html de una página web.
 * Funciona mediante la recepción de dos párametros:
 * parámetro 1: url
 * parámetro 2: etiqueta a buscar
 * 
 * @author manuelhidalgo
 *
 */

public class BuscaEtiquetas {

  public static void main(String[] args) throws IOException {
    // En primer lugar vemos si el número de parámetros recibido es correcto
    if (args.length != 2) {
      System.err.println("Error en el número de parámetros");
      System.exit(1);
    }
    // Notas del ejercicio:
    // a la hora de compilar la expresión para solucionar el error del salto de línea,
    // hay que poner: pattern.compile(patron, pattern.dotall)
    // <p.*>(.*?)<\/p> --> poner el modo "perezoso" es añadiendo después el ?
    
    try {
      // String donde almacenaremos todo el html
      String html = "";
      
      // Definir una conexión
      URL url = new URL (args[0]);
      HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
      conexion.setRequestMethod("GET");
      
      // Redirección en caso de que no encuentre la página (estado 301-302)
      if (conexion.getResponseCode() == HttpURLConnection.HTTP_MOVED_TEMP
          || conexion.getResponseCode() == HttpURLConnection.HTTP_MOVED_PERM) {
            String location = conexion.getHeaderField("Location");
            URL newUrl = new URL(location);
            conexion = (HttpURLConnection) newUrl.openConnection();
        }
      
      BufferedReader bf = new BufferedReader(
        new InputStreamReader(conexion.getInputStream()));
      
      String linea;
      while ((linea = bf.readLine()) != null) {
        html += linea + "\n";
      }
      bf.close();
      
      // Creación del patrón
      Pattern patron = Pattern.compile("<"+args[1]+"*>(.*?)<\\/"+args[1]+">", Pattern.DOTALL);
      Matcher matcher = patron.matcher(html);

      int n = 0;
      while (matcher.find()) {
        System.out.println("Coincidencia "+ ++n + matcher.group(1));
      }  
    } catch (Exception e) {
      System.err.println("Se ha producido un error, revise los parámetros.");
      System.exit(2);
    }
     
  }
}
