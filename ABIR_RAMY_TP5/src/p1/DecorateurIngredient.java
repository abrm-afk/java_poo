package p1;

public abstract class DecorateurIngredient extends Dessert {
	protected Dessert dessert;
	
	public DecorateurIngredient (Dessert dessert) {
		this.dessert = dessert;
	}
	
	@Override
	public abstract String getLibelle();
	
	@Override
	public abstract double getPrix();
		
}



/*la classe et les methodes attendront d'etre instancié*/