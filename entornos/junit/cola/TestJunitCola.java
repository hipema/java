package entornos.junit.cola;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJunitCola {
  Cola <Paciente> c;
  Paciente p0 = new Paciente("Paciente0", "Cero");

  /* 1. Antes de realizar cualquier test cree el objeto c de la Clase Cola */
  @BeforeEach
  void antesTest () {
    c = new Cola<Paciente>();
    c.enqueue(p0);
  }
  
  /* 2. Después de cada test libere la memoria del objeto c */
  @AfterEach
  void despuesCadaTest () {
    c = null;
  }
 
  /* 3. prueba_enqueue_elemento(): Comprueba que al introducir un elemento
   * Paciente nuevo, este se almacena correctamente en la cola */
  @Test
  public void prueba_enqueue_elemento() {
    c.dequeue();
    Assertions.assertTrue(c.IsEmpty());
    c.enqueue(new Paciente("Paciente", "Nuevo"));
    Assertions.assertEquals("Paciente Nuevo", c.front().toString());
    Assertions.assertFalse(c.IsEmpty());
  }
  /* 4. prueba_dequeue_elemento(): Comprueba que al eliminar un elemento de la cola,
   * el elemento que ahora esta en el front de la cola es el correcto. */
  @Test
  public void prueba_dequeue_elemento() {
   c.enqueue(new Paciente("Paciente", "Nuevo"));
   c.enqueue(new Paciente("Paciente2", "Nuevo3"));
   c.dequeue();
   // Incluimos tres pacientes.
   Assertions.assertEquals("Paciente Nuevo", c.front().toString());
  }
  
  /* 5. prueba_front_elemento(): Comprueba al crear el objeto c del punto uno de la cola,
   * el elemento que ahora esta en el front de la cola es el correcto. */
  @Test
  public void prueba_front_elemento() {
    Assertions.assertEquals("Paciente0 Cero", c.front().toString());
  }
  
  /* 6. prueba_vacia(): Comprueba mientras aplicas sucesivos dequeue, si la cola esta vacia.
   * De tal forma que el código nos de que está vacia en el momento esperado. */
  @Test
  public void prueba_vacia() {
    c.enqueue(new Paciente("Paciente", "Nuevo"));
    c.enqueue(new Paciente("Paciente2", "Nuevo3"));
    c.dequeue();
    c.dequeue();
    c.dequeue();
    Assertions.assertTrue(c.IsEmpty());
  }
  
  /* 7. Crea tu propio test sobre el proyecto cola. */
  @Test
  public void TestPropio () {
    // Metemos uno y comprobamos que el front sigue siendo el mismo
    c.enqueue(new Paciente("Paciente", "Nuevo"));
    Assertions.assertEquals("Paciente0 Cero", c.front().toString());
    // Eliminamos de la cola y obervamos que ahora es paciente Nuevo.
    c.dequeue();
    Assertions.assertEquals("Paciente Nuevo", c.front().toString());
    
    // Volvemos a eliminar para comprobar si esta vacío
    c.dequeue();
    Assertions.assertTrue(c.IsEmpty());
  }
  
  
  
}
