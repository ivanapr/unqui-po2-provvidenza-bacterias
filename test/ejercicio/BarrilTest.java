package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarrilTest {

	Barril barril;
	Poblacion pob1, pob2;
	Coco co1;
	Bacilo ba1, ba2, ba3;
	
	@BeforeEach
	void setUp() {
		barril = new Barril(123,2022);
		co1 = new Coco(1, 10);
		ba1 = new Bacilo(1, 20);
		ba2 = new Bacilo(2, 40);
		ba3 = new Bacilo(3, 60);
		pob1 = new Poblacion();
		pob2 = new Poblacion();
		pob1.addConsumidor(co1);
		pob2.addConsumidor(ba1);
		pob2.addConsumidor(ba2);
		pob2.addConsumidor(pob1);
		barril.addConsumidor(ba3);
		barril.addConsumidor(pob1);
		barril.addConsumidor(pob2);
		
	}
	@Test
	void testGetOxigenoBarril() {
		assertEquals(233, barril.getConsumoOxigenoTotal());
	}

}
