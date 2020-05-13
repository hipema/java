package entornos.junit.utiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Permite lectura desde teclado
 */
public class Teclado {

	/**
	 * Lee un car�cter del teclado
	 * 
	 * @return car�cter introducido por el usuario
	 */
	public static char leerCaracter() {
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch (Exception e) {
			caracter = 0;
		}
		return caracter;
	}

	/**
	 * Lee un car�cter del teclado
	 * 
	 * @param msj
	 *            mensaje mostrado al usuario
	 * @return car�cter introducido por el usuario
	 */
	public static char leerCaracter(String msj) {
		System.out.println(msj);
		return leerCaracter();
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @param msj
	 *            mensaje mostrado al usuario
	 * @return cadena introducida por el usuario
	 */
	public static String leerCadena(String msj) {
		System.out.println(msj);
		return leerCadena();
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @return cadena introducida por el usuario
	 */

	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); // Lee una l�nea de texto (hasta intro)
		} catch (Exception e) {
			cadena = "";
		}
		return cadena;
	}

	/**
	 * Lee un entero del teclado
	 * 
	 * 
	 * @return entero introducido por el usuario
	 */
	public static int leerEntero() {
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); // Quita los espacios del
														// String y convierte a
														// int
		} catch (Exception e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee una entero del teclado
	 * 
	 * @param msj
	 *            mensaje mostrado al usuario
	 * @return entero introducida por el usuario
	 */
	public static int leerEntero(String msj) {
		System.out.println(msj);
		return leerEntero();
	}

	/**
	 * Lee un decimal del teclado
	 * 
	 * @return decimal introducido por el usuario
	 */
	public static double leerDecimal() {
		double x;
		try {
			x = Double.parseDouble(leerCadena().trim()); // Quita los espacios
															// del String y
															// convierte a
															// double
		} catch (Exception e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee una decimal del teclado
	 * 
	 * @param msj
	 *            mensaje mostrado al usuario
	 * @return decimal introducida por el usuario
	 */
	public static double leerDecimal(String msj) {
		System.out.println(msj);
		return leerDecimal();
	}

}
