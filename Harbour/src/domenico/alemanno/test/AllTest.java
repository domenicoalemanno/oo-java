package domenico.alemanno.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import domenico.alemanno.generale.Aereo;
import domenico.alemanno.generale.Gioco;
import domenico.alemanno.generale.Invasore;
import domenico.alemanno.generale.Sottomarino;

@RunWith(Suite.class)
@SuiteClasses({Aereo.class, Gioco.class, Invasore.class, Sottomarino.class})
public class AllTest {

}