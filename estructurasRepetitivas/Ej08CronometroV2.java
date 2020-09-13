package estructurasRepetitivas;

/**
Programa:
Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

@author: manolohidalgo_
@date: 11-11-19
*/

import java.util.concurrent.TimeUnit;

public class Ej08CronometroV2 {
  public static void main(String args[]) throws InterruptedException {
    int hora;
    int minuto;
    int segundo;
    String borraAnterior = "\b\b\b\b\b\b\b\b"; 

    // horas
    for (hora=0; hora<=23; hora++) {
      // minutos
      for (minuto=0; minuto<=59; minuto++) {
        // segundos
        for (segundo=0; segundo<=59; segundo++) {
          // escribe hora:minutos:segundos (actualizandose a medida que va pasando cada segundo)
          System.out.printf("%02d:%02d:%02d",hora,minuto,segundo);
          TimeUnit.SECONDS.sleep(1);
          System.out.print(borraAnterior);
        }
      }
    }
  }


}