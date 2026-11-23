package p1;

public class TestParking {
    public static void main(String[] args) {
        Parking parking = new Parking(3);

        Voiture v1 = new Voiture("Alice", "Renault", "Clio", 5);
        Voiture v2 = new Voiture("Bob", "Peugeot", "208", 4);
        Voiture v3 = new Voiture("Charlie", "Ferrari", "F40", 12);
        Voiture v4 = new Voiture("David", "Audi", "A3", 5);

        try {
            parking.garer(v1, 0);
            parking.garer(v2, 1);
            parking.garer(v3, 2);
            
            parking.garer(v4, 0); 
            
        } catch (HorsParkingException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (PlaceNonLibreException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ParkingPleinException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erreur inattendue : " + e.getMessage());
        }
    }
}