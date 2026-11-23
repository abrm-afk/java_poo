package p1;

public abstract class DecorateurOption extends Vehicule{
	protected Vehicule vehicule;
	public DecorateurOption(Vehicule v) {
		super(v.getCin(), v.getMarque(), v.getPrixBase());
		this.vehicule = v;
	}
	
	public abstract String getLibelle();
	public abstract double getTarifJournalier();
}