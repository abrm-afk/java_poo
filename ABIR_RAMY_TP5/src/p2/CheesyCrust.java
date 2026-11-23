package p2;

public class CheesyCrust extends DecorateurPate {
	public CheesyCrust(Pizza p) {
        super(p);
    }

    @Override
    public String getNom() {
        return "Cheesy " + pizza.getNom();
    }

    @Override
    public double getPrix() {
        return pizza.getPrix() + 2;
    }

}
