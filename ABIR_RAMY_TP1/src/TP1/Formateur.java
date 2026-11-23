package TP1;

public class Formateur {
	
	  private String cin;
	    private String nom;
	    private String prenom;
	    private String adresse;
	    private int mh;
	    private int hs;
	    private double the;
	    private double ths;

	    public Formateur(String cin, String nom, String prenom, String adresse, int mh, int hs, double the, double ths) {
	        this.cin = cin;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresse = adresse;
	        this.mh = mh;
	        this.hs = hs;
	        this.the = the;
	        this.ths = ths;
	    }
	    
	    @Override
	    public String toString() {
	        return "CIN: " + cin + ", Nom: " + nom + ", Prenom: " + prenom + ", Adresse: " + adresse + ", MH: " + mh + ", HS: " + hs + ", THE: " + the + ", THS: " + ths;
	    }
	    
	    public double calculSalaire() {
	        return (mh * the) + (hs * ths);
	    }


}
