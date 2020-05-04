package juego21;

import java.io.Serializable;

/**
 * 
 * Clase dado.
 * En vez de pasar una lista al dado le pasamos los valores de las caras como parámetros.
 * Ocultamos el atributo "cara" del dado y accedemos a él a través de una propiedad para que no pueda ser cambiado.
 * Creamos una propiedad para que devuelva los valores de las caras.
 * 
 * @author manuelhidalgo
 *
 */

public class Dado implements Serializable {
  private int [] caras = new int[]{1,2,3,4,5,6};
  private int cara;
  
  Dado (){ 
    this.cara = caras[(int)(Math.random()*this.caras.length)];
  }

  public int[] getCaras() {
    return caras;
  }

  public int getCara() {
    return cara;
  }

  // Métodos
  
  public int tirada () {
    this.cara = caras[(int)(Math.random()*this.caras.length)];
    return this.cara;
  }
  
}
