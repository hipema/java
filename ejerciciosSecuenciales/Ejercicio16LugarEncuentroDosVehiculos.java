package ejerciciosSecuenciales;

import java.util.Scanner;

/**
16 Ejercicios secuenciales en Java

Programa:
Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados
por una distancia d. El que está detrás viaja a una velocidad mayor. Se pide
hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) 
y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que
tiempo (minutos) alcanzará el vehículo más rápido al otro.

@author: manolohidago_
@date: 02-11-19
*/

// Inicio del programa y declaración de variables:
public class Ejercicio16LugarEncuentroDosVehiculos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double v1;
    double v2;
    double distancia;
    double diferenciaVelocidad;
    double tiempo;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el tiempo que tardan en encontrarse dos vehículos que circulan a distinta velocidad y parten desde una distancia inicial.");
    System.out.print("Introduce la distancia a la que se encuentran situados ambos vehículos: ");
    distancia = scanner.nextDouble();
    System.out.print("Velocidad en Km/h del vehículo 1 (más lento): ");
    v1 = scanner.nextDouble();
    System.out.print("Velocidad en Km/h del vehículo 2 (más rápido): ");
    v2 = scanner.nextDouble();   
    
// Realizamos Cálculos 
    diferenciaVelocidad = v2 - v1;
    tiempo = distancia / (diferenciaVelocidad); // resultado de tiempo en horas.
    
// convertimos tiempo a minutos
    tiempo = tiempo * 60;

// Mostramos en pantalla
    System.out.println("Ambos vehículos coincidirán una vez transcurridos " + (int)tiempo + " minutos.");
    
  }
}
