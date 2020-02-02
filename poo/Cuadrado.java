package poo;

public class Cuadrado extends Rectangulo {
	 Cuadrado (int l) {
		super(l,l);
	}
// Setter y Getter de la clase
	 void setLado (int lado) {
		 this.setBase(lado);
		 this.setAltura(lado);
	 }
	 
	 int getLado () {
		 return this.getAltura();
	 }
	 
}
