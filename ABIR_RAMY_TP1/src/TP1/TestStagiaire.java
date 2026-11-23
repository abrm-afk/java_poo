package TP1;

public class TestStagiaire {
    public static void main(String[] args) {
        Stagiaire s1 = new Stagiaire("CIN378", "Abdelkhalek", "Youssef", "Tanger", "Informatique", 14.5f);
        Stagiaire s2 = new Stagiaire("CIN974", "Lahrach", "Sofia", "Marrakech", "Gestion", 12.75f);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
