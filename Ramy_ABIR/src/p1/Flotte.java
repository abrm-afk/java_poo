package p1;

import java.util.ArrayList;


public class Flotte {
    private ArrayList<Drone> drones;
    
    public Flotte() {
        this.drones = new ArrayList<>();
    }
    
    public void ajouterDrone(Drone d) {
        this.drones.add(d);
    }
    
    public void afficherFlotte() {
        if (drones.isEmpty()) {
            System.out.println("La flotte est vide.");
        } else {
            for (Drone d : drones) {
                System.out.println(d.toString());
            }
        }
    }
    
}  




	    
	    
	      	
	    

