package p1;

public class DroneNG extends Drone{
	public DroneNG(String id) {
		super(id);
	}
	
	public DroneNG(String id, int x, int y, int batterie) {
		super(id, x, y, batterie);
	}
	
	public void versEst(int n) {
		for(int i = 0; i < n; i++) {
			super.versEst();
		}	
	}
	
	public void versNord(int n) {
		for(int i = 0; i < n; i++) {
			super.versNord();
		}	
	}

	public void diagonal() {
		if(this.batterie < 2) {
			System.out.println(" Batterie insuffisant");
		}
		else {
			this.batterie -= 2;
			this.versEst();
			this.versNord();
		  
		}
	}
	
	   
}
	
		
	

