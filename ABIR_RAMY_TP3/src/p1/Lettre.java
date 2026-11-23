package p1;

public class Lettre extends ObjetPostal{
	
	private boolean estUrgente;

        public Lettre(String nomDestinataire, String adresseDestinataire, int codePostal, 
                  String villeDestination, boolean estRecommande, boolean estUrgente) {
        super(nomDestinataire, adresseDestinataire, codePostal, villeDestination, estRecommande);
        this.estUrgente = estUrgente;
    }

    @Override
    public double prix() {
        double prixTotal = 5.0; 

        if (this.estRecommande) {
            prixTotal += 15.0;
        }

        if (this.estUrgente) {
            prixTotal += 6.0;
        }

        return prixTotal;
    }

    @Override
    public String toString() {
        String urgence = estUrgente ? "Urgente" : "Normale";
        return super.toString() + " | Urgence : " + urgence;
    }

    public boolean isEstUrgente() {
        return estUrgente;
    }

    public void setEstUrgente(boolean estUrgente) {
        this.estUrgente = estUrgente;
    }
}


