package domenico.alemanno.generale.test;


import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Imprenditore;
import domenico.alemanno.generale.Societa;

public class ImprenditoreTest {

	@Test
	public void testCalcoloParcella() {
Societa soci = new Societa();
		
		soci.setpIva("as514552856");
		soci.setFatture(5500);
		
		Imprenditore im1 = new Imprenditore();
		im1.setNome("Clemente");
		im1.setCognome("Di Rosa");
		im1.setCf("Drkjcbsekgbrd34");
		im1.setSoci(soci);
		
		assertEquals(5900, im1.calcoloParcella());
		
	}

}
