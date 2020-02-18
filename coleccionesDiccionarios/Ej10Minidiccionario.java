package coleccionesDiccionarios;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos,
 * 20 palabras (con su correspondiente traducción). Utiliza un objeto
 * de la clase HashMap para almacenar las parejas de palabras. El programa
 * pedirá una palabra en español y dará la correspondiente traducción en inglés.
 *
 */
public class Ej10Minidiccionario {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);
    String value = "s";
    // Introducimos datos en el diccionario
    diccionario.put("Camiseta","T-shirt");
    diccionario.put("Perro","Dog");
    diccionario.put("Gato","Cat");
    diccionario.put("Pájaro","Bird");
    diccionario.put("Nariz","Nose");
    diccionario.put("Avión","Plane");
    diccionario.put("Helicópetero","Helicopter");
    diccionario.put("Barco","Ship");
    diccionario.put("Viaje","Travel");
    diccionario.put("Isla","Island");
    diccionario.put("Playa","Beach");
    diccionario.put("Río","River");
    diccionario.put("Barca","Boat");
    diccionario.put("Música","Music");
    diccionario.put("Venganza","Revenge");
    diccionario.put("Película","Movie");
    diccionario.put("Cine","Cinema");
    diccionario.put("Taquilla","Ticket Office");
    diccionario.put("Bicicleta","Bike");
    diccionario.put("Carrera","Career");
    
    // Pedimos traducción por teclado.
    System.out.println("Palabras disponibles en el diccionario para su traducción a Inglés:");
    for (Entry<String, String> entry : diccionario.entrySet()) {
      System.out.print(entry.getKey()+" ");
    }
    System.out.println();
    
    // Solicitar palabra para buscar
    System.out.println("Palabra a buscar: ");
    String palabraIntro = scanner.nextLine();
    if (diccionario.containsKey(palabraIntro)) {
      System.out.println(palabraIntro + ": " + diccionario.get(palabraIntro));
    } else {
      System.out.print("Palabra no disponible");
    }
  }
}