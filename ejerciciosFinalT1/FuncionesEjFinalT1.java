package ejerciciosFinalT1;
/**
 * Paquete que incluye las funciones para la realización de los ejercicios 35, 37, 42, 47, 50
 * del libro "Aprende a programar con Java 2019" a partir de la página 150.
 * 
 * @author manuelhidalgo
 * @since 10-12-19
 * @version 1.0
 *
 */

public class FuncionesEjFinalT1 {
	
	/**
	 * Esta función pasa un número entero de n dígitos convertido al sistema de palotes.
	 * Ej: 	1243
	 * 			| - || - |||| - |||
	 * @param n - número entero a convertir
	 * @return - String con la cadena de palotes
	 */
	public static String convierteEnPalotes(int n) {
		String numeroCadena = Integer.toString(n); // Convertimos el número n a cadena. 
		String cadenaResultado ="";
		
		for (int i=0; i<numeroCadena.length();i++) {	//recorremos cada dígito del número convertido a cadena y almacenamos
																									//su equivalente en "palotes" en cadenaResultado
			if (i==0) {
				cadenaResultado += palotes(Integer.parseInt(numeroCadena.substring(i,i+1))); // Utilizamos la funcion palotes
			} else {
				cadenaResultado += " - "+ palotes(Integer.parseInt(numeroCadena.substring(i,i+1)));
			}
		}
		return cadenaResultado;
		
	}
	/**
	 * Convertimos un número de 0 a 9 al sistema de palotes.
	 * @param n - número recibido
	 * @return - devolvemos String de palotes.
	 */
	public static String palotes (int n) {
		String cadena="";
		for (int i=0; i<n;i++) {
			cadena+="|";
		}
		return cadena;
	}
	
	/**
	 * Esta función convierte a código morse un número entero.
	 * @param n - número pasado por el usuario a convertir.
	 * @return valor tipo String con la cadena equivalente en código morse.
	 */
	public static String codigoMorse (int n) {
		String cadenaNumeros = Integer.toString(n);
		String cadenaEnMorse ="";
		int valorDigito;
		for (int i=0; i<cadenaNumeros.length();i++) {
			valorDigito = Integer.parseInt(cadenaNumeros.substring(i,i+1));
			cadenaEnMorse += " "+caracterEnMorse(valorDigito);
		}
		return cadenaEnMorse;
	}
	
	/**
	 * Esta función traduce un dígito en concreto a su código Morse.
	 * @param digito - valor a traducir
	 * @return valor tipo String equivalente en morse.
	 */
	public static String caracterEnMorse (int digito) {
		// Creamos unas equivalencias entre dígito y su correspondiente escritura en morse.
		String caracterMorse ="";
		switch (digito) {
		case 0:
			caracterMorse = "_____";
			break;
		case 1:
			caracterMorse = ".____";
			break;
		case 2:
			caracterMorse = "..___";
			break;
		case 3:
			caracterMorse = "...__";
			break;
		case 4:
			caracterMorse = "...._";
			break;
		case 5:
			caracterMorse = ".....";
			break;
		case 6:
			caracterMorse = "_....";
			break;
		case 7:
			caracterMorse = "__...";
			break;
		case 8:
			caracterMorse = "___..";
			break;
		case 9:
			caracterMorse = "____.";
		}
		return caracterMorse;
	}
	/**
	 * Esta función nos imprime un triángulo de la altura pasada por
	 * parámetro.
	 * @param n - altura solicitada para el triángulo.
	 */
	public static void imprimirTriangulo(int n) {
		int contador = n-1;
		// Realiza el pintado de la base del triángulo
		for (int i=0; i<n;i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i=0;i<n-1;i++) {
			System.out.print("*");
			imprimeLineaTriangulo(contador);
			System.out.println("");
			contador--;
		}
	}
	/**
	 * Esta función nos imprime una línea del triángulo.
	 * deja todos los huecos blancos hasta llega a la última posición.
	 * @param n - posición máxima de la línea
	 */
	public static void imprimeLineaTriangulo(int n) {
		int contador = n-1;
		for (int i=0; i<contador;i++) {
			if (i==contador-1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
	}
	/**
	 * Esta función convierte en cadena un array recibido de números enteros.
	 * @param array - datos enviados por el usuario
	 * @return devuelve un String con los valores del array concatenados.
	 */
	public static String convierteArrayEnString(int[] array){
		String cadena="";
		for (int i=0; i<array.length;i++) {
			cadena += array[i];
		}
		return cadena;
	}
	/**
	 *  * Esta función toma dos arrays como parámetros y devuelve un array que es el
	 * resultado de mezclar los números de ambos de forma alterna, se coge un número
	 * de a, luego de b, luego de a, etc. Los arrays a y b pueden tener longitudes
	 * diferentes; por tanto, si se terminan los números de un array se terminan de
	 * coger todos los que quedan del otro.
	 * Ejemplos:
	 * Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
	 * Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
	 * Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
	 * Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
	 * @param array1 - primer conjunto de valores pasado por el usuario
	 * @param array2 - segundo conjunto de valores pasado por el usuario
	 * @return - devolución de un array de enteros con la mezcla de ambos vectores.
	 */
	public static int[] mezcla(int[] array1, int[] array2) {
		int valorMaximo = array1.length+array2.length; //valor máximo de espacios que tendrá el nuevo array
		int mayor; // en esta variable guardaremos el valor de longitud máxima de los dos arrays
		int[] arrayMezclaIntermedio = new int [valorMaximo];
		int[]	arrayMezclaFinal;
		int contador =0;
		
		if (array1.length<array2.length) {
			mayor = array2.length;
		} else {
			mayor = array1.length;
		}
		
		for (int i=0; i<mayor;i++) {
			if (i<array1.length) {
				arrayMezclaIntermedio[contador]=array1[i];
				contador++;
			}
			if (i<array2.length) {
				arrayMezclaIntermedio[contador]=array2[i];
				contador++;
			}
		}
		arrayMezclaFinal = new int [contador];
		for (int i=0;i<contador; i++) {
			arrayMezclaFinal[i]=arrayMezclaIntermedio[i];
		}
		return arrayMezclaFinal;
	}
	public static void imprimeArray(int[] array) {
		System.out.print("{");
		for (int i=0;i<array.length;i++) {
			if (i==array.length-1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i]+",");	
			}
		}
		System.out.print("}");
		
	}
}

