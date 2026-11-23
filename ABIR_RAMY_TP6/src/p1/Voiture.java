package p1;

public class Voiture {
    private String proprietaire;
    private String marque;
    private String type;
    private int nbChevaux;

    public Voiture(String proprietaire, String marque, String type, int nbChevaux) {
        this.proprietaire = proprietaire;
        this.marque = marque;
        this.type = type;
        this.nbChevaux = nbChevaux;
    }

    public String getProprietaire() { return proprietaire; }
    public String getMarque() { return marque; }
    public String getType() { return type; }
    public int getNbChevaux() { return nbChevaux; }

    public void setProprietaire(String proprietaire) { this.proprietaire = proprietaire; }
    public void setMarque(String marque) { this.marque = marque; }
    public void setType(String type) { this.type = type; }
    public void setNbChevaux(int nbChevaux) { this.nbChevaux = nbChevaux; }

    @Override
    public String toString() {
        return "Voiture [propriétaire=" + proprietaire + ", marque=" + marque
             + ", type=" + type + ", chevaux=" + nbChevaux + "]";
    }
}