package kata.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilaTest {
	
	Fila fila;
	
	@Before
	public void setUp() {
		fila = new Fila();
	}
	
	@After
	public void tearDown() {
		fila = null;
	}

	@Test
	public void testLaCartaContieneNueveCasillasEnCadaFila() {		
		assertEquals("La longitud de las columnas deberia ser 9", 9, fila.length());
	}
	
	@Test
	public void testCuatroCuadrosBlancosEnLaFila() {
		ArrayList<Integer> blancos = fila.blancos();
		assertTrue("Esta posicion deberia almacenar un blanco en la fila.", fila.esBlanco(blancos.get(0)));
		assertTrue("Esta posicion deberia almacenar un blanco en la fila.", fila.esBlanco(blancos.get(1)));
		assertTrue("Esta posicion deberia almacenar un blanco en la fila.", fila.esBlanco(blancos.get(2)));
		assertTrue("Esta posicion deberia almacenar un blanco en la fila.", fila.esBlanco(blancos.get(3)));
	}

	@Test
	public void testCincoCuadrosConNumerosEnLaFila() {
		ArrayList<Integer> numeros = fila.numeros();
		assertTrue("Esta posicion deberia almacenar un numero en la fila.", fila.esNumero(numeros.get(0)));
		assertTrue("Esta posicion deberia almacenar un numero en la fila.", fila.esNumero(numeros.get(1)));
		assertTrue("Esta posicion deberia almacenar un numero en la fila.", fila.esNumero(numeros.get(2)));
		assertTrue("Esta posicion deberia almacenar un numero en la fila.", fila.esNumero(numeros.get(3)));
		assertTrue("Esta posicion deberia almacenar un numero en la fila.", fila.esNumero(numeros.get(4)));
	}
	
	
}
