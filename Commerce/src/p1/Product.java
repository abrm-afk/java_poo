package p1;

public abstract class Product {
	protected int id;
	protected String nom;
	protected double prix;
	public Product(int id, String nom, double prix) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
	public abstract void buy();
	public final double getPrix() {
		return prix;
	}
	

}
