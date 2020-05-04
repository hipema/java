package coleccionesDiccionarios;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que
 * sume los puntos según el juego de la brisca. El valor de las cartas se debe guardar en
 * una estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”,
 * 3). La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos
 * de la clase Carta. El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2,
 * caballo → 3, rey → 4; el resto de cartas no vale nada.
 *
 */
public class Ej12CartasPuntuacionBrisca {
  public static void main(String[] args) {
    // Creamos HashMap con valor equivalente para cada carta.
    HashMap<String,Integer> mano = new HashMap<String,Integer>();
    mano.put("AS", 11);
    mano.put("2",0);
    mano.put("3",10);
    mano.put("4", 0);
    mano.put("5",0);
    mano.put("6",0);
    mano.put("7", 0);
    mano.put("Sota",2);
    mano.put("Caballo",3);
    mano.put("Rey",4);
    
    int suma=0;
    
    // Obtenemos 5 objetos Carta que se guardarán en un ArrayList.
    ArrayList<Ej08cartas> juego = new ArrayList<Ej08cartas>();
    Ej08cartas carta = new Ej08cartas();
    juego.add(carta);
    int contador = 1;
    int n = 5; // número de cartas a obtener.
    boolean existe = true;
    
    while (contador < n) {
      Ej08cartas carta2 = new Ej08cartas();
      for (int i=0; i < juego.size();i++) {
        if (juego.get(i).equals(carta2)) {
          existe = true;
          break;
        } else {
          existe = false;
        }
      }  
      if (!existe) {
        juego.add(carta2);
        contador ++;
      }
    }
    // Imprimimos las cartas obtenidas
    for (int i=0; i < n; i++) {
      System.out.println(juego.get(i));
    } 
    // Calculamos la puntuación de las cartas.
    for (int i=0; i < n; i++) {
      suma = suma +mano.get(juego.get(i).tipoCarta());
    }
    System.out.println("La suma de las cartas es "+suma);
  }
}