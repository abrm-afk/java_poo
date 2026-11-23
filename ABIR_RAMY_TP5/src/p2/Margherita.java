package p2;

public class Margherita extends Pizza {
	
	 public Margherita() {
	        setNom("Margherita");
	        setPrixH(PRIX_H);
	    }

	    @Override
	    public double getPrix() {
	        return getPrixH() * 4;
	    }

}
