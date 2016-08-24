package kata.bingo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class JugadorTest {
	
	private Jugador jugador;
	private Carta cartaMocked;
	private Bombo bomboMocked;
	
	@Before
	public void setUp() {
		jugador = new Jugador("jugador");
		cartaMocked = mock(Carta.class);
		bomboMocked = mock(Bombo.class);
	}
	
	@Test
	public void testJugadorCompraCarta() {		
		jugador.comprarCarta(cartaMocked);
		
		assertTrue("El jugador debe tener una carta de bingo.", jugador.tieneCarta());
	}
	
	@Test
	public void testChequeoDeNumeroMismaFila() {
		when(cartaMocked.numeroDeFila(anyInt())).thenReturn(1);
		when(bomboMocked.getNumero()).thenReturn(8);
		
		jugador.comprarCarta(cartaMocked);
		
		assertEquals("El numero deberia estar en cualquier fila.", 1, jugador.chequeoNumero(bomboMocked.getNumero()));
	}
	
	@Test
	public void testChequeoDeLlamadaDeNumeroEnLaFila(){
		
		jugador.comprarCarta(cartaMocked);
		jugador.chequeoNumero(anyInt());
		
		verify(cartaMocked).numeroDeFila(anyInt());
	}
	
	@Test
	public void testChequeoDeNumeroNoEstaEnNingunaFila() {
		when(cartaMocked.numeroDeFila(anyInt())).thenReturn(-1);
		when(bomboMocked.getNumero()).thenReturn(8);
		
		jugador.comprarCarta(cartaMocked);
		int number = bomboMocked.getNumero();
		
		assertEquals("El numero deberia estar en cualquier fila. ", -1, jugador.chequeoNumero(number));
	}
	
	@Test
	public void testJugadorChequeaNumeroYVericaSiTieneLineaGanadora() {
		
		jugador.comprarCarta(cartaMocked);
		jugador.chequeoLineaGanadora(anyInt());
		
		verify(cartaMocked).numeroDeFila(anyInt());
	}
}
