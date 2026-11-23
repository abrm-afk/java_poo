package P1;


import java.util.Scanner;

public class TestCompte {

	public static void main(String[] args) {
		Compte c1 = new Compte ("Yahya",100000.00);
		Compte c2 = new Compte ("Abir" , 300000.00);
		c2.deposer(2987);
		c1.retirer(187);
		System.out.println(c2);
		System.out.println(c1);	
		Courant p1 = new Courant("Ethan",4800.00,450.00);
		System.out.println("Solde initial : " + p1.getSolde());
		p1.retirer(500);
        System.out.println("Après retrait de 500 : " + p1);
		Epargne t1 = new Epargne("Grayson",3000.00,0.7);
		System.out.println("Solde initial : " + t1.getSolde());
		t1.deposer(6000);
        System.out.println("Après dépôt de 6000 avec interets : " + t1);
        
        Scanner scanner = new Scanner(System.in);
        Compte compteActuel = null;

            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Créer un compte");
                System.out.println("2. Afficher un compte");
                System.out.println("3. Lancer une transaction (Retrait ou Dépôt)");
                System.out.println("4. Tester Up-casting et Down-casting");
                System.out.println("5. Quitter");
                System.out.print("Votre choix : ");
                
                int choix = scanner.nextInt();
                scanner.nextLine(); // Consommer le retour à la ligne

                switch (choix) {
                    case 1:
                        System.out.print("Type de compte (1: Simple, 2: Courant, 3: Epargne) : ");
                        int type = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        System.out.print("Nom du client : ");
                        String nom = scanner.nextLine();
                        System.out.print("Solde initial : ");
                        double solde = scanner.nextDouble();

                        if (type == 1) {
                            compteActuel = new Compte(nom, solde);
                        } else if (type == 2) {
                            System.out.print("Montant du découvert autorisé : ");
                            double decouvert = scanner.nextDouble();
                            compteActuel = new Courant(nom, solde, decouvert);
                        } else if (type == 3) {
                            System.out.print("Taux d'intérêt (ex: 0.05) : ");
                            double taux = scanner.nextDouble();
                            compteActuel = new Epargne(nom, solde, taux);
                        } else {
                            System.out.println("Type invalide.");
                        }
                        System.out.println("Compte créé avec succès !");
                        break;

                    case 2:
                        if (compteActuel != null) {
                            System.out.println(compteActuel.toString());
                        } else {
                            System.out.println("Aucun compte n'existe.");
                        }
                        break;

                    case 3:
                        if (compteActuel != null) {
                            System.out.print("Opération (1: Dépôt, 2: Retrait) : ");
                            int op = scanner.nextInt();
                            System.out.print("Montant : ");
                            double montant = scanner.nextDouble();

                            if (op == 1) {
                                compteActuel.deposer(montant);
                            } else if (op == 2) {
                                compteActuel.retirer(montant);
                            }
                            System.out.println("Transaction effectuée.");
                        } else {
                            System.out.println("Veuillez d'abord créer un compte.");
                        }
                        break;

                    case 4:
                        System.out.println("\n--- DÉMONSTRATION DU CASTING ---");
                        
                        Compte compteUp = new Courant("ClientUp", 1000, 500);
                        System.out.println("1. Up-casting : " + compteUp.getNom() + " est vu comme un Compte.");

                        if (compteUp instanceof Courant) {
                            Courant compteDown = (Courant) compteUp; 
                            System.out.println("2. Down-casting réussi. Le découvert est de : " + compteDown.getDecouvert()); 
                        }
                        break;

                    case 5:
                        System.out.println("Au revoir !");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Choix invalide.");
                }
            }
        }

		

}
