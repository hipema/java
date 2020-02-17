package coleccionesDiccionarios;
import java.util.ArrayList;

public class Ej08Test {

  public static void main(String[] args) {
    ArrayList<Ej08cartas> juego = new ArrayList<Ej08cartas>();
    int contador = 0;
    while (contador < 10) {
      Ej08cartas carta = new Ej08cartas();
      if (!juego.contains(carta)){
        juego.add(carta);
        contador ++;
      }  
    }
    for (int i=0; i < 10; i++) {
      System.out.println(juego.get(i));
    }    
  }
}
