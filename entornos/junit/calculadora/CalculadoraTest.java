package entornos.junit.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
  Calculadora calc = new Calculadora();
  
  @BeforeEach
  void antesDeCadaTest() {
    System.out.println("Código a Ejecutar antes de cada test.");
  }
  
  @AfterEach
  void despuesDeCadaTest() {
    System.out.println("Código a Ejecutar después de cada test.");
  }

  @Test
  void testSumar() {
    Assertions.assertEquals(3, calc.sumar(3));
    Assertions.assertEquals(7, calc.sumar(4));
    Assertions.assertEquals(9, calc.sumar(2));
  }

  @Test
  void testRestar() {
    Assertions.assertEquals(-3, calc.restar(3));
    Assertions.assertEquals(-5, calc.restar(2));
    Assertions.assertEquals(-10, calc.restar(5));
  }

  @Test
  void testGetResultado() {
    Assertions.assertEquals(0, calc.getResultado());
  }

}
