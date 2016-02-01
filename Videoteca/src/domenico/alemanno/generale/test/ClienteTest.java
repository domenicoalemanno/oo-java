package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Bluray;
import domenico.alemanno.generale.Cassetta;
import domenico.alemanno.generale.Cliente;
import domenico.alemanno.generale.Dvd;
import domenico.alemanno.generale.Film;

public class ClienteTest {



	@Test
	public void testCosto() {
		Bluray film = new Bluray();
		film.setData();
		
		film.setnGiorni(5);
		
		
		Cassetta ca = new Cassetta();
		ca.setnGiorni(2);
		
		
		Bluray f2 = new Bluray();
		f2.setnGiorni(1);
	
		
		Bluray f3 = new Bluray();
		f3.setnGiorni(2);

		
		Dvd c1 = new Dvd();
		c1.setnGiorni(3);
		
	
		
		Cliente c = new Cliente();
		Film films[] = new Film[]{
				f2,
				f3,
				film,
				c1, 
				ca
		};
		c.setFilms(films);
		
		//ritorno la stringa del valore
		assertEquals("30.4", c.costo());
	}

}
