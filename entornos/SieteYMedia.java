package entornos;

/**
 * Juego de las siete y media con arrays
 * @author Jaime Rabasco
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SieteYMedia {

  /**
   * 
   * Almacena las 40 cartas en un array bidimensional. Toma de forma aleatoria una
   * de ellas y las va acumulando.
   * 
   * El jugador decide si seguir arriesgando o no
   * 
   */

  public static void main(String[] args) throws IOException {

    char respuesta = 'n'; // Si no la inicializo me da error al compilar
    BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    int i, j;
    float acumulado = 0;

    int[][] cartas = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }; // declaraci�n, construcci�n e inicializaci�n
    do {
      do {
        i = (int) (Math.random() * 4);
        j = (int) (Math.random() * 10);

        System.out.println("Tu carta es: " + ((cartas[i][j] > 7) ? 0.5 : cartas[i][j]));
      } while (cartas[i][j] == 0);// carta ya seleccionada. No puedo repetirla.
      switch (cartas[i][j]) {
      case 8:
      case 9:
      case 10:
        acumulado += 0.5;
        break;

      default:
        acumulado += cartas[i][j];
      }// switch

      cartas[i][j] = 0;// Marco la carta como seleccionada
      System.out.println("Tienes acumulado: " + acumulado);
      if (acumulado == 7.5)
        System.out.println("EUREKA. Has ganado");
      else if (acumulado > 7.5)
        System.out.println("Te has pasado. Has perdido");
      else {
        System.out.println("Quieres otra (s/n)? ");
        respuesta = bReader.readLine().charAt(0);
      }
    } while ((respuesta == 's') && (acumulado <= 7.5));
    for (i = 0; i < cartas.length; i++) {
      System.out.print("\n");
      for (j = 0; j < cartas[i].length; j++)
        System.out.print(cartas[i][j] + "\t");
    }
  }
}