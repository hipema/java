package matematicas;

import matematicas.FuncionesEj1a14;

/**
 * Esta clase se utiliza para realizar el test de la librería "FuncionesEj1a14" donde podemos encontrar diferentes
 * funciones matemáticas.
 * 
 * @author manuelhidalgo
 * @version 1.0
 * @since 9-12-19
 */
public class PruebaFunciones {
	public static void main(String[] args) {
		// Prueba para esPrimo
		System.out.println("Prueba función esPrimo con 2, 4, 9 y 17");
		System.out.println("2: "+FuncionesEj1a14.esPrimo(2));
		System.out.println("4: "+FuncionesEj1a14.esPrimo(4));
		System.out.println("9: "+FuncionesEj1a14.esPrimo(9));
		System.out.println("-17: "+FuncionesEj1a14.esPrimo(-17));
		System.out.println("19: "+FuncionesEj1a14.esPrimo(19));
		System.out.println("17: "+FuncionesEj1a14.esPrimo(-17));
		System.out.println();
		
		System.out.println("Prueba función siguientePrimo con 3, 6, 9 y 15");
		System.out.println("3: "+FuncionesEj1a14.siguientePrimo(3));
		System.out.println("6: "+FuncionesEj1a14.siguientePrimo(6));
		System.out.println("9: "+FuncionesEj1a14.siguientePrimo(9));
		System.out.println("15: "+FuncionesEj1a14.siguientePrimo(15));
		System.out.println();
		
		System.out.println("Prueba función volteado con 34567, 6736, 1238");
		System.out.println("34567: "+FuncionesEj1a14.voltea(34567));
		System.out.println("6736: "+FuncionesEj1a14.voltea(6736));
		System.out.println("1238: "+FuncionesEj1a14.voltea(1238));
		System.out.println("-1238: "+FuncionesEj1a14.voltea(-1238));
		System.out.println();
		
		System.out.println("Prueba función esCapicua con 122, 121, 4333");
		System.out.println("122: "+FuncionesEj1a14.esCapicua(122));
		System.out.println("121: "+FuncionesEj1a14.esCapicua(121));
		System.out.println("4333: "+FuncionesEj1a14.esCapicua(4333));
		System.out.println();
		
		System.out.println("Prueba función potencia:");
		System.out.println("base 2, exponente 6: "+FuncionesEj1a14.potencia(6, 2));
		System.out.println("base 3, exponente 2: "+FuncionesEj1a14.potencia(2, 3));
		System.out.println("base 2, exponente -4: "+FuncionesEj1a14.potencia(-4, 2));
		System.out.println("base 2, exponente 0: "+FuncionesEj1a14.potencia(0, 2));
		System.out.println();
		
		System.out.println("Prueba función digitos:");
		System.out.println("2345: "+FuncionesEj1a14.digitos(2345));
		System.out.println("21: "+FuncionesEj1a14.digitos(21));
		System.out.println("1: "+FuncionesEj1a14.digitos(1));
		System.out.println("212342345: "+FuncionesEj1a14.digitos(212342345));
		System.out.println();
		
		System.out.println("Prueba función mostrar carácter de un posición:");
		System.out.println("2345: "+FuncionesEj1a14.digitoN(2345, 2));
		System.out.println("218709: "+FuncionesEj1a14.digitoN(218709, 0));
		System.out.println("1903938: "+FuncionesEj1a14.digitoN(1903938, 5));
		System.out.println("212342345: "+FuncionesEj1a14.digitoN(212342345, 8));
		System.out.println();
		
		System.out.println("Prueba función mostrar posición de un carácter");
		System.out.println("123456789: "+FuncionesEj1a14.posicionDeDigito(123456789, 5));
		System.out.println("123456789: "+FuncionesEj1a14.posicionDeDigito(123456789, 3));
		System.out.println("123456789: "+FuncionesEj1a14.posicionDeDigito(123456789, 22));
		System.out.println("123456789: "+FuncionesEj1a14.posicionDeDigito(123456789, 0));
		System.out.println();
		
		System.out.println("Prueba función juntaNumeros:");
		System.out.println("123 y 987: "+FuncionesEj1a14.juntaNumeros(123, 987));
		System.out.println();
	
		System.out.println("Prueba función quitaPorDetras:");
		System.out.println("1237865 - 2 digitos: "+FuncionesEj1a14.quitaPorDetras(1237865, 2));
		System.out.println("1237865 - 7 digitos: "+FuncionesEj1a14.quitaPorDetras(1237865, 7));
		System.out.println("1237865 - 9 digitos: "+FuncionesEj1a14.quitaPorDetras(1237865, 9));
		System.out.println();
		
		System.out.println("Prueba función quitaPorDelante:");
		System.out.println("1237865 - 2 digitos: "+FuncionesEj1a14.quitaPorDelante(1237865, 2));
		System.out.println("1237865 - 3 digitos: "+FuncionesEj1a14.quitaPorDelante(1237865, 3));
		System.out.println("1237865 - 7 digitos: "+FuncionesEj1a14.quitaPorDelante(1237865, 7));
		System.out.println("1237865 - 9 digitos: "+FuncionesEj1a14.quitaPorDelante(1237865, 9));
		System.out.println();
		
		System.out.println("Prueba función pegaPorDetras:");
		System.out.println("1237865 - 2: "+FuncionesEj1a14.pegaPorDetras(1237865, 2));
		System.out.println("1237865 - 3: "+FuncionesEj1a14.pegaPorDetras(1237865, 3));
		System.out.println("1237865 - 7: "+FuncionesEj1a14.pegaPorDetras(1237865, 7));
		System.out.println("1237865 - 9: "+FuncionesEj1a14.pegaPorDetras(1237865, 9));
		System.out.println();
		
		System.out.println("Prueba función pegaPorDelante:");
		System.out.println("1237865 - 2: "+FuncionesEj1a14.pegaPorDelante(1237865, 2));
		System.out.println("1237865 - 3: "+FuncionesEj1a14.pegaPorDelante(1237865, 3));
		System.out.println("1237865 - 7: "+FuncionesEj1a14.pegaPorDelante(1237865, 7));
		System.out.println("1237865 - 9: "+FuncionesEj1a14.pegaPorDelante(1237865, 9));
		System.out.println();
		
		System.out.println("Prueba función trozoDeNumero:");
		System.out.println("1237865, quita 2 dígitos por delante y 1 por detras: "+FuncionesEj1a14.trozoDeNumero(1237865, 2, 1));
		System.out.println();
		
	}
}
