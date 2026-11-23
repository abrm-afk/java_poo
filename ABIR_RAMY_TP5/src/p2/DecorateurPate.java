package p2;

public abstract class DecorateurPate extends Pizza{
	protected Pizza pizza;
	
	public DecorateurPate(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public abstract String getNom();
	@Override
	public abstract double getPrix();
}