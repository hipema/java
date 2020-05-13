package entornos.junit.cola;
/**
 * @author Jaime Rabasco
 */

public class TestCola {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cola<Paciente> cola = new Cola<Paciente>();

		cola.enqueue(new Paciente("a", "a"));
		cola.enqueue(new Paciente("b", "b"));
		cola.enqueue(new Paciente("c", "c"));
		//cola.show();
		System.out.println(cola.show());

		System.out.println("Cabeza de la cola: " + cola.front());

		while (!cola.IsEmpty())
			System.out.println("Saco de la cola: " + cola.dequeue());

		System.out.println("Cola vacía");

	}

}
class Paciente {
	private String nombre = null;
	private String apellidos = null;

	/**
	 * Constructor de la clase paciente
	 * 
	 * @param nombre
	 * @param apellidos
	 */
	Paciente(String nombre, String apellidos) {
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
