package p1;

import java.util.Scanner;

public class BoiteALetrre {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("===== BOITE A LETTRES =====");
	        System.out.println("Que souhaitez-vous expédier ?");
	        System.out.println("1. Une Lettre");
	        System.out.println("2. Un Colis");
	        System.out.print("Votre choix : ");
	        int choix = scanner.nextInt();
	        scanner.nextLine(); 

	        ObjetPostal objet = null;

	        System.out.println("\n-- Informations destinataire --");
	        System.out.print("Nom du destinataire : ");
	        String nom = scanner.nextLine();
	        System.out.print("Adresse : ");
	        String adresse = scanner.nextLine();
	        System.out.print("Code postal : ");
	        int cp = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Ville : ");
	        String ville = scanner.nextLine();
	        System.out.print("Envoi recommandé ? (true/false) : ");
	        boolean recommande = scanner.nextBoolean();

	        if (choix == 1) {
	            System.out.print("Lettre urgente ? (true/false) : ");
	            boolean urgente = scanner.nextBoolean();

	            objet = new Lettre(nom, adresse, cp, ville, recommande, urgente);

	        } else if (choix == 2) {
	            System.out.print("Poids du colis (en grammes) : ");
	            double poids = scanner.nextDouble();

	            objet = new Colis(nom, adresse, cp, ville, recommande, poids);

	        } else {
	            System.out.println("Choix invalide. Fin du programme.");
	            scanner.close();
	            return;
	        }

	        System.out.println("Rappel");
	        System.out.println(objet); 
	        System.out.println("Tarif d'affranchissement : " + objet.prix() + " Dhs");

	        scanner.close();
	    }

}


