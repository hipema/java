package poo;
import java.util.Scanner;

import poo.Tiempo;

/**
 * Test para la prueba de la clase tiempo.
 * 
 * @version 1.0
 * @author manuelhidalgo
 *
 */
public class PruebaTiempo {

	public static void main(String[] args) {
		Tiempo t1, t2, t3, t4;
		int horas, minutos, segundos;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tiempo 1: ");
		t1 = new Tiempo(1, 25, 30);
		System.out.println(t1);
		
		// Probamos métodos de suma de horas, minutos y segundos
		System.out.println("Horas a sumar a " + t1);
		horas = scanner.nextInt();
		t1.sumarHoras(horas);
		System.out.println("Ahora t1 es: " +t1);
		System.out.println();
		
		System.out.println("Minutos a sumar a "+t1);
		minutos = scanner.nextInt();
		t1.sumarMinutos(minutos);
		System.out.println("Ahora t1 es: "+t1);
		System.out.println();
		
		System.out.println("Segundos a sumar a "+t1);
		segundos = scanner.nextInt();
		t1.sumarSegundos(segundos);
		System.out.println("Ahora t1 es: "+t1);
		System.out.println();

		// Probamos métodos de resta de horas, minutos y segundos.
		System.out.println("Horas a restar a " + t1);
		horas = scanner.nextInt();
		t1.restarHoras(horas);
		System.out.println("Ahora t1 es: " +t1);
		System.out.println();
		
		System.out.println("Minutos a restar a "+t1);
		minutos = scanner.nextInt();
		t1.restarMinutos(minutos);
		System.out.println("Ahora t1 es: "+t1);
		System.out.println();
		
		System.out.println("Segundos a restar a "+t1);
		segundos = scanner.nextInt();
		t1.restarSegundos(segundos);
		System.out.println("Ahora t1 es: "+t1);
		System.out.println();

		// Probamos funciones de suma y resta de dos Tiempos
		t1 = new Tiempo(1, 10, 20);
		t2 = new Tiempo(0, 2, 30);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Sumamos ambos tiempos: ");
		t1.sumarSegundosObjetos(t2);
		System.out.println("El resultado es: "+t1);
		System.out.println();
		
		System.out.println("Ahora volvemos a restar t2.");
		t1.restarSegundosObjetos(t2);
		System.out.println("El resultado es: "+t1);
		System.out.println();
	}

}
