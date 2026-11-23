package tp4;

import java.util.ArrayList;
import java.util.Iterator;
public class Agence {
    private String code;
    private String nom;
    private ArrayList<Client> clients;

    public Agence(String code, String nom) {
        this.code = code;
        this.nom = nom;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client c) {
        clients.add(c);
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
    public void supprimerClient(int cin) {
    	Iterator<Client> it = clients.iterator();
    	boolean trouve = false;
    	while(it.hasNext()) {
    		Client c = it.next();
    		if(c.getCin() == cin) {
    			it.remove();
    			trouve = true;
    			System.out.println("client supprime");
    		}
    	}
    		if (!trouve) { // trouve renvoie true
    	        System.out.println("Client introuvable.");
    	    }
    	}
    	
    	
   public void supp(int cin) {
	   Iterator<Client> it = clients.iterator();
	   boolean trouve = false;
	   while(it.hasNext()) {
		   Client c = it.next();
		   if(c.getCin() == cin) {
			   it.remove();
			   trouve=true;
		   }
		   
		  
		   
	   }
   }
    	
  //  	Le type déclaré détermine les méthodes accessibles à la compilation (d’où l’erreur de la ligne 6). Le type réel détermine la version de la méthode exécutée (liaison dynamique) : v2.getTarifJournalier() exécute celle de Camionnette
  //A2. Upcasting et downcasting
   //Upcasting : conversion d’une référence de sous-classe vers sa super-classe (Vehicule v = new Voiture(...)). Il est implicite et toujours sûr, car une Voiture est un Vehicule.
  // Downcasting : conversion d’une référence de super-classe vers une sous-classe ((Voiture) v). Il nécessite une écriture explicite, car le compilateur ne peut pas garantir que l’objet réel est de ce type. Le programmeur prend la responsabilité du cast, et une ClassCastException est possible à l’exécution.
   //A3. Type déclaré et type réel
   //Type déclaré : le type écrit à gauche dans la déclaration (Vehicule v2). Il est fixé à la compilation.
   //Type réel : la classe de l’objet créé avec new (Camionnette). Il est connu à l’exécution.	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public void AfficherClients() {
        clients.sort((c1, c2) -> {
            double somme1 = 0;
            for (Compte cp : c1.getComptes()) {
                somme1 += cp.getSolde();
            }
            double somme2 = 0;
            for (Compte cp : c2.getComptes()) {
                somme2 += cp.getSolde();
            }
            return Double.compare(somme1, somme2);
        });

        System.out.println("*** Liste des clients (triés par solde total) ***");
        for (Client c : clients) {
            double total = 0;
            for (Compte cp : c.getComptes()) {
                total += cp.getSolde();
            }
            System.out.println("Client : " + c.getNom() + " | Solde total : " + total + " Dhs");
        }
    }
}