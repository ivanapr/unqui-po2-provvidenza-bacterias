package ejercicio;

public abstract class Bacteria implements Consumidor {
	private int edad;
	private int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int getConsumoOxigeno() {
		int consumo = getConsumoEspecifico();
		if (this.getEdad()>2){
			consumo = consumo / 2;
		}
		return consumo;
	}
	public abstract int getConsumoEspecifico();
}
