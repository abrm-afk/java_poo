package p1;

public class Chocolat extends DecorateurIngredient {
	public Chocolat(Dessert d) {
        super(d);
    }
	
	@Override
	public String getLibelle() {
		return dessert.getLibelle() + " au chocolat";
	}

	
	@Override
	public double getPrix() {
		return dessert.getPrix() + 0.20;
	}
}
