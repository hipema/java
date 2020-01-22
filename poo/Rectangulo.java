package poo;

/**
 * Esta clase representa objetos de tipo rectángulo.
 * Acciones: cálculo del perímetro, área, dibujar, comparar.
 * 
 * @author manuelhidalgo
 * @version 1.0
 * 
 * Parte del ejercicio realizada en clase el 22 de enero.
 * 	Realizamos el constructor, atributos, toString y contador de rectángulos.
 *  Comenzamos la comprobación del ladoMáximo.
 *
 */

public class Rectangulo {
// Atributos
	private int base;
	private int altura;
	static private int numRectangulos = 0;
	static private int ladoMaximo = 10;
	
	public Rectangulo (int base, int altura) {
		this.base = base;
		this.altura = altura;
		this.numRectangulos += 1;
	}
	
	// Setters
	void setBase (int b) {
		assert this.esLadoCorrecto(b);
		this.base = b;
	}
	void setAltura (int a) {
		assert this.esLadoCorrecto(a);
		this.altura = a;
	}
	
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

// Métodos
static int rectangulosCreados() {
	return Rectangulo.numRectangulos;
}

static boolean esLadoCorrecto(int value) {
    return (0 < value && value <= Rectangulo.ladoMaximo);
}
}
