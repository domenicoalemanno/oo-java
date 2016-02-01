package domenico.alemanno.generale.test;

import static org.junit.Assert.*;

import org.junit.Test;

import domenico.alemanno.generale.Film;

public class FilmTest {

	@Test
	public void testCosto() {
		Film film = new Film();
		assertEquals(0, film.costo());
	}

}
