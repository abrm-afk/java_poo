package p1;

import java.util.ArrayList;

public class TestFlotte {
	
	public static void main(String[] args) {
		ArrayList<Drone> flotte = new ArrayList<>();
		Drone d1 = new Drone("D1");
        DroneNG d2 = new DroneNG("D2");
        DroneNGSprint d3 = new DroneNGSprint("D3");
           
        flotte.add(d1);
        flotte.add(d2);
        flotte.add(d3);
        

        for (Drone d : flotte) {
            System.out.println(d.toString());
        }
    }
	
	
}

		

		

	        
	

