package tp4;

import java.util.ArrayList;

public class Client {
	protected int cin;
	private String nom;
	private ArrayList <Compte> comptes;	
	public Client(int cin,String nom) {
		this.cin = cin;
		this.nom = nom;
		this.comptes = new ArrayList<>();
	}	
	public void addCompte(Compte c) {
		comptes.add(c);
	}	
	public ArrayList<Compte> getcompte(){
		return comptes;
	}	
	public int getCin() {
        return cin;
    }
    public String getNom() {
        return nom;
    }
    public void AfficherCompte() {
    	for(int i=0;i<comptes.size();i++) {
    		Compte c = comptes.get(i);
    		System.out.println(" - Compte N°" + i + " | Solde: " + c.getSolde() + " Dhs");           		
    	}
    }   
    public void Printrelevet() {
    	for (int i=0;i<comptes.size();i++) {
    		comptes.get(i).afficher();
    	}
    }
    
    
    alter table etudiant
    set nom='abir' and nv_etud=mip
    where numetud = 1;

}
    
    

