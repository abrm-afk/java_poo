package P1;

public class Epargne extends Compte {
	private double tauxInteret;
	
	public Epargne (String nom, double solde, double taux_interet) {
		super(nom,solde);
		this.tauxInteret = tauxInteret;	
	}
	
	public void deposer(double montant) {
		if(montant>0) {
			solde += montant + (montant*tauxInteret);
			
		}
	}
	
	 @Override
	    public String toString() {
	        return super.toString() + " | Taux d'intérêt : " + tauxInteret;
	    }

	 public double getTauxInteret() {
		 return tauxInteret;
	 }

	 public void setTauxInteret(double tauxInteret) {
		 this.tauxInteret = tauxInteret;
	 }

}
