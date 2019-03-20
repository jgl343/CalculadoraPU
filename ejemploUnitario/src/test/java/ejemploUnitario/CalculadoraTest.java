package ejemploUnitario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
		
	private Calculadora fixture;
	
	@Before
	public void setup() {
		this.fixture = new Calculadora();
		
	}
	
	@Test
	public void testSumar() throws Exception {
		int resultado = fixture.sumar(2,2);
		assertEquals(4, resultado);
	}
	
	@Test
	public void testRestar() throws Exception {
		int resultado = fixture.restar(2,2);
		assertEquals(0, resultado);
	}
	
	@Test
	public void testMultiplicar() throws Exception {
		int resultado = fixture.multiplicar(2,2);
		assertEquals(4, resultado);
	}
	@Test
	public void testDividir() throws Exception {
		int resultado = fixture.dividir(2,2);
		assertEquals(0, resultado);
	}
}
