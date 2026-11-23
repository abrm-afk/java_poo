package p2;

public class Pan extends DecorateurPate {
	 public Pan(Pizza p) {
	        super(p);
	    }

	    @Override
	    public String getNom() {
	        return "Pan " + pizza.getNom();
	    }

	    @Override
	    public double getPrix() {
	        return pizza.getPrix() + 1.5;
	    }

}
