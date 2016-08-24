package kata.bingo;

import java.util.ArrayList;
import java.util.Random;

public class Carta {

	ArrayList<Fila> filas;
	private static final int FILA_LENGTH = 3;
	
	public Carta(){
		filas = new ArrayList<Fila>();
		for (int i = 0; i < FILA_LENGTH; i++) {
			filas.add(new Fila());
		}
	}
	
	public static int randomNumeroParaColumna(int numeroDeColumna) {
		Random r = new Random();
		return (numeroDeColumna == 0) ? r.nextInt(9)+1 : numeroDeColumna*10 + r.nextInt(9)+1;
	}

	public ArrayList<Fila> filas() {
		return filas;
	}
	
	//rowForNumber
	public int numeroDeFila(int numero) {
		Fila fila;
		for (int i = 0; i < filas.size(); i++) {
			fila = filas.get(i);
			if(fila.esNumero(numero))
				return i;
		}
		return -1;
	}
}
