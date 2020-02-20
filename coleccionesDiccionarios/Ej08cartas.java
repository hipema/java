package coleccionesDiccionarios;

import java.util.ArrayList;

import poo.Fecha;

public class Ej08cartas implements Comparable<Ej08cartas> {
  private int numero;
  private String palo;
  private String nombre;
  private String nombreCorto;
  
  Ej08cartas (int numero, String palo) {
    assert (numero > 0 && numero <13 && (numero != 8 && numero != 9)&& (palo =="Oros" || 
        palo == "Bastos" || palo == "Copas" || palo == "Espadas")): "Valor incorrecto";
    this.numero = numero;
    this.palo = palo;  
  }
  
  Ej08cartas (){
    /**
     * Constructor sin pasar parámetros, para crear una carta de forma aleatoria.
     */
    int numeroCarta = 8;
    String[] paloCarta = {"Oros", "Espadas", "Bastos", "Copas"};
    int numPalo;
    while (numeroCarta == 8 || numeroCarta == 9) {
      numeroCarta = (int)(Math.random()*12)+1;
    }
    numPalo = (int)(Math.random()*4);

    Ej08cartas carta = new Ej08cartas(numeroCarta, paloCarta[numPalo]);
    this.numero = numeroCarta;
    this.palo = paloCarta[numPalo];
  }
  
  //Getters y Setters
  
  public int getNumero() {
    return numero;
  }
  public String getNombreCorto () {
    return nombreCorto;
  }

  public String getPalo() {
    return palo;
  }
  
  public String getNombre() {
    this.nombreDeCarta();
    return nombre;
  }

  public void setNumero(int numero) {
    assert (numero > 0 && numero < 13 && (numero != 8 && numero != 9)): "Valor incorrecto, los números de las cartas son de 1 a 12";
    this.numero = numero;
  }

  public void setPalo(String palo) {
    assert (palo == "Copas" || palo == "Oros" || palo == "Bastos" || palo == "Espadas"): "El palo debe ser Copas, Oros, Bastos o Espadas.";
    this.palo = palo;
  }
  
  // Métodos de la carta.
  public void nombreDeCarta () {
    String[]  nombres = {"AS", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    if (numero > 0 && numero < 8) {
      this.nombre = nombres[this.numero-1]+" de "+ this.palo;
    } else {
      this.nombre = nombres[this.numero-3]+" de "+ this.palo;
    }
    
  }

  public String tipoCarta () {
    String[]  nombres = {"AS", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    if (numero > 0 && numero < 8) {
      this.nombreCorto = nombres[this.numero-1];
    } else {
      this.nombreCorto = nombres[this.numero-3];
    }
    return this.nombreCorto;
  }
  
  @Override
  public String toString() {
    return this.getNombre();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + numero;
    result = prime * result + ((palo == null) ? 0 : palo.hashCode());
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
    Ej08cartas other = (Ej08cartas) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (numero != other.numero)
      return false;
    if (palo == null) {
      if (other.palo != null)
        return false;
    } else if (!palo.equals(other.palo))
      return false;
    return true;
  }
  
  @Override
  public int compareTo (Ej08cartas other) {
    //Ordena los palos
    int resultado;
    if (this.palo=="Bastos" && (other.palo == "Espadas" || other.palo == "Copas" || other.palo =="Oros")) {
      return resultado = 1;
    } else if (this.palo =="Copas" && (other.palo =="Espadas" || other.palo == "Oros")) {
      return resultado = 1;
    } else if (this.palo == "Copas" && (other.palo =="Bastos")) {
      return resultado = -1;
    } else if (this.palo == "Espadas" && (other.palo == "Oros")) {
      return resultado = 1;
    } else if (this.palo == "Espadas" && (other.palo == "Copas" || other.palo =="Bastos")) {
      return resultado = -1;
    } else if (this.palo == "Oros" && (other.palo =="Bastos" || other.palo == "Copas" || other.palo == "Espadas")) {
      return resultado = -1;
    } else if (this.numero > other.numero) {
      return resultado = 1;
    } else if (this.numero < other.numero) {
      return resultado = -1;
    } else {
      return resultado = 0;
    }
  }
}
