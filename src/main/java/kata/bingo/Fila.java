package kata.bingo;

import java.util.ArrayList;

public class Fila {

	private static final int COLUMNA_LENGTH = 9;
	private static final int BLANCOS_LENGTH = 4;
	private static final int NUMEROS_LENGTH = 5;

	private ArrayList<Integer> numerosArray;
	private ArrayList<Integer> indicesBlancos;
	private ArrayList<Integer> indicesNumeros;

	public Fila() {
		numerosArray = new ArrayList<Integer>(COLUMNA_LENGTH);
		for (int indice = 0; indice < COLUMNA_LENGTH; indice++) {
			numerosArray.add(indice);
		}
		indicesBlancos = new ArrayList<Integer>(BLANCOS_LENGTH);
		for (int i = 0; i < BLANCOS_LENGTH; i++) {
			indicesBlancos.add(0);
		}
		indicesNumeros = new ArrayList<Integer>(NUMEROS_LENGTH);
		for (int i = 0; i < NUMEROS_LENGTH; i++){ //el blanco será el cero (0)
			indicesNumeros.add(Carta.randomNumeroParaColumna(i));
		}
		poblarFilaConBlancosYNumeros();
	}

	private void poblarFilaConBlancosYNumeros() {
		mezclarNumeroYBlancos();

	}

	public ArrayList<Integer> mezclarNumeroYBlancos(){
		ArrayList<Integer> nuevaLista = new ArrayList<Integer>(COLUMNA_LENGTH);
		for (int i = 0; i < NUMEROS_LENGTH; i++) {
			if (i < 4){
				Integer aa = indicesBlancos.get(i);
				nuevaLista.add(aa);
			}
			if (i <= 4){
				Integer bb = indicesNumeros.get(i);
				nuevaLista.add(bb);
			}
		}
		return nuevaLista;
	}

	public int length() {
		return COLUMNA_LENGTH;
	}

	public ArrayList<Integer> blancos() {
		return indicesBlancos;
	}

	public boolean esBlanco(int columna) {
		return indicesBlancos.get(columna) == 0;
	}

	public ArrayList<Integer> numeros() {
		return numerosArray;
	}

	public boolean esNumero(int columna) {
		return indicesNumeros.get(columna) != 0;
	}
	
}
