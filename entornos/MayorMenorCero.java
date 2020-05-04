package entornos;

/**
 * Esta lase permite saber si un número leído porteclado
 * es mayor, menor o igual a cero, mostrando en pantalla las diferentes salidas.
 * @author Jaime Rabasco
 *
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MayorMenorCero {
  /**
   * Utiliza la clase Teclado, if.
   */
  public static void main (String[] args) throws IOException {
   BufferedReader bReader = new BufferedReader (new InputStreamReader(System.in)) ;
   System.out.println("Introduzca un número");
   int num = Integer.parseInt(bReader.readLine().trim());
   
   if (num<0)
     System.out.println("Es negativo");
   else if (num > 0)
     System.out.println("Es positivo");
   else
     System.out.println("Es cero");

  }
}
