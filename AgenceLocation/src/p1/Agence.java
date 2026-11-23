package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class Agence {
	private ArrayList<Vehicule> v;
	
	public Agence(){
		v = new ArrayList<>();
		v.add(new Voiture(56789,"DAFJ",35.7));
		v.add(new Camionette(56789,"ERTYU",876.90,87.00));
	}
		public void ajouterVehicule(Vehicule c) {
	        v.add(c);
    
	}
		
		public void remove(Vehicule c) {
			v.remove(c);			
		}
		
		public void afficher1() {
			for(Vehicule c : v) {
	            System.out.println(v);

				if(c instanceof Camionette) {
					Camionette cam = (Camionette) c;
				}else if(c instanceof Voiture) {
					Voiture voiture = (Voiture) c;
					
				}
			}
		}
			

		public void afficher() {
		    for (int i = 0; i < v.size(); i++) {
		        Vehicule c = v.get(i);
		        System.out.println(c); // Note: printing c instead of v to show each individual vehicle

		        if (c instanceof Camionette) {
		            Camionette cam = (Camionette) c;
		        } else if (c instanceof Voiture) {
		            Voiture voiture = (Voiture) c;
		        }
		    }
		}
}
