package ejerciciosSecuenciales;

import java.util.Scanner;

/**
17 Ejercicios secuenciales en Java

Programa:
Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir 
un algoritmo que determine la hora de llegada a la ciudad B.

@author: manolohidalgo_
@date: 02-11-19

Variables a utilizar:
    * hh (long)
    * mm (long)
    * ss (long)
    * tiempo (long)
    * totalSegundos (long)
   
ALGORITMO
    - LEER hh, mm, ss, tiempo
    - Cálculos
        * Separamos en segundos la hora de salida y añadimos el tiempo de
          viaje que será en segundos:
          * totalSegundos = (hh*3600 + mm*60 + ss) + tiempo
        * Separamos el totalSegundos y almacenamos la nueva hora en hh, mm, ss
          * hh = totalSegundos / 3600
          * mm = totalSegundos - (hh*3600)
          * ss = totalSegundos - (hh*3600) - (mm*60)
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio17TiempoViaje {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int hh;
    int mm;
    int ss;
    int tiempo;
    int totalSegundos;
    int segundosRestantes;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la hora de llegada de un ciclista conociendo la hora de salida" +
                        "y el tiempo de viaje en segundos");
    System.out.print("Pediremos la hora segmentada, introduce la HORA: ");
    hh = scanner.nextInt();
    System.out.print("Introduce los MINUTOS: ");
    mm = scanner.nextInt();
    System.out.print ("Introduce los SEGUNDOS: ");
    ss = scanner.nextInt();
    System.out.print ("Duración del viaje en segundos: ");
    tiempo = scanner.nextInt();
    
// Realizamos Cálculos 
    // convertimos la hora dada por el usuario a segundos y le sumamos el tiempo del trayecto
    totalSegundos = hh *3600 + mm *60 + ss + tiempo;
    // Volvemos a traducir, ahora el total de segundos al formato hora.
    hh = totalSegundos / 3600;
    segundosRestantes = totalSegundos % 3600;
    mm = segundosRestantes / 60;
    ss = segundosRestantes % 60;

// Mostramos en pantalla
    System.out.println("La hora de llegada a la ciudad B será: "+ hh +":" + mm + ":"+ss);
    
  }
}
