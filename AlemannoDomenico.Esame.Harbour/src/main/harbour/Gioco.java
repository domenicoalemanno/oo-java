package main.harbour;

/**
* ************* *
* DA COMPLETARE *
* ************* *
*/
public class Gioco {
    
    private Porto p;
    
    public Gioco(Porto p) {
        super();
        this.p = p;
    }

    public Porto getP() {
        return p;
    }

    public void setP(Porto p) {
        this.p = p;
    }
    
    
    public void attacco(Invasore[] inv){
        int pf = 0;
        for (int i = 0; i < inv.length; i++) {
            pf += inv[i].potenzaFuoco();
        }
        
        p.addMetriQuadriDistrutti(pf * 2.5);
    }
    
    public boolean portoDistrutto(){
        return p.getDimensioneSqMetersNonDistrutta() == 0;
    }
}