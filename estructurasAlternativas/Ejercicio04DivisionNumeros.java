package estructurasAlternativas;

/*
04 Ejercicios Estructuras Alternativas en Java

Programa:
Crea un programa que pida al usuario dos números y muestre su división si el 
segundo no es cero, o un mensaje de aviso en caso contrario.

Autor: Manuel Hidalgo Pérez
Fecha: 08-11-19

Variables a utilizar:
    * numero1 (int)
    * numero2 (int)
ALGORITMO
    - LEER numero1, numero2
    - Cálculos
    *   si numero2 != 0 --> numero1/numero2
    *   si numero2 == 0 --> mensaje de aviso        
    - MOSTRAR resultado
*/

// Inicio del programa y declaración de variables:
public class Ejercicio04DivisionNumeros {
  public static void main(String[] args) {
    int numero1;
    int numero2;

// Solicitud de datos al usuario
    System.out.println("Este programa muestra la division entre dos números, si el segundo no es 0.");
    System.out.print("Introduce el primer número: ");
    numero1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    numero2 = Integer.parseInt(System.console().readLine());
    
// Realizamos Cálculos y mostramos en pantalla
    if (numero2 != 0){
        System.out.println((double)numero1/(double)numero2);
    }else {
        System.out.println("El segundo número introducido es 0. Reinicie el programa e introduzca otro valor.");
    }  
  }
}
