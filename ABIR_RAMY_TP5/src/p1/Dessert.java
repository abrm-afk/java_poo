package p1;

public abstract class Dessert {
	public String libelle;
	public double prix;
	
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
	    return getLibelle() + " : " + getPrix() + " Dh";
	}
}
