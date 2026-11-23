package TP1;

public class Stagiaire {
    private String cin;
    private String nom;
    private String prenom;
    private String adresse;
    private String filiere;
    private float moyenne;

    public Stagiaire(String cin, String nom, String prenom, String adresse, String filiere, float moyenne) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.filiere = filiere;
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "CIN: " + cin + ", Nom: " + nom + ", Prenom: " + prenom + ", Adresse: " + adresse + ", Filiere: " + filiere + ", Moyenne: " + moyenne;
    }
}