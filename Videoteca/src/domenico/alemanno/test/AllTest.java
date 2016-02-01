package domenico.alemanno.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import domenico.alemanno.generale.Attore;
import domenico.alemanno.generale.Bluray;
import domenico.alemanno.generale.Cassetta;
import domenico.alemanno.generale.Cliente;
import domenico.alemanno.generale.Dvd;
import domenico.alemanno.generale.Film;

@RunWith(Suite.class)
@SuiteClasses({Attore.class, Bluray.class, Cassetta.class, Cliente.class, Dvd.class, Film.class})
public class AllTest {

}
