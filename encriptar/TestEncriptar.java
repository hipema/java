package encriptar;
import encriptar.Encriptar;
import java.util.Scanner;

/**
 * 2. Crea un programa que encripte un fichero que le pasamos como parámetro y
 * almacene el resultado en otro, que también pasamos como parámetro, de manera
 * que: ARCHIVO EXISTENTE PARA HACER PRUEBA DE LECTURA: prueba01.txt 
 * - Si el programa no recibe dos parámetros termina con un error 1.
 * - Si el programa recibe un solo parámetro guardará la información encriptada en el mismo
 * archivo del que lee, pero antes advertirá al usuario de que machacará el
 * archivo origen, dando opción a que la operación no se haga. Si el fichero
 * origen no existe (da error al abrirlo como lectura) el programa termina con
 * un mensaje de error y código 2. Si en el fichero destino no se puede escribir
 * da error al abrirlo como lectura) el programa termina con un mensaje de error
 * y código 2. Para encriptar usa el método César, necesitarás una clave que
 * debes pedir al usuario.
 */

public class TestEncriptar {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      // Comprobamos la cantidad de argumentos recibida en la ejecución del programa.
      if (args.length == 1) {
        String opcion ="";
        // Lanzamos aviso de sobreescritura sobre el mismo archivo y preguntamos si continúa o no.
        do {
          System.out.println("La información encriptada se guardará en el mismo archivo de origen.\\n ¿Desea continuar? (s/n)");
          opcion = scanner.nextLine().toUpperCase();
        } while (!opcion.equals("S") && !opcion.equals("N"));
        // Java nos permite hacer el "do while", queda más elegante y sería más correcto que hacerlo como en python.

        // Si está de acuerdo en continuar, lanzamos la función encriptar.
        if (opcion.equals("s") || opcion.equals("S")) {
          Encriptar.encriptarFichero(args[0],args[0]);
        // Si no quiere continuar salimos del programa.
        } else {
          System.exit(0);
        }
      } else if (args.length==2) {
        // Si recibe dos argumentos, envía ambos archivos para utilizar la función Encriptar.
        Encriptar.encriptarFichero(args[0],args[1]);
      } else {
        // Lanzamos mensaje de error en caso de número incorrecto de argumentos.
        System.err.println("Error en el número de parámetros");
        System.exit(1);
      }
    } catch (Exception e){
      System.out.println("Se ha producido un error.");
      System.exit(1);
    }
  }
 }