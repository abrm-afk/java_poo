package p1;

public class Voiture extends Vehicule{
	public Voiture(int cin,String marque,Double prixBase) {
		super (cin,marque,prixBase);
		
	}
	
	@Override
	public double getTarifJournalier() {
		return getPrixBase();
	}
	
	

}
