package p1;

public class Clothing extends Product implements Delivrable {
	protected String taille;
	public Clothing(int id, String nom, double prix, String taille) {
		super(id, nom, prix);
		this.taille = taille;
	}
	public void ship() {
		System.out.println("Achat du vêtement : " + this.nom + " de taille " + this.taille + " pour un prix de " + this.prix);
	}
	public void buy() {
		System.out.println("Achat du vêtement : " + this.nom + " de taille " + this.taille + " pour un prix de " + this.prix);
	}
	
	
	


}
