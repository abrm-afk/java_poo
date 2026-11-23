package p1;

public class Camionette extends Vehicule {
	private double volume;
	
	public Camionette(int cin,String marque,double prixBase,double volume) {
		super(cin,marque,prixBase);
		this.volume = volume;
		
	}
	public double getVolume() {
		return volume;
	}
	
	@Override
	public double getTarifJournalier() {
		return getPrixBase()+10 * volume;
	}
}
