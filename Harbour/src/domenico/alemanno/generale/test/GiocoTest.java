package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Aereo;
import domenico.alemanno.generale.Gioco;
import domenico.alemanno.generale.Invasore;
import domenico.alemanno.generale.PortoNavale;
import domenico.alemanno.generale.Sottomarino;

public class GiocoTest {

	@Test
	public void testDamage() {
		PortoNavale porto = new PortoNavale();
		porto.setNome("Porto Navale");
		porto.setDimensione(100);
		

		Aereo a = new Aereo(10 , 10);
		Aereo b = new Aereo(15, 5);
		
		Sottomarino s1 = new Sottomarino(10 , 10);
		Sottomarino s2 = new Sottomarino(5 , 15);
	
	
		Invasore incursori[] = new Invasore[]{
				a,
				b,
				s1,
				s2
		};
			
		
		Gioco game = new Gioco();
		game.setPorto(porto);
		game.setInvasori(incursori);
		
		assertEquals( 1 , game.damage());
		
	}

	@Test
	public void testLive() {
		PortoNavale porto = new PortoNavale();
		porto.setNome("Porto Navale");
		porto.setDimensione(10000);
		
		Gioco game = new Gioco();
		game.setPorto(porto);
		
		assertEquals(true , game.live());
	}
	

	
}