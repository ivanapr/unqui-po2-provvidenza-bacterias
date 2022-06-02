package ejercicio;

public class Coco extends Bacteria {

	private int radio;
	public Coco(int edad, int radio) {
		this.setRadio(radio);
		this.setEdad(edad);
	}
	private int getRadio() {
		return radio;
	}
	private void setRadio(int radio) {
		this.radio = radio;
	}
	public int getConsumoEspecifico() {
		return 2 * this.getRadio();
		
	}
}
