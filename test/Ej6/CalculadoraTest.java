package test.Ej6;

import Ej6.Calculadora;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setup() throws Exception {
        calculadora = new Calculadora();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMultiplicar() throws Exception {
        double resultado = calculadora.multiplicar(80, 3);
        assertEquals(240, resultado, 0);
    }

    @Test
    public void testSumarYDividir() throws Exception {
        double resultado = calculadora.dividir(calculadora.sumar(150, 180), 3);
        assertEquals(110, resultado, 0);
    }

    @Test
    public void testRestarYMultiplicar() throws Exception {
        double resultado = calculadora.multiplicar(calculadora.restar(90, 50), 15);
        assertNotEquals(605, resultado, 0);
    }

    @Test
    public void testSumarYMultiplicar() throws Exception {
        double resultado = calculadora.multiplicar(calculadora.sumar(70, 40), 25);
        assertNotEquals(2700, resultado, 0);
    }
}
