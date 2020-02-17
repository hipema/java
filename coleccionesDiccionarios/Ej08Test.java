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
    System.out.println(juego.get(0));
    System.out.println(juego.get(1));
    System.out.println(juego.get(2));
    System.out.println(juego.get(3));
    System.out.println(juego.get(4));
    System.out.println(juego.get(5));
    System.out.println(juego.get(6));
    System.out.println(juego.get(7));
    System.out.println(juego.get(8));
    System.out.println(juego.get(9));
    
//    // Mostramos el listado de objetos.
//    Ej08cartas carta = new Ej08cartas(1,"Oros");
//    System.out.println("La carta creada es:");
//    System.out.println(carta); 
    
    // Proceso de Crear una carta.
//    int numeroCarta = 8;
//    String[] paloCarta = {"Oros", "Espadas", "Bastos", "Copas"};
//    int numPalo;
//    while (numeroCarta == 8 || numeroCarta == 9) {
//      numeroCarta = (int)(Math.random()*12)+1;
//    }
//    numPalo = (int)(Math.random()*4);
//
//    Ej08cartas carta = new Ej08cartas(numeroCarta, paloCarta[numPalo]);
//
//    System.out.println(numeroCarta);
//    System.out.println(numPalo);
//
//    System.out.println(carta);
  }
}
