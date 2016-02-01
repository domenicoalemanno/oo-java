package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Cliente;
import domenico.alemanno.generale.Commercialista;
import domenico.alemanno.generale.Dipendente;
import domenico.alemanno.generale.Imprenditore;
import domenico.alemanno.generale.LiberoProfessionista;
import domenico.alemanno.generale.Societa;

public class CommercialistaTest {

	@Test
	public void testIncasso() {
Societa soci = new Societa();
		
		soci.setpIva("as514552856");
		soci.setFatture(5500);
		
		Imprenditore im1 = new Imprenditore();
		im1.setNome("Clemente");
		im1.setCognome("Di Rosa");
		im1.setCf("Drkjcbsekgbrd34");
		im1.setSoci(soci);
		
		Dipendente dip1 = new Dipendente();
		dip1.setCognome("Matteo");
		dip1.setCognome("Steve");
		dip1.setCf("hjjvfewjvh");
		
		LiberoProfessionista lb = new LiberoProfessionista();
		lb.setFatture(100);
		lb.setpIva("ashgbjadf");
		
		
		Commercialista clem = new Commercialista();
		
		Cliente[] clienti = new Cliente[]{
			lb,
			dip1,
			im1
		};
		
		clem.setClienti(clienti);
		
		assertEquals(6050, clem.incasso());
		
	}
	

}