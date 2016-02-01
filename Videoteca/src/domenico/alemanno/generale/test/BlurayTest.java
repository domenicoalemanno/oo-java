package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Bluray;

public class BlurayTest {

	@Test
	public void testCosto() {
		Bluray film = new Bluray();
		
		
		film.setnGiorni(5);
		//intero
		assertEquals(193, film.costo());
		// valore preciso
		//assertEquals("19.3", film.costo() / 10 + "." + film.costo() % 10);
	}

}