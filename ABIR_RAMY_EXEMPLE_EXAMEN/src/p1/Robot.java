package p1;
public class Robot {
    private String nom;          
    private int x;               
    private int y;               
    private String direction;    
    
    public Robot(String nom) {
        this(nom, 0, 0, "Est");
    }

    public Robot(String nom, int x, int y, String direction) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getNom()        { return nom; }
    public int getX()             { return x; }
    public int getY()             { return y; }
    public String getDirection()  { return direction; }

    protected void setX(int x)               { this.x = x; }
    protected void setY(int y)               { this.y = y; }
    protected void setDirection(String d)    { this.direction = d; }

    public void avance() {
        switch (direction) {
            case "Nord":  y++; break;
            case "Sud":   y--; break;
            case "Est":   x++; break;
            case "Ouest": x--; break;
        }
    }

    public void droite() {
        switch (direction) {
            case "Nord":  direction = "Est";   break;
            case "Est":   direction = "Sud";   break;
            case "Sud":   direction = "Ouest"; break;
            case "Ouest": direction = "Nord";  break;
        }
    }

    @Override
    public String toString() {
        return "Robot{nom='" + nom + "', position=(" + x + "," + y +
               "), direction='" + direction + "'}";
    }
}