package p1;

public class ProductDecorateur extends Product {
	protected Product product;
	
	public ProductDecorateur(Product product) {
		super(product.id, product.nom, product.prix);
		this.product = product;
	}
	
	@Override
	public void buy() {
		product.buy();
	}

}
