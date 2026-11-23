package p2;

public class FruttiDiMare extends Pizza{
	 public FruttiDiMare() {
	        setNom("Frutti di Mare");
	        setPrixH(PRIX_H);
	    }

	    @Override
	    public double getPrix() {
	        return getPrixH() * 6;
	    }

}
