package p1;

import java.util.HashMap;

public class Parking {
    private HashMap<Integer, Voiture> places;
    private int nbPlaces;

    public Parking(int nbPlaces) {
        this.nbPlaces = nbPlaces;
        this.places = new HashMap<>();
    }
    
    public void garer(Voiture v, int numeroPlace) 
            throws PlaceNonLibreException, HorsParkingException, ParkingPleinException {
        
        if (numeroPlace < 0 || numeroPlace >= nbPlaces) {
            throw new HorsParkingException("La place " + numeroPlace + " n'existe pas.");
        }

        if (places.size() >= nbPlaces) {
            throw new ParkingPleinException("Le parking est complet.");
        }

        if (places.containsKey(numeroPlace)) {
            throw new PlaceNonLibreException("La place " + numeroPlace + " est déjà occupée.");
        }

        places.put(numeroPlace, v);
        System.out.println("Voiture garée à la place " + numeroPlace);
    }

    public void sortir(int numeroPlace) 
            throws PlaceLibreException, HorsParkingException {
        
        if (numeroPlace < 0 || numeroPlace >= nbPlaces) {
            throw new HorsParkingException("La place " + numeroPlace + " n'existe pas.");
        }

        if (!places.containsKey(numeroPlace)) {
            throw new PlaceLibreException("La place " + numeroPlace + " est déjà vide.");
        }

        places.remove(numeroPlace);
        System.out.println("La place " + numeroPlace + " est maintenant libre.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- État du Parking ---\n");
        for (int i = 0; i < nbPlaces; i++) {
            sb.append("Place n°").append(i).append(" : ");
            if (places.containsKey(i)) {
                sb.append(places.get(i).toString());
            } else {
                sb.append("Libre");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
    
    
