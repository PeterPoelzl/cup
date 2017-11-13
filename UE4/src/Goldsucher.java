import becker.robots.*;
import java.lang.Math;

public class Goldsucher {
    private RobotSE robi;

    public Goldsucher (RobotSE robi){
        this.robi = robi;
    }
    public void steckeClaimAb(){
        robi.move(4);
        robi.pickAllThings();
        int quadrat = robi.countThingsInBackpack();
        int seitenstueck = (int)Math.floor(quadrat / 4);

        for (int i = 1; i <= 4; i++){
            robi.turnLeft();
            for (int j = 1; j <= seitenstueck; j++) {
                robi.move();
                robi.putThing();
            }
        }
        robi.move();
    }
}
