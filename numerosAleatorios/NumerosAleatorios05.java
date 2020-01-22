package numerosAleatorios;

import java.util.Scanner;

/**
 *Ejercicio05
 *
 *	Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *	separados por espacios. Muestra también el máximo, el mínimo, la moda, la
 * 	media, la mediana y la desviación típica de esos números.
 * 
 * VARIABLES
		int control;
		int[] numeros = new int[50];
		int i; // variable para recorrer el array de los números
		int j; // variable para recorrer el array a modo de comparación
		int max = 99;
		int min = 200;
		int suma = 0;
		int contador=0; // cuenta cada repetición de valor en el array
		int auxiliar=0; // variable que sirve para almacenar el valor máximo de repeticiones de un valor en el array
		int moda=0;
		double desviacion = 0;
		int[] mediana = new int[50];
		int auxiliarArray;
		int minOperaciones;
		double medianaFinal;
 *
 * @author manuelhidalgo
 * @since 23-11-2019
 */

public class NumerosAleatorios05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int control;
		int[] numeros = new int[50];
		int i; // variable para recorrer el array de los números
		int j; // variable para recorrer el array a modo de comparación
		int max = 99;
		int min = 200;
		int suma = 0;
		int contador=0; // cuenta cada repetición de valor en el array
		int auxiliar=0; // variable que sirve para almacenar el valor máximo de repeticiones de un valor en el array
		int moda=0;
		double desviacion = 0;
		int[] mediana = new int[50];
		int auxiliarArray;
		int minOperaciones;
		double medianaFinal;
		
		System.out.println("Este programa generará 50 números enteros entre 100 y 199 e indicará máximo, mínimo, moda, media, medina y desviacion típica de la cadena..\n");
		while (true) {
			System.out.print("Pulsa 1 para iniciar el programa: ");
			control = scanner.nextInt();
			if (control==1) {
				break;
			}
		}
		for (i=0;i<50;i++) {
			numeros[i]=(int)(Math.random()*100+100);
			if (numeros[i] > max) {
				max = numeros[i];
			} else if (numeros[i] < min) {
				min = numeros[i];
			}
			suma = suma + numeros[i];
		}
		for (i=0; i<50; i++) {
			System.out.print(numeros[i]+" ");
			for (j=0; j<50; j++) {
				if (numeros[i] == numeros[j]);
					contador++;
			}
			if (contador > auxiliar) {
				moda = numeros [i];
			}
			contador=0;
			//Calculo de la varianza como paso previo a la desviación típica
			//esta es la raiz cuadrada de la varianza. Se calculará el resultado
			//al salir del bucle
			desviacion = desviacion + (Math.pow(numeros[i]-(suma/50),2) / 50);
		}
		desviacion = Math.sqrt(desviacion);
		//Cálculo de la mediana, reordenación del array con un array auxiliar
        auxiliarArray = 0;
		for (minOperaciones=min; minOperaciones<=max; minOperaciones++) {
		 for (i=0; i<50; i++) {
		   if (numeros[i] == minOperaciones) {
				mediana[auxiliarArray] = numeros[i];
				auxiliarArray++;
		   }          
		 }
		}
		medianaFinal = ((mediana[23] + mediana[24])/2);
		System.out.println("\n\nNúmero máximo: "+ max +"\nNúmero mínimo: "+ min);
		System.out.println("La media es: " + (suma/50));
		System.out.println("La moda es " + moda);
		System.out.println("La desviación típica es " + desviacion);
		System.out.println("La mediana es :"+ medianaFinal);
	}
}
