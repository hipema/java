package coleccionesDiccionarios;
import java.util.ArrayList;

public class Ej08Test {

  public static void main(String[] args) {
    ArrayList<Ej08cartas> juego = new ArrayList<Ej08cartas>();
    Ej08cartas carta = new Ej08cartas();
    juego.add(carta);
    int contador = 1;
    boolean existe = true;
    
    while (contador < 10) {
      Ej08cartas carta2 = new Ej08cartas();
      for (int i=0; i < juego.size();i++) {
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
    for (int i=0; i < 10; i++) {
      System.out.println(juego.get(i));
    }
  }
}