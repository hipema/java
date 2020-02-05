package poo;

import javax.swing.JOptionPane;

/**
 * Esta clase crea objetos del tipo Círculo
 * 
 * ACTUALIZACIONES: Controlamos que el radio introducido pase siempre como valor
 * absoluto. Modificamos la ventana emergente. Convertimos en privado el método
 * área para evitar inconsistencia en el objeto. Para consultar el área por
 * separado, creamos un método específico que devuelva el valor del área.
 * 
 * @version 2.0
 * @author manuelhidalgo
 *
 */
public class Circulo {
// Atributos
  private double radio;

// Constructor
  Circulo(double radio) {
    this.radio = Math.abs(radio);
  }

// Getters y setters
  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    if (radio == 0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área");
    }
    this.radio = Math.abs(radio);
  }

// Métodos de la clase
  private double area() {
    double area = Math.PI * Math.pow(this.getRadio(), 2);
    return area;
  }

  public double mostrarArea() {
    return this.area();
  }

  public void crecerCirculo(int valor) {
    if (valor >= 0) {
      this.radio *= valor;
    } else {
      this.menguarCirculo(Math.abs(valor));
    }
  }

  public void menguarCirculo(int valor) {
    if (valor >= 0) {
      this.radio /= valor;
    } else {
      this.crecerCirculo(Math.abs(valor));
    }
  }

// Métodos

  public String toString() {
    return "Soy un círculo de radio " + this.radio + " metros. Ocupo un área de " + this.area() + " metros cuadrados.";
  }
}
