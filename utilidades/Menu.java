package utilidades;

public class Menu {
  private String titulo = null;
  private String[] opciones = null;
  private int numeroOpciones = 0;
  // Creamos un menú
  public Menu (String titulo, String[] opciones) {
    this.titulo = titulo;
    this.opciones = opciones;
    this.numeroOpciones = opciones.length;
  }
  
  // Métodos del menú
  
  /**
   * Muestra el menú con todas sus opciones.
   */
  private void mostrarMenu() {
    System.out.println(this.titulo);
    for (int i=0; i <this.titulo.length();i++) {
      System.out.print("-");
    }
    System.out.println();
    for (int i=0; i < this.numeroOpciones; i++) {
      if (i+1 < 10) {
        System.out.println((i+1)+"  " + opciones[i]);
      } else {
        System.out.println((i+1)+" " + opciones[i]);
      }
    }
    if (this.numeroOpciones+1 < 10) {
      System.out.println(this.numeroOpciones+1 + "  Salir");
    } else {
      System.out.println(this.numeroOpciones+1 + " Salir");
    }
  }
  
  private int elegirOpcion() {
    int opcionElegida;
    do {
      System.out.println("");
      opcionElegida = Teclado.leerNumeroEntero("Selecciona una opción: ");
    } while (opcionElegida < 1 || opcionElegida > this.numeroOpciones+1);
    return opcionElegida;
  }
  
  public int gestionar() {
    mostrarMenu();
    return elegirOpcion();
  } 
}