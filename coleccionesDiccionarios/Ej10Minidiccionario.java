package coleccionesDiccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 *
 */
public class Ej10Minidiccionario {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String palabraIntro;
    boolean buscar = true;
    String value;

    // Creamos diccionario en el que trabajaremos
    Ej10DiccionarioClase diccionario = new Ej10DiccionarioClase();
    // Pedimos el listado de palabras que contiene el diccionario:
    diccionario.listarPalabras();
    System.out.println();

    // Solicitamos palabra a buscar
    while (buscar) {
      System.out.println("¿Cuál palabra quieres traducir?");
      palabraIntro = scanner.nextLine();
      diccionario.obtenerTraduccion(palabraIntro);
      System.out.println("¿Buscar otra palabra? Pulsa \"s\" para seguir u otra tecla para terminar el programa");
      value = scanner.nextLine();
      if (!value.equals("s")) {
        buscar = false;
      }        
    }
    System.out.println("Programa terminado, gracias por utilizar nuestro traductor.");

  }
}