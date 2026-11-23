package p1;
import java.util.ArrayList;
import java.util.List;

public class ListeRobots {

    private List<Robot> listeRobots;                 

    public ListeRobots() {                           
        this.listeRobots = new ArrayList<Robot>();
    }

    public void ajouterRobot(Robot r) {              
        listeRobots.add(r);
    }

    public void afficherListeRobots() {              
        for (Robot r : listeRobots) {
            System.out.println(r);
        }
    }
}