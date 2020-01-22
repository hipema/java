package ejerciciosSecuenciales;

/*
16 Ejercicios secuenciales en Java

Programa:
Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados
por una distancia d. El que está detrás viaja a una velocidad mayor. Se pide
hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) 
y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que
tiempo (minutos) alcanzará el vehículo más rápido al otro.

Autor: Manuel Hidalgo Pérez
Fecha: 02-11-19

Variables a utilizar:
    * v1 (double)
    * v2 (double)
    * distancia (double)
    * tiempo (double) - en minutos
   
ALGORITMO
    - LEER v1, v2 y distancia
    - Cálculos
        * tiempo = distancia / ((v2/60)-(v1/60))
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio16LugarEncuentroDosVehiculos {
  public static void main(String[] args) {
    double v1;
    double v2;
    double distancia;
    double tiempo;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula el tiempo que tardan en encontrarse dos vehículos que circulan a distinta velocidad y parten desde una distancia inicial.");
    System.out.print("Introduce la distancia a la que se encuentran situados ambos vehículos: ");
    distancia = Double.parseDouble(System.console().readLine());
    System.out.print("Velocidad en Km/h del vehículo 1 (más lento): ");
    v1 = Double.parseDouble(System.console().readLine());
    System.out.print("Velocidad en Km/h del vehículo 2 (más rápido): ");
    v2 = Double.parseDouble(System.console().readLine());    
    
// Realizamos Cálculos 
    tiempo = distancia / ((v2/60) - (v1/60));

// Mostramos en pantalla
    System.out.println("Ambos vehículos coincidirán una vez transcurridos " + (int)tiempo + " minutos.");
    
  }
}
