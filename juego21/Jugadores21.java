package juego21;
import java.io.Serializable;

import juego21.Dado;

/**
 * Esta clase creará jugadores para el Juego de Dados "El 21".
 * Para su funcionamiento se valdrá de las clases Dado y Dados realizadas por Rafael del Castillo.
 * 
 * Necesitaremos realizar que cada objeto Jugador disponga de:
 *   nombre (str)
 *   dado 1, dado 2 (dado)
 *   tirar_un_dado (método)
 *   tirar_dos_dados (método)
 *   resultado_dados
 *   resultado_ronda
 *   borrar_resultado (método)
 *   contador_victorias
 */

public class Jugadores21 implements Serializable {
  private String nombre;
  private int resultado_ronda = 0;
  private int resultado_dados = 0;
  private int contador_victorias = 0;
  private Dado dado1 = new Dado();
  private Dado dado2 = new Dado();

  Jugadores21 (String nombre){
    this.nombre = nombre;
    
  }
  
  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public int getResultado_ronda() {
    return resultado_ronda;
  }

  public int getResultado_dados() {
    return resultado_dados;
  }

  public int getContador_victorias() {
    return contador_victorias;
  }

  private void setResultado_ronda(int resultado_ronda) {
    this.resultado_ronda = resultado_ronda;
  }

  private void setResultado_dados(int resultado_dados) {
    this.resultado_dados = resultado_dados;
  }
  
  public int getResultadoDado1() {
    return this.dado1.getCara();
  }
  
  public int getResultadoDado2() {
    return this.dado2.getCara();
  }
  
  // Métodos
  /**
   * Añade una victoria al jugador.
   */
  public void sumar_victoria() {
    this.contador_victorias++;
  }
  
  /**
   * Realiza una tirada con un dado, y suma el valor al resultado total de la ronda.
   */
  public void tiradaUndado() {
    this.dado1.tirada();
    setResultado_dados(dado1.getCara());
    setResultado_ronda(getResultado_ronda()+getResultado_dados());
  }
  
  /**
   * Realiza una tirada con los dados, sumado el valor de ambos al total de la ronda.
   */
  public void tiradaDosDados() {
    this.dado1.tirada();
    this.dado2.tirada();
    setResultado_dados(dado1.getCara()+dado2.getCara());
    setResultado_ronda(getResultado_ronda()+getResultado_dados());
  }
  
  /**
   * Borra los resultados de la tirada realizada para poner los marcadores a cero.
   */
  public void borrarResultado() {
    setResultado_ronda(0);
  }
  
  // Sobrecarga de funciones
  @Override
  public String toString() {
    return getNombre() +"\t ---- \t"+ getContador_victorias() + "\n";
  }
}