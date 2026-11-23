package p1;

public abstract class Vehicule {
	protected int cin;
	protected String marque;
	protected double prixBase;
	
	public Vehicule(int cin, String marque,double pixBase){
		this.cin = cin;
		this.marque = marque;
		this.prixBase = prixBase;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrixBase() {
		return prixBase;
	}

	private void setPrixBase(double prixBase) {
		this.prixBase = prixBase;
	}
	public abstract double getTarifJournalier();
	public String getLibelle() {
		return marque + "("+ cin +")";
	}

	@Override
	public String toString() {
		return "Vehicule [cin=" + getCin()  + ", marque=" + getMarque() + ", prixBase=" + getPrixBase() + "]";
	}
	 

}
