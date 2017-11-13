import becker.robots.*;

public class FolgeSpurBot {
    private RobotSE robi;

    public FolgeSpurBot(RobotSE robi){
        this.robi = robi;
    }
    public void folgeSpur() {
        robi.move();
        for (int i = 1; i <= 3; i++) {
            while (robi.canPickThing()) {
                robi.pickThing();
                robi.move();
            }
            robi.turnAround();
            robi.move();
            robi.turnLeft();
            robi.move();

            if (!robi.canPickThing()){
                robi.turnAround();
                robi.move(2);
            }
        }
    }
}
