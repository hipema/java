package entornos.junit.lista;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Clase Lista que gestiona una estructura de datos ArrayList. Se encarga de
 * almacenar elementos de tipo genérico T en el orden indicado. Implementa una
 * gran cantidad de operaciones sobre la estructura de datos.
 * 
 * @author Jaime Rabasco
 * 
 */
public class Lista<T> {
	/**
	 * Almacena la estructura de datos. Es un objeto ArrayList que contiene
	 * elementos de tipo T
	 */
	private ArrayList<T> lista = null;

	/**
	 * Constructor que crea el objeto ArrayList de tipo T
	 * 
	 */
	public Lista() {
		this.lista = new ArrayList<T>();
	}

	/**
	 * A�ade al final de la lista
	 * 
	 * @param elemento
	 *            elemento o nodo que va a añadirse al final de la estructura
	 */

	public void annadir(T elemento) {
		lista.add(elemento);
	}

	/**
	 * Añade en una determinado posición de la lista
	 * 
	 * @param posicion
	 *            índice donde va a insertarse el elemento (0 para el primero y
	 *            tamaño de la lista para añadir al final)
	 * @param elemento
	 *            elemento o nodo de tipo T que va a insertarse
	 */
	public void annadir(int posicion, T elemento) {

		if ((posicion < 0) || (posicion > lista.size()))
			System.out.println("Fuera de rango en annadir.");
		else
			lista.add(posicion, elemento);
	}

	/**
	 * Modifica un elemento de una determinada posición de la lista
	 * 
	 * @param posicion
	 *            índice donde va a modificarse el elemento (0 para el primero y
	 *            tamaño de la lista - 1 para modificar el último)
	 * @param elemento
	 *            elemento o nodo de tipo T que va a modificarse
	 */
	public boolean modificar(int posicion, T elemento) {

		if ((posicion < 0) || (posicion >= lista.size())) {
			System.out.println("Fuera de rango en modificar.");
			return false;
		} else {
			lista.set(posicion, elemento);
			return true;
		}
	}

	/**
	 * Reemplaza un elemento de la lista. Se indica la posición del elemento
	 * 
	 * 
	 * @param posicion
	 *            índice donde va a insertarse el elemento (0 para el primero y
	 *            tamaño de la lista para añadir al final)
	 * @param elemento
	 * @return
	 */
	/*
	 * boolean reemplazar(int posicion, T elemento) {
	 * 
	 * if ((posicion < 0) || (posicion > lista.size() - 1)) {
	 * System.out.println("Fuera de rango en reemplazar."); return false; }
	 * lista.set(posicion, elemento); return true; }
	 */
	/**
	 * Método que devuelve el tamaño de la lista
	 * 
	 * @return tamaño de la lista
	 */
	public int tamanno() {
		return lista.size();
	}

	/**
	 * Método que devuelve si una lista está vacía o no
	 * 
	 * @return true si la lista está vacía
	 */
	public boolean estaVacia() {
		return lista.isEmpty();
	}

	/**
	 * Método que muestra la lista
	 */
	public void mostrar() {
		System.out.println(lista);
	}

	/**
	 * Método que muestra la lista al revés
	 */
	public void mostrarAlReves() {
		ListIterator<T> lIt = lista.listIterator(lista.size());
		System.out.print("\n[");

		while (lIt.hasPrevious())
			System.out.print(lIt.previous() + ", ");
		System.out.println("]");
	}

	/**
	 * Borra el elemento de la posición indicada
	 * 
	 * @param posicion
	 *            índice del elemento a borrar
	 * @return true si se borra el elemento
	 */
	public boolean borrar(int posicion) {
		if ((posicion < 0) || (posicion > lista.size() - 1)) {
			System.out.println("Fuera de rango en borrar.");
			return false;
		}
		lista.remove(posicion);
		return true;
	}

	/**
	 * Método que busca el elemento indicado dentro de la lista
	 * 
	 * @param elemento
	 *            Elemento a buscar
	 * @return el índice de la primera ocurrencia encontrada en la lista. -1 si
	 *         no se encuentra el elemento
	 * 
	 */
	public int buscar(T elemento) {
		return lista.indexOf(elemento);
	}

	/**
	 * Método que busca y devuelve un elemento indicando su posición dentro de
	 * la lista
	 * 
	 * @param posicion
	 *            índice del elemento a devolver
	 * @return Elemento encontrado en la posición indicada. null si no está el
	 *         elemento.
	 */
	public T buscar(int posicion) {
		if (fueraDeRango(posicion))
			return null;
		return lista.get(posicion);
	}

	/**
	 * Método que borra el elemento indicado dentro de la lista
	 * 
	 * @param elemento
	 *            Elemento a borrar
	 * @return true si el elemento está en la lista
	 */
	public boolean borrar(T elemento) {
		if (buscar(elemento) != -1)
			lista.remove(elemento);
		return false;
	}

	/**
	 * Averigua si el índice indicado está dentro del rango de la lista, del 0
	 * al tamaño-1 de la lista
	 * 
	 * @param posicion
	 *            posición del elemento a confirmar dentro de la lista
	 * 
	 * @return true si la posición indicada está dentro del rango de la lista
	 */
	 private boolean fueraDeRango(int posicion) {
		if ((posicion < 0) || (posicion >= lista.size()))
			return true;
		return false;
	}

}
