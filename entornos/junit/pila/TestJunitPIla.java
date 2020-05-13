package entornos.junit.pila;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJunitPIla {
  Pila <Persona> p;
  Persona pers = new Persona ("Nombre", "Apellido");
  
  /* 1. Antes de realizar cualquier test cree el objeto p de la Clase Pila */
  @BeforeEach
  public void antesTest () {
    p = new Pila<Persona>();
    p.push(pers);
    p.push(new Persona ("Nombre2", "Apellido2"));
    p.push(new Persona ("Nombre3", "Apellido3"));
  }
  
  /* 2. Después de cada test libere la memoria del objeto p */
  @AfterEach
  public void despuesTest () {
    p = null;
  }
  
  /* 3. prueba_push_elemento():Comprueba que al introducir un elemento Persona nuevo,
   * este se almacena correctamente en el top de la pila */
  @Test
  public void prueba_push_elemento() {
    // toString
    p.push(new Persona("Nombre4", "Apellido4"));
    Assertions.assertEquals("Nombre4 Apellido4",  p.top().toString());
    
    // Referencia
    Persona persona = new Persona("Nombre5", "Apellido5");
    p.push(persona);
    Assertions.assertEquals(persona, p.top());
  }
  
  /* 4. prueba_pop_elemento():Comprueba que al eliminar un elemento de la pila,
   * el elemento que ahora esta en el top de la pila es el correcto. */
  @Test
  public void prueba_pop_elemento() {
    // to String
    p.pop();
    Assertions.assertEquals("Nombre2 Apellido2", p.top().toString());
    
    // Referencia
    p.pop();
    Assertions.assertEquals(pers, p.top());
  }
  
  /* 5. prueba_vacia(): Comprueba mientras aplicas sucesivos pop, si la pila esta vacia.
   * De tal forma que el código nos de que está vacia en el momento esperado. */
  @Test
  public void prueba_vacia() {
    // Comprobamos que la pila no está vacía con el "False"
    p.pop();
    p.pop();
    Assertions.assertFalse(p.IsEmpty());
    // Comprobaos que ahora sí es verdad que está vacía.
    p.pop();
    Assertions.assertTrue(p.IsEmpty());
  }

  /* 6. Crea tu propio test sobre el proyecto pila. */
  @Test
  public void testPropio () {
    // Probamos a añadir un nuevo objeto y que la función top devuelve el último nombre.
    p.push(new Persona("Nombre4", "Apellido4"));
    Assertions.assertTrue(p.top().toString().compareTo("Nombre4 Apellido4")==0);
    
    // Probamos a quitar un objeto
    p.pop();
    Assertions.assertEquals("Nombre3 Apellido3", p.top().toString());// Probamos que 
  }
}
