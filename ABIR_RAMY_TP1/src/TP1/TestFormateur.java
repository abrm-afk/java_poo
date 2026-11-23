package TP1;

public class TestFormateur {
    public static void main(String[] args) {
        Formateur f1 = new Formateur("CIN974", "Ramy", "Abir", "Mohammedia", 100, 10, 50.0, 75.0);
        Formateur f2 = new Formateur("CIN2945", "Mazmar", "Sara", "Casablanca", 120, 5, 60.0, 90.0);

        System.out.println(f1.toString());
        System.out.println("Salaire: " + f1.calculSalaire() + "DH");

        System.out.println(f2.toString());
        System.out.println("Salaire: " + f2.calculSalaire() + "DH");
    }
}