package ejercicio;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Poblacion implements Consumidor {
	private int factorDeOxidacion = 4;
	ArrayList<Consumidor> consumidores;
	public Poblacion() {
		this.consumidores = new ArrayList<Consumidor>();
	}
	@Override
	public int getConsumoOxigeno() {
		return (this.getConsumoComponentes() * this.getCantidadComponentes())/factorDeOxidacion;
	}
	public int getConsumoComponentes() {
		Stream <Consumidor> contenidos = consumidores.stream();
		return contenidos.mapToInt(c -> c.getConsumoOxigeno()).sum();
	}
	public int getCantidadComponentes() {
		return consumidores.size();
	}
	public void addConsumidor(Consumidor c) {
		consumidores.add(c);
	}
}
