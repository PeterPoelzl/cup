import becker.robots.*;
import java.util.Random;

public class TesteZufallsBot {
    public static void main(String[] args) {
        City c = new City();
        RobotSE robi = new RobotSE(c, 5, 5, Direction.EAST, 6);
        ZufallsBot zufallsBot = new ZufallsBot(robi);
        Random random = new Random();

        Thing t[] = new Thing[5];
        for (int i = 0; i < 5; i++){
            t[i] = new Thing(c, random.nextInt(6) + 3, random.nextInt(6) + 3);
        }
        zufallsBot.sammleUndLegeAb(2, 3);
    }
}
