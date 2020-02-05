package poo;

import javax.swing.JOptionPane;

/**
 * Esta clase crea objetos del tipo Círculo
 * 
 * @version 1.0
 * @author manuelhidalgo
 *
 */
public class Circulo {
// Atributos
  private double radio;

// Constructor
  Circulo(double radio) {
    this.radio = radio;
  }

// Getters y setters
  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    if (radio == 0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área");
    }
    this.radio = radio;
  }

// Métodos de la clase
  public double area() {
    double area = Math.PI * Math.pow(this.getRadio(), 2);
    return area;
  }

  public void crecerCirculo(int valor) {
    this.radio *= valor;
  }

  public void menguarCirculo(int valor) {
    this.radio /= valor;
  }

// Métodos

  public String toString() {
    return "Soy un círculo de radio " + this.radio + " metros. Ocupo un área de " + this.area() + " metros cuadrados.";
  }
}
