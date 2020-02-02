package poo;

/**
 * Esta clase crea objetos de la clase Fracción.
 * 
 * @version 1.0
 * @author manuelhidalgo
 * @date 02-02-2020
 */
public class Fraccion {
	// Atributos
	private int numerador;
	private int denominador;

	// Constructor
	Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	// Getters y setters
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}
	
	public void setDenominador(int denominador) {
		if (denominador == 0) {
			System.out.println("ERROR, el denominador no puede ser 0, no se ha modificado.");
		} else {
			this.denominador = denominador;
		}
	}

// Métodos
	public String obtenerFraccion () {
		return this.toString();
	}
	
	public double obtenerResultado () {
		return (double) this.getNumerador()/this.getDenominador();
	}
	
	public void multiplicaNumero (int numero) {
		this.numerador *= numero;
		this.simplificaFraccion();
	}
	
	public void multiplicaFracciones (Fraccion f) {
		this.numerador *= f.numerador;
		this.denominador *= f.denominador;
		this.simplificaFraccion();
	}
	
	public void sumarFracciones (Fraccion f) {
		this.numerador = (this.getNumerador()*f.getDenominador())+(f.getNumerador()*this.getDenominador());
		this.denominador = this.getDenominador()*f.getDenominador();
		this.simplificaFraccion();
	}
	
	public void restarFracciones (Fraccion f) {
		this.numerador = (this.getNumerador()*f.getDenominador())-(f.getNumerador()*this.getDenominador());
		this.denominador = this.getDenominador()*f.getDenominador();
		this.simplificaFraccion();
	}
	
	/**
	 * Función para imprimir en pantalla la fracción.
	 */
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}
	
	private int mcd () {
		int dividendo, divisor, resto;
		dividendo = this.getNumerador();
		divisor = this.getDenominador();
		resto = dividendo%divisor;
		while (resto != 0) {
			dividendo = divisor;
			divisor = resto;
			resto = dividendo % divisor;
		}
		return divisor;
	}
	public void simplificaFraccion () {
		int divisor;
		divisor = this.mcd();
		this.setNumerador(this.getNumerador()/divisor);
		this.setDenominador(this.getDenominador()/divisor);		
	}
}
