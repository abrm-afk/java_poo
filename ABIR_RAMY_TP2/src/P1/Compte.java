package P1;

public class Compte {
	protected static int compteur = 0;
	protected int code;
	protected String nom;
	protected double solde;
	
	public Compte( String nom, double solde) {
		compteur++;
		this.code=compteur;
		this.nom = nom;
		this.solde = solde;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void deposer(double montant) {
		if (montant>0) {
			 solde+=montant;
		}
	}
	public void retirer (double montant) {
		if(montant>0 && montant<=solde) {
			 this.solde-=montant;
		}
		
		else {
			System.out.println("Solde insuffisant");
		}
		 	}
	
	@Override
	public String toString(){
		return "compte numero : " + code + " nom : " + nom + " avec un solde de : " + solde;
	}

}
