package poo;
import java.util.Scanner;

public class TestFecha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fecha f1, f2;
		f1 = new Fecha(12,13,2020);
		System.out.println(f1.fechaNumerica());
		
		f2 = new Fecha(2,12,2021);
		
		System.out.println(f2);

	}

}
