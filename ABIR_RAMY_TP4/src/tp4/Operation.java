package tp4;

import java.util.Date;

public class Operation{
	private Date date;
	private TypeOperation type;
	private double montant;
	
	public Operation(TypeOperation type,double montant) {
		this.type = type;
		this.montant = montant;
		this.date = new Date();
	}
	
	public TypeOperation getType() {
		return type;
	}
	
	 public double getMontant() {
	        return montant;
	    }

	    @Override
	    public String toString() {
	        return "Date : " + date + " | Type : " + type + " | Montant : " + montant + " Dhs";
	    }
}