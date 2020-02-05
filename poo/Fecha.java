package poo;

/**
 * Clase que crea objetos Fecha, basandonos en el ejercicio del exámen.
 * 
 * @version 1.0
 * @author manuelhidalgo
 *
 */

public class Fecha {
	// Atributos
	private int dia;
	private int mes;
	private int anyo;

	// Constructor
	Fecha(int dia, int mes, int anyo) {
		assert (Fecha.fechaCorrecta(dia, mes, anyo));
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	// Getters y Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		assert Fecha.fechaCorrecta(dia, this.mes, this.anyo);
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		assert Fecha.fechaCorrecta(this.dia, mes, this.anyo);
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		assert Fecha.fechaCorrecta(this.dia, this.mes, anyo);
		this.anyo = anyo;
	}

	// Métodos
	// Devuelve nombre del mes.
	public String nombreMes() {
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
		    "Octubre", "Noviembre", "Diciembre" };
		return meses[this.mes - 1];
	}

	// Sumar un día
	public Fecha sumarUnDia() {
		int dia, mes, anyo;
		dia = this.dia + 1;
		mes = this.mes;
		anyo = this.anyo;
		if (dia > Fecha.diaMaximoMes(this.mes, this.anyo)) {
			dia = 1;
			mes += 1;
			if (mes > 12) {
				mes = 1;
				anyo += 1;
			}
		}
		return new Fecha(dia, mes, anyo);
	}

	// Sumar n días
	public void sumarNDias(int value) {
		for (int i = 0; i < value; i++) {
			this.sumarUnDia();
		}
	}

	// Restar 1 día
	public Fecha restarUnDia() {
		int dia, mes, anyo;
		dia = this.dia - 1;
		mes = this.mes;
		anyo = this.anyo;
		if (dia == 0) {
			mes -= 1;
			if (mes == 0) {
				mes = 12;
				anyo -= 1;
			}
			dia = Fecha.diaMaximoMes(mes, anyo);
		}
		return new Fecha(dia, mes, anyo);
	}

	// Restar n días.
	public void restarNDias(int value) {
		for (int i = 0; i < value; i++) {
			this.restarUnDia();
		}
	}

	// Devuelve la fecha numérica
	public int fechaNumerica() {
		String fecha;
		int resultado;
		fecha = "".concat(Integer.toString(this.anyo));
		if (this.mes < 10) {
			fecha += "0".concat(Integer.toString(this.mes));
		} else {
			fecha += "".concat(Integer.toString(this.mes));
		}
		if (this.dia < 10) {
			fecha += "0".concat(Integer.toString(this.dia));
		} else {
			fecha += "".concat(Integer.toString(this.dia));
		}
		resultado = Integer.parseInt(fecha);
		return resultado;
	}

	// Compara fechas
	public int comparaFechas(Fecha otro) {
		int fecha1, fecha2;
		fecha1 = this.fechaNumerica();
		fecha2 = otro.fechaNumerica();
		return fecha1 - fecha2;
	}

	// Métodos estáticos
	static boolean fechaCorrecta(int dia, int mes, int anyo) {
		// año correcto
		if (anyo < 0) {
			return false;
		}
		// mes correcto
		if (mes < 1 || mes > 12) {
			return false;
		}
		// dia correcto
		int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (Fecha.esBisiesto(anyo)) {
			diasMes[1] = 29;
		}
		return dia > 0 && dia <= diasMes[mes - 1];
	}

	static boolean esBisiesto(int anyo) {
		return (anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0));
	}

	static int diaMaximoMes(int mes, int anyo) {
		int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (Fecha.esBisiesto(anyo)) {
			diasMes[1] = 29;
		}
		return diasMes[mes - 1];
	}

	// Sobrecarga
	public String toString() {
		return this.dia + " de " + this.nombreMes() + " de " + this.anyo;
	}
}
