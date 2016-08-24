package kata.bingo;

@SuppressWarnings("unused")
public class Jugador {
	
	private String nombre;
	private Carta bingoCarta;
	
	public Jugador(String nombre) {
		this.setNombre(nombre);
	}

	public void notificacionDeNuevoNumero(int numero) {
		int line = bingoCarta.numeroDeFila(numero);
		
	}

	public void comprarCarta(Carta carta) {
		this.bingoCarta = carta;
		
	}

	public boolean tieneCarta() {
		return true;
	}

	public int chequeoNumero(int numero) {
		return bingoCarta.numeroDeFila(numero);
	}

	public int chequeoLineaGanadora(int numero) {
		int fila = chequeoNumero(numero);
		return 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
