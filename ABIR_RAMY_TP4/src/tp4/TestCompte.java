package tp4;

public class TestCompte {

    public static void main(String[] args) {
        Client client1 = new Client(12345, "Yahya");
        Client client2 = new Client(67890, "Abir");

        Compte c1 = new Compte(1, "Compte Courant Yahya", 1500.0);
        Compte c2 = new Compte(2, "Compte Epargne Yahya", 5000.0);
        Compte c3 = new Compte(3, "Compte Courant Abir", 8000.0);

        client1.addCompte(c1);
        client1.addCompte(c2);
        client2.addCompte(c3);

        c1.deposer(500.0);
        c1.retirer(200.0);
        c1.deposer(1000.0);

        c2.deposer(200.0);
        c2.retirer(7000.0); 

        c3.deposer(1500.0);
        c3.retirer(500.0);

        System.out.println("*** Relevé du compte 1 ***");
        c1.afficher();
        System.out.println();

        System.out.println("*** Liste des comptes de Yahya ***");
        client1.AfficherCompte();
        System.out.println();

        System.out.println("*** Relevé complet des comptes de Yahya ***");
        client1.printReleve();
        System.out.println();


        Agence agence = new Agence("AG001", "Agence Centrale");
        agence.addClient(client1);
        agence.addClient(client2);

        Client client3 = new Client(11111, "Ethan");
        Compte c4 = new Compte(4, "Compte Ethan", 10000.0);
        client3.addCompte(c4);
        agence.addClient(client3);

        
        System.out.println("*** Affichage des clients de l'agence (triés par solde total) ***");
        agence.AfficherClients();
        System.out.println();

        System.out.println("*** Suppression du client Abir (CIN: 67890) ***");
        agence.supprimerClient(67890);
        System.out.println();

        System.out.println("*** Nouvel affichage des clients après suppression ***");
        agence.AfficherClients();
    }
}