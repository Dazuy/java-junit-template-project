package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HausaufgabenTest {
	public Rechnen rn;

	@Test
	public void kleineSummeTest() {
		rn = new Rechnen();
		String text = rn.Berechnen(3, 5);
		assertEquals("KleineSumme", text);
	}
	
	@Test
	public void MittlereSummeTest() {
		rn = new Rechnen();
		String text = rn.Berechnen(10, 50);
		assertEquals("MittlereSumme", text);
	}
	
	@Test
	public void GrosseSummeTest() {
		rn = new Rechnen();
		String text = rn.Berechnen(1000, 5000);
		assertEquals("GrosseSumme", text);
	}
	
	
	
	
}
