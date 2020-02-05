package poo;

import java.util.Scanner;

public class TestFecha {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Fecha f1, f2, f3;
    f1 = new Fecha(12, 12, 2020);
    System.out.println(f1);
    System.out.println(f1.fechaNumerica());

    System.out.println("Fecha2 (2,12,2021)");
    f2 = new Fecha(2, 12, 2021);

    System.out.println(f2);
    System.out.println("Sumamos 30 días: ");
    f3 = f2.sumarNDias(30);
    System.out.println(f3);
    
    /**f3.setMes(13);
    System.out.println(f3.fechaNumerica());
    f3.setDia(45);
    System.out.println(f3.fechaNumerica());*/
  }

}
