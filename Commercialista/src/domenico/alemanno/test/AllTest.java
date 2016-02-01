package domenico.alemanno.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import domenico.alemanno.generale.Cliente;
import domenico.alemanno.generale.Commercialista;
import domenico.alemanno.generale.Dipendente;
import domenico.alemanno.generale.Imprenditore;
import domenico.alemanno.generale.LiberoProfessionista;
import domenico.alemanno.generale.Societa;

@RunWith(Suite.class)
@SuiteClasses({Cliente.class, Commercialista.class, Dipendente.class, Imprenditore.class, LiberoProfessionista.class, Societa.class})
public class AllTest {

}