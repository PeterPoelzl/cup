import becker.robots.*;
import java.util.Random;
import java.lang.Math;

public class TesteFolgeSpurBot {
    public static void main(String[] args){
        City c = new City();
        RobotSE robi = new RobotSE(c, 1, 1, Direction.EAST);
        FolgeSpurBot spurBot = new FolgeSpurBot(robi);

        Random random = new Random();
        int z1 = random.nextInt(10) + 3;
        Thing t1[] = new Thing[z1];
        for (int i = 0; i < z1; i++) {
            t1[i] = new Thing(c, 0 + 1, 0 + 1 + (i + 1) * 1);
        }
        int z2 = random.nextInt(10) + 3;
        Thing t2[] = new Thing[z2];

        int r2 = (int)Math.pow(-1, random.nextInt(2));

        for (int j = 0; j < z2; j++) {
            t2[j] = new Thing(c, 0 + 1 + (j + 1) * r2, z1 + 1);
        }
        int z3 = random.nextInt(10) + 3;
        Thing t3[] = new Thing[z3];

        int r3 = (int)Math.pow(-1, random.nextInt(2));

        for (int k = 0; k < z3; k++) {
            t3[k] = new Thing(c,z2 * r2 + 1, (z1 + 1) + (k + 1) * r3);
        }
        spurBot.folgeSpur();
    }
}
