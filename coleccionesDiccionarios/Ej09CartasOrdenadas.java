package coleccionesDiccionarios;
import java.util.ArrayList;
import java.util.Collections;

public class Ej09CartasOrdenadas{

  public static void main(String[] args) {
    ArrayList<Ej08cartas> juego = new ArrayList<Ej08cartas>();
    Ej08cartas carta = new Ej08cartas();
    juego.add(carta);
    int contador = 1;
    boolean existe = true;
    
    while (contador < 10) {
      Ej08cartas carta2 = new Ej08cartas();
      for (int i=0; (i < juego.size());i++) {
        if (juego.get(i).equals(carta2)) {
        //if (juego.get(i).getNombre().compareTo(carta2.getNombre())==0) {
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
    System.out.println();
    for (int i=0; i < 10; i++) {
      System.out.println(juego.get(i));
    }
    System.out.println();
    Collections.sort(juego);
    System.out.println("Ordenamos el mazo de cartas:");
    for (int i=0; i < 10; i++) {
      System.out.println(juego.get(i));
    }
  }
}