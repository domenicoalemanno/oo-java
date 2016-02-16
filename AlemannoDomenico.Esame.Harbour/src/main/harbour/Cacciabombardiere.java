package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Cacciabombardiere extends Invasore {
	
	private int nArmamentiAlpha;
	private int nArmamentiBeta;
	
	public Cacciabombardiere(){
		
	}
	
	public Cacciabombardiere(int nAlpha, int nBeta){
		this.nArmamentiAlpha = nAlpha;
		this.nArmamentiBeta = nBeta;
	}
	
	public int potenzaFuoco(){
		return Math.round((this.nArmamentiAlpha + this.nArmamentiBeta) * 40);
	}

	public int getnArmamentiAlpha() {
		return nArmamentiAlpha;
	}

	public void setnArmamentiAlpha(int nArmamentiAlpha) {
		this.nArmamentiAlpha = nArmamentiAlpha;
	}

	public int getnArmamentiBeta() {
		return nArmamentiBeta;
	}

	public void setnArmamentiBeta(int nArmamentiBeta) {
		this.nArmamentiBeta = nArmamentiBeta;
	}
	
	

	
	
	
}