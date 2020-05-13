package entornos.junit.lista;
import entornos.junit.utiles.Teclado;

/**
 * Implementa un programa que gestione una lista de las canciones m�s
 * escuchadas. El usuario podrá:
 * <ul>
 * <li>Añadir una canción (en una posición) al TopMusic.</li>
 * <li>Sacar un elemento del TopMusic.</li>
 * <li>Subir un puesto en el TopMusic.</li>
 * <li>Bajar un puesto en el TopMusic.</li>
 * <li>Mostrar la lista TopMusic.</li>
 * <li>Mostrar la canción más escuchada.</li>
 * </ul>
 * Sobre la canción se almacenará el título, artista o grupo y año de grabación.
 * 
 * @author Jaime Rabasco
 * 
 */
public class TestTopMusic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<Cancion> listaTopMusic = new Lista<Cancion>();
		int opcion;
		do {
			menu();
			opcion = recogeEntero(1, 7);
			switch (opcion) {
			case 1:// añadir
				annadir(listaTopMusic);
				break;
			case 2:// sacar
				if (listaTopMusic.estaVacia()) {
					System.out.println("ERROR. La lista está vacía.");
					break;
				}
				sacar(listaTopMusic);
				break;
			case 3:// subir
				if (listaTopMusic.tamanno() < 2) {
					System.out
							.println("ERROR. Ningún elemento de la lista puede subir.");
					break;
				}
				subir(listaTopMusic);
				break;
			case 4:// bajar
				if (listaTopMusic.tamanno() < 2) {
					System.out
							.println("ERROR. Ningún elemento de la lista puede bajar.");
					break;
				}
				bajar(listaTopMusic);
				break;
			case 5:// mostrar lista
				listaTopMusic.mostrar();
				break;
			case 6:// mostrar top
				System.out.println(listaTopMusic.buscar(0));
				break;
			}
		} while (opcion != 7);
		System.out.println("Adios.");

	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void bajar(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(1, listaTopMusic.tamanno() - 1,
				"Introduce la posición del elemento a bajar, [" + 1 + ","
						+ (listaTopMusic.tamanno() - 1) + "]");

		listaTopMusic.annadir(i + 1, listaTopMusic.buscar(i - 1));
		listaTopMusic.borrar(i - 1);
	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void subir(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(2, listaTopMusic.tamanno(),
				"Introduce la posición del elemento a subir, [" + 2 + ","
						+ (listaTopMusic.tamanno()) + "]");

		listaTopMusic.annadir(i - 2, listaTopMusic.buscar(i - 1));
		listaTopMusic.borrar(i);
	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void sacar(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(1, listaTopMusic.tamanno(),
				"Introduce la posición del elemento a sacar, [" + 1 + ","
						+ listaTopMusic.tamanno() + "]");
		listaTopMusic.borrar(--i);

	}

	/**
	 * @param listaTopMusic
	 * @return
	 */
	private static void annadir(Lista<Cancion> listaTopMusic) {
		int i;
		i = recogeEntero(1, listaTopMusic.tamanno() + 1,
				"Introduce la posición del elemento a introducir, [" + 1 + ","
						+ (listaTopMusic.tamanno() + 1) + "]");

		listaTopMusic.annadir(i - 1, Cancion.pedirDatosCancion());

	}

	static void menu() {
		System.out
				.println("************************************************************");
		System.out
				.println("1. Añadir una canción (en una posición) al TopMusic.");
		System.out.println("2. Sacar un elemento del TopMusic.");
		System.out.println("3. Subir un puesto en el TopMusic.");
		System.out.println("4. Bajar un puesto en el TopMusic.");
		System.out.println("5. Mostrar la lista TopMusic.");
		System.out.println("6. Mostrar la canción más escuchada.");
		System.out.println("7. Salir.");

	}

	/**
	 * Recoge un entero por teclado dentro de un rango permitido
	 * 
	 * @param min
	 *            valor mínimo del rango
	 * @param max
	 *            valor máximo del rango
	 * @return entero válido introducido por el usuario
	 */
	static int recogeEntero(int min, int max) {
		int i;
		do {
			i = Teclado.leerEntero();
		} while (i < min || i > max);

		return i;
	}

	/**
	 * Recoge un entero por teclado dentro de un rango permitido
	 * 
	 * @param min
	 *            valor mínimo del rango
	 * @param max
	 *            valor máximo del rango
	 * @param msj
	 *            mensaje que se muestra al usuario
	 * 
	 * @return entero válido introducido por el usuario
	 */
	static int recogeEntero(int min, int max, String msj) {
		System.out.println(msj);
		return recogeEntero(min, max);

	}

}
