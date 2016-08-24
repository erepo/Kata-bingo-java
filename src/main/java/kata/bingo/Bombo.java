package kata.bingo;

import java.util.ArrayList;
import java.util.Random;

public class Bombo {

	public static final int NUM_BOLAS_EN_BOMBO = 89;
	public static Bombo INSTANCE = null;
	private ArrayList<Integer> bomboNumeros;
	private ArrayList<Jugador> jugadores;
	private Random random;

	public Bombo() {
		bomboNumeros = new ArrayList<Integer>();
		jugadores = new ArrayList<Jugador>();
		random = new Random(System.currentTimeMillis());
		poblarBombo();
	}

	public static Bombo getInstance() {
		if (INSTANCE == null){
			INSTANCE = new Bombo();
		}
		return INSTANCE;
	}

	private void poblarBombo() {
		for (int i = 1; i <= NUM_BOLAS_EN_BOMBO; i++) 
			bomboNumeros.add(i);		
	}

	public int getNumero() {
		if (bomboNumeros.size() == 0) return -1; //el bombo esta vacio
		int indice = random.nextInt(bomboNumeros.size());
		int numero = bomboNumeros.get(indice); //extraigo el numero
		//notifacion a los jugadores de nuevo numero
		for (Jugador jugador : jugadores) {
			jugador.notificacionDeNuevoNumero(numero);
		}
		//borrado de numero del bombo
		bomboNumeros.remove(indice);
		return numero;
	}

	public void addJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

}
