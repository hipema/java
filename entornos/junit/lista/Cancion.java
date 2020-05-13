package entornos.junit.lista;
import entornos.junit.utiles.Teclado;

public class Cancion {
	private String titulo;
	private String autor;
	private String annoGrabacion;

	/**
	 * @param cancion
	 * @param autor
	 * @param annoGrabacion
	 */
	Cancion(String cancion, String autor, String annoGrabacion) {
		this.titulo = cancion;
		this.autor = autor;
		this.annoGrabacion = annoGrabacion;
	}

	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCancion ["
				+ (titulo != null ? "cancion=" + titulo + ", " : "")
				+ (autor != null ? "autor=" + autor + ", " : "")
				+ (annoGrabacion != null ? "annoGrabacion=" + annoGrabacion
						: "") + "]";
	}

	/**
	 * Solicita al usuario los datos de una nueva canción
	 * 
	 * @return la nueva canción con los datos solicitados del usuario
	 */
	static Cancion pedirDatosCancion() {
		Cancion cancion = new Cancion();
		System.out.print("Título: ");
		cancion.titulo = Teclado.leerCadena();
		System.out.print("Año de grabación: ");
		cancion.annoGrabacion = Teclado.leerCadena();
		System.out.print("Autor: ");
		cancion.autor = Teclado.leerCadena();
		return cancion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annoGrabacion == null) ? 0 : annoGrabacion.hashCode());
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Cancion other = (Cancion) obj;
		if (annoGrabacion == null) {
			if (other.annoGrabacion != null)
				return false;
		} else if (!annoGrabacion.equals(other.annoGrabacion))
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
