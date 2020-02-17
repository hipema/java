package coleccionesDiccionarios;

public class Ej03Test {

  public static void main(String[] args) {

    // Creamos un objeto ArrayList con 10 números introducidos a mano.
    Ej03OrdenarArrayList numeros = new Ej03OrdenarArrayList();
    
    // Mostramos el listado de objetos.
    System.out.println("Los números introducidos son:");
    System.out.println(numeros);
    
    // Ordenamos los 10 números:
    System.out.println("El ArrayList ordenado es el siguiente:");
    numeros.ordenarArray();
    System.out.println(numeros);
 
  }
 }
