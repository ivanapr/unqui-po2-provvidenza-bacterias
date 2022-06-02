package ejercicio;

public class Bacilo extends Bacteria {

	private int longitud;
	public Bacilo(int edad, int longitud) {
		this.setLongitud(longitud);
		this.setEdad(edad);
	}
	private int getLongitud() {
		return longitud;
	}
	private void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getConsumoEspecifico() {
		return 3 * this.getLongitud();
	}
}
