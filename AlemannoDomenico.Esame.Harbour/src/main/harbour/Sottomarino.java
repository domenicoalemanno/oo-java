package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore {
	
	private int stazza;
	private int nArmamenti;
	
	public Sottomarino(){
		
	}
	
	public Sottomarino(int s, int arma){
		this.stazza = s;
		this.nArmamenti = arma;
	}
	
	public int potenzaFuoco(){
		return Math.round((this.nArmamenti * this.stazza) * 0.25f);
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}
}