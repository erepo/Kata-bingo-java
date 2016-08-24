package kata.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("static-access")
public class CartaTest {
	
	Carta carta;
	
	@Before
	public void setUp() {
		carta = new Carta();
	}
	
	@After
	public void tearDown() {
		carta = null;
	}
	
	@Test 
	public void testNumeroDeFilasCorrectas() {
		ArrayList<Fila> filas = carta.filas();
		int numeroDeFilas = filas.size();
		assertEquals("El numero de filas deberia ser 3.", 3, numeroDeFilas);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorPrimeraColumna() {
		assertTrue("El numero deberia ser mayor que 0", carta.randomNumeroParaColumna(0) > 0);
		assertTrue("El numero deberia ser mayor que 9", carta.randomNumeroParaColumna(0) <= 9);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorSegundaColumna() {
		assertTrue("El numero deberia ser mayor que 10", carta.randomNumeroParaColumna(1) >= 10);
		assertTrue("El numero deberia ser menor que 19", carta.randomNumeroParaColumna(1) <= 19);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorTerceraColumna() {
		assertTrue("El numero deberia ser mayor que 20", carta.randomNumeroParaColumna(2) >= 20);
		assertTrue("El numero deberia ser menor que 29", carta.randomNumeroParaColumna(2) <= 29);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorCuartaColumna() {
		assertTrue("El numero deberia ser mayor que 30", carta.randomNumeroParaColumna(3) >= 30);
		assertTrue("El numero deberia ser menor que 39", carta.randomNumeroParaColumna(3) <= 39);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorQuintaColumna() {
		assertTrue("El numero deberia ser mayor que 40", carta.randomNumeroParaColumna(4) >= 40);
		assertTrue("El numero deberia ser menor que 49", carta.randomNumeroParaColumna(4) <= 49);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorSextaColumna() {
		assertTrue("El numero deberia ser mayor que 50", carta.randomNumeroParaColumna(5) >= 50);
		assertTrue("El numero deberia ser menor que 59", carta.randomNumeroParaColumna(5) <= 59);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorSeptimaColumna() {
		assertTrue("El numero deberia ser mayor que 60", carta.randomNumeroParaColumna(6) >= 60);
		assertTrue("El numero deberia ser menor que 69", carta.randomNumeroParaColumna(6) <= 69);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorOctavaColumna() {
		assertTrue("El numero deberia ser mayor que 70", carta.randomNumeroParaColumna(7) >= 70);
		assertTrue("El numero deberia ser menor que 79", carta.randomNumeroParaColumna(7) <= 79);
	}
	
	@Test 
	public void testLimiteInferiorYSuperiorNovenaColumna() {
		assertTrue("El numero deberia ser mayor que 80", carta.randomNumeroParaColumna(8) >= 80);
		assertTrue("El numero deberia ser menor que 89", carta.randomNumeroParaColumna(8) <= 89);
	}

}
