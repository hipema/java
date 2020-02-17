package coleccionesDiccionarios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ejercicio 3 (Página 228 Aprende Java).
 * Escribe un programa que ordene 10 números enteros introducidos
 * por teclado y almacenados en un objeto de la clase ArrayList.
 * 
 * MÉTODOS A IMPLEMENTAR
 * Crear un arrayList
 * Ordenar ArrayList
 * @author manuelhidalgo
 *
 */

public class Ej03OrdenarArrayList {
  Scanner scanner = new Scanner(System.in);
  private ArrayList<Integer> listado;
  // ArrayList<String> listadoAleatorio = new ArrayList<String>();
  
  Ej03OrdenarArrayList (){
    ArrayList<Integer> resultado = new ArrayList<Integer>();
    for (int i=0; i<10; i++) {
      System.out.println("Introduce el número"+(i+1)+" ");
      int valor = scanner.nextInt();
      resultado.add(valor);
    }
    this.listado = resultado;
  }

  // Getters y Setters
  public ArrayList<Integer> getListado() {
    return listado;
  }
 
  public void ordenarArray () {
    Collections.sort(this.listado);
  }
  
  @Override
  public String toString() {
    return this.getListado().toString();
  }  
}
