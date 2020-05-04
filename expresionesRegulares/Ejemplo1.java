package expresionesRegulares;

import java.util.regex.Matcher; // estos tres son los paquetes para utilizar Expresiones Regulares.
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Creamos expresión regular para fechas: dd/mm/aaaa
 * 
 * Enlaces de interés:
 * https://programacion.net/articulo/expresiones_regulares_en_java_127
 * 
 * https://es.wikipedia.org/wiki/Expresi%C3%B3n_regular
 * 
 * https://www.oracle.com/technetwork/es/articles/sql/expresiones-regulares-base-de-datos-1569340-esa.html
 * 
 * Test para expresiones regulares:
 * https://www.regexplanet.com/advanced/java/index.html
 * 
 * @author manuelhidalgo
 *
 */

public class Ejemplo1 {
  public static void main(String[] args) {
  
  String patronFecha1 = "\\d{1,2}/\\d{1,2}/\\d{4}";
  
  // Lo siguiente encaja con el patrón
  prueba(patronFecha1, "11/12/2014");
  prueba(patronFecha1, "11/12/2014");
  prueba(patronFecha1, "1/12/2014");
  prueba(patronFecha1, "11/2/2014");
  
  // Lo siguiente NO encaja con el patrón
  prueba(patronFecha1, "11/12/14");
  prueba(patronFecha1, "11//2014");
  prueba(patronFecha1, "11/12/14perico");
  
  // el (?i) --> indica que da igual que sea mayúscula o minúscula.
  // al separar por | puede ser cualquiera de esos valores
  String patronFecha2 = "\\d{1,2}/(?i)(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/\\d{4}";
  
  // Encajan
  prueba(patronFecha1, "11/dic/2014");
  prueba(patronFecha1, "1/nov/2014");
  prueba(patronFecha1, "11/AGO/2014");
  prueba(patronFecha1, "11/Ago/2014");
  
  // NO Encajan
  prueba(patronFecha2, "11/aaa/2014");
  prueba(patronFecha2, "1//2014");
  prueba(patronFecha2, "11/AGO/14");
  prueba(patronFecha2, "11/Dec/2014perico");
  
  // Formato DNI. Las letras no pueden acabar en I, O, U
  String patronDNI = "\\d{8}[A-H-NP-TV-Z]";
      
  prueba(patronDNI, "80154636G");
  
  // Expresión para email. No existe una 100% fiable, hay muchos formatos válidos y complejos.
  String patronEmail = "[^@]+@[^@]+\\.[a-zA-Z{2,}]";
  
  // Encaja
  prueba(patronEmail, "a@b.com");
  prueba(patronEmail, "+++@+++.com");
  
  // No encaja
  prueba(patronEmail, "@b.com");
 
  }

  /**
   * Función para probar las expresiones regulares
   * 
   */

  private static void prueba (String patron, String cadena) {
    System.out.print("Cadena: " + cadena + "\t");
    System.out.println("Patrón expresión regular: " + patron + " ");
    if (Pattern.matches(patron, cadena)){
      System.out.println("ENCAJA");
    }else{
        System.out.println("NO ENCAJA");
    }
  }
}
