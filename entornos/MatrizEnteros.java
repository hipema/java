package entornos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
* Crea y modifica un array con valores consecutivos (desde el 1) con los datos del usuario, que introduce el tamaño.
* Los valores (1, 2.. tamaño) podrán modificarse tantas veces como quiera el usuario, al que se le pedirá la posición
* y el nuevo valor. Se mostrará todo el array al final.
* @author Jaime Rabasco Ronda 
*/

public class MatrizEnteros {
  public static void main(String[] args) throws IOException {
    BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    int i, tamanno, posicion, valor; 
    char respuesta;
    
    do {
      //Solicitamos longitud del array
      System.out.println("Vamos a crear un array con valores consecutivos. Dame la longitud del array (entero positivo):");
      //El número ha de ser positivo
      tamanno = Integer.parseInt(bReader.readLine().trim());
    }while (tamanno<1);
    
    int[] a = new int[tamanno];
    
    //Inicializamos con valores consecutivos
    for (i=0; i<tamanno;i++)
      a[i] =  i + 1;
    
    //Modificamos elementos
    System.out.println("Ahora vamos a modificar el array.");
    do{
      
      do {
        System.out.println("Dame un elemento del array (entre 1 y "+tamanno+"): ");
        posicion = Integer.parseInt(bReader.readLine().trim());
      }while ((posicion<1)||(posicion>tamanno));
      System.out.println("Dame un valor para introducir en la posición "+posicion+" del array: ");
      valor = Integer.parseInt(bReader.readLine().trim());
      a[posicion-1] = valor;
      System.out.println("¿Quieres modificar otro (s/n)? ");
      respuesta = bReader.readLine().charAt(0);
    }while(respuesta == 's');
    
    //Visualizamos el array
    for (i=0; i<tamanno;i++)
      System.out.println("a["+i+"] = " + a[i] );  
  }
}