package poo;

/**
 * Clase que crea objetos Fecha, basandonos en el ejercicio del exámen.
 * 
 * Ejercicio añadiendo la corrección de clase, y comentarios.
 * 
 * @version 3.0
 * @author manuelhidalgo
 *
 */

public class Fecha implements Comparable<Fecha> {
  // para usar la sobrecarga con compareTo, java nos obliga a implementar  la
  // interfaz Comparable, que nos permite comparar objetos.
  // Atributos
  private int dia;
  private int mes;
  private int anyo;

  /**
   * Constructor de la clase.
   * @param dia
   * @param mes
   * @param anyo
   */
  Fecha(int dia, int mes, int anyo) {
    // En java no necesita que se especifique los métodos estáticos
    // con Fecha.fechaCorrecta. Además, se puede incluir : "mensaje a mostrar con error"
    assert fechaCorrecta(dia, mes, anyo): "Construcción de fecha incorrecta"; 
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
  }

  // Getters y Setters
  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    assert fechaCorrecta(dia, this.mes, this.anyo): "Día incorrecto";
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    assert fechaCorrecta(this.dia, mes, this.anyo): "Mes incorrecto";
    this.mes = mes;
  }

  public int getAnyo() {
    return anyo;
  }

  public void setAnyo(int anyo) {
    assert fechaCorrecta(this.dia, this.mes, anyo): "Año incorrecto";
    this.anyo = anyo;
  }

  // Métodos
  /**
   * Esta función devuelve el nombre del mes del objeto.
   * @return String con el nombre del mes de la función.
   */
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
  public Fecha sumarNDias(int value) {
    Fecha f = new Fecha(this.dia, this.mes, this.anyo);
    for (int i = 0; i < value; i++) {
      f = f.sumarUnDia();
    }
    return new Fecha(f.dia, f.mes, f.anyo);
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
    /*
     * Esta función se podría hacer como en la versión original, aunque es más
     * sencillo mediante la fórmula explicada en clase.
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
    return resultado;*/
    int fecha;
    fecha = this.anyo*10000 + this.mes*100 + this.dia;
    return fecha;
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
    return dia > 0 && dia <= Fecha.diaMaximoMes(mes, anyo);
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
  @Override
  public String toString() {
    return this.dia + " de " + this.nombreMes() + " de " + this.anyo;
  }

  // hashCode hay que mantenerlo. Forma parte del autogenerado del equals.
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + anyo;
    result = prime * result + dia;
    result = prime * result + mes;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fecha other = (Fecha) obj;
    if (anyo != other.anyo)
      return false;
    if (dia != other.dia)
      return false;
    if (mes != other.mes)
      return false;
    return true;
  }

  @Override
  public int compareTo(Fecha other) {
    int resultado = this.fechaNumerica()-other.fechaNumerica();
    return resultado;
  }
  
}
