package expresionesRegulares;

import java.util.regex.Matcher; // estos tres son los paquetes para utilizar Expresiones Regulares.
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Segundo ejercicio de expresiones regulares.
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

public class Ejemplo2 {
  public static void main(String[] args) {
    
    // http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
    
    // Extraer partes de las cadenas, queremos sacar 23, 12, 35.
    String cadena = "23+12=35";
    
    // Patrón compilado
    Pattern patron = Pattern.compile("(\\d+)\\+(\\d+)=(\\d+)");
    
    // Encajador, Matcher
    Matcher matcher = patron.matcher(cadena);
    
    // Buscamos las partes (si existen)
    if (matcher.find()) {
      // devuelve los trozos. El primer paréntesis es el 1,
      // el segundo el 2 y el tercero el 3.
      System.out.println(matcher.group(1));
      System.out.println(matcher.group(2));
      System.out.println(matcher.group(3));
      // también podemos acceder como si fuese un vector
      //for (int i=1; i<= matcher.groupCount(); i++) {
      //  System.out.println(matcher.group(i));
      System.out.println();
    }
    
    // Buscamos en la siguiente cadena: <a>uno</a><b>dos</b><c>tres</c>
    String cadena2 = "<a>uno</a><b>dos</b><c>tres</c>";
    // Lo que queremos extraer va entre paréntesis, 
    // por eso ahora se crea un sólo grupo y antes eran tres.
    Pattern pattern1 = Pattern.compile("<[^>]*>([^<]*)</[^>]*>");
    Matcher matcher1 = pattern1.matcher(cadena2);

    while (matcher1.find()) {
       System.out.println(matcher1.group(1));
    }
  }
}
