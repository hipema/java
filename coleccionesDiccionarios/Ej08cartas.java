package coleccionesDiccionarios;

public class Ej08cartas {
  private int numero;
  private String palo;
  private String nombre;
  
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
  
  @Override
  public String toString() {
    return this.getNombre();
  }
}
