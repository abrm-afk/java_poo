package p1;

public class Chantilly extends DecorateurIngredient {
	public Chantilly(Dessert dessert) {
		super(dessert);
	}
	
	@Override
    public String getLibelle() {
        return dessert.getLibelle() + " avec chantilly";
    }

    @Override
    public double getPrix() {
        return dessert.getPrix() + 0.50;
    }

}
