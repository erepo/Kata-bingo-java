package kata.bingo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BomboTest {
	
	Bombo bingoBombo;
	
	@Before
	public void setUp() {
		bingoBombo = new Bombo();
	}
	
	@After
	public void tearDown() {
		bingoBombo = null;
	}
	
	
	@Test
	public void testObtenerNumeroDesdeBombo() {
		int numero = bingoBombo.getNumero();
		assertNotNull("El resultado no deberia ser nulo.", numero);
	}
	
	@Test
	public void testDosExtraccionesConsecutivasDiferentesNumeros() {
		int numero1 = bingoBombo.getNumero();
		int numero2 = bingoBombo.getNumero();
		assertTrue("Extraccion de numeros que deberian ser diferentes.", numero1 != numero2);
	}
	
	@Test
	public void  testTresExtraccionesConsecutivasDiferentesNumeros() {
		int numero1 = bingoBombo.getNumero();
		int numero2 = bingoBombo.getNumero();
		int numero3 = bingoBombo.getNumero();
		assertTrue("Extraccion de numeros que deberian ser diferentes.", numero1 != numero2);
		assertTrue("Extraccion de numeros que deberian ser diferentes.", numero1 != numero3);
		assertTrue("Extraccion de numeros que deberian ser diferentes.", numero2 != numero3);
	}
	
	
	@Test
	public void testBingoNotificaAJugadorCuandoHayNuevoNumero() {
		Jugador jugadorMocked = mock(Jugador.class);
		bingoBombo.addJugador(jugadorMocked);
		int numero = bingoBombo.getNumero();
		verify(jugadorMocked).notificacionDeNuevoNumero(numero);
	}
	
	@Test
	public void testBomboDeberiaEstarVacio() {
		for(int i = 0; i < Bombo.NUM_BOLAS_EN_BOMBO; i++ )
			bingoBombo.getNumero();
		assertTrue("El bombo del bingo deberia estar vacio.", bingoBombo.getNumero() == -1);
	}
	
}
