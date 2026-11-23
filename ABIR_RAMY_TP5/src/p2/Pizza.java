package p2;

public abstract class Pizza{
	protected static final double PRIX_H=2.5;
	
	protected String nom;
	protected double prixH;
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public double getPrixH() {
		return prixH;
	}
	
	public void setPrixH(double prixH) {
		this.prixH=prixH;
	}
	
	public abstract double getPrix();
	
	public String toString() {
		return getNom() +" : " + getPrix();
	}
}
