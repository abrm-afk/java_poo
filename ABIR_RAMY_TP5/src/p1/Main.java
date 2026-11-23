package p1;

public class Main {
    public static void main(String[] args) {
        Dessert d1 = new Gaufre();
        d1 = new Chocolat(d1);
        System.out.println(d1);

        Dessert d2 = new Crepe();
        d2 = new Chocolat(d2);
        d2 = new Chantilly(d2);
        System.out.println(d2);

        Dessert d3 = new Chantilly(new Chocolat(new Crepe()));
        System.out.println(d3);
    }
}