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
	Fecha (int dia, int mes, int anyo){
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	// Getters y Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	// Métodos
	// Devuelve nombre del mes.
	public String nombreMes () {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
				"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		return meses[this.mes-1];
	}
	
	// Sumar un día
	public Fecha sumarUnDia () {
		int dia, mes, ultimoDiaMes;
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (Fecha.esBisiesto(this.anyo)) {
        	diasMes[1] = 29;
        }
        dia = this.dia;
        mes = this.mes;
        anyo = this.anyo;
        ultimoDiaMes = diasMes[this.mes-1];
        dia += 1;
        if (dia > ultimoDiaMes) {
        	dia = 1;
        	mes += 1;
        	if (mes > 12) {
        		mes = 1;
        		anyo += 1;
        	}
        }
    return new Fecha(dia,mes,anyo);
	}
	
	// Sumar n días
	public void sumarNDias (int value) {
		for (int i=0; i < value; i++) {
			this.sumarUnDia();
		}
	}
	
	// Restar 1 día
	
	
	// Métodos estáticos
	static boolean fechaCorrecta (int dia, int mes, int anyo) {
    // año correcto
		if (anyo < 0) {
    	return false;
    }
    // mes correcto
		if (mes < 1 || mes > 12) {
			return false;
		}
    // dia correcto
		int[]diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (Fecha.esBisiesto(anyo)){
			diasMes[1] = 29;
		}
		return dia > 0 && dia <= diasMes[mes-1];
	}
	
	static boolean esBisiesto(int anyo) {
		return (anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0));
	}
	
}
