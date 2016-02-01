package domenico.alemanno.generale.test;


import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Dipendente;

public class DipendenteTest {

	@Test
	public void testCalcoloParcella() {
		Dipendente dip1 = new Dipendente();
		dip1.setCognome("Matteo");
		dip1.setCognome("Steve");
		dip1.setCf("hjjvfewjvh");
		
		assertEquals(50, dip1.calcoloParcella());
		
		
	}

}