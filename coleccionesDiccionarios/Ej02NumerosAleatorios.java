package coleccionesDiccionarios;
import java.util.ArrayList;

/**
 * Ejercicio 2 (Página 228 Aprende Java).
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un 
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 * 
 * MÉTODOS A IMPLEMENTAR
 * crear ArrayList
 * suma
 * media
 * máximo
 * mínimo
 * 
 * @author manuelhidalgo
 *
 */

public class Ej02NumerosAleatorios {
  private ArrayList<Integer> listadoAleatorio;
  private int contador;
  // ArrayList<String> listadoAleatorio = new ArrayList<String>();
  
  Ej02NumerosAleatorios (){
    this.listadoAleatorio = this.creaArrayList();
  }

  // Getters y Setters
  
  public ArrayList<Integer> getListadoAleatorio() {
    return listadoAleatorio;
  }

  public int getContador() {
    return contador;
  }

  public void setListadoAleatorio(ArrayList<Integer> listadoAleatorio) {
    this.listadoAleatorio = listadoAleatorio;
  }

  public void setContador(int contador) {
    this.contador = contador;
  }
  
  // Métodos
  
  public ArrayList<Integer> creaArrayList() {
    /**
     * Crea un arrayList de longitud variable entre 10 y 20 con valores
     * entre 1 y 100.
     */
    int aleatorios = (int)(Math.random()*11)+10;
    ArrayList<Integer> resultado= new ArrayList<Integer>();
    for (int i = 0; i < aleatorios; i++) {
      resultado.add((int)(Math.random()*101));
    }
    this.contador = resultado.size();
    return resultado;
  }  

  public int sumaArrayList () {
    /**
     * Esta función realiza de los números incluidos en el ArrayList.
     */
    int sumatorio = 0;
    for (int i=0; i < this.listadoAleatorio.size(); i++){
      sumatorio += this.listadoAleatorio.get(i);
    }
    return sumatorio;
  }
  
  public double mediaArrayList () {
    double media = (double)this.sumaArrayList()/(double)this.contador;
    return media;
  }
  
  public int maximoArrayList () {
    int maximo = 0;
    for (int i=0; i < this.listadoAleatorio.size(); i++) {
      if (maximo < this.listadoAleatorio.get(i)) {
        maximo = this.listadoAleatorio.get(i);
      }
    }
    return maximo;
  }
  
  public int minimoArrayList () {
    int minimo = 101;
    for (int i=0; i < this.listadoAleatorio.size(); i++) {
      if (minimo > this.listadoAleatorio.get(i)) {
        minimo = this.listadoAleatorio.get(i);
      }
    }
    return minimo;
  }
  
  @Override
  public String toString() {
    return this.getListadoAleatorio().toString();
  }

  
}
