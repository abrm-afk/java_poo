package p1;

public class Cube implements Bloc {
	//protected double hauteur;
	//protected Couleur couleur;
	//public Cube(double hauteur,Couleur couleur) {
		//this.couleur = couleur;
		//this.hauteur = hauteur;
	//}
	//@Override
	//public double getHauteur() {
		//return hauteur;
	//}
	
	//@Override	
	//public Couleur getCouleur() {
		//return couleur;
	//}
	
	//@Override
	//public boolean estEmpilable() {
		//return false;
	//}
	
	protected double hauteur;
	protected Couleur couleur;
	public Cube(double hauteur,Couleur couleur) {
		this.hauteur = hauteur;
		this.couleur = couleur;
	}
	
	@Override
	public double getHauteur() {
		return hauteur;
	}
	@Override
	public Couleur getCouleur() {
		return couleur;
	}
	@Override
	public boolean estEmpilable() {
		return false;
	}
}
