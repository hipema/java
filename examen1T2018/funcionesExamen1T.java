package examen1T2018;
/**
 * Lista de funciones para la realización del examen del primer trimestre de 2018.
 * 
 * @author manuelhidalgo
 *
 */
public class funcionesExamen1T {
	/**
	 * Función para validar una fecha introducida por teclado, con formato DD/MM/AAAA.
	 * @param fecha - valor pasado mediante cadena por el usuario
	 * @return devuelve true si la fecha tiene un valor correcto.
	 */
	public static boolean validaFecha(String fecha) {
		boolean fechaCorrecta = true; // variable para comprobar si la fecha es correcta.
		String auxiliarFecha;
		int year;
		int mes;
		int dia;
		
		/*
		 *  Comprobamos que la longitud de cadena es 10.
		 *  Comprobamos que los carácteres de separación se encuentran en el lugar correcto.
		 *  Comprobamos que el resto son dígitos que podrían ser válidos en una fecha.
		 */
		
		if (fecha.length() != 10) {
			return false;
		} else if (fecha.charAt(2) != '/' || fecha.charAt(5)!='/') {
			return false;
		} else if (fecha.charAt(0) < '0' || fecha.charAt(0) >'3') {
			return false;
		} else if (fecha.charAt(1) < '0' || fecha.charAt(1) >'9') {
			return false;
		} else if (fecha.charAt(3) < '0' || fecha.charAt(0) >'1') {
			return false;
		} else if (fecha.charAt(4) < '0' || fecha.charAt(0) >'9') {
			return false;
		} else if (fecha.charAt(6) < '0' || fecha.charAt(6) >'9') {
			return false;
		} else if (fecha.charAt(7) < '0' || fecha.charAt(7) >'9') {
			return false;
		} else if (fecha.charAt(8) < '0' || fecha.charAt(8) >'9') {
			return false;
		} else if (fecha.charAt(9) < '0' || fecha.charAt(9) >'9') {
			return false;
		} 
		
		// Convertimos los números de día, mes y año a enteros.
		year = Integer.parseInt(fecha.substring(6,10));
		mes = Integer.parseInt(fecha.substring(3,5)); 
		dia = Integer.parseInt(fecha.substring(0, 2));
		
		if (mes <1 || mes>12) { // Confirmamos si mes está en el valor entre 1 y 12
			return false;
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12) { // Comprobamos si es un mes con 31 días.
			if (dia <1 || dia > 31) {
				return false;
			}
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // Comprobamos si es un mes con 30 días
			if (dia <1 || dia > 30) {
				return false;
			}
		} else if (mes ==2) { // si es febrero, tenemos en cuenta si es bisiesto o no. 
				if (dia <1 || dia > 29) { //Si tiene más de 29 días, es incorrecto siempre
					return false;
				}
				if (!esBisiesto(year)) { //si el año no es bisiesto y tiene mas de 28 dias, es incorrecto
					if (dia <1 || dia >28) {
						return false;
					}
				}
		}
		return true; // si ha superado todos los filtros, es una fecha correcta.
	}
	/**
	 * Esta función comprueba si un año es bisiesto.
	 * @param year - año introducido por el usuario
	 * @return devuele verdadero en caso de ser bisiesto.
	 */
	public static boolean esBisiesto(int year) {
    if (year % 400 == 0){
      return true;
    }else if (year % 100 == 0){
      return false;
    }else if (year % 4 == 0){
      return true;
    }else{
      return false;
    }
	}

}
