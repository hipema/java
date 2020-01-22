package arrays;

/**
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números enteros que contenga las siguientes funciones:
 * 1. -generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. -minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. -maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 4. -mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. -estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. - posicionEnArray: Busca un número en un array y devuelve la posición
 * 		 (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. -rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
 * 		 array.
 * 9. -rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
 * 		 un array.
 * 
 * @author manuelhidalgo
 *
 */
public class FuncionesEjercicios20a28 {

	/**
	 * Genera un array de números aleatorios de tamaño n, pasados los valores de máximo y mínimo .
	 * @param n - tamaño del array
	 * @param min - valor mínimo del rango de números aleatorios.
	 * @param max - valor máximo del rango de números aleatorios.
	 * @return devuelve el array generado
	 */
	public static int[] generaArrayInt (int n, int min, int max) {
		int[] array = new int[n];
	
		for (int i=0; i<n;i++) {
			array[i]=(int)(Math.random()*(max+1-min)+min);
		}
		return array;
	}
	
	/**
	 * Calcula el valor mínimo de un array recibido por parámetro
	 * @param array - conjunto de valores enteros del que se calculará el mínimo
	 * @return número entero con el valor del mínimo.
	 */
	public static int minimoArrayInt (int[] array) {
		int valorMinimo = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < valorMinimo) {
				valorMinimo = array[i];
			}
		}
		return valorMinimo;
	}
	
	/**
	 * Calcula el valor máximo de un array recibido por parámetro
	 * @param array - conjunto de valores enteros del que se calculará el máximo
	 * @return número entero con el valor del máximno.
	 */
	public static int maximoArrayInt (int[] array) {
		int valorMaximo = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > valorMaximo) {
				valorMaximo = array[i];
			}
		}
		return valorMaximo;
	}
	
	/**
	 * Calcula la media de los valores de un array
	 * @param array - conjunto de valores pasados por el usuario
	 * @return
	 */
	public static double mediaArrayInt (int[] array) {
		double media;
		double sumaArray =0;
		for (int i = 0; i < array.length; i++) {
			sumaArray += array[i];
		}
		media = sumaArray/array.length;
		return media;
	}
	
	/**
	 * Esta función busca un valor n en un array.
	 * @param array - conjunto de valores en los que se realiza la búsqueda
	 * @param n - valor a buscar en el array
	 * @return devuelve verdadero en caso de encontrar el valor en el array
	 */
	public static boolean estaEnArrayInt (int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				return true; 
			}
		}
		return false;
	}
	
	/**
	 * Esta función busca la posición/es de un valor en un array
	 * @param array - conjunto de valores en los que buscar el valor
	 * @param n - valor a buscar en el array
	 * @return devuelve un vector de números enteros con las posiciones donde se encuentra el número.
	 */
	public static int[] posicionEnArrayInt (int[]array, int n) {
		int[] auxiliarPosicionValor = new int[array.length]; // vector con la longitud máxima para ir anotando las posiciones donde aparece n
		int j =0;
		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				auxiliarPosicionValor[j] = i;
				j++;
			}
		}
		if (j==0) {
			auxiliarPosicionValor[0]=-1;
			j++;
		}
		int[] posicionValor = new int[j]; // Creamos un array con la longitud de ocurrencias que aparece el valor
																			// dentro del array inicial. De este modo al imprimir por pantalla no
																			// aparecerán ceros de relleno.
		for (int i=0; i<j;i++) {
			posicionValor[i] = auxiliarPosicionValor[i];
		}
		return posicionValor;
	}
	
public static int[] volteaArrayInt(int[]array) {
	int[] arrayVolteado = new int[array.length];
	for (int i=0; i<array.length;i++) {
		arrayVolteado[array.length-1-i]=array[i];
	}
	return arrayVolteado;
}

	/**
	 * Rota n posiciones a la derecha los números de un
	 * array.
	 * 
	 * @param array - array pasado por el usuario
	 * @param n - número de posiciones a avanzar
	 */
	public static void rotaDerechaArrayInt (int[] array, int n) {
		int[] copia = new int[array.length];
		int c=n; // contador para el segundo array (copia)
		
		if (n>=0) {
			for (int i=0;i<array.length; i++) { // copiamos el array, en copia desplazandolo n posiciones a la derecha.
				copia[c] = array[i];
				c++;
				if (c == array.length) {
					c=0;
				}
			}
			for (int i=0; i< array.length; i++) { // llevo la copia al array que me llega como parámetro.
				array[i] = copia [i];
			}
		}else {
			c= Math.abs(n);
			FuncionesEjercicios20a28.rotaIzquierdaArrayInt(array,c);
		}	
	}
	
	/**
	 * Esta función rota a la izquierda un array 
	 * 
	 * @param array - valores recibidos por el usuario
	 * @param n - número de posiciones a trasladar a la izquierda
	 */
	
	public static void rotaIzquierdaArrayInt (int[] array, int n) {
		int[] copia = new int[array.length];
		int c=n; // contador para el segundo array (copia)
		
		for (int i=0;i<array.length; i++) { // copiamos el array, en copia desplazandolo n posiciones a la izquierda.
			if (array.length-1-c >=0) {
				copia[array.length-1-c] = array[array.length-1-i];
				c++;	
			}else {
				copia[array.length-1+(array.length-c)] = array[array.length-1-i];
				c++;
			}
		}
		// llevo la copia al array que me llega como parámetro.
		for (int i=0; i < array.length; i++) {
			array[i] = copia [i];
		}
	}
	
	/**
	 * Imprime un array.
	 * 
	 * @param array
	 */
	public static void imprimeArray (int[] array) {
		for (int n: array) {
			System.out.print(n+" ");
		}
	}
}
