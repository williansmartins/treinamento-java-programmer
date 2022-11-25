package exemplos.capitulo_13;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testaASoma() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.somar(11, 22);
		assertEquals(33,resultado , 0.0);
	}
	
	@Test
	public void testaASomaDandoErro() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.somar(11, 22);
		assertNotEquals(0,resultado , 0.0);
	}
	
	@Test
	public void testaASubtracao() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.subtrair(66, 22);
		assertEquals(44,resultado , 0.0);
	}
	
	@Test
	public void testaAMultiplicacao() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.multiplicar(66, 22);
		assertEquals(1452,resultado , 0.0);
	}
	
	
	
//	@Test
//	public void testaSomar() {
//		Calculadora calculadora = new Calculadora();
//		double resultado = calculadora.somar(11, 33);
//		assertEquals(44, resultado, 0.0);
//	}
//	
//	@Test
//	public void testaSomarFalhar() {
//		Calculadora calculadora = new Calculadora();
//		double resultado = calculadora.somar(11, 33);
//		assertNotEquals(0, resultado, 0.0);
//	}
//	
//	@Test
//	public void testaSubtrair() {
//		Calculadora calculadora = new Calculadora();
//		double resultado = calculadora.somar(11, 33);
//		assertEquals(44, resultado, 0.0);
//	}
}
