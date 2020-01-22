package estructurasAlternativas;

/*
20 Ejercicios Estructuras Alternativas en Java

Programa:
Una compañía de transporte internacional tiene servicio en algunos países de
América del Norte, América Central, América del Sur, Europa y Asia. El costo
por el servicio de transporte se basa en el peso del paquete y la zona a la que
va dirigido. Lo anterior se muestra en la tabla:

    ZONA	UBICACIÓN	        COSTO/GRAMO
    1	    América del Norte	24.00 euros
    2	    América Central	    20.00 euros
    3	    América del Sur	    21.00 euros
    4	    Europa	            10.00 euros
    5	    Asia	            18.00 euros

Parte de su política implica que los paquetes con un peso superior a 5 kg no son
transportados, esto por cuestiones de logística y de seguridad. 
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en
su caso, el rechazo de la entrega.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    #   peso (int)
    #   zona (int)

ALGORITMO
    - LEER mes
    - Cálculos
       #   Realizamos cálculos de comparación y mostramos resultado
        # Si peso > 5 or peso < 5 --> rechazar
        # Si zona 1 --> peso * 24
        # Si zona 2 --> peso * 20
        # Si zona 3 --> peso * 21
        # Si zona 4 --> peso * 10
        # Si zona 5 --> peso * 18
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio20v2Transporte {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int peso;
    int zona;

// Solicitud de datos al usuario
    System.out.println("Calcula la tarifa para el envío según peso y zona de destino.");
    System.out.println("Zonas de envío:");
    System.out.println("1.- América del Norte");
    System.out.println("2.- América Central");
    System.out.println("3.- América del Sur");
    System.out.println("4.- Europa");
    System.out.println("5.- Asia");
    zona = s.nextInt();
    System.out.println("Introduce el peso del paquete en gramos: ");
    peso = s.nextInt();

// Realizamos comparaciones y mostramos el resultado
    if (peso > 5000){
        System.out.println("El paquete no puede ser admitido por motivos de seguridad.");
    } else if (zona == 1){
        System.out.println("El paquete de " + peso + " gramos enviado a América del Norte sale por " +(peso*24000) + " euros.");
    } else if (zona ==2){
        System.out.println("El paquete de " + peso + " gramos enviado a América Central sale por " +(peso*20000) + " euros.");
    } else if (zona == 3){
        System.out.println("El paquete de " + peso + " gramos enviado a América del Sur sale por " +(peso*21000) + " euros.");
    } else if (zona == 4){
        System.out.println("El paquete de " + peso + " gramos enviado a Europa sale por " +(peso*10000) + " euros.");
    } else if (zona == 5){
        System.out.println("El paquete de " + peso + " gramos enviado a Asia sale por " +(peso*18000) + " euros.");
    } else {
        System.out.println("ERROR: zona elegida incorrecta.");
    }
  }
}