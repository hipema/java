package coleccionesDiccionarios;

public class Ej02Test {

  public static void main(String[] args) {

    Ej02NumerosAleatorios Numeros = new Ej02NumerosAleatorios();
    System.out.println("ArrayList generado automáticamente con valores de 1" +
        "a 100 y una longitud variable de 10 a 20.");
    System.out.println(Numeros);
    System.out.println("");
    System.out.println("Número total de posiciones en este Array");
    System.out.println(Numeros.getContador());
    System.out.println();
    System.out.println("Suma de los valores aparecidos en el Array:");
    System.out.println(Numeros.sumaArrayList());
    System.out.println("Media de los valores obtenidos:");
    System.out.println(Numeros.mediaArrayList());
    System.out.println("Buscamos el valor máximo del Array:");
    System.out.println(Numeros.maximoArrayList());
    System.out.println("Buscamos el valor mínimo del Array:");
    System.out.println(Numeros.minimoArrayList());
  }

}
