import becker.robots.*;
import java.util.Random;

public class ZufallsBot {
    private RobotSE robi;

    public ZufallsBot(RobotSE robi){
        this.robi = robi;
    }
    public void sammleUndLegeAb(int n, int m){
        Random random = new Random();
        for (int i = 0; i < 30 && robi.countThingsInBackpack() > 0; i++){
            if ((robi.getStreet() + robi.getAvenue()) % n == 0){
                robi.putThing();
            }
            if ((robi.getStreet() + robi.getAvenue()) % m == 0){
                if (robi.canPickThing()){
                    robi.pickThing();
                }
            }
            robi.turnLeft(random.nextInt(4));
            robi.move();
        }
    }
}
