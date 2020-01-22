package examen1T2018;

/*
 * Impresión de la quiniela de la jornada de fútbol (15 partidos) después de conocer los resultados.
 * 
 * Para ello vamos a utilizar dos matrices:
 * 
 * - Equipos:   matriz de cadenas de caracteres donde guardamos en cada columna el nombre 
 *              de los equipos de cada partido. En la quiniela se indican 15 partidos.
 * - Resultados: matriz de enteros donde se indica el resultado. También tiene dos columnas, 
 *              en la primera se guarda el número de goles del equipo que está guardado en la 
 *              primera columna de la tabla anterior, y en la segunda los goles del otro equipo.
 *              
 * El programa ira pidiendo los nombres de los equipos de cada partido y el resultado del partido,
 * guardará los datos donde corresponda y a continuación imprimirá la quiniela de esa jornada 
 * llamando a una función que recibirá ambas matrices.
 * 
 */

// Inicio del programa y declaración de variables:

public class Ejercicio02 {
  public static void main(String[] args) {
 /* String nombre;
    System.out.print("Dime tu nombre: ");
    nombre = System.console().readLine();
    System.out.println("Hola " + nombre);*/
  	
  	String equipos ="RealMadrid - Barcelona";
  	String[] arrayEquipos = equipos.split("-");
  	System.out.println(arrayEquipos[0].trim() +"+"+ arrayEquipos[1].trim());
  	
  	String resultado = "1-0";
  	String[] arrayResultado = resultado.split("-");
  	System.out.println();
  }
}