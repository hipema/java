package matematicas;
import java.util.Scanner;
/**
 * Biblioteca de funcones matemáticas que contiene:
 * <ul>
 * <li>esCapicua: Devuelve verdadero si el número que se pasa como paráme- tro es capicúa y falso en caso contrario.</li>
 * <li>esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.</li>
 * <li>siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.</li>
 * <li>potencia: Dada una base y un exponente devuelve la potencia.</li>
 * <li>digitos: Cuenta el número de dígitos de un número entero.</li>
 * <li>voltea: Le da la vuelta a un número.</li>
 * <li>digitoN: Devuelve el dígito que está en la posición n de un número entero.</li>
 * <li>Se empieza contando por el 0 y de izquierda a derecha.</li>
 * <li>posicionDeDigito: Da la posición de la primera ocurrencia de un dígito</li>
 * <li>dentro de un número entero. Si no se encuentra, devuelve -1.</li>
 * <li>quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).</li>
 * <li>quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).</li>
 * <li>pegaPorDetras: Añade un dígito a un número por detrás.</li>
 * <li>pegaPorDelante: Añade un dígito a un número por delante.</li>
 * <li>trozoDeNumero: Toma como parámetros las posiciones inicial y final</li>
 * <li>dentro de un número y devuelve el trozo correspondiente.</li>
 * <li>juntaNumeros: Pega dos números para formar uno.</li>
 * </ul>
 * Ejercicios del libro "Aprende Java con Ejercicios". Edición 2019"
 * @author manuelhidalgo
 * @version 1.0
 * @since 9-12-19
 * 
 */
public class FuncionesEj1a14 {
	
	/**
	 * Esta función calcula si un número es primo. 
	 * @param n - valor recibido para calcular si es primo.
	 * @return  devuelve <strong>true</strong> en caso de que el número sea primo, <strong>falso</strong> en caso contrario.
	 * 
	 */
	public static boolean esPrimo (int n) {
		boolean creoQueEsPrimo = true;
		// casos triviales 1, 2, par.
		if (n==2) {
			return true;
		} else if (n%2==0 || n<=1) {
			return false;
		}
		
		for (int i=3; i<=Math.sqrt(n) && creoQueEsPrimo;i+=2) {
			if (n%i ==0) {
				creoQueEsPrimo = false;
			}
		}
		return creoQueEsPrimo;
	}
	
	/**
	 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 * 
	 * @param n - numero inicial pasado por el usuario a fin de localizar el siguiente primo.
	 * @return número entero con el valor del siguiente número primo.
	 */
	public static int siguientePrimo (int n) {
		int primoSiguiente = n+1; // Candidato a primo siguiente
		
		// proceso para encontrar el primo siguiente
		while (!esPrimo(primoSiguiente)) {
			primoSiguiente++;
		}
	return primoSiguiente;
	}
	
	/**
	 * Le da la vuelta a un número.
	 * 
	 * @param n - numero recibido que debemos modificicar.
	 * @return devuelve un entero con el número volteado.
	 */
// 	Opción realizada por mi
//	public static int voltea (int n) {
//		String numero;
//		String volteado=""; // se inicializa una cadena vacía donde se concatenará la cadena invertida.
// 
//		if (n<0) {
//			n = Math.abs(n);
//			numero = Integer.toString(n); // convertimos entero a cadena.
//			for (int i=numero.length()-1;i>=0;i--) { //realizamos el ciclo y vamos añadiendo los carácteres en orden inverso
//				volteado += numero.substring(i,i+1);
//			}
//			volteado = "-"+volteado;
//			return Integer.parseInt(volteado); //devolvemos el valor de la cadena volteada convertida a entero.
//		} else {
//			numero = Integer.toString(n); // convertimos entero a cadena.
//			for (int i=numero.length()-1;i>=0;i--) { //realizamos el ciclo y vamos añadiendo los carácteres en orden inverso
//				volteado += numero.substring(i,i+1);
//			}
//		return Integer.parseInt(volteado);//devolvemos el valor de la cadena volteada convertida a entero.
//		}
//	}>
	public static int voltea (int n) {
		String numero = Integer.toString(Math.abs(n));
		String volteado=""; // se inicializa una cadena vacía donde se concatenará la cadena invertida.
 
		for (int i=numero.length()-1;i>=0;i--) { //realizamos el ciclo y vamos añadiendo los carácteres en orden inverso
			volteado += numero.substring(i,i+1);
		}
		if (n<0) {
			return -1*Integer.parseInt(volteado); //devolvemos el valor de la cadena volteada convertida a entero.
		}else {
			return Integer.parseInt(volteado); //devolvemos el valor de la cadena volteada convertida a entero.
		}
	}
	
	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es capicúa
	 * y falso en caso contrario.
	 * 
	 * @param n - número recibido a valorar
	 * @return verdadero o falso
	 */
	public static boolean esCapicua (int n) {
		
		if (n ==FuncionesEj1a14.voltea(n)) { //comparamos si el número recibido es = al valor volteado, si es verdadero, es capicua.
			return true;
		}
		return false;
	}
	
	/**
	 * Esta función nos calcula el valor de una potencia, dada su base y exponente.
	 * @param exponente - número entero que recibimos como exponente.
	 * @param base - número recibido como base, puede ser un número real.
	 * @return valor del resultado de la potencia, tipo double.
	 */
	public static double potencia (int exponente, double base) {
    double resultado;
    
   	// Recibimos una base  y exponente, según valor del exponente realizamos operaciones.
  	if (exponente == 0) {
			resultado = 1;
		} else if (exponente > 0){
			resultado =1;
			for (int i=0; i<exponente;i++) {
				resultado = resultado * base;
			}
		} else {
			resultado=1;
			for (int i=0; i<Math.abs(exponente);i++) {
				resultado = resultado * base;
			}
			resultado = 1/resultado;
		}
  	return resultado;
	}
	
	/**
	 * Cuenta el número de dígitos de un número entero facilitado por el usuario.
	 * 
	 * @param n - número recibido a comprobar
	 * @return - número de caracteres del número recibido.
	 */
	public static int digitos (int n) {
		String numero;
		numero = Integer.toString(n); // Convertimos número a cadena
		return numero.length(); // devolvemos la longitud de la cadena
	}
	/**
	 * Devuelve el dígito que está en la posición "n" de un número entero.
	 * @param n - número a comprobar
	 * @param posicion - posición indicada para su búsqueda.
	 * @return - valor devuelto por la función.
	 */
	public static int digitoN (int n, int posicion) {
		String numero = Integer.toString(n); // Convertimos número a cadena
		return Integer.parseInt(numero.substring(posicion, posicion+1)); // buscamos el carácter en la posición indicada y convertimos a entero.
	}
	
	/**
	 * Da la posición de la primera ocurrencia de un dígito dentro de un número entero.
	 * Si no se encuentra, devuelve -1. Si el valor introducido tiene más de un dígito manda error "-2".
	 * @param n - numero a comprobar
	 * @param digitoComprobar - digito a buscar en el número
	 * @return - posición del dígito en la cadena numérica
	 */
	public static int posicionDeDigito (int n, int digitoComprobar) {
		String numero = Integer.toString(n); // Convertimos números a cadena
		String caracter = Integer.toString(digitoComprobar);
		
		if (caracter.length() != 1) { // Si se ha introducido más de un dígito a buscar lanza el mensaje -2 para mandar error.
			return (-2);
		}else {
			for (int i=0; i<numero.length(); i++) { // Si tiene un dígito, recorre la cadena comparando hasta encontrar la primera coincidencia.
		  	if (caracter.equals(numero.substring(i,i+1))) {
		  		return i;
		  	}
		  }
			return -1; // Si no hay coincidencia en el ciclo anterior, devuelve -1.
		}
	}
	
	/**
	 * Pega dos números enteros facilitados por el usuario para para formar uno.
	 * @param n - primer valor pasado por el usuario
	 * @param n2 - segundo valor pasado por el usuario
	 * @return devuelve un entero con los dos números juntos, en el orden de introducción.
	 */
	public static int juntaNumeros (int n, int n2) {
		String numero = (n+""+n2); // convertimos a cadena y unimos ambos numeros.
		return Integer.parseInt(numero); // devolvemos la cadena de ambos números como entero.
	}
	
	/**
	 * Le quita a un número n dígitos por detrás (por la derecha) a un número entero introducido por teclado.
	 * @param n - numero a modificar
	 * @param digitos - digitos a quitar
	 * @return - devuelve un entero con el número modificado
	 */
	public static int quitaPorDetras (int n, int digitos) {
		String numero = Integer.toString(n); // convertimos el número a cadena para operar con él
		String numeroRecortado = ""; // en esta variable almacenaremos el número creado durante el ciclo
		if (digitos >= numero.length()) { // Si el número de dígitos a quitar, es igual o superior al número original, devolvemos 0.
			return 0;
		} else {
			for (int i=0; i<numero.length()-digitos;i++) { // realizamos el ciclo desde el punto 0, hasta la longitud -numero de digitos.
				numeroRecortado = numeroRecortado + numero.substring(i,i+1);
			}
			return Integer.parseInt(numeroRecortado);	
		}
	}
	
	/**
	 * Le quita a un número n dígitos por delante (por la izquierda) a un número entero introducido por teclado.
	 * @param n - número a modificar
	 * @param digitos - digitos a quitar
	 * @return - devuelve un etnero con el número modificado.
	 */
	public static int quitaPorDelante (int n, int digitos) {
		String numero = Integer.toString(n); // convertimos el número a cadena para operar con él
		String numeroRecortado = ""; // en esta variable almacenaremos el número creado durante el ciclo
		if (digitos >= numero.length()) { // Si el número de dígitos a quitar, es igual o superior al número original, devolvemos 0.
			return 0;
		} else {
			for (int i=digitos; i<numero.length();i++) { // realizamos el ciclo desde el punto "digitos", hasta la longitud del número original.
				numeroRecortado = numeroRecortado + numero.substring(i,i+1);
			}
			return Integer.parseInt(numeroRecortado);	
		}
	}
	/**
	 * Añade un dígito a un número facilitado por el usuario por detrás.
	 * @param n - numero inicial
	 * @param digito - valor a añadir
	 * @return - número entero modificado.
	 */
	public static int pegaPorDetras (int n, int digito) {
		Scanner scanner = new Scanner(System.in);
		String digitoCadena= Integer.toString(digito);
		String numeroFinal;
		while (digitoCadena.length() != 1) {
			System.out.println("Se ha incluido un número de más de un dígito.");
			System.out.print("Indique qué dígito quiere añadir al final a "+n+": ");
			digito = scanner.nextInt();
			digitoCadena = Integer.toString(digito);
		}		
		numeroFinal = (n+""+digito);
		return Integer.parseInt(numeroFinal);
	}
	
	/**
	 * Añade un dígito a un número facilitado por el usuario por delante.
	 * @param n - numero inicial
	 * @param digito - valor a añadir al inicio del número
	 * @return - número entero modificado.
	 */
	public static int pegaPorDelante (int n, int digito) {
		Scanner scanner = new Scanner(System.in);
		String digitoCadena= Integer.toString(digito);
		String numeroFinal;
		while (digitoCadena.length() != 1) {
			System.out.println("Se ha incluido un número de más de un dígito.");
			System.out.print("Indique qué dígito quiere añadir al inicio a "+n+": ");
			digito = scanner.nextInt();
			digitoCadena = Integer.toString(digito);
		}		
		numeroFinal = (digito+""+n);
		return Integer.parseInt(numeroFinal);
	}
	/**
	 * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
	 * @param n - numero a modificar
	 * @param posicion1 - indice inicial
	 * @param posicion2 - indice final
	 * @return - devuelve un entero con el número modificado
	 */
	public static int trozoDeNumero (int n, int posicion1, int posicion2) {
		int numero1 = FuncionesEj1a14.quitaPorDelante(n, posicion1);
		int numero2 = FuncionesEj1a14.quitaPorDetras(numero1, posicion2);
		return numero2;
	}
	
}
