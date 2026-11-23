package tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class Compte{
	private int cin;
	private double solde;
	private ArrayList <Operation> operations;
	
	public Compte(int cin,double solde) {
		this.cin=cin;
		this.solde = solde;
		this.operations=new ArrayList<>();		
	}
	
	public void addOperation(TypeOperation type,double montant) {
		operations.add(new Operation(type,montant));
	}
	
	public void retirer(double montant) {
		if(solde<=montant) {
			System.out.println("solde insufisant");
		}else {
			solde-=montant;
			addOperation(TypeOperation.RETRAIT,montant);	 
		}
	}
	
	public void deposer(double montant) {
		solde+=montant;
		addOperation(TypeOperation.DEPOT,montant);
	}
	
	public void afficher() {
		if(operations.isEmpty()) {
			System.out.println("aucune operation");
		}else {
			Iterator<Operation> it = operations.iterator(); // on declare un iterator qui traversera type Operation,lesoperations
			while(it.hasNext()) {//puisque ce n'est pas le dernier
				Operation op = it.next();//on stocke la valeur suivante dans op
				System.out.println(op.toString());//on affiche les info de op
				
			}
			
		}

	}
	
	public double getSolde() {
        return solde;
    }

	}
    
    
