package p1;

import java.util.ArrayList;

public class Client {
	private int code;
	private double solde;
	private ArrayList <Compte> comptes;
	
	public Client(int code,double solde){
		this.code = code;
		this.solde=solde;
		this.comptes = new ArrayList<>();	
	}

	public void addCompte(Compte c) {
		comptes.add(c);		
	}
	
	public void AfficherCompte() {
		for(int i =0; i<=comptes.size(); i++) {
			Compte c = comptes.get(i);
			System.out.printf("compte n" + i  );
		}
	}
	
	public void relevet() {
		for(int i=0;i<comptes.size();i++) {
			comptes.get(i).afficher();
		}
	}
}
