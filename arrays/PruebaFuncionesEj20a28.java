package arrays;
import arrays.FuncionesEjercicios20a28;

public class PruebaFuncionesEj20a28 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		System.out.println("Prueba ejercicio Rota un Array a la Derecha");
		System.out.println("-------------------------------------------");
		System.out.println("Array antes de rotar:");
		FuncionesEjercicios20a28.imprimeArray(array);
		System.out.println();
		FuncionesEjercicios20a28.rotaDerechaArrayInt(array, 2);
		System.out.println("Array después de rotar:");
		FuncionesEjercicios20a28.imprimeArray(array);
		System.out.println("");
		System.out.println();
		
		System.out.println("Prueba ejercicio Rota un Array a la Izquierda");
		System.out.println("-------------------------------------------");
		System.out.println("Array antes de rotar:");
		FuncionesEjercicios20a28.imprimeArray(array2);
		System.out.println();
		FuncionesEjercicios20a28.rotaIzquierdaArrayInt(array2, 2);
		
		System.out.println("Array después de rotar:");
		FuncionesEjercicios20a28.imprimeArray(array2);
		System.out.println("");
		
		System.out.println("Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		int[] arrayGenerado = FuncionesEjercicios20a28.generaArrayInt(5, 1, 50);
		FuncionesEjercicios20a28.imprimeArray(arrayGenerado);
		System.out.println("");
		System.out.println();
		
		System.out.println("Devuelve el mínimo del array que se pasa como parámetro.");
		System.out.println("--------------------------------------------------------");
		int valorMinimo = FuncionesEjercicios20a28.minimoArrayInt(arrayGenerado);
		System.out.println("El valor mínimo es: "+valorMinimo);
		System.out.println("");
		System.out.println();
		
		System.out.println("Devuelve el máximo del array que se pasa como parámetro.");
		System.out.println("--------------------------------------------------------");
		int valorMaximo = FuncionesEjercicios20a28.maximoArrayInt(arrayGenerado);
		System.out.println("El valor máximo es: "+valorMaximo);
		System.out.println("");
		System.out.println();
		
		System.out.println("Calcula la media de un array.");
		System.out.println("-----------------------------");
		double media = FuncionesEjercicios20a28.mediaArrayInt(arrayGenerado);
		System.out.println("La media es: "+media);
		System.out.println("");
		System.out.println();
		
		System.out.println("Busca en un valor en un array.");
		System.out.println("------------------------------");
		System.out.println("¿Está en el array? "+FuncionesEjercicios20a28.estaEnArrayInt(arrayGenerado, 9));
		System.out.println("");
		System.out.println();
		
		System.out.println("Busca la posición de un valor en un array.");
		System.out.println("------------------------------------------");
		int[] posicionesValor = FuncionesEjercicios20a28.posicionEnArrayInt(arrayGenerado, 9);
		System.out.println("El valor se encuentra en la posición: ");
		FuncionesEjercicios20a28.imprimeArray(posicionesValor);
		System.out.println("");
		System.out.println();
		
		System.out.println("Voltea los valores de un array.");
		System.out.println("-------------------------------");
		int[] arrayVolteado = FuncionesEjercicios20a28.volteaArrayInt(arrayGenerado);
		System.out.print("Array original: ");
		FuncionesEjercicios20a28.imprimeArray(arrayGenerado);
		System.out.println("");
		System.out.print("Array volteado: ");
		FuncionesEjercicios20a28.imprimeArray(arrayVolteado);
		System.out.println("");
		System.out.println();
}
}
