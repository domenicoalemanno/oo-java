package domenico.alemanno.generale;

public class Videoteca {
	
	public static void main(String[] args){
		
		
		
		
		Attore tom = new Attore();
		tom.setNome("Tom");
		
		Attore jesse = new Attore();
		jesse.setNome("Jesse");
		
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
		System.out.println(c.costo());
		
		
		
	}
}