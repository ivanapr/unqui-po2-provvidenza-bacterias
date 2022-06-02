package ejercicio;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Barril {
	private int codigo;
	private int anio;
	ArrayList<Consumidor> consumidores;
	public Barril(int codigo, int anio) {
		this.setCodigo(codigo);
		this.setAnio(anio);
		this.consumidores = new ArrayList<Consumidor>();
	}
	private int getCodigo() {
		return codigo;
	}
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	private int getAnio() {
		return anio;
	}
	private void setAnio(int anio) {
		this.anio = anio;
	}
	public int getConsumoOxigenoTotal() {
		Stream <Consumidor> contenidos = consumidores.stream();
		return contenidos.mapToInt(c -> c.getConsumoOxigeno()).sum();
	}
	public void addConsumidor(Consumidor c) {
		consumidores.add(c);
	}
}
