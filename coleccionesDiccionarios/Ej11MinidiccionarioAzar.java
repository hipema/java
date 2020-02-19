package coleccionesDiccionarios;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del mini-
 * diccionario del ejercicio anterior. El programa irá pidiendo que el usuario
 * teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 *
 */
public class Ej11MinidiccionarioAzar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numPalabras = 5;
    String[] aparecidas = new String[numPalabras];
    String respuesta;
    String solucion;
    
    // Creamos diccionario en el que trabajaremos
    Ej10DiccionarioClase diccionario = new Ej10DiccionarioClase();
    
    // Pedimos palabra
    String palabra = diccionario.palabraAzar();
    aparecidas[0] = palabra;
    
    // Realizamos ciclo para ir sacando el resto de palabras que vamos a preguntar
    for (int i = 1; i < numPalabras; i++) {
      boolean palabraExiste = true;
      while (palabraExiste) {
        int aux=0;
        palabra = diccionario.palabraAzar();
        for (int j =0; j < numPalabras; j++) {
          if (aparecidas[j] == palabra) {
            aux++;
          }
        }
        if (aux>0) {
          palabraExiste = true;
        } else {
          palabraExiste = false;
        }
      }
      aparecidas[i]=palabra;
    }
    
    // Preguntamos por las palabras y vemos si son correctas o no las respuestas.
    // Revisar problema igual que comento en el primer trimestre, tema buffer
    for (int i = 0; i < numPalabras; i++) {
      System.out.println("¿Cuál es la traducción de "+aparecidas[i]+"?");
      respuesta = scanner.next();
      solucion = diccionario.traducirPalabra(aparecidas[i]);
      if (respuesta.equals(solucion)) {
        System.out.println("Resultado correcto");
      } else {
        System.out.println("Resultado incorrecto, la respuesta es "+solucion);
      }
    }
  }
}