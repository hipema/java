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
public class Ej10DiccionarioClase {
  private HashMap<String, String> diccionario = new HashMap<String, String>();
  Scanner scanner = new Scanner(System.in);
  String value = "s";
  String resultado;
  
  Ej10DiccionarioClase () {
    this.diccionario.put("Camiseta","T-shirt");
    this.diccionario.put("Perro","Dog");
    this.diccionario.put("Gato","Cat");
    this.diccionario.put("Pájaro","Bird");
    this.diccionario.put("Nariz","Nose");
    this.diccionario.put("Avión","Plane");
    this.diccionario.put("Helicópetero","Helicopter");
    this.diccionario.put("Barco","Ship");
    this.diccionario.put("Viaje","Travel");
    this.diccionario.put("Isla","Island");
    this.diccionario.put("Playa","Beach");
    this.diccionario.put("Río","River");
    this.diccionario.put("Barca","Boat");
    this.diccionario.put("Música","Music");
    this.diccionario.put("Venganza","Revenge");
    this.diccionario.put("Película","Movie");
    this.diccionario.put("Cine","Cinema");
    this.diccionario.put("Taquilla","Ticket Office");
    this.diccionario.put("Bicicleta","Bike");
    this.diccionario.put("Carrera","Career");    
  }
  //Getters y Setters  
  public String getResultado() {
    return resultado;
  }

  public void setDiccionario(HashMap<String, String> diccionario) {
    this.diccionario = diccionario;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }
  // Métodos
  public void obtenerTraduccion (String palabraIntro) {
    if (diccionario.containsKey(palabraIntro)) {
      System.out.println(palabraIntro + ": " + diccionario.get(palabraIntro));
      this.resultado = diccionario.get(palabraIntro);
    } else {
      System.out.print("Palabra no disponible");
    }
  }
  public String traducirPalabra (String palabraIntro) {
    if (diccionario.containsKey(palabraIntro)) {
      this.resultado = diccionario.get(palabraIntro);
    } 
    return this.resultado;
  }

  public void listarPalabras (){
    System.out.println("Palabras disponibles en el diccionario para su traducción a Inglés:");
    for (Entry<String, String> entry : diccionario.entrySet()) {
      System.out.println(entry.getKey() + " ");
    }
  }
  
  public String palabraAzar () {
    String[] keys = this.diccionario.keySet().toArray(new String[0]);
    int size = this.diccionario.size();
    String palabra = keys[(int)(Math.random()*size-1)+1];
    return palabra;
  }

}







