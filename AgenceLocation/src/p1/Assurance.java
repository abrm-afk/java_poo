package p1;

public class Assurance extends DecorateurOption{
	public Assurance(Vehicule v) {
		super(v);
	}
	
	@Override
	public String getLibelle() {
		return vehicule.getLibelle() +"+Assurance";
	}
	@Override
	pu

}