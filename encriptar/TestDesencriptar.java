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

public class TestDesencriptar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      if (args.length == 1) {
        String opcion ="";
        while (!opcion.equals("s") && !opcion.equals("S") && !opcion.equals("n") && !opcion.equals("N")){
          System.out.println("La información encriptada se guardará en el mismo archivo de origen.\n ¿Desea continuar? (s/n)");
          opcion = scanner.nextLine();
        }
        if (opcion.equals("s") || opcion.equals("S")) {
          Desencriptar.desencriptarFichero(args[0],args[0]);
        } else {
          System.exit(0);
        }
      } else if (args.length==2) {
        Desencriptar.desencriptarFichero(args[0],args[1]);
      } // falta por lanzar la excepcioón
    } catch (Exception e){
      System.out.println("Error");
      System.exit(1);
    }
  }
 }