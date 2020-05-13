package entornos.junit.numeros;

import entornos.junit.utiles.Teclado;

public class TestNumeros {
	public static void main(String[] args) {
		int opc = 0;
		int num, base, expon;
		Numeros numero = new Numeros();
		do {
			System.out.println("1. Numero primo");
			System.out.println("2. Numero elevado a:");
			System.out.println("3. Fibonacci");
			System.out.println("4. Perfecto");
			System.out.println("5. Salir");
			opc=Teclado.leerEntero();
			switch (opc) {
			case 1:
				System.out.println("Introduce un n�mero para saber si es primo");
				num = Teclado.leerEntero();
				if (numero.primo(num))
					System.out.println(num + " es primo");
				else
					System.out.println(num + " no es primo");
				break;
			case 2:
				System.out.println("Introduce la base");
				base = Teclado.leerEntero();
				System.out.println("Introduce el exponente");
				expon = Teclado.leerEntero();
				System.out.println(base + " elevadoa a " + expon + "= "
						+ numero.Potencia(base, expon));
				break;
			case 3:
				System.out.println("Introduce un n�mero para saber su Fibonnaci");
				num = Teclado.leerEntero();
				System.out.println("Fibonacci de " + num + " es "
						+ numero.Fibonacci(num));
				break;
			case 4:
				System.out
						.println("Introduce un n�mero para saber si es perfecto");
				num = Teclado.leerEntero();
				if (numero.Perfecto(num))
					System.out.println(num + " es perfecto");
				else
					System.out.println(num + " no es perfecto");
				break;
			case 5:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opci�n Incorrecta");
				break;
			}

		} while (opc != 5);

	}
}
