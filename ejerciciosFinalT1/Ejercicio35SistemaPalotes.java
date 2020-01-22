package ejerciciosFinalT1;

import ejerciciosFinalT1.FuncionesEjFinalT1;
import java.util.Scanner;

/**
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el ||||-|||-||||-
 * -||-|-||| en el sistema de palotes. Utiliza esta función en un programa para
 * comprobar que funciona bien. Desde la función no se debe mostrar nada por
 * pantalla, solo se debe usar print desde el programa principal.
 * 
 * @author manuelhidalgo
 * @since 10-12-19
 *
 */
public class Ejercicio35SistemaPalotes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Este programa convierte un número entero al sistema de palotes.");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.print("Introduce el número entero positivo: ");
		numero = scanner.nextInt();
		while (numero<0) {
			System.out.println("ERROR: el número introducido es negativo.");
			System.out.print("Introduce el número entero positivo: ");
			numero = scanner.nextInt();
		}
		System.out.println("El número "+numero+" en palotes es:");
		System.out.println(FuncionesEjFinalT1.convierteEnPalotes(numero));
	}
}
