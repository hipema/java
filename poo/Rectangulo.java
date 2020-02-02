package poo;

/**
 * Esta clase representa objetos de tipo rectángulo. Acciones: cálculo del
 * perímetro, área, dibujar, comparar.
 * 
 * @author manuelhidalgo
 * @version 1.0
 * 
 *          Parte del ejercicio realizada en clase el 22 de enero. Realizamos el
 *          constructor, atributos, toString y contador de rectángulos.
 *          Comenzamos la comprobación del ladoMáximo.
 *
 */

public class Rectangulo {
// Atributos
	private int base;
	private int altura;
	private static int numRectangulos = 0;
	static private int ladoMaximo = 10;

	// Constructor
	Rectangulo(int base, int altura) { // al constructor no se le pone visibilidad.
		assert esLadoCorrecto(base) && esLadoCorrecto(altura);
		this.base = base;
		this.altura = altura;
		this.numRectangulos += 1;
	}

	// Setters y getters
	void setBase(int b) {
		assert esLadoCorrecto(b);
		this.base = b;
	}

	int getBase() {
		return this.base;
	}

	void setAltura(int a) {
		assert esLadoCorrecto(a);
		this.altura = a;
	}

	int getAltura() {
		return this.altura;
	}

// Métodos de la clase (tienes que llamar al objeto en sí para acceder a ellos)
	/**
	 * Convierte en string la representación del objeto.
	 */

	public String toString() {
		String resultado = "", linea = "";

		for (int i = 0; i < this.base; i++) {
			linea += "*";
		}
		linea += "\n";
		for (int i = 0; i < this.altura; i++) {
			resultado += linea;
		}
		return resultado;
	}

	/**
	 * Calcula el perímetro del objeto.
	 * 
	 * @return (int) valor del perímetro del objeto.
	 */
	public int perimetro() {
		return 2 * (this.getBase() + this.getAltura());

	}

	/**
	 * Calcula el área de un rectángulo.
	 * @return (int) valor del área del rectángulo instanciado.
	 */
	public int area() {
		return this.getBase() * this.getAltura();
	}
	/**
	 * Compara si dos rectángulos tienen el mismo área.
	 * @param otro objeto con el que comparamos el actual.
	 * @return >0 si mayor, 0 si igual, <0 si menor.
	 */
	public int compara(Rectangulo otro) {
		return this.area() - otro.area();
	}
	
	/**
	 * Compara dos ojetos y mira si son idénticos, base y altura.
	 * @param otro - objeto con el que comparamos el actual.
	 * @return True o False
	 */
	public boolean esGemelo (Rectangulo otro) {
		return this.getBase() == otro.getBase() && this.getAltura() == otro.getAltura();
	}

// Métodos estáticos (los llamas con el nombre de la clase, no del objeto en sí).
	/**
	 * Contabiliza el número de rectángulos creados.
	 * 
	 * @return (int) número entero de rectángulos creados.
	 */
	static int rectangulosCreados() {
		return Rectangulo.numRectangulos;
	}

	/**
	 * Comprueba que el lado (base o altura) del rectángulo sea menor al lado máximo
	 * establecido.
	 * 
	 * @param (int) value (valor del lado máximo)
	 * @return verdadero o falso según la comprobación establecida.
	 */
	static boolean esLadoCorrecto(int value) {
		return (0 < value && value <= Rectangulo.ladoMaximo);

	}
}
