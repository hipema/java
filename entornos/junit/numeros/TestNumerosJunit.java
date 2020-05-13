package entornos.junit.numeros;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* 7. Haz varias pruebas de cada uno de los métodos dentro de cada @Test  */
class TestNumerosJunit {
  Numeros numero;
  int base, num, exp;
  
  /* 1. Antes de realizar cualquier test cree el objeto de la clase Numeros */
  @BeforeEach
  void antesTest () {
    numero = new Numeros();  
  }
  
  /* 2. Después de cada test libere la memoria del objeto Numeros */
  @AfterEach
  void despuesTest () {
    numero = null;
  }
  
  /* 3. prueba_numero_primo(): Comprueba que al introducir un numero,
   * devueelve correctamente si es primo o no. */
  @Test
  void prueba_numero_primo() {
    Assertions.assertTrue(numero.primo(7));
    Assertions.assertFalse(numero.primo(4));
  }

  /* 4. prueba_base_exponente(): Comprueba que devuelve el resultado correcto de la operación. */
  @Test
  void prueba_base_exponente() {
    Assertions.assertEquals("4", numero.Potencia(2, 2));
    Assertions.assertEquals("16", numero.Potencia(2, 4));
  }
  
  /* 5. prueba_fibonacci(): Comprueba que devuelve correctamente la secuencia de
   * Fibonacci de un numero. */
  @Test
  void prueba_fibonacci() {
    Assertions.assertEquals(0, numero.Fibonacci(0));
    Assertions.assertEquals(1, numero.Fibonacci(2));
    Assertions.assertEquals(610, numero.Fibonacci(15));
  }
  
  /* 6. prueba_perfecto(): Comprueba si un número es perfecto. */
  @Test
  void prueba_perfecto() {
    Assertions.assertTrue(numero.Perfecto(28));
    Assertions.assertFalse(numero.Perfecto(5));
    Assertions.assertTrue(numero.Perfecto(8128));
  }
}
