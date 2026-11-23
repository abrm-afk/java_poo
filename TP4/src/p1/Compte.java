package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class Compte {
	private int code;
	private double solde;
	private ArrayList<Operation> operations;

	public Compte(int code , double solde) {
		this.code = code;
		this.solde = solde;
		this.operations = new ArrayList<>();		
	}
	
	public void addOperation(TypeOperation type,double montant) {
		operations.add(new Operation(type,montant));		
	}
	public void deposer(double montant) {
		solde+=montant;
		addOperation(TypeOperation.DEPOT,montant);
	}
	
	public void retirer(double montant) {
		if(solde<montant) {
			System.out.println("solde insufisant");
		}else {
			solde-=montant;
			addOperation(TypeOperation.RETRAIT,montant);
		}
	}
	
	public void afficher() {
		if(operations.isEmpty()) {
			System.out.printf("pas d'operation");
		}else {
			Iterator<Operation> it = operations.iterator();
			while(it.hasNext()) {
				Operation op = it.next();
				System.out.println(op.toString());
			}
		}
	}
	
}
