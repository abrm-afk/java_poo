package p1;

public class DroneNGSprint  extends Drone{
    private boolean modeSprint;
    public DroneNGSprint(String id) {
        super(id);
        this.modeSprint = false;
    }
    public DroneNGSprint(String id, int x, int y, int batterie) {
        super(id, x, y, batterie);
        this.modeSprint = false;
    }
    public void activerSprint() {
        this.modeSprint = true;
    }

    public void desactiverSprint() {
        this.modeSprint = false;
    }
    
    public void versEst(int n) {
    	int compt;
    	if (modeSprint) {
    		compt = 2;
    	} else {
    		compt = 1;
    	}
        for (int i = 0; i < n; i++) {
            this.x += compt;
        }
    }
    
    public void versNord(int n) {
    	int compt;
    	if (modeSprint) {
    		compt = 2;
    	} else {
    		compt = 1;
    	}        for (int i = 0; i < n; i++) {
            this.y += compt;
        }
    }

    public void diagonal() {
    	int it;
    	if (modeSprint) {
    		it = 2;
    	} else {
    		it = 1;
    	}        if (this.batterie < it) {
            System.out.println("Batterie insuffisant");
        } else {
            this.batterie -= it;
            int compt;
        	if (modeSprint) {
        		compt = 2;
        	} else {
        		compt = 1;
        	}      
        	this.x += compt;
            this.y += compt;
        }
    }
    @Override
    public String toString() {
        String etat = super.toString();
        if (modeSprint) {
            etat += " [ Sprint on]";
        } else {
            etat += " [ Sprint off]";
        }
        return etat;
    }
    
    
}




	    
	    

	    
	   
	   

	   

