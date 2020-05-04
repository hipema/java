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

public class MenorDeTres {
  /**
   * Lee tres números y calcula cuál de ellos es el menor.
   * Suponemos que los tres números son distintos.
   * @author Jaime Rabasco
   */
  public static void main (String[] args) throws IOException {
   int x, y, z, menor;
   BufferedReader bReader = new BufferedReader (new InputStreamReader(System.in)) ;
   System.out.println("Introduzca un número");
   x = Integer.parseInt(bReader.readLine().trim());
   System.out.println("Introduzca un número");
   y = Integer.parseInt(bReader.readLine().trim());
   System.out.println("Introduzca un número");
   z = Integer.parseInt(bReader.readLine().trim());
   
   if (x<y)
       if (x<z) menor = x;
       else menor = z;
   else if (z<y) menor = z;
   else menor = y;
   
   System.out.println("El menor es " + menor);
  }
}
