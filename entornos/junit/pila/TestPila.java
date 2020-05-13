package entornos.junit.pila;

/**
 * @author Jaime Rabasco
 * 
 */

public class TestPila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Pila<Persona> p = new Pila<Persona>();
	  
		p.push(new Persona("a", "a"));
		p.push(new Persona("b", "b"));
		p.push(new Persona("c", "c"));
		//p.show();
		System.out.println(p.show());

		
		System.out.println("Cima de la pila: " + p.top());
		
		while (!p.IsEmpty())
			System.out.println("Desapilo de la pila: " + p.pop());


		System.out.println("Pila vac�a");
	}

}

class Persona {
	private String nombre = null;
	private String apellidos = null;

	/**
	 * Constructor de la clase persona
	 * 
	 * @param nombre
	 * @param apellidos
	 */
	Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * Sobreescritura de toString para mostrar el objeto
	 */
	public String toString() {
		return nombre + " " + apellidos;
	}

}
