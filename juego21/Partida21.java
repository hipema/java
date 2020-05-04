package juego21;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import juego21.Jugadores21;
import utilidades.Teclado;

/**
 * Este programa nos permite realizar una partida al juego "el 21" para un número de jugadores que será elegido por el
 * usuario y para un total de rondas que podrás seleccionar.
 * Clases propias utilizadas: Partida21, Jugadores21
 * 
 * REGLAS:
 * Jugadores: 2 ó +
 * Objetivo:
 * Alcanzar el puntaje , total de 21 puntos o aproximarse a dicha cifra, lo más posible pero sin pasarla.
 * Comienzo:
 * Cada jugador tira un dado para determinar el orden del juego. Sale primero el que saca la mayor suma.
 * Si dos participantes sacan el mismo número en el tiro preliminar, vuelven a tirar hasta que desempaten.
 * El juego prosigue en el sentido de las agujas del reloj.
 * 
 * Hay una ventaja estratégica en ser el Ultimo: le resulta posible ver cuanto tiene que sacar para ganar y se arriesgará
 * consecuentemente.
 * 
 * Todos los participantes apuestan la misma cantidad de dinero, determinada de antemano.
 * 
 * 4.Desarrollo
 * El participante juega solo una vez por vuelta. Puede tirar los dados tantas veces como lo desee y puede plantarse en
 * cualquier momento mientras el puntaje no sea mayor de 21. Cada tiro se va sumando al anterior. Cuando se alcanza un total
 * de 14 o más, pasa a jugar con un dado. Por supuesto, que un jugador desafortunado puede fracasar con un tiro alto aun
 * cuando no haya tenido la oportunidad de pasar a un dado.
 * 
 * Si un jugador alcanza un puntaje mayor de 21 pierde inmediatamente queda fuera de juego.
 * 
 * Después que todos hayan intervenido, el participante cuyo total este más cerca de los 21 puntos - pero no supere dicha
 * cifra - gana el pozo. Si empatan dos o más competidores, seguirán tirando hasta que se determine el ganador. El último en
 * empatar tira primero.
 * 
 * 5.Estrategia
 * La estrategia más elemental puede abreviarse de la siguiente forma:
 * El participante que haya alcanzado un total de 17 puntos o menos debe arriesgar otro tiro.
 * 
 * El que haya logrado un total de 19 puntos o más, deberá quedarse con ese total a menos que otro competidor haya obtenido
 * ya los 20 o 21 puntos.
 * 
 * Quien haya alcanzado un total de 18 puntos puede plantarse o tirar nuevamente, ya que tres posibles resultados de su
 * próximo tiro lo acercarán a 21 y tres lo harán pasarse de dicha cifra.
 * 
 * Por supuesto, los últimos participantes estarán influidos por el éxito o el fracaso de los anteriores. Por ejemplo, si
 * uno de los primeros jugadores ha alcanzado un total de 20 puntos, los competidores posteriores estarán forzados a tirar
 * nuevamente aun cuando hayan llegado a 19. En esta situación es probable que se pase de 21, pero no tiene sentido quedarse
 * con un total perdedor.
 * 
 * @author manuelhidalgo
 * @date 20 Abril 2020
 *
 */



public class Partida21 {

  public static void main(String[] args) throws FileNotFoundException, IOException, EOFException {
    // Comienza la partida, elegimos cantidad de Jugadores
    System.out.println("Bienvenido al JUEGO DEL 21.\n"+
        "Este juego consiste en tirar dados hasta aproximarse lo máximo posible al número 21\n"+
        "sin pasarse, si se pasa queda eliminado. Gana el juador que más se acerque.");
    System.out.println("-----------------------------------------------------------------------------------\n");
    // Cargar una lista de jugadores antigua
    String partida = "";
    ArrayList <Jugadores21> jugadores = new ArrayList<Jugadores21>();
    do {
      partida = Teclado.leerCadena("¿Deseas continuar con el historial de una partida anterior? (s/n)");
    } while (partida.toUpperCase().compareTo("S") != 0 && partida.toUpperCase().compareTo("N") != 0);
    
    if (partida.toUpperCase().compareTo("S") == 0) {
      try {
        String nombreArchivo = Teclado.leerCadena("Nombre del archivo:");
        FileInputStream manejador = new FileInputStream(nombreArchivo);
        ObjectInputStream archivo = new ObjectInputStream(manejador);
        // Se lee el primer objeto
        while (manejador.available()>0) {
          jugadores.add((Jugadores21)archivo.readObject());
        }
        manejador.close();
        archivo.close(); 
        
      } catch (Exception e) {
        System.err.println("Archivo no encontrado.");
        System.exit(1);
      }
    } else if (partida.toUpperCase().compareTo("N") == 0) {
      System.out.println("\nComenzamos una nueva partida.");
      // Elección número de jugadores y alta
      int numero = Teclado.leerNumeroEntero("¿Número de jugadores? ");
      jugadores = altaJugadores(numero);
      System.out.println();
    }
    
    // Elección de número de rondas
    int rondasTotales = Teclado.leerNumeroEntero("¿Cuántas rondas queréis jugar? ");
    System.out.println();
    System.out.println("Jugadores para la partida:");
    System.out.println("-------------------------");
    System.out.println(listarPartida(jugadores));
    System.out.println();
    
    // Tirada inicial para selección de orden
    System.out.println(Teclado.leerCadena("Pulsa \"Enter\" para dar inicio a la tirada automática de cada usuario que seleccionará el orden de la partida"));
    rondaInicial(jugadores);
    System.out.println();
    System.out.println(Teclado.leerCadena("Pulsa \"Enter\" para ver el orden final de la partida"));
    System.out.println(listarPartida(jugadores));
    
    // Jugamos rondas
    for (int i=0; i < rondasTotales; i++) {
      System.out.println("Ronda " + (i+1) +": ");
      jugarRondaTodos(jugadores);
    }
    String tirar = "";
    do {
      tirar = Teclado.leerCadena("¿Quieres jugar otra ronda? (s/n) ");
    } while (tirar.toUpperCase().compareTo("S") != 0 && tirar.toUpperCase().compareTo("N") != 0);
    
    if (tirar.toUpperCase().compareTo("S") == 0) {
      jugarRondaTodos(jugadores);
    } else if (tirar.toUpperCase().compareTo("N") == 0) {
      String guardar = "";
      do {
        guardar = Teclado.leerCadena("¿Deseas guardar el historial de victorias para una próxima partida? (s/n) ");
        if (guardar.toUpperCase().compareTo("S") == 0) {
         
            String nombreArchivo = Teclado.leerCadena("Indica el nombre del fichero: ");
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            for (int i=0; i < jugadores.size(); i++) {
                archivo.writeObject(jugadores.get(i));
            }
            archivo.close();  // Se cierra al terminar.
        }
      } while (guardar.toUpperCase().compareTo("S") != 0 && guardar.toUpperCase().compareTo("N") != 0);
      System.out.println("Fin de la partida. Gracias por jugar al 21");
    }
 
  // Métodos  
  }
  public static ArrayList<Jugadores21> altaJugadores(int numero) {
    ArrayList <Jugadores21> jugadores = new ArrayList<Jugadores21>();
    for (int i=0; i<numero; i++) {
      String nombreJugador = "j"+(i+1)+": "+Teclado.leerCadena("Introduce nombre del jugador "+(i+1)+": ");
      Jugadores21 jugador = new Jugadores21(nombreJugador);
      jugadores.add(jugador);
    }
    return jugadores;
  }
  
  public static String listarPartida (ArrayList<Jugadores21> jugadores) {
    String salida = "";
    for (int i=0; i<jugadores.size(); i++) {
      salida += jugadores.get(i).toString();
    }
    return salida;
  } 
  
  public static void rondaInicial (ArrayList<Jugadores21> jugadores) {
    ArrayList<Jugadores21> jugadores2 = new ArrayList<Jugadores21>();
    for (int i=0; i < jugadores.size(); i++) {
      jugadores2.add(jugadores.get(i));
      jugadores2.get(i).borrarResultado();
//      System.out.println(jugadores.get(i));
//      System.out.println(jugadores2.get(i));
    }
    int maximo = 0;
    while (jugadores2.size() > 1) {
      if (jugadores2.size() != jugadores.size()) {
        System.out.println("Hay un empate, se juega una ronda de desempate entre las puntuaciones máximas.");
      }
      for (int i=0; i < jugadores2.size(); i++) {
        jugadores2.get(i).tiradaUndado();
        System.out.println("Resultado de "+ jugadores2.get(i).getNombre()+ " es "+ jugadores2.get(i).getResultado_ronda());
        if (jugadores2.get(i).getResultado_ronda() > maximo) {
          maximo = jugadores2.get(i).getResultado_ronda();
        }
      }
      // Eliminamos de la lista los jugadores que hayan obtenido un resultado inferior al máximo
      int aux=0;
      while (jugadores2.size()>1 && aux < jugadores2.size()) {
        if (jugadores2.get(aux).getResultado_ronda() != maximo) {
          jugadores2.remove(aux);
        } else {
          aux++;
        }
      }
      // Reiniciamos los contadores
      for (int i=0; i < jugadores2.size(); i++) {
        jugadores2.get(i).borrarResultado();
      }
      maximo = 0;
      System.out.println();
    }
    // Sólo queda un jugador, empezará la partida por él.
    System.out.println("Empieza a jugar: "+jugadores2.get(0).getNombre());
    
    // Reordenamos el arrayList para los jugadores.
    ArrayList<Jugadores21> auxiliar = new ArrayList<Jugadores21>();
    int indice = 0;
    int j=0;
    for (int i=0; i < jugadores.size(); i++) {
      if (jugadores2.get(0).getNombre() == jugadores.get(i).getNombre()) {
        indice = i;
        j = 0;
      }
    }
    for (int i=0; i< jugadores.size(); i++) {
      if ((indice+i) < jugadores.size()) {
        auxiliar.add(jugadores.get(indice+i));
      } else {
        auxiliar.add(jugadores.get(j));
        j++;
      }
    }
    jugadores.clear();
    for (int i=0; i < auxiliar.size(); i++) {
      jugadores.add(auxiliar.get(i));
    }
  }
  
  public static String preguntarLanzar () {
    String lanzar = Teclado.leerCadena("¿Deseas volver a lanzar? (si deseas lanzar pulsa \"A\", para plantarte pulsa \"B\". \n");
    while (lanzar.toUpperCase().compareTo("A") != 0 && lanzar.toUpperCase().compareTo("B") != 0) {
      lanzar = Teclado.leerCadena("Opción no encontrada. Pulse \"A\" para realuzar su tirada o \"B\" si desea plantarse. \n");
    }
    return lanzar;
  }
  
  public static void mostrarPreResultado2Dados (Jugadores21 jugador) {
    System.out.println("Resultado dado 1: " + jugador.getResultadoDado1());
    System.out.println("Resultado dado 2: " + jugador.getResultadoDado2());
    System.out.println("Resultado tirada: " + jugador.getResultado_dados());
    System.out.println("Resultado acumulado en esta ronda: " + jugador.getResultado_ronda() + "\n");
  }
  
  public static void mostrarPreResultado1Dado (Jugadores21 jugador) {
    System.out.println("Resultado tirada: " + jugador.getResultadoDado1());
    System.out.println("Resultado acumulado en esta ronda: " + jugador.getResultado_ronda());
  }
  
  public static int jugarRonda (Jugadores21 jugador) {
    String lanzar = Teclado.leerCadena("pulsa \"A\" para lanzar los dados. \n");
    while (lanzar.toUpperCase().compareTo("A") != 0) {
      lanzar = Teclado.leerCadena("Opción no encontrada, pulse \"A\" para realizar su tirada. \n");
    }
    jugador.tiradaDosDados();
    mostrarPreResultado2Dados(jugador);
    
    while (jugador.getResultado_ronda() < 14) {
      lanzar = preguntarLanzar();
      if (lanzar.toUpperCase().compareTo("A") == 0) {
        jugador.tiradaDosDados();
        mostrarPreResultado2Dados(jugador);
      } else {
        System.out.println("Resultado final de ronda: " + jugador.getResultado_ronda()+"\n");
        return jugador.getResultado_ronda();
      }
    }
    while (jugador.getResultado_ronda()<= 21) {
      if (jugador.getResultado_ronda() == 21) {
        System.out.println("Has logrado la puntuación máxima.\n");
        return jugador.getResultado_ronda();
      }
      System.out.println("Estás muy cerca del límite, a partir de ahora, tirarás con un único dado.\n");
      lanzar = preguntarLanzar();
      if (lanzar.toUpperCase().compareTo("A") == 0) {
        jugador.tiradaUndado();
        mostrarPreResultado1Dado(jugador);
      } else {
        System.out.println("Resultado final de ronda: " + jugador.getResultado_ronda()+ "\n");
        return jugador.getResultado_ronda();
      } 
    }
    System.out.println("Has superado el límite de 21, quedas eliminado automáticamente.\n");
    return jugador.getResultado_ronda();
  }
  
  public static void jugarRondaTodos (ArrayList<Jugadores21> jugadores) {
    ArrayList<Jugadores21> jugadores2 = new ArrayList<Jugadores21>();
    for (int i=0; i < jugadores.size(); i++) {
      jugadores.get(i).borrarResultado();
      jugadores2.add(jugadores.get(i));
    }
    int maximo = 0;
    // Siempre que haya más de un jugador aún en este array repetiremos la tirada para romper con los desempates.
    while (jugadores2.size() > 1) {
      if (jugadores2.size() != jugadores.size()) {
        System.out.println("Hay un empate, se juega una ronda de desempate entre las puntuaciones máximas.");
      }
      for (int i=0; i < jugadores2.size();i++) {
        System.out.println("\nTurno de "+jugadores2.get(i).getNombre());
        jugarRonda(jugadores2.get(i));
        if (jugadores2.get(i).getResultado_ronda() > maximo && jugadores2.get(i).getResultado_ronda() <= 21) {
          maximo = jugadores2.get(i).getResultado_ronda();
        }
      }
      int aux = 0;
      // Eliminamos de la lista los jugadores que hayan obtenido un resultado inferior al máximo
      while (jugadores2.size() > 1 && aux < jugadores2.size()) {
        if (jugadores2.get(aux).getResultado_ronda() != maximo) {
          jugadores2.remove(aux);
        } else {
          aux++;
        }
      }
      // Reiniciamos lo contadores
      for (int i=0; i < jugadores2.size(); i++) {
        jugadores2.get(i).borrarResultado();        
      }
      maximo = 0;
      System.out.println();
    }
    // Sólo queda un jugador
    System.out.println("Gana la ronda: "+jugadores2.get(0).getNombre()+"\n");
    System.out.println("Clasificación");
    System.out.println("-------------");
    jugadores2.get(0).sumar_victoria();
    System.out.println(listarPartida(jugadores));
    System.out.println("-------------");
  }
}
