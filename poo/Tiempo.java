package poo;

/**
 * Esta clase crea objetos del tipo Tiempo.
 * 
 * @version 1.0
 * @author manuelhidalgo
 *
 */

public class Tiempo {
// Atributos
	private int horas;
	private int minutos;
	private int segundos;
	
// Constructor
	Tiempo (int horas, int minutos, int segundos){
		assert horas >= 0 && minutos >=0 && minutos < 60 && segundos >=0 && segundos < 60;
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}


	// Funciones del objeto:
	/**
	 * Sumar tiempo de dos objetos
	 */
	public void sumarSegundosObjetos (Tiempo otro) {
		Tiempo sumaTiempos;
		int tiempoSegundos;
		tiempoSegundos = this.tiempoASegundos()+otro.tiempoASegundos();
		assert tiempoSegundos >= 0;
		sumaTiempos = this.segundosATiempo(tiempoSegundos);
		this.horas = sumaTiempos.getHoras();
		this.minutos = sumaTiempos.getMinutos();
		this.segundos = sumaTiempos.getSegundos();		
	}
	
	public void restarSegundosObjetos (Tiempo otro) {
		Tiempo restaTiempos;
		int tiempoSegundos;
		tiempoSegundos = this.tiempoASegundos()-otro.tiempoASegundos();
		assert tiempoSegundos >= 0;
		restaTiempos = this.segundosATiempo(tiempoSegundos);
		this.horas = restaTiempos.getHoras();
		this.minutos = restaTiempos.getMinutos();
		this.segundos = restaTiempos.getSegundos();		
	}
	
	public void sumarHoras (int valorHoras) {
		assert (this.getHoras()- valorHoras) >= 0;
		this.horas += valorHoras;
	}
	
	public void sumarMinutos (int valorMinutos) {
		Tiempo resultado;
		int seg;
		seg = this.tiempoASegundos()+ valorMinutos*60;
		assert seg >= 0;
		resultado = this.segundosATiempo(seg);
		this.horas = resultado.horas;
		this.minutos = resultado.minutos;
		this.segundos = resultado.segundos;
	}
	
	public void sumarSegundos (int valorSegundos) {
		Tiempo resultado;
		int seg;
		seg = this.tiempoASegundos()+valorSegundos;
		assert seg >=0;
		resultado = this.segundosATiempo(seg);
		this.horas = resultado.horas;
		this.minutos = resultado.minutos;
		this.segundos = resultado.segundos;
	}
	
	public void restarHoras (int valorHoras) {
		this.sumarHoras(-valorHoras);
	}
	
	public void restarMinutos (int valorMinutos) {
		this.sumarMinutos(-valorMinutos);
	}
	
	public void restarSegundos (int valorSegundos) {
		this.sumarSegundos(-valorSegundos);
	}
// Métodos
	/**
	 * Función para mostrar formateado el tiempo en pantalla
	 */
	public String toString () {
		return this.horas + "h, " + this.minutos + "m, " + this.segundos + "s.";
	}

// Métodos privados
	/**
	 * Convierte un objeto tiempo a segundos
	 * @return (int) con el valor del objeto en segundos.
	 */
	private int tiempoASegundos () {
		return this.horas*3600 + this.minutos*60 + this.segundos;
	}
	
	private Tiempo segundosATiempo (int segundosTotal) {
		int horas, minutos, segundos;
		horas = segundosTotal / 3600;
		minutos = (segundosTotal - horas*3600)/60;
		segundos = segundosTotal - horas*3600 - minutos*60;
		return new Tiempo(horas, minutos, segundos);
	}
}
