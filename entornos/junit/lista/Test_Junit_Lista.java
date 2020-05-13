package entornos.junit.lista;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_Junit_Lista {
  Lista<Cancion> listaTopMusic = new Lista<Cancion>();
  Cancion c1 = new Cancion("Highway to hell", "ACDC", "1979");
  Cancion c2 = new Cancion("A la luz de una sonrisa", "Gritando en Silencio", "2009" );
  /* 1. Antes de realizar cualquier test cree el objeto mimusica de la Clase Lista */
  @BeforeEach
  public void antesTest () {
    listaTopMusic.annadir(c1); // añade primera canción, originalmente [0]
    listaTopMusic.annadir(c2); // añade segunda canción en la siguiente posición [1]
  }
  
  /* 2. Después de cada test libere la memoria del objeto mimusica */
  @AfterEach
  public void despuesTest () {
    listaTopMusic = null;
  }
  
  /* 3. prueba_annadir_final_elemento(): Comprueba que al introducir un elemento Canción nuevo,
   * este se almacena correctamente al final de la lista. */
  @Test
  public void prueba_annadir_final_elemento() {
    Cancion c3 = new Cancion("Hay poco rock & roll", "Platero y tú", "1994");
    listaTopMusic.annadir(c3);
    Assertions.assertEquals(c3, listaTopMusic.buscar(2));
  }
  
  /* 4. prueba_annadir_pos_elemento(): Comprueba que al introducir un elemento
   * Canción nuevo, este se almacena correctamente en la posición indicada en la lista. */
  @Test
  public void prueba_annadir_pos_elemento() {
    Cancion c3 = new Cancion("Hay poco rock & roll", "Platero y tú", "1994");
    listaTopMusic.annadir(0, c3);
    Assertions.assertEquals(c3, listaTopMusic.buscar(0));
  }
  
  /* 5. prueba_modificar_elemento(): Comprueba que al modificar un elemento de la lista,
   * este se ha modificado correctamente. */
  @Test
  public void prueba_modificar_elemento() {
    Assertions.assertTrue(listaTopMusic.tamanno()==2);
    Cancion c4 = new Cancion("El Vals del Obrero", "Ska-p", "1996");
    listaTopMusic.modificar(1, c4);
    Assertions.assertEquals(c4, listaTopMusic.buscar(1));
    Assertions.assertTrue(listaTopMusic.tamanno()==2);
  }
  /* 6. prueba_tamanno_lista(): Comprueba que devuelve el tamaño correcto de la lista. */
  @Test
  public void prueba_tamanno_lista() {
    Assertions.assertTrue(listaTopMusic.tamanno()==2);
    Cancion c3 = new Cancion("Hay poco rock & roll", "Platero y tú", "1994");
    listaTopMusic.annadir(0, c3);
    Assertions.assertTrue(listaTopMusic.tamanno()==3);
  }
  
  /* 7. prueba_borrar_elemento(): Comprueba que borra correctamente un elemento de la lista. */
  @Test
  public void prueba_borrar_elemento() {
    Assertions.assertTrue(listaTopMusic.tamanno()==2);
    listaTopMusic.borrar(0);
    Assertions.assertTrue(listaTopMusic.tamanno()==1);
  }
  /* 8. prueba_buscar_elemento(): Comprueba que busca un elemento correctamente en la lista. */
  @Test
  public void  prueba_buscar_elemento() {
    Assertions.assertEquals(1, listaTopMusic.buscar(c2));
  }
  /* 9. prueba_buscar_pos_elemento(): Comprueba que busca correctamente un elemento dando
   * su posición en la lista. */
  @Test
  public void prueba_buscar_pos_elemento() {
    Assertions.assertEquals(c1, listaTopMusic.buscar(0));    
  }
  /* 10. prueba_vacia(): Comprueba que la lista esta vacia una vez que borras todos
   * los elementos de la lista. */
  @Test
  public void prueba_vacia() {
    Assertions.assertTrue(listaTopMusic.tamanno()==2);
    listaTopMusic.borrar(c2);
    listaTopMusic.borrar(0);
    Assertions.assertTrue(listaTopMusic.tamanno()==0);
  }
  /* 11. Crea tu propio test sobre el proyecto Lista. */
  @Test
  public void TestPropio () {
    Assertions.assertTrue(listaTopMusic.tamanno()==2);
    // Comprobamos que añadir canciones, tanto en el listado en general,
    // como en una posición específica funciona
    Cancion ultima = new Cancion("Corazón de Heavy Metal", "Lujuria", "1999");
    listaTopMusic.annadir(ultima); // pos 2 (en e momento) después 3
    Cancion top = new Cancion ("We Will Rock You", "Queen", "1977");
    listaTopMusic.annadir(0, top);
    Assertions.assertTrue(listaTopMusic.tamanno()==4);
    // Comprobamos que al añadir con posición, el elemento 0 se corresponde, y que la anterior se añadió al final
    Assertions.assertEquals(top, listaTopMusic.buscar(0));
    Assertions.assertEquals(ultima, listaTopMusic.buscar(3));
    // Comprobamos la opción modificar
    Cancion c3 = new Cancion("Hay poco rock & roll", "Platero y tú", "1994");
    listaTopMusic.modificar(0, c3);
    // Comprobamos que con el cambio, no se ha aumentado el tamaño de la lista y que la posición 0 ha variado.
    Assertions.assertFalse(listaTopMusic.tamanno()==5);
    Assertions.assertTrue(listaTopMusic.tamanno()==4);
    Assertions.assertEquals(c3, listaTopMusic.buscar(0));
   
  }
}
