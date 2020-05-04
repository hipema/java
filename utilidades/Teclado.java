package utilidades;
import java.util.Scanner;

public class Teclado {
  private static Scanner scanner = new Scanner(System.in);
  
  /**
   * Lee el valor de una cadena.
   * @return string cadena.
   */
  public static String leerCadena() {
    return scanner.nextLine();
  }
  
  /**
   * Pedir cadena al usuario con mensaje a mostrar.
   * @param mensaje
   * @return
   */
  public static String leerCadena (String mensaje) {
    System.out.println(mensaje);
    return leerCadena();
  }

  /**
   * Lee el valor de un número entero.
   * @return 
   */
  public static int leerNumeroEntero() {
    do {
      try {
        return Integer.parseInt(leerCadena());
      } catch (Exception e){
        System.err.println("Introduce un número entero");
      }
    } while (true);
  }
  
  /**
   * Lee el valor de un número entero con mensaje a mostrar
   * @return int
   */
  public static int leerNumeroEntero(String mensaje) {
    System.out.println(mensaje);
    return leerNumeroEntero();
  }
  
  /**
   * Lee un número con decimales.
   * @return
   */
  public static double leerDouble() {
    do {
      try {
        return Double.parseDouble(leerCadena());
      } catch (Exception e){
        System.err.println("Introduce un número");
      }
    } while (true);
  }

  /**
   * Lee el valor de un número con decimáles con mensaje a mostrar
   * @return double
   */
  public static double leerDouble(String mensaje) {
    System.out.println(mensaje);
    return leerDouble();
  }public Teclado() {
    // TODO Auto-generated constructor stub
  }
  /**
   * Lee un carácter introducido por teclado.
   * @return char
   */
  public static char leerCaracter() {;
    char caracter;
    String cadena = leerCadena();
    while (cadena.length() > 1) {
      System.err.println("Debe introducir un único carácter");
      cadena = leerCadena();
    }
    return cadena.charAt(0);
  }
  
  /**
   * Lee un carácter introducido por teclado mostrando un mensaje.
   * @param mensaje
   * @return
   */
  public static char leerCaracter(String mensaje) {
    System.out.println(mensaje);
    return leerCaracter();
  }
}