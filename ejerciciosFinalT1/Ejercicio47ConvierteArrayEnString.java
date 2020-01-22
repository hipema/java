package ejerciciosFinalT1;

import ejerciciosFinalT1.FuncionesEjFinalT1;
import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para pintar las líneas.
 * 
 * Ejemplo 1:
 * Esta función toma como parámetro un array que contiene números y
 * devuelve una cadena de caracteres con esos números.
 * Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”;
 *							si a = { 8 },convierteArrayEnString(a) devuelve “8”;
 *							si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve “62501”.
 * 
 * @author manuelhidalgo
 * @since 10-12-2019
 *
 */
public class Ejercicio47ConvierteArrayEnString {
	public static void main(String[] args) {
		int[] array1 = {};
		int[]	array2 = {8};
		int[]	array3 = {1,3,4,6,7,0};
	
	System.out.println("El resultado de array1 es: "+FuncionesEjFinalT1.convierteArrayEnString(array1));
	System.out.println("El resultado de array2 es: "+FuncionesEjFinalT1.convierteArrayEnString(array2));
	System.out.println("El resultado de array3 es: "+FuncionesEjFinalT1.convierteArrayEnString(array3));
	}
}
