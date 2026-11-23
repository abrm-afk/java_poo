package p1;

public class DroneNG1 extends Drone {
	
	public DroneNG1(String id) {
		super(id);
		}
		
	public DroneNG1(String id, int x, int y, int batterie) {
		super(id, x, y, batterie);
		}
	

    public void versEst(int n) {
        this.x += n;
    }
    
    public void versNord(int n) {
        this.y += n;
    }

    public void diagonal() {
        if (this.batterie < 2) {
            System.out.println("Batterie insuffisante");
        } else {
            this.batterie -= 2;
            this.x += 1;
            this.y += 1;
        }
    }
    

}
