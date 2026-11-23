package p1;

import java.util.Date;

public class Operation {
	protected Date date;
	protected TypeOperation type;
	protected double montant;

	
	public Operation(TypeOperation type, double montant) {
		this.date =new Date();
		this.montant = montant;
		this.type = type;
	}
	
	public TypeOperation getType() {
		return type;
	}
	public double getMontant() {
		return montant;
	}
	
	@Override
	public String toString() {
		return "la date " + date + "montant" + montant + "type operation" + type;
	}
	

}
