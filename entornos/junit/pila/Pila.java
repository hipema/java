package entornos.junit.pila;

import java.util.ArrayList;

/**
 * Implementa las operaciones b�sicas de una estructura de datos pila (o stack).
 * Una pila es una estructura LIFO donde el �ltimo elemento en entrar es el
 * primero en salir.
 * 
 * @author Jaime Rabasco
 * 
 * @param <T>
 */
public class Pila<T> {
	private ArrayList<T> pila = null;

	/**
	 * Constructor de la estructura pila
	 */
	Pila() {
		pila = new ArrayList<T>();
	}

	/**
	 * Apila un elemento a la pila
	 * 
	 * @param element
	 *            elemento a añadir
	 */
	void push(T element) {
		pila.add(element);
	}

	/**
	 * Retira/elimina la cima de la pila
	 * 
	 * @return cima de la pila
	 */
	T pop() {
		if (pila.size() == 0)
			return null;
		return pila.remove(pila.size() - 1);
	}

	/**
	 * Devuelve la cima de la pila
	 * 
	 * @return cima de la pila
	 */
	T top() {
		if (pila.size() == 0)
			return null;
		return pila.get(pila.size() - 1);

	}

	/**
	 * Muestra la pila
	 */
	/*
	void show() {
		System.out.println(pila);
	}
	*/
	
	/* Muestra la lista para la prueba de caja negra*/
	String show() {
		return pila.toString();
	}

	/**
	 * Devuelve si la pila está vacía
	 * 
	 * @return true si la pila está vacía
	 */
	boolean IsEmpty() {
		return pila.isEmpty();
	}

}
