package p1;

public class Colis extends ObjetPostal {
	 private double poids; 

	    public Colis(String nomDestinataire, String adresseDestinataire, int codePostal,
	                 String villeDestination, boolean estRecommande, double poids) {
	        super(nomDestinataire, adresseDestinataire, codePostal, villeDestination, estRecommande);
	        this.poids = poids;
	    }

	    @Override
	    public double prix() {
	        double prixTotal = 8.0; 
	        prixTotal += 2.0 * poids; 
	        if (this.estRecommande) {
	            prixTotal += 15.0;
	        }
	        return prixTotal;
	    }

	    @Override
	    public String toString() {
	        double poidsEnKilos = poids / 1000.0;
	        return super.toString() + " | Poids : " + poidsEnKilos + " kg";
	    }

	    public double getPoids() {
	        return poids;
	    }

	    public void setPoids(double poids) {
	        this.poids = poids;
	    }

}
