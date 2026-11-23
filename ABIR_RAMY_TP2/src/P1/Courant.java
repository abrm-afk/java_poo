package P1;

public class Courant extends Compte {
	private double decouvert;
	
	public Courant(String nom, double solde, double decouvert) {
		super(nom,solde);
		this.decouvert=decouvert;	
	}
	
	public void retirer(double montant) {
		if(montant>0 && (solde+decouvert) >= montant) {
			solde = solde - montant;
		}	
			else {
				System.out.println("solde insuffisant");
			}
	}
	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
	return "compte numero : " + code + " nom : " + nom + " avec un solde de : " + solde + " decouvert autorise " + decouvert;
	}
}


