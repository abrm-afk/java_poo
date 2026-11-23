package TP1;

import java.util.Scanner;

public class TestVehicule {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println(" BerlinCar ");
        System.out.print("Entrez le fabriquant : ");
        String fab1 = scanner.nextLine();
        
        System.out.print("Entrez le modèle : ");
        String mod1 = scanner.nextLine();
        
        System.out.print("Entrez le nombre de passagers : ");
        int pass1 = scanner.nextInt();
        
        System.out.print("Entrez la capacité du réservoir (fuelcap) : ");
        double fuel1 = scanner.nextDouble();
        
        System.out.print("Entrez la consommation (kmpl) : ");
        double kmpl1 = scanner.nextDouble();
        
         scanner.nextLine(); 

        Vehicule BerlinCar = new Vehicule(fab1, mod1, pass1, fuel1, kmpl1);

        System.out.println(" MiniCar ");
        System.out.print("Entrez le fabriquant : ");
        String fab2 = scanner.nextLine();
        
        System.out.print("Entrez le modèle : ");
        String mod2 = scanner.nextLine();
        
       System.out.print("Entrez le nombre de passagers : ");
        int pass2 = scanner.nextInt();
        
        System.out.print("Entrez la capacité du réservoir (fuelcap) : ");
        double fuel2 = scanner.nextDouble();
        
        System.out.print("Entrez la consommation (kmpl) : ");
        double kmpl2 = scanner.nextDouble();

       Vehicule MiniCar = new Vehicule(fab2, mod2, pass2, fuel2, kmpl2);
        
        System.out.println("BerlinCar : " + BerlinCar.toString());
        System.out.println("MiniCar   : " + MiniCar.toString());
        
        scanner.close();
        
        System.out.println("Portée de la BerlinCar (BMW Z4) : " + BerlinCar.range() + " km");
        System.out.println("Portée de la MiniCar (Dacia Lodgy) : " + MiniCar.range() + " km");
        
        System.out.printf("Carburant BerlinCar pour 500 km : %.2f L%n", BerlinCar.fuelneeded(500));    
        System.out.println("Carburant MiniCar pour 500 km   : " + MiniCar.fuelneeded(500) + " L");
        
        Vehicule Car1 = new Vehicule("BMW", "Z4", 2, 55, 8);
        Vehicule Car2 = new Vehicule("BMW", "Z4", 2, 55, 8);
        System.out.println(Car1.equals(Car2));    
    	
        Vehicule minicar1 = MiniCar;       
        Vehicule minicar2 = new Vehicule("Dacia", "Lodgy", 7, 50, 6);

        System.out.println("minicar1 " + minicar1.toString());
        System.out.println("minicar2 " + minicar2.toString());

        System.out.println("minicar1.equals(minicar2) ? " + minicar1.equals(minicar2));

        MiniCar.setModele("Logan");

        System.out.println("minicar1 " + minicar1.toString());
        System.out.println("minicar2 " + minicar2.toString());
        
        System.out.println("minicar1.equals(minicar2) ? " + minicar1.equals(minicar2));

        System.out.println("comparaison 1 " + (MiniCar == minicar1));
        System.out.println("comparaison 2 " + (MiniCar == minicar2));
    	
    }
}