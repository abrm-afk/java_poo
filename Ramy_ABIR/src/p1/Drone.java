package p1;

public class Drone {
	protected String id;
	protected int x;
	protected int y;
	protected int batterie;
	
	public Drone(String id) {
		this.id = id;
		this.x = 0;
		this.y = 0;
		this.batterie = 100;
	}
	public Drone(String id, int x, int y, int batterie) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.batterie = batterie;
	}
	
	public void versEst() {
		if(this.batterie == 0) {
			System.out.println(" Batterie vide");
		} else {
			this.x++;
			this.batterie--;
		}
		
	}
	
	public void versNord() {
		if(this.batterie == 0) {
			System.out.println(" Batterie vide");
		} else {
			this.batterie--;
		    this.y++;
		}   
		
	}
	
	public String toString() {
		return "Drone [id=" + id + ", x=" + x + ", y=" + y + ", batterie=" + batterie + "]";
	}

}
