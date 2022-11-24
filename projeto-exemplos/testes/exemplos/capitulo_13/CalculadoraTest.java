package exemplos.capitulo_13;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testaSomar() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.somar(11, 33);
		assertEquals(44, resultado, 0.0);
	}
	
	@Test
	public void testaSomarFalhar() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.somar(11, 33);
		assertNotEquals(0, resultado, 0.0);
	}
	
	@Test
	public void testaSubtrair() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.somar(11, 33);
		assertEquals(44, resultado, 0.0);
	}
}
