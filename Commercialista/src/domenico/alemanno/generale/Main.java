package domenico.alemanno.generale;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Societa soci = new Societa();
		
		soci.setpIva("dngnft88e87");
		soci.setFatture(5500);
		
		Imprenditore im1 = new Imprenditore();
		im1.setNome("Prima");
		im1.setCognome("Colazione");
		im1.setCf("prmclz88e27");
		im1.setSoci(soci);
		//System.out.println(im1.calcoloParcella());
		
		Dipendente dip1 = new Dipendente();
		dip1.setCognome("Secondo");
		dip1.setCognome("La Polizia");
		dip1.setCf("scnlpz53e10");
		//System.out.println(dip1.calcoloParcella());
		
		LiberoProfessionista lb = new LiberoProfessionista();
		lb.setFatture(100);
		lb.setpIva("ashgbjadf");
		//System.out.println(lb.calcoloParcella());
		
		
		Commercialista clem = new Commercialista();
		
		Cliente[] clienti = new Cliente[]{
			lb,
			dip1,
			im1
		};
		
		
		clem.setClienti(clienti);
		
		System.out.println(clem.incasso());
		
		
		
	}
}