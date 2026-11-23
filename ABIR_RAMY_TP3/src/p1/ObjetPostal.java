package p1;

public abstract class ObjetPostal {
	protected String nomDestinataire;
	protected String adresseDestinataire;
	protected int codePostal;
	protected String villeDestination;
	protected boolean estRecommande; 
	
	public ObjetPostal(String nomDestinataire,String adresseDestinataire,int codePostal,String villeDestination, boolean estRecommande) {
		this.nomDestinataire = nomDestinataire;
		this.adresseDestinataire = adresseDestinataire;
		this.codePostal = codePostal;
		this.villeDestination = villeDestination;
		this.estRecommande = estRecommande;
	}
	
	public abstract double prix();


	public String getNomDestinataire() {
		return nomDestinataire;
	}

	public void setNomDestinataire(String nomDestinataire) {
		nomDestinataire = nomDestinataire;
	}

	public String getAdresseDestinataire() {
		return adresseDestinataire;
	}

	public void setAdresseDestinataire(String adresseDestinataire) {
		adresseDestinataire = adresseDestinataire;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		codePostal = codePostal;
	}

	public String getVilleDestination() {
		return villeDestination;
	}

	public void setVilleDestination(String villeDestination) {
		villeDestination = villeDestination;
	}

	public boolean isEstRecommande() {
		return estRecommande;
	}

	public void setEstRecommande(boolean estRecommande) {
		this.estRecommande = estRecommande;
	}
	
	
	 @Override
	    public String toString() {
	        String typeEnvoi = estRecommande ? "Recommande" : "Normal";
	        return "Objet Postal {" +
	               "Destinataire : '" + nomDestinataire + '\'' +
	               ", Adresse : '" + adresseDestinataire + '\'' +
	               ", Code Postal : '" + codePostal + '\'' +
	               ", Ville : '" + villeDestination + '\'' +
	               ", Type : " + typeEnvoi +
	               '}';
	    }

}
