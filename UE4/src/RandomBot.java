import becker.robots.*;
import java.util.Random;

public class RandomBot {
    private RobotSE robi;
    // Der Zufallsgenerator kann auch in der Methode zufallsschritt() initialisiert werden,
    // so ist aber schon gleich einmal sichergestellt,
    // dass sich beliebige RandomBots unabängig voneinander bewegen.
    private Random random = new Random();

    public RandomBot (RobotSE robi){
        this.robi = robi;

    }
    public void zufallsschritt(){
        robi.turnLeft(random.nextInt(4));
        while (!robi.frontIsClear()){
            robi.turnLeft(random.nextInt(4));
        }
        robi.move();
    }
    // Hier sind die nötigen Methoden aus der Klasse RobotSE neu implementiert,
    // um auch zu wissen, wo sich die RandomBots aufhalten.
    public int getStreet(){
        return robi.getStreet();
    }
    public int getAvenue(){
        return robi.getAvenue();
    }
}
