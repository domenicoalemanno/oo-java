package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Attore;

public class AttoreTest {

	@Test
	public void testGetNome() {
		Attore tom = new Attore();
		tom.setNome("Tom");
		
		assertEquals("Tom", tom.getNome());
	}

}