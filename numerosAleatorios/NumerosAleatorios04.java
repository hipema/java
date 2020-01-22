package numerosAleatorios;

import java.util.Scanner;

/**
 *Ejercicio04
 *
 *	Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio.
 *	La cabeza se representará con el carácter @ y se debe colocar  exactamente en la posición 13
 *	(con 12 espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera:
 *	se generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter
 *	se  coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a
 *	la derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el
 *	usuario introducirá un dato correcto.
 *	Ejemplo:
 *	Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
            @
            *
             *
             *
             *
            *
            
 * 
 * VARIABLES
 * int longitud - indicará el largo total de la serpiente, incluyendo pa cabeza.
 * int posicion - indicará la posición a imprimir el símbolo *
 * int digito - esta variable, sera obtenida mediante número aleatorio y sumará 1, restará 1 o dejará igual la posición.
 * int i - contador para realizar el ciclo.
 * 
 * INICIO PROGRAMA 
 * 1.- Presentación al programa y petición de longitud al usuario.
 * 2.- Imprimimos la cabeza en la posición 13 mediante printf.
 * 3.- Calculamos la posición del cuerpo en el bucle mediante el uso de digito y posicion.
 * 4.- Incluimos un if para controlar que la posición no baje de 0, ya que sino, se produciría un error en el programa.
 *
 * @author manuelhidalgo
 * @since 23-11-2019
 */

public class NumerosAleatorios04 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		int longitud;
		int posicion =13;
		int digito;
		int i;
		// Inicio del programa y presentación al usuario.
		System.out.println("Este programa mostrará una serpiente de la longitud indicada por el usuario.\n");
		// Petición de longitud al usuario
		while (true) {
			System.out.print("Indica la longitud de la serpiente: ");
			longitud = scanner.nextInt();
		// Control de valor para una longitud adecuada.	
			if (longitud>=1) {
				break;
			} else {
				System.out.println("ERROR: introduce un valor positivo.");
			}
		}
		// Imprimimos la cabeza colocando en la posición 13.
		System.out.printf("%13s", "@\n");
		// Calculamos posición a imprimir del siguiente punto de la serpiente.
		for (i=1; i<longitud; i++) {
			digito = (int)(Math.floor(Math.random()*3-1));
			posicion = posicion + digito;
			// añadimos control de posición para evitar números negativos.
			if (posicion <0) {
				posicion = 0;
			}
			System.out.printf("%"+(posicion)+"s", "*\n");
		}
	}
}
