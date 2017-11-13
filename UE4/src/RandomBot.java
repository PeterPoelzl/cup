import becker.robots.*;
import java.util.Random;

public class RandomBot {
    private RobotSE robi;
    private Random random = new Random();

    public RandomBot (RobotSE robi){
        super();
        this.robi = robi;

    }
    public void zufallsschritt(){
        robi.turnLeft(random.nextInt(4));
        while (!robi.frontIsClear()){
            robi.turnLeft(random.nextInt(4));
        }
        robi.move();
    }
    public int getStreet(){
        return robi.getStreet();
    }
    public int getAvenue(){
        return robi.getAvenue();
    }
}
