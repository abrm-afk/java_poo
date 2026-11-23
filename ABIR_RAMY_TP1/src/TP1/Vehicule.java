package TP1;

public class Vehicule {
	private static int nbrvehicule = 0;
	private int id;
	private String modele;
	private String fariquant;
	private int nb_passagers;
	private double kmpl;
	private double fuelcap;
	
	public Vehicule (String modele , String fabriquant , int nb_passagers , double kmpl , double fuelcap) {

		nbrvehicule++;
		this.id = nbrvehicule;
		this.modele = modele;
		this.fariquant = fabriquant;
		this.nb_passagers = nb_passagers;
		this.kmpl = kmpl;
		this.fuelcap = fuelcap;

	}
	
	public double range() {
		return fuelcap*kmpl;
	}
	
	public double fuelneeded(double kms) {
		return kms/kmpl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getFariquant() {
		return fariquant;
	}

	public void setFariquant(String fariquant) {
		this.fariquant = fariquant;
	}

	public int getNb_passagers() {
		return nb_passagers;
	}

	public void setNb_passagers(int nb_passagers) {
		this.nb_passagers = nb_passagers;
	}

	public double getKmpl() {
		return kmpl;
	}

	public void setKmpl(double kmpl) {
		this.kmpl = kmpl;
	}

	public double getFuelcap() {
		return fuelcap;
	}

	public void setFuelcap(double fuelcap) {
		this.fuelcap = fuelcap;
	}
	
	
    @Override
    public String toString() {
        return "Fabriquant: " + fariquant + ", Modèle: " + modele;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        Vehicule autre = (Vehicule) obj;
        return this.fariquant.equals(autre.fariquant) 
            && this.modele.equals(autre.modele);
    }

}	
