package estructurasAlternativas;

/*
16 Ejercicios Estructuras Alternativas en Java

Programa:
La política de cobro de una compañía telefónica es: cuando se realiza una llamada,
el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos
cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos,
y a partir del décimo minuto, 50 céntimos. 
Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana,
15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por
cada concepto una persona que realiza una llamada.

Interpretamos que el coste de la llamada es por tramos.

Autor: Manuel Hidalgo Pérez
Fecha: 09-11-19

Variables a utilizar:
    #   minutos (int)
    #   dia (string)
    #   horario (string)
    #   precio (double)
    #   impuesto (double)

ALGORITMO
    - LEER minutos, dia, horario
    - Cálculos
        #   Realizamos cálculos del precio
        # Si precio > 10 --> 3 euros
        # Si precio > 8 -->  2.50 euros
        # Si precio > 5 --> 1.80 euros
        # Si precio <= 5 --> 1 euro
    #   Realizamos cálculo del impuesto
        # Si domingo 3% del precio
        # Si != domingo 
            # mañana --> 15% del precio
            # tarde --> 10% del precio
    - MOSTRAR resultado
*/

import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class Ejercicio16Telefonica {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int minutos;
    String dia;
    String horario;
    double precio;
    double impuesto;

// Solicitud de datos al usuario
    System.out.println("Calculamos el precio base de la llamada y el impuesto a pagar:");
    System.out.print("Duración de la llamada en minutos: ");
    minutos = s.nextInt();
    System.out.print("Día de la semana: ");
    dia = s.next(); s.nextLine();
    if (dia.compareTo("Domingo") == 0 || (dia.compareTo("domingo") == 0)){
        System.out.print("¿La llamada se realizó en horario de mañana o tarde? ");
        horario = s.nextLine();
    } else {
        horario = "";
    }

// Calculamos el precio base a pagar:
    if (minutos > 10){
        precio = 3;
    } else if (minutos > 8){
        precio = 2.5;
    } else if (minutos > 5){
        precio = 1.80;
    } else {
        precio = 1;
    }

 // Calculamos impuesto:
    if (dia.compareTo("Domingo") == 0 || dia.compareTo("domingo") == 0){
      impuesto = precio * 0.30;
    } else if (horario.compareTo("mañana") == 0){
      impuesto = precio *0.15;
    } else{
      impuesto = precio*0.10;
    } 

// Realizamos Cálculos y mostringamos en pantalla
    System.out.println("El precio total de la llamada es de " + (precio + impuesto) + " siendo el precio base de " + precio + "y el impuesto a pagar " + impuesto);
  }
}