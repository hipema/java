package expresionesRegulares;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Este programa busca en un archivo diferentes datos según el parámetro enviado:
 * En el primer parámetro recibirá el nombre del archivo donde se realizará la búsqueda
 * En el segundo parámetro se indicará los datos a buscar, que serán los siguientes:
 * 
 * DNI: extrae los DNIs.
 * IP: extrae las direcciones IP.
 * MAT: extrae matrículas de coche con formato 0000XXX.
 * HEX: extrae números hexadecimales.
 * FEC: extrae fechas con formato dd/mm/aaaa.
 * TWT: extrae usuarios de twitter: empieza por @ y puede contener letras mayusculas y
      minusculas, numeros, guiones y guiones bajos.
 * 
 * @author manuelhidalgo
 *
 */

public class ExtraeDatosFichero {
  public static void main(String[] args) {
    // En primer lugar vemos si el número de parámetros recibido es correcto
    if (args.length != 2) {
      System.err.println("Error en el número de parámetros");
      System.exit(1);
    }
    
    Pattern patron = Pattern.compile("");
    // Comprobamos si los parámetros recibidos son correctos
    // El segundo argumento debe ser una de las siguientes opciones.
    if  (args[1].toUpperCase().equals("DNI")) {
      patron = Pattern.compile("\\b(\\d{8}[A-H-NP-TV-Z])\\b");
      
    } else if (args[1].toUpperCase().equals("IP")){
      patron = Pattern.compile("\\b(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\b");
      
    } else if (args[1].toUpperCase().equals("MAT")) {
      patron = Pattern.compile("\\b(\\d{4}[A-Z]{3})\\b");
      
    } else if (args[1].toUpperCase().equals("HEX")) {
      // en este caso el patrón presenta problemas con el \b, al igual que con \W
      patron = Pattern.compile("(#[0-9A-F]+)\\b");
      
    } else if (args[1].toUpperCase().equals("FEC")) {
      patron = Pattern.compile("\\b(\\d{1,2}/\\d{1,2}/\\d{4})\\b");
      
    } else if (args[1].toUpperCase().equals("TWT")) {
      patron = Pattern.compile("\\B(@[a-zA-Z0-9_]{1,15})\\b");      
    } else {
      System.err.println("Función a buscar no encontrada.");
      System.exit(1);
    }
    
    // Abrimos el fichero donde buscar
    try {
      // Abrimos fichero origen
      BufferedReader bOrigen = new BufferedReader(new FileReader(args[0]));
   
      // Leemos primera línea del fichero.
      String linea = bOrigen.readLine();
      while (linea != null) {
        Matcher matcher = patron.matcher(linea);

        while (matcher.find()) {
           System.out.println(matcher.group(1));
        }
        // leemos nueva línea
        linea = bOrigen.readLine();
      }
      
      bOrigen.close();
      
    } catch (FileNotFoundException e){
      System.err.println("No se encuentra el archivo.");
      System.exit(1);
    } catch (IOException e) {
      System.err.println("Error de entrada/salida al manejar el fichero");
      System.exit(2);
    }
  }
}
