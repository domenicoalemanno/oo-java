package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Dvd;

public class DvdTest {

	@Test
	public void testCosto() {
		Dvd c1 = new Dvd();
		c1.setnGiorni(3);
		
		assertEquals(50,c1.costo());
	}

}
