package p1;
public class RobotNG extends Robot {

    private boolean turbo = false;     

    public RobotNG(String nom) { super(nom); }
    public RobotNG(String nom, int x, int y, String direction) {
        super(nom, x, y, direction);
    }

    public void activerTurbo()    { this.turbo = true;  }
    public void desactiverTurbo() { this.turbo = false; }

    @Override
    public void avance() {              
        int pas = turbo ? 3 : 1;
        switch (getDirection()) {
            case "Nord":  setY(getY() + pas); break;
            case "Sud":   setY(getY() - pas); break;
            case "Est":   setX(getX() + pas); break;
            case "Ouest": setX(getX() - pas); break;
        }
    }

    public void avance(int n) {         
        int total = n * (turbo ? 3 : 1);
        switch (getDirection()) {
            case "Nord":  setY(getY() + total); break;
            case "Sud":   setY(getY() - total); break;
            case "Est":   setX(getX() + total); break;
            case "Ouest": setX(getX() - total); break;
        }
    }

    public void gauche() {             
        for (int i = 0; i < 3; i++) super.droite();
    }

    public void demiTour() {           
        super.droite();
        super.droite();
    }

    @Override
    public String toString() {          
        return super.toString() + " [Turbo " + (turbo ? "ACTIF" : "INACTIF") + "]";
    }
}